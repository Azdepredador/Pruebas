package ejemplo;

import ejemplo.HelloBaseListener;
import ejemplo.HelloParser;


public class HelloWalker extends HelloBaseListener {
	  public void enterProgram(HelloParser.ProgramContext ctx ) {

	   // System.out.println( "ID : "+ctx.ID() );
	    //System.out.println( "ID : "+ctx.PROGRAMA() );
	    
	   
	  }

	  public void exitProgram(HelloParser.ProgramContext ctx ) {
	    //System.out.println( "Exiting R" );
	  }
	}