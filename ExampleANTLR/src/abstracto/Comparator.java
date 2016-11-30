package abstracto;

import java.util.Map;

public class Comparator implements ASTNode {
	
	private ASTNode op;
	private String comp;
	private ASTNode op1;
	
	
	
	
	


	public Comparator(ASTNode op, String comp, ASTNode op1) {
		super();
		this.op = op;
		this.comp = comp;
		this.op1 = op1;
	}







	@Override
	public Object execute(Map<String, Object> symbolTable, Map<String, Object> dataType) {
		// TODO Auto-generated method stub		
		
	
		
		if(comp.equals("<")){
		
		if(Integer.parseInt(op.execute(symbolTable, dataType).toString()) < Integer.parseInt(op1.execute(symbolTable, dataType).toString())){
			return true;
		}
		else{
			return false;
		}
		
		}
		
		
		return null;
	}

}
