package abstracto;

import java.util.Map;

public class ComparatorDoble implements ASTNode {
	
	
	private ASTNode operadorB;
	private ASTNode op;
	private ASTNode op2;
	
	
	
	


	public ComparatorDoble(ASTNode operadorB, ASTNode op, ASTNode op2) {
		super();
		this.operadorB = operadorB;
		this.op = op;
		this.op2 = op2;
	}






	@Override
	public Object execute(Map<String, Object> symbolTable, Map<String, Object> dataType) {
		
		if( (boolean)operadorB.execute(symbolTable, dataType) && Integer.parseInt(op.execute(symbolTable, dataType).toString()) < Integer.parseInt(op2.execute(symbolTable, dataType).toString())){
			
			return true;
		}
		else{
			return false;
		}
		
	}

}
