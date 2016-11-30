package abstracto;

import java.util.List;
import java.util.Map;

public class If implements ASTNode {
	
	private ASTNode condition;
	private List<ASTNode> body;
	private List<ASTNode> elseBody;
	private List<Object> listaIF;
	
	
	


	public If(ASTNode condition, List<ASTNode> body, List<ASTNode> elseBody, List<Object> listaIF) {
		super();
		this.condition = condition;
		this.body = body;
		this.elseBody = elseBody;
		this.listaIF = listaIF;
	}





	@Override
	public Object execute(Map<String, Object> symbolTable, Map<String, Object> dataType) {
		// TODO Auto-generated method stub
		
		if((boolean)condition.execute(symbolTable, dataType)){
			for(ASTNode n: body){
				n.execute(symbolTable, dataType);
			}
		}
		else{
			for(ASTNode n: elseBody){
				n.execute(symbolTable, dataType);
			}
		}
		
		for(int i=0; i<listaIF.size();i++){
			symbolTable.remove(listaIF.get(i));
		}
		
		
		
		return null;
	}

}
