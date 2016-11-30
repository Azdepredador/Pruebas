package abstracto;

import java.util.Map;

public class varDecl implements ASTNode {
	
	private String name;
	private String tipoDeDato;
	
	

	


	public varDecl(String name, String dataType) {
		super();
		this.name = name;
		this.tipoDeDato = dataType;
	}






	@Override
	public Object execute(Map<String, Object> symbolTable, Map<String, Object> dataType) {
		// TODO Auto-generated method stub
		
		if(symbolTable.containsKey(name)){
			System.out.println("Error variable "+name+" ya fue declarada");
			
		}else{
		
			symbolTable.put(name,new Object());
			dataType.put(name, tipoDeDato);
			
		
		}
		return null;
	}

}
