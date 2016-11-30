package abstracto;

import java.util.Map;

public class VarRef implements ASTNode {
	
	private String name;
	
	
	
	public VarRef(String name) {
		super();
		this.name = name;
	}



	@Override
	public Object execute(Map<String, Object> symbolTable, Map<String, Object> dataType) {
		// TODO Auto-generated method stub
		return symbolTable.get(name);
	}

}
