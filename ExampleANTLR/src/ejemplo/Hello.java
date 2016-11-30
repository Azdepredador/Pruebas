package ejemplo;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import ejemplo.HelloWalker;
import ejemplo.HelloLexer;
import ejemplo.HelloParser;

public class Hello {
	
	
  public static void main( String[] args) throws Exception 
  {
	  
	ANTLRInputStream input= new ANTLRInputStream("program MiPrograma {"
			+ "var a;"
			+ "var b;"
			+ "a=5;"
			+ "b=10;"
			+ "if(1 < 3 && a < b && 2<3){"
			+ "println b;"
			+ "}else{ println a; }"
			+ "}"
			+ "");
	
	/*
	 * if(10 > 11)
	 * 			falso brinca a else o a else if
	 * bloque	  
	 * 
	 */
    HelloLexer lexer = new HelloLexer(input);
    CommonTokenStream tokens = new CommonTokenStream( lexer );
    HelloParser parser = new HelloParser( tokens );
    ParseTree tree = parser.program();
    ParseTreeWalker walker = new ParseTreeWalker();
    walker.walk( new HelloWalker(), tree );
   

    
    
    
  }
}
