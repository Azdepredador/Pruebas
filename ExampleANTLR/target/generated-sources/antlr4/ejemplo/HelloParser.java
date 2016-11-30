// Generated from Hello.g4 by ANTLR 4.4

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
	
	

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAMA=1, VAR=2, PRINTLN=3, IF=4, ELSE=5, ELSEIF=6, PLUS=7, MINUS=8, 
		MULT=9, DIV=10, AND=11, OR=12, NOT=13, GT=14, LT=15, GEQ=16, LEQ=17, EQ=18, 
		NEQ=19, ASSIGN=20, BRACKET_OP=21, BRACKET_CLOSE=22, PAR_OP=23, PAR_CLOSE=24, 
		PUNTO_COMA=25, BOOLEAN=26, ID=27, NUMBER=28, WS=29;
	public static final String[] tokenNames = {
		"<INVALID>", "'program'", "'var'", "'println'", "'if'", "'else'", "'elseif'", 
		"'+'", "'-'", "'*'", "'/'", "'&&'", "'||'", "'!'", "'>'", "'<'", "'>='", 
		"'<='", "'=='", "'!='", "'='", "'{'", "'}'", "'('", "')'", "';'", "BOOLEAN", 
		"ID", "NUMBER", "WS"
	};
	public static final int
		RULE_program = 0, RULE_sentence = 1, RULE_println = 2, RULE_conditional = 3, 
		RULE_var_decl = 4, RULE_var_assign = 5, RULE_expresion = 6, RULE_factor = 7, 
		RULE_term = 8, RULE_term2 = 9, RULE_termPri = 10, RULE_comp = 11, RULE_valor = 12;
	public static final String[] ruleNames = {
		"program", "sentence", "println", "conditional", "var_decl", "var_assign", 
		"expresion", "factor", "term", "term2", "termPri", "comp", "valor"
	};

	@Override
	public String getGrammarFileName() { return "Hello.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		Map<String, Object> dataType= new HashMap<String, Object>();
		Map<String, Object> tableSymbols= new HashMap<String, Object>();
		
		
		public static List <Object> listaIf= new ArrayList<Object>();
		
		Hello h= new Hello();
		public boolean hayIf=false;	
		public boolean banderasOp=false;
		int contadorEtiquetas=0;
		int contadorMsg=0;
		int jumpDone=0;
		

	public HelloParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public TerminalNode BRACKET_OP() { return getToken(HelloParser.BRACKET_OP, 0); }
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public TerminalNode BRACKET_CLOSE() { return getToken(HelloParser.BRACKET_CLOSE, 0); }
		public TerminalNode PROGRAMA() { return getToken(HelloParser.PROGRAMA, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26); match(PROGRAMA);
			setState(27); match(ID);
			setState(28); match(BRACKET_OP);
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PRINTLN) | (1L << IF) | (1L << ID))) != 0)) {
				{
				{
				setState(29); sentence();
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(35); match(BRACKET_CLOSE);

				
				System.out.println("mov esp,ebp");
				System.out.println("pop ebp");
				System.out.println("mov eax,0");
				System.out.println("ret");

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentenceContext extends ParserRuleContext {
		public PrintlnContext println() {
			return getRuleContext(PrintlnContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public Var_assignContext var_assign() {
			return getRuleContext(Var_assignContext.class,0);
		}
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentence);
		try {
			setState(44);
			switch (_input.LA(1)) {
			case PRINTLN:
				enterOuterAlt(_localctx, 1);
				{
				setState(38); println();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(39); conditional();
				System.out.println(".done"+Integer.toString(jumpDone)+": "); jumpDone++; contadorEtiquetas++;	
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(42); var_decl();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(43); var_assign();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintlnContext extends ParserRuleContext {
		public TermPriContext termPri;
		public TerminalNode PRINTLN() { return getToken(HelloParser.PRINTLN, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(HelloParser.PUNTO_COMA, 0); }
		public TermPriContext termPri() {
			return getRuleContext(TermPriContext.class,0);
		}
		public PrintlnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_println; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterPrintln(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitPrintln(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitPrintln(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintlnContext println() throws RecognitionException {
		PrintlnContext _localctx = new PrintlnContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_println);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46); match(PRINTLN);
			setState(47); ((PrintlnContext)_localctx).termPri = termPri();
			setState(48); match(PUNTO_COMA);

				
				//System.out.println((((PrintlnContext)_localctx).termPri!=null?_input.getText(((PrintlnContext)_localctx).termPri.start,((PrintlnContext)_localctx).termPri.stop):null));
				System.out.print("call printf\nadd esp , 8\n");
				

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(HelloParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(HelloParser.IF, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(HelloParser.PAR_CLOSE, 0); }
		public List<TerminalNode> BRACKET_OP() { return getTokens(HelloParser.BRACKET_OP); }
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public List<TerminalNode> BRACKET_CLOSE() { return getTokens(HelloParser.BRACKET_CLOSE); }
		public TerminalNode PAR_OP() { return getToken(HelloParser.PAR_OP, 0); }
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public TerminalNode BRACKET_CLOSE(int i) {
			return getToken(HelloParser.BRACKET_CLOSE, i);
		}
		public TerminalNode BRACKET_OP(int i) {
			return getToken(HelloParser.BRACKET_OP, i);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51); match(IF);
			setState(52); match(PAR_OP);
			setState(53); comp();
			setState(54); match(PAR_CLOSE);

							hayIf=true;
							//{System.out.println(".done: ");}
						
			setState(56); match(BRACKET_OP);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PRINTLN) | (1L << IF) | (1L << ID))) != 0)) {
				{
				{
				setState(57); sentence();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63); match(BRACKET_CLOSE);
			setState(64); match(ELSE);
			 
							//{System.out.println(".done: ");}
							System.out.println("jmp .done"+Integer.toString(jumpDone));
							
							System.out.println(".else"+Integer.toString(contadorEtiquetas)+": ");
						
			setState(66); match(BRACKET_OP);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PRINTLN) | (1L << IF) | (1L << ID))) != 0)) {
				{
				{
				setState(67); sentence();
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73); match(BRACKET_CLOSE);

							
							hayIf=false;
										
						
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_declContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public TerminalNode VAR() { return getToken(HelloParser.VAR, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(HelloParser.PUNTO_COMA, 0); }
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitVar_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitVar_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76); match(VAR);
			setState(77); ((Var_declContext)_localctx).ID = match(ID);
			setState(78); match(PUNTO_COMA);

							
						if(hayIf){
							listaIf.add((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null));
						}
						
						
						if(tableSymbols.containsKey((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null))){
							System.out.println("Error variable ya fue declarada "+(((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null));	
						}
						else{
						tableSymbols.put((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null),0);
						dataType.put((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null),"entero");
						
						}
					
					
					
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_assignContext extends ParserRuleContext {
		public Token ID;
		public TermContext term;
		public ExpresionContext expresion;
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(HelloParser.ASSIGN, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PUNTO_COMA() { return getToken(HelloParser.PUNTO_COMA, 0); }
		public Var_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterVar_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitVar_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitVar_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_assignContext var_assign() throws RecognitionException {
		Var_assignContext _localctx = new Var_assignContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_var_assign);
		try {
			setState(93);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81); ((Var_assignContext)_localctx).ID = match(ID);
				setState(82); match(ASSIGN);
				setState(83); ((Var_assignContext)_localctx).term = term();
				setState(84); match(PUNTO_COMA);

						System.out.println("Valor de "+(((Var_assignContext)_localctx).ID!=null?((Var_assignContext)_localctx).ID.getText():null)+" valor "+(((Var_assignContext)_localctx).term!=null?_input.getText(((Var_assignContext)_localctx).term.start,((Var_assignContext)_localctx).term.stop):null));
				 		System.out.print("mov ["+(((Var_assignContext)_localctx).ID!=null?((Var_assignContext)_localctx).ID.getText():null)+"] ,eax\n");
				 	//	banderasOp=false;
				 	
				 		if(tableSymbols.containsKey((((Var_assignContext)_localctx).ID!=null?((Var_assignContext)_localctx).ID.getText():null))){
				 			
				 			/*if(dataType.get((((Var_assignContext)_localctx).ID!=null?((Var_assignContext)_localctx).ID.getText():null)).equals("entero")){
				 				
				 			}*/
				 			
				 			tableSymbols.put((((Var_assignContext)_localctx).ID!=null?((Var_assignContext)_localctx).ID.getText():null),(((Var_assignContext)_localctx).term!=null?_input.getText(((Var_assignContext)_localctx).term.start,((Var_assignContext)_localctx).term.stop):null));
				 			
				 			
				 			
				 			
				 		}else{
				 			System.out.println("Error variable no se encuentra "+(((Var_assignContext)_localctx).ID!=null?((Var_assignContext)_localctx).ID.getText():null));
				 		}
				 	
				 	
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87); ((Var_assignContext)_localctx).ID = match(ID);
				setState(88); match(ASSIGN);
				setState(89); ((Var_assignContext)_localctx).expresion = expresion();
				setState(90); match(PUNTO_COMA);

				 		
				 		System.out.println("Valor de "+(((Var_assignContext)_localctx).ID!=null?((Var_assignContext)_localctx).ID.getText():null)+" valor "+((Var_assignContext)_localctx).expresion.value);
				 		
				 		if(tableSymbols.containsKey((((Var_assignContext)_localctx).ID!=null?((Var_assignContext)_localctx).ID.getText():null))){
				 			
				 			/*if(dataType.get((((Var_assignContext)_localctx).ID!=null?((Var_assignContext)_localctx).ID.getText():null)).equals("entero")){
				 				
				 			}*/
				 			tableSymbols.put((((Var_assignContext)_localctx).ID!=null?((Var_assignContext)_localctx).ID.getText():null),((Var_assignContext)_localctx).expresion.value);

				 		}else{
				 			System.out.println("Error variable no se encuentra "+(((Var_assignContext)_localctx).ID!=null?((Var_assignContext)_localctx).ID.getText():null));
				 		}
				 		
				 		System.out.print("mov ["+(((Var_assignContext)_localctx).ID!=null?((Var_assignContext)_localctx).ID.getText():null)+"] ,eax\n");
				 		System.out.print("add esp,4\n");
				 	//	banderasOp=false;
				 		System.out.println("valor "+((Var_assignContext)_localctx).expresion.value);
				    
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpresionContext extends ParserRuleContext {
		public Object value;
		public FactorContext t1;
		public FactorContext t2;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(HelloParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(HelloParser.PLUS, i);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expresion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95); ((ExpresionContext)_localctx).t1 = factor();
			((ExpresionContext)_localctx).value =  (int)((ExpresionContext)_localctx).t1.value;
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(97); match(PLUS);
				setState(98); ((ExpresionContext)_localctx).t2 = factor();
				((ExpresionContext)_localctx).value =  (int)_localctx.value + (int)((ExpresionContext)_localctx).t2.value;
							
							System.out.println("pop ecx");
							System.out.println("pop eax");
							System.out.println("add eax,ecx");
							System.out.println("push eax");			

								
							
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public Object value;
		public Term2Context t1;
		public Term2Context t2;
		public List<Term2Context> term2() {
			return getRuleContexts(Term2Context.class);
		}
		public TerminalNode MULT(int i) {
			return getToken(HelloParser.MULT, i);
		}
		public List<TerminalNode> MULT() { return getTokens(HelloParser.MULT); }
		public Term2Context term2(int i) {
			return getRuleContext(Term2Context.class,i);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106); ((FactorContext)_localctx).t1 = term2();
			((FactorContext)_localctx).value =  (int)((FactorContext)_localctx).t1.value; 
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT) {
				{
				{
				setState(108); match(MULT);
				setState(109); ((FactorContext)_localctx).t2 = term2();
				((FactorContext)_localctx).value =  (int)_localctx.value * (int)((FactorContext)_localctx).t2.value ;
						 
							System.out.println("pop ecx");
							System.out.println("pop eax");
							System.out.println("mul ecx");
							System.out.println("push eax");
						
					
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public Object value;
		public Token NUMBER;
		public Token BOOLEAN;
		public Token ID;
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(HelloParser.PAR_CLOSE, 0); }
		public TerminalNode PAR_OP() { return getToken(HelloParser.PAR_OP, 0); }
		public TerminalNode NUMBER() { return getToken(HelloParser.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(HelloParser.BOOLEAN, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_term);
		try {
			setState(127);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(117); ((TermContext)_localctx).NUMBER = match(NUMBER);
				((TermContext)_localctx).value =  (((TermContext)_localctx).NUMBER!=null?((TermContext)_localctx).NUMBER.getText():null) ;
						//if(!banderasOp)
						System.out.print("mov eax ,"+(((TermContext)_localctx).NUMBER!=null?((TermContext)_localctx).NUMBER.getText():null)+"\n");
					
				}
				break;
			case PAR_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(119); match(PAR_OP);
				setState(120); expresion();
				setState(121); match(PAR_CLOSE);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(123); ((TermContext)_localctx).BOOLEAN = match(BOOLEAN);
				((TermContext)_localctx).value =  (((TermContext)_localctx).BOOLEAN!=null?((TermContext)_localctx).BOOLEAN.getText():null);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(125); ((TermContext)_localctx).ID = match(ID);
				((TermContext)_localctx).value =  tableSymbols.get((((TermContext)_localctx).ID!=null?((TermContext)_localctx).ID.getText():null)); 
						System.out.print("mov eax ,["+(((TermContext)_localctx).ID!=null?((TermContext)_localctx).ID.getText():null)+"]\n");
					
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Term2Context extends ParserRuleContext {
		public Object value;
		public Token NUMBER;
		public ExpresionContext expresion;
		public Token BOOLEAN;
		public Token ID;
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(HelloParser.PAR_CLOSE, 0); }
		public TerminalNode PAR_OP() { return getToken(HelloParser.PAR_OP, 0); }
		public TerminalNode NUMBER() { return getToken(HelloParser.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(HelloParser.BOOLEAN, 0); }
		public Term2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterTerm2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitTerm2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitTerm2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Term2Context term2() throws RecognitionException {
		Term2Context _localctx = new Term2Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_term2);
		try {
			setState(140);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(129); ((Term2Context)_localctx).NUMBER = match(NUMBER);
				((Term2Context)_localctx).value =  Integer.parseInt((((Term2Context)_localctx).NUMBER!=null?((Term2Context)_localctx).NUMBER.getText():null));  
						
						System.out.println("mov ecx , "+(((Term2Context)_localctx).NUMBER!=null?((Term2Context)_localctx).NUMBER.getText():null));
						System.out.println("push ecx "); 
					
				}
				break;
			case PAR_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(131); match(PAR_OP);
				setState(132); ((Term2Context)_localctx).expresion = expresion();
				((Term2Context)_localctx).value = ((Term2Context)_localctx).expresion.value;
				setState(134); match(PAR_CLOSE);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(136); ((Term2Context)_localctx).BOOLEAN = match(BOOLEAN);
				((Term2Context)_localctx).value =  (((Term2Context)_localctx).BOOLEAN!=null?((Term2Context)_localctx).BOOLEAN.getText():null);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(138); ((Term2Context)_localctx).ID = match(ID);
				((Term2Context)_localctx).value = Integer.parseInt(tableSymbols.get((((Term2Context)_localctx).ID!=null?((Term2Context)_localctx).ID.getText():null)).toString()); 
						
						System.out.println("mov ecx , ["+(((Term2Context)_localctx).ID!=null?((Term2Context)_localctx).ID.getText():null)+"]");
						//System.out.println("mov ecx , eax");
						System.out.println("push ecx "); 

						
						
					
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermPriContext extends ParserRuleContext {
		public Object value;
		public Token NUMBER;
		public Token BOOLEAN;
		public Token ID;
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(HelloParser.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(HelloParser.BOOLEAN, 0); }
		public TermPriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termPri; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterTermPri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitTermPri(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitTermPri(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermPriContext termPri() throws RecognitionException {
		TermPriContext _localctx = new TermPriContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_termPri);
		try {
			setState(148);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(142); ((TermPriContext)_localctx).NUMBER = match(NUMBER);
				((TermPriContext)_localctx).value = (((TermPriContext)_localctx).NUMBER!=null?((TermPriContext)_localctx).NUMBER.getText():null); System.out.print("push "+(((TermPriContext)_localctx).NUMBER!=null?((TermPriContext)_localctx).NUMBER.getText():null)+"\n"); 
																				  h.st.append("msg"+Integer.toString(contadorMsg)+": db \"%d\",10,0\n");
																				  System.out.print("push dword msg"+Integer.toString(contadorMsg)+"\n");
																				  contadorMsg++;	
					
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(144); ((TermPriContext)_localctx).BOOLEAN = match(BOOLEAN);
				((TermPriContext)_localctx).value =  (((TermPriContext)_localctx).BOOLEAN!=null?((TermPriContext)_localctx).BOOLEAN.getText():null);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(146); ((TermPriContext)_localctx).ID = match(ID);
				((TermPriContext)_localctx).value = (((TermPriContext)_localctx).ID!=null?((TermPriContext)_localctx).ID.getText():null);
						
						
						if(!tableSymbols.containsKey((((TermPriContext)_localctx).ID!=null?((TermPriContext)_localctx).ID.getText():null))){
							System.out.println("Error variable no encontrada "+(((TermPriContext)_localctx).ID!=null?((TermPriContext)_localctx).ID.getText():null));
						}
						
						 System.out.print("push dword  ["+(((TermPriContext)_localctx).ID!=null?((TermPriContext)_localctx).ID.getText():null)+"]\n");
						 h.st.append("msg"+Integer.toString(contadorMsg)+": db \"%d\",10,0\n");	  
				         System.out.print("push dword msg"+Integer.toString(contadorMsg)+"\n");	
				         contadorMsg++;
								
						
						
						
					
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompContext extends ParserRuleContext {
		public TerminalNode AND(int i) {
			return getToken(HelloParser.AND, i);
		}
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public List<TerminalNode> LT() { return getTokens(HelloParser.LT); }
		public List<TerminalNode> AND() { return getTokens(HelloParser.AND); }
		public List<TerminalNode> OR() { return getTokens(HelloParser.OR); }
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public TerminalNode OR(int i) {
			return getToken(HelloParser.OR, i);
		}
		public TerminalNode LT(int i) {
			return getToken(HelloParser.LT, i);
		}
		public CompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitComp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitComp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompContext comp() throws RecognitionException {
		CompContext _localctx = new CompContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comp);
		int _la;
		try {
			setState(236);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150); valor();
				setState(155);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(151); match(LT);
					setState(152); valor();

							System.out.println("pop eax");
							System.out.println("pop ebx");
							System.out.println("cmp ebx,eax");
							System.out.println("jnl .else"+Integer.toString(contadorEtiquetas)+"");
							
						
					}
				}

				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND) {
					{
					{
					setState(157); match(AND);
					setState(158); valor();
					setState(163);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(159); match(LT);
						setState(160); valor();
								
								System.out.println("pop eax");
								System.out.println("pop ebx");
								System.out.println("cmp ebx,eax");
								
								

								System.out.println("jnl .else"+Integer.toString(contadorEtiquetas)+"");
								
								
								
								
								
						}
					}

					}
					}
					setState(169);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(170); valor();
				setState(175);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(171); match(LT);
					setState(172); valor();

							System.out.println("pop eax");
							System.out.println("pop ebx");
							System.out.println("cmp ebx,eax");
							System.out.println("jl .elseIF"+Integer.toString(contadorEtiquetas));
							
						
					}
				}

				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OR) {
					{
					{
					setState(177); match(OR);
					setState(178); valor();
					setState(183);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(179); match(LT);
						setState(180); valor();
								
								System.out.println("pop eax");
								System.out.println("pop ebx");
								System.out.println("cmp ebx,eax");
								
								

								System.out.println("jl .elseIF"+Integer.toString(contadorEtiquetas));
								
								
								
								
								
						}
					}

					}
					}
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
					System.out.println("jump .else"+Integer.toString(contadorEtiquetas));
							System.out.println("\n.elseIF"+Integer.toString(contadorEtiquetas)+":");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(192); valor();
				setState(197);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(193); match(LT);
					setState(194); valor();

							System.out.println("pop eax");
							System.out.println("pop ebx");
							System.out.println("cmp ebx,eax");
							System.out.println("jnl .else"+Integer.toString(contadorEtiquetas));
							
						
					}
				}

				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND || _la==OR) {
					{
					{
					setState(199);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(200); valor();
					setState(205);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(201); match(LT);
						setState(202); valor();
								
								System.out.println("pop eax");
								System.out.println("pop ebx");
								System.out.println("cmp ebx,eax");
								
								

								System.out.println("jl .elseIF"+Integer.toString(contadorEtiquetas));
								
								
								
								
								
						}
					}

					}
					}
					setState(211);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}

							System.out.println("jump .else"+Integer.toString(contadorEtiquetas));
							System.out.println("\n.elseIF"+Integer.toString(contadorEtiquetas)+":");
						
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(214); valor();
				setState(219);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(215); match(LT);
					setState(216); valor();

							
							System.out.println("pop eax");
							System.out.println("pop ebx");
							System.out.println("cmp ebx,eax");
							System.out.println("jl .else"+Integer.toString(contadorEtiquetas));
							
						
					}
				}

				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND || _la==OR) {
					{
					{
					setState(221);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(222); valor();
					setState(227);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(223); match(LT);
						setState(224); valor();
							
									
								System.out.println("pop eax");
								System.out.println("pop ebx");
								System.out.println("cmp ebx,eax");
								

								System.out.println("jl .elseIF"+Integer.toString(contadorEtiquetas));
								
								
								
						}
					}

					}
					}
					setState(233);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}

							System.out.println("jump .else"+Integer.toString(contadorEtiquetas));
							System.out.println("\n.elseIF"+Integer.toString(contadorEtiquetas)+":");
						
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValorContext extends ParserRuleContext {
		public Token NUMBER;
		public Token ID;
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(HelloParser.PAR_CLOSE, 0); }
		public TerminalNode PAR_OP() { return getToken(HelloParser.PAR_OP, 0); }
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(HelloParser.NUMBER, 0); }
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitValor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitValor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_valor);
		try {
			setState(246);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(238); ((ValorContext)_localctx).NUMBER = match(NUMBER);
				System.out.println("push "+(((ValorContext)_localctx).NUMBER!=null?((ValorContext)_localctx).NUMBER.getText():null)); 
				}
				break;
			case PAR_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(240); match(PAR_OP);
				setState(241); comp();
				setState(242); match(PAR_CLOSE);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(244); ((ValorContext)_localctx).ID = match(ID);

						
						if(!tableSymbols.containsKey((((ValorContext)_localctx).ID!=null?((ValorContext)_localctx).ID.getText():null))){
							System.out.println("Error no se encuentra la variable "+(((ValorContext)_localctx).ID!=null?((ValorContext)_localctx).ID.getText():null));
						}
						
						
						
						System.out.println("mov ecx, ["+(((ValorContext)_localctx).ID!=null?((ValorContext)_localctx).ID.getText():null)+"]");   
						System.out.println("push ecx");
					
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\37\u00fb\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\7\2!\n\2\f\2\16\2$\13"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3/\n\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5=\n\5\f\5\16\5@\13\5\3\5\3\5\3\5\3\5\3\5"+
		"\7\5G\n\5\f\5\16\5J\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7`\n\7\3\b\3\b\3\b\3\b\3\b\3\b\7"+
		"\bh\n\b\f\b\16\bk\13\b\3\t\3\t\3\t\3\t\3\t\3\t\7\ts\n\t\f\t\16\tv\13\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0082\n\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u008f\n\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\5\f\u0097\n\f\3\r\3\r\3\r\3\r\3\r\5\r\u009e\n\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\5\r\u00a6\n\r\7\r\u00a8\n\r\f\r\16\r\u00ab\13\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u00b2\n\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ba\n\r\7\r\u00bc"+
		"\n\r\f\r\16\r\u00bf\13\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00c8\n\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\5\r\u00d0\n\r\7\r\u00d2\n\r\f\r\16\r\u00d5\13\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00de\n\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00e6"+
		"\n\r\7\r\u00e8\n\r\f\r\16\r\u00eb\13\r\3\r\3\r\5\r\u00ef\n\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00f9\n\16\3\16\2\2\17\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\2\3\3\2\r\16\u010f\2\34\3\2\2\2\4.\3\2\2\2\6\60"+
		"\3\2\2\2\b\65\3\2\2\2\nN\3\2\2\2\f_\3\2\2\2\16a\3\2\2\2\20l\3\2\2\2\22"+
		"\u0081\3\2\2\2\24\u008e\3\2\2\2\26\u0096\3\2\2\2\30\u00ee\3\2\2\2\32\u00f8"+
		"\3\2\2\2\34\35\7\3\2\2\35\36\7\35\2\2\36\"\7\27\2\2\37!\5\4\3\2 \37\3"+
		"\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#%\3\2\2\2$\"\3\2\2\2%&\7\30\2\2"+
		"&\'\b\2\1\2\'\3\3\2\2\2(/\5\6\4\2)*\5\b\5\2*+\b\3\1\2+/\3\2\2\2,/\5\n"+
		"\6\2-/\5\f\7\2.(\3\2\2\2.)\3\2\2\2.,\3\2\2\2.-\3\2\2\2/\5\3\2\2\2\60\61"+
		"\7\5\2\2\61\62\5\26\f\2\62\63\7\33\2\2\63\64\b\4\1\2\64\7\3\2\2\2\65\66"+
		"\7\6\2\2\66\67\7\31\2\2\678\5\30\r\289\7\32\2\29:\b\5\1\2:>\7\27\2\2;"+
		"=\5\4\3\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@>\3\2\2\2"+
		"AB\7\30\2\2BC\7\7\2\2CD\b\5\1\2DH\7\27\2\2EG\5\4\3\2FE\3\2\2\2GJ\3\2\2"+
		"\2HF\3\2\2\2HI\3\2\2\2IK\3\2\2\2JH\3\2\2\2KL\7\30\2\2LM\b\5\1\2M\t\3\2"+
		"\2\2NO\7\4\2\2OP\7\35\2\2PQ\7\33\2\2QR\b\6\1\2R\13\3\2\2\2ST\7\35\2\2"+
		"TU\7\26\2\2UV\5\22\n\2VW\7\33\2\2WX\b\7\1\2X`\3\2\2\2YZ\7\35\2\2Z[\7\26"+
		"\2\2[\\\5\16\b\2\\]\7\33\2\2]^\b\7\1\2^`\3\2\2\2_S\3\2\2\2_Y\3\2\2\2`"+
		"\r\3\2\2\2ab\5\20\t\2bi\b\b\1\2cd\7\t\2\2de\5\20\t\2ef\b\b\1\2fh\3\2\2"+
		"\2gc\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\17\3\2\2\2ki\3\2\2\2lm\5\24"+
		"\13\2mt\b\t\1\2no\7\13\2\2op\5\24\13\2pq\b\t\1\2qs\3\2\2\2rn\3\2\2\2s"+
		"v\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\21\3\2\2\2vt\3\2\2\2wx\7\36\2\2x\u0082"+
		"\b\n\1\2yz\7\31\2\2z{\5\16\b\2{|\7\32\2\2|\u0082\3\2\2\2}~\7\34\2\2~\u0082"+
		"\b\n\1\2\177\u0080\7\35\2\2\u0080\u0082\b\n\1\2\u0081w\3\2\2\2\u0081y"+
		"\3\2\2\2\u0081}\3\2\2\2\u0081\177\3\2\2\2\u0082\23\3\2\2\2\u0083\u0084"+
		"\7\36\2\2\u0084\u008f\b\13\1\2\u0085\u0086\7\31\2\2\u0086\u0087\5\16\b"+
		"\2\u0087\u0088\b\13\1\2\u0088\u0089\7\32\2\2\u0089\u008f\3\2\2\2\u008a"+
		"\u008b\7\34\2\2\u008b\u008f\b\13\1\2\u008c\u008d\7\35\2\2\u008d\u008f"+
		"\b\13\1\2\u008e\u0083\3\2\2\2\u008e\u0085\3\2\2\2\u008e\u008a\3\2\2\2"+
		"\u008e\u008c\3\2\2\2\u008f\25\3\2\2\2\u0090\u0091\7\36\2\2\u0091\u0097"+
		"\b\f\1\2\u0092\u0093\7\34\2\2\u0093\u0097\b\f\1\2\u0094\u0095\7\35\2\2"+
		"\u0095\u0097\b\f\1\2\u0096\u0090\3\2\2\2\u0096\u0092\3\2\2\2\u0096\u0094"+
		"\3\2\2\2\u0097\27\3\2\2\2\u0098\u009d\5\32\16\2\u0099\u009a\7\21\2\2\u009a"+
		"\u009b\5\32\16\2\u009b\u009c\b\r\1\2\u009c\u009e\3\2\2\2\u009d\u0099\3"+
		"\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a9\3\2\2\2\u009f\u00a0\7\r\2\2\u00a0"+
		"\u00a5\5\32\16\2\u00a1\u00a2\7\21\2\2\u00a2\u00a3\5\32\16\2\u00a3\u00a4"+
		"\b\r\1\2\u00a4\u00a6\3\2\2\2\u00a5\u00a1\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\u00a8\3\2\2\2\u00a7\u009f\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2"+
		"\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ef\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac"+
		"\u00b1\5\32\16\2\u00ad\u00ae\7\21\2\2\u00ae\u00af\5\32\16\2\u00af\u00b0"+
		"\b\r\1\2\u00b0\u00b2\3\2\2\2\u00b1\u00ad\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\u00bd\3\2\2\2\u00b3\u00b4\7\16\2\2\u00b4\u00b9\5\32\16\2\u00b5\u00b6"+
		"\7\21\2\2\u00b6\u00b7\5\32\16\2\u00b7\u00b8\b\r\1\2\u00b8\u00ba\3\2\2"+
		"\2\u00b9\u00b5\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b3"+
		"\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\u00c0\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\b\r\1\2\u00c1\u00ef\3\2"+
		"\2\2\u00c2\u00c7\5\32\16\2\u00c3\u00c4\7\21\2\2\u00c4\u00c5\5\32\16\2"+
		"\u00c5\u00c6\b\r\1\2\u00c6\u00c8\3\2\2\2\u00c7\u00c3\3\2\2\2\u00c7\u00c8"+
		"\3\2\2\2\u00c8\u00d3\3\2\2\2\u00c9\u00ca\t\2\2\2\u00ca\u00cf\5\32\16\2"+
		"\u00cb\u00cc\7\21\2\2\u00cc\u00cd\5\32\16\2\u00cd\u00ce\b\r\1\2\u00ce"+
		"\u00d0\3\2\2\2\u00cf\u00cb\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\3\2"+
		"\2\2\u00d1\u00c9\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d7\b\r"+
		"\1\2\u00d7\u00ef\3\2\2\2\u00d8\u00dd\5\32\16\2\u00d9\u00da\7\21\2\2\u00da"+
		"\u00db\5\32\16\2\u00db\u00dc\b\r\1\2\u00dc\u00de\3\2\2\2\u00dd\u00d9\3"+
		"\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e9\3\2\2\2\u00df\u00e0\t\2\2\2\u00e0"+
		"\u00e5\5\32\16\2\u00e1\u00e2\7\21\2\2\u00e2\u00e3\5\32\16\2\u00e3\u00e4"+
		"\b\r\1\2\u00e4\u00e6\3\2\2\2\u00e5\u00e1\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\u00e8\3\2\2\2\u00e7\u00df\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2"+
		"\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec"+
		"\u00ed\b\r\1\2\u00ed\u00ef\3\2\2\2\u00ee\u0098\3\2\2\2\u00ee\u00ac\3\2"+
		"\2\2\u00ee\u00c2\3\2\2\2\u00ee\u00d8\3\2\2\2\u00ef\31\3\2\2\2\u00f0\u00f1"+
		"\7\36\2\2\u00f1\u00f9\b\16\1\2\u00f2\u00f3\7\31\2\2\u00f3\u00f4\5\30\r"+
		"\2\u00f4\u00f5\7\32\2\2\u00f5\u00f9\3\2\2\2\u00f6\u00f7\7\35\2\2\u00f7"+
		"\u00f9\b\16\1\2\u00f8\u00f0\3\2\2\2\u00f8\u00f2\3\2\2\2\u00f8\u00f6\3"+
		"\2\2\2\u00f9\33\3\2\2\2\32\".>H_it\u0081\u008e\u0096\u009d\u00a5\u00a9"+
		"\u00b1\u00b9\u00bd\u00c7\u00cf\u00d3\u00dd\u00e5\u00e9\u00ee\u00f8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}