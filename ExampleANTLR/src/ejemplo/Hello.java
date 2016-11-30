package ejemplo;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import ejemplo.HelloWalker;
import ejemplo.HelloLexer;
import ejemplo.HelloParser;

public class Hello {
	
	public static StringBuilder st= new StringBuilder();
	
  public static void main( String[] args) throws Exception 
  {
	  
	ANTLRInputStream input= new ANTLRInputStream("program MiPrograma {"
			+ "if(1 < 3){"
			+ "if(6 < 6){println 666;} else{println 777;}"
			+ "}else{ println 10; }"
			+ "}"
			+ "");
	
	/*
	 * if(10 > 11)
	 * 			falso brinca a else o a else if
	 * bloque	  
	 * 
	 */
	st.append("EXTERN .bss\n");
	
    HelloLexer lexer = new HelloLexer(input);
    CommonTokenStream tokens = new CommonTokenStream( lexer );
    HelloParser parser = new HelloParser( tokens );
    ParseTree tree = parser.program();
    ParseTreeWalker walker = new ParseTreeWalker();
    walker.walk( new HelloWalker(), tree );
   
    System.out.print(st.toString());
    
    
    
  }
}
