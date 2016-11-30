package abstracto;

import java.util.Map;

public class Println implements ASTNode {
	
	private ASTNode data;
	private Object line;
	
	

	



	public Println(ASTNode data, Object line) {
		super();
		this.data = data;
		this.line = line;
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
		if(data.execute(symbolTable, dataType)==null){
			System.out.println("Error en linea "+line);
			
		}else{
		
		System.out.println(data.execute(symbolTable, dataType));
		
		}
		
		return null;
	}

}
