package pt.up.fe.specs.mlir.antlr;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.ParseTree;

import pt.up.fe.specs.mlir.grammar.MlirLexer;
import pt.up.fe.specs.mlir.grammar.MlirParser;

public class AntlrUtils {

    private static final Map<String, Method> CACHED_METHODS = new HashMap<>();

    public static ParseTree parse(String code, String ruleName) {
        // Convert code string into a character stream
        var input = new ANTLRInputStream(code);
        // Transform characters into tokens using the lexer
        var lex = new MlirLexer(input); // Will we interact with this?

        // Wrap lexer around a token stream
        var tokens = new CommonTokenStream(lex);

        // Transforms tokens into a parse tree
        var parser = new MlirParser(tokens);

        return parse(lex, parser, ruleName).orElseThrow(() -> new RuntimeException("There are syntax errors"));
    }

    /**
     * Invokes the given parser rule, returning an implementation of JmmNode. If there are syntax errors,
     *
     * @param parser
     * @param ruleName
     * @return
     */
    public static Optional<ParseTree> parse(Lexer lex, Parser parser, String ruleName) {

        // Setup listeners so that an exception is thrown where there is an error
        lex.removeErrorListeners();
        lex.addErrorListener(new ThrowingErrorListener());

        // parser.removeErrorListeners();
        // parser.addErrorListener(new ThrowingErrorListener());

        var node = (ParseTree) invoke(parser, ruleName);

        if (parser.getNumberOfSyntaxErrors() > 0) {
            return Optional.empty();
        }

        return Optional.of(node);
    }

    public static Object invoke(Object object, String method, Object... args) {

        Class<?>[] types = new Class[args.length];
        int index = 0;
        for (var arg : args) {
            types[index] = arg.getClass();
            index++;
        }

        Class<?> invokingClass = object instanceof Class ? (Class<?>) object : object.getClass();
        // Class<?> invokingClass = object.getClass();
        // Object invokingObject = object instanceof Class ? null : object;
        // If method is static, object will be ignored
        Object invokingObject = object;

        // Choose best method
        Method invokingMethod = getMethod(invokingClass, method, types);

        if (invokingMethod == null) {
            throw new RuntimeException("Could not find method '" + method + "' for object " + object + " and arguments "
                    + Arrays.asList(types));
        }

        try {
            return invokingMethod.invoke(invokingObject, args);
        } catch (Exception e) {
            throw new RuntimeException("Error while invoking method '" + method + "'", e);
        }
        // return object.class.getMethod(property, arguments).invoke(object, arguments);
    }

    private static Method getMethod(Class<?> invokingClass, String methodName, Class<?>... types) {
        // Use methodId to cache results
        String methodId = getMethodId(invokingClass, methodName, types);
        return CACHED_METHODS.computeIfAbsent(methodId, key -> findMethod(invokingClass, methodName, types));
    }

    private static String getMethodId(Class<?> invokingClass, String methodName, Class<?>... types) {
        StringBuilder methodId = new StringBuilder();

        methodId.append(invokingClass.getName());
        methodId.append("::").append(methodName);
        for (var type : types) {
            methodId.append(",");
            methodId.append(type.getName());
        }

        return methodId.toString();
    }

    private static Method findMethod(Class<?> invokingClass, String methodName, Class<?>... types) {
        Method invokingMethod = null;
        top: for (var classMethod : invokingClass.getMethods()) {
            // Check name
            if (!classMethod.getName().equals(methodName)) {
                continue;
            }

            // Check if types are compatible
            var paramTypes = classMethod.getParameterTypes();
            if (paramTypes.length != types.length) {
                continue;
            }

            for (int i = 0; i < paramTypes.length; i++) {
                if (!paramTypes[i].isAssignableFrom(types[i])) {
                    continue top;
                }
            }

            invokingMethod = classMethod;
        }
        return invokingMethod;
    }

}
