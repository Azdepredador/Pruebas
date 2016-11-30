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
	Map<String, Object> dataType= new HashMap<String, Object>();
	Map<String, Object> tableSymbols= new HashMap<String, Object>();
	
	
	public static List <Object> listaIf= new ArrayList<Object>();
	
	Hello h= new Hello();
	public boolean hayIf=false;	
	public boolean banderasOp=false;
	int contadorEtiquetas=0;
	int contadorMsg=0;
	int jumpDone=0;
	
}


program: PROGRAMA ID BRACKET_OP 
	sentence*//{System.out.println(".done: ");}
BRACKET_CLOSE
{
	
	System.out.println("mov esp,ebp");
	System.out.println("pop ebp");
	System.out.println("mov eax,0");
	System.out.println("ret");
}

;

sentence:    println 		
			|conditional {System.out.println(".done"+Integer.toString(jumpDone)+": "); jumpDone++; contadorEtiquetas++;	}
			|var_decl  		
			|var_assign 
			;


println: PRINTLN termPri PUNTO_COMA 
{
	
	//System.out.println($termPri.text);
	System.out.print("call printf\nadd esp , 8\n");
	
};


conditional: IF PAR_OP comp PAR_CLOSE
			{
				hayIf=true;
				//{System.out.println(".done: ");}
			}
			BRACKET_OP sentence* BRACKET_CLOSE
			ELSE { 
				//{System.out.println(".done: ");}
				System.out.println("jmp .done"+Integer.toString(jumpDone));
				
				System.out.println(".else"+Integer.toString(contadorEtiquetas)+": ");
			}
			BRACKET_OP sentence* BRACKET_CLOSE
			{
				
				hayIf=false;
							
			}
			;
			
var_decl:
			VAR ID PUNTO_COMA {
				
			if(hayIf){
				listaIf.add($ID.text);
			}
			
			
			if(tableSymbols.containsKey($ID.text)){
				System.out.println("Error variable ya fue declarada "+$ID.text);	
			}
			else{
			tableSymbols.put($ID.text,0);
			dataType.put($ID.text,"entero");
			
			}
		
		
		
	}
	
	
;
	
	//a=10+10+c;
	
var_assign:
 	ID ASSIGN term PUNTO_COMA {
		System.out.println("Valor de "+$ID.text+" valor "+$term.text);
 		System.out.print("mov ["+$ID.text+"] ,eax\n");
 	//	banderasOp=false;
 	
 		if(tableSymbols.containsKey($ID.text)){
 			
 			/*if(dataType.get($ID.text).equals("entero")){
 				
 			}*/
 			
 			tableSymbols.put($ID.text,$term.text);
 			
 			
 			
 			
 		}else{
 			System.out.println("Error variable no se encuentra "+$ID.text);
 		}
 	
 	
    }
    | ID ASSIGN expresion PUNTO_COMA {
 		
 		System.out.println("Valor de "+$ID.text+" valor "+$expresion.value);
 		
 		if(tableSymbols.containsKey($ID.text)){
 			
 			/*if(dataType.get($ID.text).equals("entero")){
 				
 			}*/
 			tableSymbols.put($ID.text,$expresion.value);

 		}else{
 			System.out.println("Error variable no se encuentra "+$ID.text);
 		}
 		
 		System.out.print("mov ["+$ID.text+"] ,eax\n");
 		System.out.print("add esp,4\n");
 	//	banderasOp=false;
 		System.out.println("valor "+$expresion.value);
    }
    

    
;
			

expresion returns [Object value]: 
	t1=factor{$value = (int)$t1.value;} 
		(PLUS t2=factor {$value= (int)$value + (int)$t2.value;
			
			System.out.println("pop ecx");
			System.out.println("pop eax");
			System.out.println("add eax,ecx");
			System.out.println("push eax");			

				
			}
		)*;
		


		
factor returns [Object value]: 
	t1=term2 {$value = (int)$t1.value; }
	(MULT t2=term2 {$value = (int)$value * (int)$t2.value ;
		 
			System.out.println("pop ecx");
			System.out.println("pop eax");
			System.out.println("mul ecx");
			System.out.println("push eax");
		
	})*;
	
	
term returns [Object value]: 
	NUMBER {$value = $NUMBER.text ;
		//if(!banderasOp)
		System.out.print("mov eax ,"+$NUMBER.text+"\n");
	}
	|PAR_OP expresion PAR_CLOSE
	|BOOLEAN {$value= $BOOLEAN.text;}
	|ID {$value= tableSymbols.get($ID.text); 
		System.out.print("mov eax ,["+$ID.text+"]\n");
	} 
	
	;
	
term2 returns [Object value]: 
	NUMBER {$value = Integer.parseInt($NUMBER.text);  
		
		System.out.println("mov ecx , "+$NUMBER.text);
		System.out.println("push ecx "); 
	}
	|PAR_OP expresion{$value=$expresion.value;} PAR_CLOSE
	|BOOLEAN {$value= $BOOLEAN.text;}
	|ID {$value=Integer.parseInt(tableSymbols.get($ID.text).toString()); 
		
		System.out.println("mov ecx , ["+$ID.text+"]");
		//System.out.println("mov ecx , eax");
		System.out.println("push ecx "); 

		
		
	} 
	
	;
	



	

	
	
termPri returns [Object value]: 
	NUMBER {$value =$NUMBER.text; System.out.print("push "+$NUMBER.text+"\n"); 
																  h.st.append("msg"+Integer.toString(contadorMsg)+": db \"%d\",10,0\n");
																  System.out.print("push dword msg"+Integer.toString(contadorMsg)+"\n");
																  contadorMsg++;	
	}
	|BOOLEAN {$value= $BOOLEAN.text;}
	|ID {$value=$ID.text;
		
		
		if(!tableSymbols.containsKey($ID.text)){
			System.out.println("Error variable no encontrada "+$ID.text);
		}
		
		 System.out.print("push dword  ["+$ID.text+"]\n");
		 h.st.append("msg"+Integer.toString(contadorMsg)+": db \"%d\",10,0\n");	  
         System.out.print("push dword msg"+Integer.toString(contadorMsg)+"\n");	
         contadorMsg++;
				
		
		
		
	} 
	;
	
	
	
	
comp :

	valor(LT valor{
		System.out.println("pop eax");
		System.out.println("pop ebx");
		System.out.println("cmp ebx,eax");
		System.out.println("jnl .else"+Integer.toString(contadorEtiquetas)+"");
		
	} )? 
	(AND valor (LT valor {		
		System.out.println("pop eax");
		System.out.println("pop ebx");
		System.out.println("cmp ebx,eax");
		
		

		System.out.println("jnl .else"+Integer.toString(contadorEtiquetas)+"");
		
		
		
		
		}  )?)*


    |
    
    
    	valor(LT valor{
		System.out.println("pop eax");
		System.out.println("pop ebx");
		System.out.println("cmp ebx,eax");
		System.out.println("jl .elseIF"+Integer.toString(contadorEtiquetas));
		
	} )? 
	(OR valor (LT valor {		
		System.out.println("pop eax");
		System.out.println("pop ebx");
		System.out.println("cmp ebx,eax");
		
		

		System.out.println("jl .elseIF"+Integer.toString(contadorEtiquetas));
		
		
		
		
		}  )?)*
		
		{	System.out.println("jump .else"+Integer.toString(contadorEtiquetas));
			System.out.println("\n.elseIF"+Integer.toString(contadorEtiquetas)+":");}
    
    
     |
    
	valor(LT valor{
		System.out.println("pop eax");
		System.out.println("pop ebx");
		System.out.println("cmp ebx,eax");
		System.out.println("jnl .else"+Integer.toString(contadorEtiquetas));
		
	} )? 
	((AND | OR )valor (LT valor {		
		System.out.println("pop eax");
		System.out.println("pop ebx");
		System.out.println("cmp ebx,eax");
		
		

		System.out.println("jl .elseIF"+Integer.toString(contadorEtiquetas));
		
		
		
		
		}  )?)*{
			System.out.println("jump .else"+Integer.toString(contadorEtiquetas));
			System.out.println("\n.elseIF"+Integer.toString(contadorEtiquetas)+":");
		}
		
		
	|
	
		
	valor(LT valor{
		
		System.out.println("pop eax");
		System.out.println("pop ebx");
		System.out.println("cmp ebx,eax");
		System.out.println("jl .else"+Integer.toString(contadorEtiquetas));
		
	} )? 
	 ((OR |AND) valor (LT valor {	
			
		System.out.println("pop eax");
		System.out.println("pop ebx");
		System.out.println("cmp ebx,eax");
		

		System.out.println("jl .elseIF"+Integer.toString(contadorEtiquetas));
		
		
		}  )?)*{
			System.out.println("jump .else"+Integer.toString(contadorEtiquetas));
			System.out.println("\n.elseIF"+Integer.toString(contadorEtiquetas)+":");
		}
		
		
	
	
	;




valor:
	NUMBER {System.out.println("push "+$NUMBER.text); }
	|PAR_OP comp PAR_CLOSE
	|ID {
		
		if(!tableSymbols.containsKey($ID.text)){
			System.out.println("Error no se encuentra la variable "+$ID.text);
		}
		
		
		
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