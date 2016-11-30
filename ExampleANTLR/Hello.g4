/**
 * Define a grammar called Hello
 */
grammar Hello;


@parser::header{
	package ejemplo;	
	import java.util.Map;
	import java.util.HashMap;
	import abstracto.ASTNode;
	import abstracto.Addition;
	import abstracto.If;
	import abstracto.Multiplication;
	import abstracto.Println;
	import abstracto.Constant;
	import abstracto.varDecl;
	import abstracto.VarAssign;
	import abstracto.VarRef;
	import abstracto.Comparator;
	import abstracto.ComparatorDoble;
	import abstracto.DeleteTable;
	
	
}

@lexer::header{
	package ejemplo;
}

@parser::members{
	Map<String, Object> entero= new HashMap<String, Object>();
	public static List <Object> listaIf= new ArrayList<Object>();
	
	public boolean hayIf=false;	
	public boolean banderasOp=false;
	
}


program: PROGRAMA ID BRACKET_OP 
	{
		List<ASTNode> body = new ArrayList<ASTNode>();
		Map<String, Object> symbolTable = new HashMap<String,Object>();
		Map<String, Object> dataType = new HashMap<String,Object>();
	
	}
	(sentence {})*
BRACKET_CLOSE
{
	
	System.out.println(".done: ");
	System.out.println("mov esp,ebp");
	System.out.println("pop ebp");
	System.out.println("mov eax,0");
	System.out.println("ret");
}

;

sentence returns [ASTNode node]: println {$node = $println.node;} 
			|conditional{$node = $conditional.node;}
			|var_decl {$node = $var_decl.node;}
			|var_assign {$node= $var_assign.node;}
			
			;


println returns [ASTNode node]: PRINTLN expresionPri PUNTO_COMA 
{$node = new Println($expresionPri.node, $PRINTLN.line);
	System.out.print("call printf\nadd esp , 8\n");
	
};


conditional returns [ASTNode node]: IF PAR_OP comp PAR_CLOSE
			{
				hayIf=true;
			}
			BRACKET_OP sentence* BRACKET_CLOSE
			ELSE { 
				System.out.println("jmp .done");
				System.out.println(".else: ");
			}
			BRACKET_OP sentence* BRACKET_CLOSE
			{
				
				hayIf=false;
				
				
			}
			;
			
var_decl returns [ASTNode node]:
			VAR ID PUNTO_COMA {
				
			if(hayIf){
				listaIf.add($ID.text);
			}
			
			$node= new varDecl($ID.text,"entero");
			entero.put($ID.text,"entero");
		
		
		
	}
	
	
;
	
	//a=10+10+c;
	
var_assign returns [ASTNode node]:
 	ID ASSIGN term PUNTO_COMA {
 		$node= new VarAssign($ID.text, $term.node);
 		System.out.print("mov ["+$ID.text+"] ,eax\n");
 	//	banderasOp=false;
    }
    | ID ASSIGN expresion PUNTO_COMA {
 		$node= new VarAssign($ID.text, $expresion.node);
 		System.out.print("mov ["+$ID.text+"] ,eax\n");
 		System.out.print("add esp,4\n");
 	//	banderasOp=false;
    }
    

    
;
			

expresion returns [ASTNode node]: 
	t1=factor{$node = $t1.node; 	} 
		(PLUS t2=factor {$node= new Addition($node, $t2.node);
			System.out.println("pop ecx");
			System.out.println("pop eax");
			System.out.println("add eax,ecx");
			System.out.println("push eax");			

				
				
				
			}
		)*;
		


		
factor returns [ASTNode node]: 
	t1=term2 {$node = $t1.node; }
	(MULT t2=term2 {$node = new Multiplication($node,$t2.node);  
			System.out.println("pop ecx");
			System.out.println("pop eax");
			System.out.println("mul ecx");
			System.out.println("push eax");
		
	})*;
	
	
term returns [ASTNode node]: 
	NUMBER {$node = new Constant(Integer.parseInt($NUMBER.text)); 
			
		//if(!banderasOp)
		System.out.print("mov eax ,"+$NUMBER.text+"\n");

	}
	|PAR_OP expresion{ $node = $expresion.node;} PAR_CLOSE
	|BOOLEAN {$node= new Constant(Boolean.parseBoolean($BOOLEAN.text));}
	|ID {$node= new VarRef($ID.text); 
		
		//if(!banderasOp)
		System.out.print("mov eax ,["+$ID.text+"]\n");

		
		
	} 
	
	;
	
term2 returns [ASTNode node]: 
	NUMBER {$node = new Constant(Integer.parseInt($NUMBER.text)); 
		System.out.println("mov ecx , "+$NUMBER.text);
		//System.out.println("mov ecx , eax");
		System.out.println("push ecx "); 
	}
	|PAR_OP expresion{ $node = $expresion.node;} PAR_CLOSE
	|BOOLEAN {$node= new Constant(Boolean.parseBoolean($BOOLEAN.text));}
	|ID {$node= new VarRef($ID.text); 
		
		System.out.println("mov ecx , ["+$ID.text+"]");
		//System.out.println("mov ecx , eax");
		System.out.println("push ecx "); 

		
		
	} 
	
	;
	



	
expresionPri returns [ASTNode node]: 
	t1=factorPri{$node = $t1.node;} 
		(PLUS t2=factorPri {$node= new Addition($node, $t2.node);})*;
		
		
factorPri returns [ASTNode node]: 
	t1=termPri {$node = $t1.node;}
	(MULT t2=termPri {$node = new Multiplication($node,$t2.node);})*;
	
	
termPri returns [ASTNode node]: 
	NUMBER {$node = new Constant(Integer.parseInt($NUMBER.text)); System.out.print("push "+$NUMBER.text+"\n"); 
																  System.out.print("msg1: db \"%d\",10,0\n");
																  System.out.print("push dword msg1\n");	
	}
	|PAR_OP expresionPri{ $node = $expresionPri.node;} PAR_CLOSE
	|BOOLEAN {$node= new Constant(Boolean.parseBoolean($BOOLEAN.text));}
	|ID {$node= new VarRef($ID.text); System.out.print("push dword  ["+$ID.text+"]\n");
									  System.out.print("msg2: db \"%d\",10,0\n");
						              System.out.print("push dword msg2\n");	
				
		
		
		
	} 
	;
	
	
	
	
comp returns [ASTNode node]:

	valor(LT valor{
		System.out.println("pop eax");
		System.out.println("pop ebx");
		System.out.println("cmp ebx,eax");
		System.out.println("jnl .else");
		
	} )? 
	(AND valor (LT valor {		
		System.out.println("pop eax");
		System.out.println("pop ebx");
		System.out.println("cmp ebx,eax");
		
		

		System.out.println("jnl .else");
		
		
		
		
		}  )?)*


    |
    
    
    	valor(LT valor{
		System.out.println("pop eax");
		System.out.println("pop ebx");
		System.out.println("cmp ebx,eax");
		System.out.println("jl .elseIF");
		
	} )? 
	(OR valor (LT valor {		
		System.out.println("pop eax");
		System.out.println("pop ebx");
		System.out.println("cmp ebx,eax");
		
		

		System.out.println("jl .elseIF");
		
		
		
		
		}  )?)*
		
		{	System.out.println("jump .else");
			System.out.println("\n.elseIF:");}
    
    
     |
    
	valor(LT valor{
		System.out.println("pop eax");
		System.out.println("pop ebx");
		System.out.println("cmp ebx,eax");
		System.out.println("jnl .else");
		
	} )? 
	((AND | OR { banderasOp=true; })valor (LT valor {		
		System.out.println("pop eax");
		System.out.println("pop ebx");
		System.out.println("cmp ebx,eax");
		
		

		System.out.println("jl .elseIF");
		
		
		
		
		}  )?)*{
			System.out.println("jump .else");
			System.out.println("\n.elseIF:");
		}
		
		
	|
	
		
	valor(LT valor{
		
		System.out.println("pop eax");
		System.out.println("pop ebx");
		System.out.println("cmp ebx,eax");
		System.out.println("jl .else");
		
	} )? 
	 ((OR |AND{ banderasOp=true; }) valor (LT valor {	
			
		System.out.println("pop eax");
		System.out.println("pop ebx");
		System.out.println("cmp ebx,eax");
		

		System.out.println("jl .elseIF");
		
		
		}  )?)*{
			System.out.println("jump .else");
			System.out.println("\n.elseIF:");
		}
		
		
	
	
	;




valor returns [ASTNode node]:
	NUMBER {$node = new Constant(Integer.parseInt($NUMBER.text));  System.out.println("push "+$NUMBER.text); }
	|PAR_OP comp{ $node = $comp.node;} PAR_CLOSE
	|BOOLEAN {$node= new Constant(Boolean.parseBoolean($BOOLEAN.text));}
	|ID {$node= new VarRef($ID.text);
		System.out.println("mov ecx, ["+$ID.text+"]");   
		System.out.println("push ecx");
	}
;



PROGRAMA: 'program';
VAR: 'var';
PRINTLN: 'println';
IF: 'if';
ELSE: 'else';
ELSEIF: 'elseif';

PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';

AND: '&&';
OR: '||';
NOT: '!';

GT: '>';
LT: '<';
GEQ: '>=';
LEQ: '<=';
EQ: '==';
NEQ: '!=';
ASSIGN: '=';

BRACKET_OP: '{';
BRACKET_CLOSE: '}';
PAR_OP: '(';
PAR_CLOSE: ')';

PUNTO_COMA: ';';

BOOLEAN: 'true'|'false';
ID: [a-zA-Z_][a-zA-Z0-9_]*;
NUMBER: [0-9]+
{};


WS: [ \t\r\n]+->skip;