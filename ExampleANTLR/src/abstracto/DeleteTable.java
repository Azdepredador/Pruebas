package abstracto;

import java.util.Map;

public class DeleteTable implements ASTNode {
	
	private Object name;
	
	
	
	
	public DeleteTable(Object name) {
		super();
		this.name = name;
	}




	@Override
	public Object execute(Map<String, Object> symbolTable, Map<String, Object> dataType) {
		// TODO Auto-generated method stub
	
		symbolTable.remove(name);
		
		return null;
	}

}
