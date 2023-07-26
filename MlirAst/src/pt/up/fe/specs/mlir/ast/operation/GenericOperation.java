package pt.up.fe.specs.mlir.ast.operation;

import java.util.Collection;

import org.suikasoft.jOptions.Datakey.DataKey;
import org.suikasoft.jOptions.Datakey.KeyFactory;
import org.suikasoft.jOptions.Interfaces.DataStore;

import pt.up.fe.specs.mlir.ast.MlirNode;

public class GenericOperation extends Operation {

	public final static DataKey<String> NAME = KeyFactory.string("name");
	
	public GenericOperation(DataStore data, Collection<? extends MlirNode> children) {
		super(data, children);
	}

}
