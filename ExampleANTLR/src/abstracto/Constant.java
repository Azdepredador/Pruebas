package abstracto;

import java.util.Map;

public class Constant implements ASTNode {
	
	private Object value;

	
	
	public Constant(Object value) {
		super();
		this.value = value;
	}



	@Override
	public Object execute(Map<String, Object> symbolTable, Map<String, Object> dataType) {
		// TODO Auto-generated method stub
		return value;
	}

}
