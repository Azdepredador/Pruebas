package abstracto;

import java.util.Map;

public class VarAssign implements ASTNode {

	private String name;
	private ASTNode expression;
	
	
	
	public VarAssign(String name, ASTNode expression) {
		super();
		this.name = name;
		this.expression = expression;
	}
	
	
	
	public static boolean isNumeric(Object cadena){
	try {
		Integer.parseInt(cadena.toString());
		return true;
	} catch (NumberFormatException nfe){
		return false;
		}
	}
	



	@Override
	public Object execute(Map<String, Object> symbolTable, Map<String, Object> dataType) {
		// TODO Auto-generated method stub
		
		
		
		if(symbolTable.containsKey(name)){
			
			symbolTable.put(name, expression.execute(symbolTable, dataType));
			
			if(dataType.get(name).equals("entero")){
				if(!isNumeric(expression.execute(symbolTable, dataType))){
					System.out.println("Error tipo de dato en  "+name);
				}
			}
			
			
			return null;
		}
		else{
			System.out.println("Error variable no ha sido inicializada "+name);
			return null;
		}
		
		
		
		
	}

}
