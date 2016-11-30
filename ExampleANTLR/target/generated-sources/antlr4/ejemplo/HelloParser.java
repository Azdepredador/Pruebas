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
		RULE_term = 8, RULE_term2 = 9, RULE_expresionPri = 10, RULE_factorPri = 11, 
		RULE_termPri = 12, RULE_comp = 13, RULE_valor = 14;
	public static final String[] ruleNames = {
		"program", "sentence", "println", "conditional", "var_decl", "var_assign", 
		"expresion", "factor", "term", "term2", "expresionPri", "factorPri", "termPri", 
		"comp", "valor"
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


		Map<String, Object> entero= new HashMap<String, Object>();
		public static List <Object> listaIf= new ArrayList<Object>();
		
		public boolean hayIf=false;	
		public boolean banderasOp=false;
		

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
			setState(30); match(PROGRAMA);
			setState(31); match(ID);
			setState(32); match(BRACKET_OP);

					List<ASTNode> body = new ArrayList<ASTNode>();
					Map<String, Object> symbolTable = new HashMap<String,Object>();
					Map<String, Object> dataType = new HashMap<String,Object>();
				
				
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PRINTLN) | (1L << IF) | (1L << ID))) != 0)) {
				{
				{
				setState(34); sentence();

				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42); match(BRACKET_CLOSE);

				
				System.out.println(".done: ");
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
		public ASTNode node;
		public PrintlnContext println;
		public ConditionalContext conditional;
		public Var_declContext var_decl;
		public Var_assignContext var_assign;
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
			setState(57);
			switch (_input.LA(1)) {
			case PRINTLN:
				enterOuterAlt(_localctx, 1);
				{
				setState(45); ((SentenceContext)_localctx).println = println();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).println.node;
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(48); ((SentenceContext)_localctx).conditional = conditional();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).conditional.node;
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(51); ((SentenceContext)_localctx).var_decl = var_decl();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).var_decl.node;
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(54); ((SentenceContext)_localctx).var_assign = var_assign();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).var_assign.node;
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
		public ASTNode node;
		public Token PRINTLN;
		public ExpresionPriContext expresionPri;
		public ExpresionPriContext expresionPri() {
			return getRuleContext(ExpresionPriContext.class,0);
		}
		public TerminalNode PRINTLN() { return getToken(HelloParser.PRINTLN, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(HelloParser.PUNTO_COMA, 0); }
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
			setState(59); ((PrintlnContext)_localctx).PRINTLN = match(PRINTLN);
			setState(60); ((PrintlnContext)_localctx).expresionPri = expresionPri();
			setState(61); match(PUNTO_COMA);
			((PrintlnContext)_localctx).node =  new Println(((PrintlnContext)_localctx).expresionPri.node, (((PrintlnContext)_localctx).PRINTLN!=null?((PrintlnContext)_localctx).PRINTLN.getLine():0));
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
		public ASTNode node;
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
			setState(64); match(IF);
			setState(65); match(PAR_OP);
			setState(66); comp();
			setState(67); match(PAR_CLOSE);

							hayIf=true;
						
			setState(69); match(BRACKET_OP);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PRINTLN) | (1L << IF) | (1L << ID))) != 0)) {
				{
				{
				setState(70); sentence();
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76); match(BRACKET_CLOSE);
			setState(77); match(ELSE);
			 
							System.out.println("jmp .done");
							System.out.println(".else: ");
						
			setState(79); match(BRACKET_OP);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PRINTLN) | (1L << IF) | (1L << ID))) != 0)) {
				{
				{
				setState(80); sentence();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86); match(BRACKET_CLOSE);

							
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
		public ASTNode node;
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
			setState(89); match(VAR);
			setState(90); ((Var_declContext)_localctx).ID = match(ID);
			setState(91); match(PUNTO_COMA);

							
						if(hayIf){
							listaIf.add((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null));
						}
						
						((Var_declContext)_localctx).node =  new varDecl((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null),"entero");
						entero.put((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null),"entero");
					
					
					
				
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
		public ASTNode node;
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
			setState(106);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94); ((Var_assignContext)_localctx).ID = match(ID);
				setState(95); match(ASSIGN);
				setState(96); ((Var_assignContext)_localctx).term = term();
				setState(97); match(PUNTO_COMA);

				 		((Var_assignContext)_localctx).node =  new VarAssign((((Var_assignContext)_localctx).ID!=null?((Var_assignContext)_localctx).ID.getText():null), ((Var_assignContext)_localctx).term.node);
				 		System.out.print("mov ["+(((Var_assignContext)_localctx).ID!=null?((Var_assignContext)_localctx).ID.getText():null)+"] ,eax\n");
				 	//	banderasOp=false;
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100); ((Var_assignContext)_localctx).ID = match(ID);
				setState(101); match(ASSIGN);
				setState(102); ((Var_assignContext)_localctx).expresion = expresion();
				setState(103); match(PUNTO_COMA);

				 		((Var_assignContext)_localctx).node =  new VarAssign((((Var_assignContext)_localctx).ID!=null?((Var_assignContext)_localctx).ID.getText():null), ((Var_assignContext)_localctx).expresion.node);
				 		System.out.print("mov ["+(((Var_assignContext)_localctx).ID!=null?((Var_assignContext)_localctx).ID.getText():null)+"] ,eax\n");
				 		System.out.print("add esp,4\n");
				 	//	banderasOp=false;
				    
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
		public ASTNode node;
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
			setState(108); ((ExpresionContext)_localctx).t1 = factor();
			((ExpresionContext)_localctx).node =  ((ExpresionContext)_localctx).t1.node; 	
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(110); match(PLUS);
				setState(111); ((ExpresionContext)_localctx).t2 = factor();
				((ExpresionContext)_localctx).node =  new Addition(_localctx.node, ((ExpresionContext)_localctx).t2.node);
							System.out.println("pop ecx");
							System.out.println("pop eax");
							System.out.println("add eax,ecx");
							System.out.println("push eax");			

								
								
								
							
				}
				}
				setState(118);
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
		public ASTNode node;
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
			setState(119); ((FactorContext)_localctx).t1 = term2();
			((FactorContext)_localctx).node =  ((FactorContext)_localctx).t1.node; 
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT) {
				{
				{
				setState(121); match(MULT);
				setState(122); ((FactorContext)_localctx).t2 = term2();
				((FactorContext)_localctx).node =  new Multiplication(_localctx.node,((FactorContext)_localctx).t2.node);  
							System.out.println("pop ecx");
							System.out.println("pop eax");
							System.out.println("mul ecx");
							System.out.println("push eax");
						
					
				}
				}
				setState(129);
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
		public ASTNode node;
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
			setState(141);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(130); ((TermContext)_localctx).NUMBER = match(NUMBER);
				((TermContext)_localctx).node =  new Constant(Integer.parseInt((((TermContext)_localctx).NUMBER!=null?((TermContext)_localctx).NUMBER.getText():null))); 
							
						//if(!banderasOp)
						System.out.print("mov eax ,"+(((TermContext)_localctx).NUMBER!=null?((TermContext)_localctx).NUMBER.getText():null)+"\n");

					
				}
				break;
			case PAR_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(132); match(PAR_OP);
				setState(133); ((TermContext)_localctx).expresion = expresion();
				 ((TermContext)_localctx).node =  ((TermContext)_localctx).expresion.node;
				setState(135); match(PAR_CLOSE);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(137); ((TermContext)_localctx).BOOLEAN = match(BOOLEAN);
				((TermContext)_localctx).node =  new Constant(Boolean.parseBoolean((((TermContext)_localctx).BOOLEAN!=null?((TermContext)_localctx).BOOLEAN.getText():null)));
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(139); ((TermContext)_localctx).ID = match(ID);
				((TermContext)_localctx).node =  new VarRef((((TermContext)_localctx).ID!=null?((TermContext)_localctx).ID.getText():null)); 
						
						//if(!banderasOp)
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
		public ASTNode node;
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
			setState(154);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(143); ((Term2Context)_localctx).NUMBER = match(NUMBER);
				((Term2Context)_localctx).node =  new Constant(Integer.parseInt((((Term2Context)_localctx).NUMBER!=null?((Term2Context)_localctx).NUMBER.getText():null))); 
						System.out.println("mov ecx , "+(((Term2Context)_localctx).NUMBER!=null?((Term2Context)_localctx).NUMBER.getText():null));
						//System.out.println("mov ecx , eax");
						System.out.println("push ecx "); 
					
				}
				break;
			case PAR_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(145); match(PAR_OP);
				setState(146); ((Term2Context)_localctx).expresion = expresion();
				 ((Term2Context)_localctx).node =  ((Term2Context)_localctx).expresion.node;
				setState(148); match(PAR_CLOSE);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(150); ((Term2Context)_localctx).BOOLEAN = match(BOOLEAN);
				((Term2Context)_localctx).node =  new Constant(Boolean.parseBoolean((((Term2Context)_localctx).BOOLEAN!=null?((Term2Context)_localctx).BOOLEAN.getText():null)));
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(152); ((Term2Context)_localctx).ID = match(ID);
				((Term2Context)_localctx).node =  new VarRef((((Term2Context)_localctx).ID!=null?((Term2Context)_localctx).ID.getText():null)); 
						
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

	public static class ExpresionPriContext extends ParserRuleContext {
		public ASTNode node;
		public FactorPriContext t1;
		public FactorPriContext t2;
		public List<TerminalNode> PLUS() { return getTokens(HelloParser.PLUS); }
		public FactorPriContext factorPri(int i) {
			return getRuleContext(FactorPriContext.class,i);
		}
		public TerminalNode PLUS(int i) {
			return getToken(HelloParser.PLUS, i);
		}
		public List<FactorPriContext> factorPri() {
			return getRuleContexts(FactorPriContext.class);
		}
		public ExpresionPriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionPri; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterExpresionPri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitExpresionPri(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitExpresionPri(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionPriContext expresionPri() throws RecognitionException {
		ExpresionPriContext _localctx = new ExpresionPriContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expresionPri);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156); ((ExpresionPriContext)_localctx).t1 = factorPri();
			((ExpresionPriContext)_localctx).node =  ((ExpresionPriContext)_localctx).t1.node;
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(158); match(PLUS);
				setState(159); ((ExpresionPriContext)_localctx).t2 = factorPri();
				((ExpresionPriContext)_localctx).node =  new Addition(_localctx.node, ((ExpresionPriContext)_localctx).t2.node);
				}
				}
				setState(166);
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

	public static class FactorPriContext extends ParserRuleContext {
		public ASTNode node;
		public TermPriContext t1;
		public TermPriContext t2;
		public TerminalNode MULT(int i) {
			return getToken(HelloParser.MULT, i);
		}
		public List<TerminalNode> MULT() { return getTokens(HelloParser.MULT); }
		public TermPriContext termPri(int i) {
			return getRuleContext(TermPriContext.class,i);
		}
		public List<TermPriContext> termPri() {
			return getRuleContexts(TermPriContext.class);
		}
		public FactorPriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factorPri; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterFactorPri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitFactorPri(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitFactorPri(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorPriContext factorPri() throws RecognitionException {
		FactorPriContext _localctx = new FactorPriContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_factorPri);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167); ((FactorPriContext)_localctx).t1 = termPri();
			((FactorPriContext)_localctx).node =  ((FactorPriContext)_localctx).t1.node;
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT) {
				{
				{
				setState(169); match(MULT);
				setState(170); ((FactorPriContext)_localctx).t2 = termPri();
				((FactorPriContext)_localctx).node =  new Multiplication(_localctx.node,((FactorPriContext)_localctx).t2.node);
				}
				}
				setState(177);
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

	public static class TermPriContext extends ParserRuleContext {
		public ASTNode node;
		public Token NUMBER;
		public ExpresionPriContext expresionPri;
		public Token BOOLEAN;
		public Token ID;
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(HelloParser.PAR_CLOSE, 0); }
		public ExpresionPriContext expresionPri() {
			return getRuleContext(ExpresionPriContext.class,0);
		}
		public TerminalNode PAR_OP() { return getToken(HelloParser.PAR_OP, 0); }
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
		enterRule(_localctx, 24, RULE_termPri);
		try {
			setState(189);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(178); ((TermPriContext)_localctx).NUMBER = match(NUMBER);
				((TermPriContext)_localctx).node =  new Constant(Integer.parseInt((((TermPriContext)_localctx).NUMBER!=null?((TermPriContext)_localctx).NUMBER.getText():null))); System.out.print("push "+(((TermPriContext)_localctx).NUMBER!=null?((TermPriContext)_localctx).NUMBER.getText():null)+"\n"); 
																				  System.out.print("msg1: db \"%d\",10,0\n");
																				  System.out.print("push dword msg1\n");	
					
				}
				break;
			case PAR_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(180); match(PAR_OP);
				setState(181); ((TermPriContext)_localctx).expresionPri = expresionPri();
				 ((TermPriContext)_localctx).node =  ((TermPriContext)_localctx).expresionPri.node;
				setState(183); match(PAR_CLOSE);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(185); ((TermPriContext)_localctx).BOOLEAN = match(BOOLEAN);
				((TermPriContext)_localctx).node =  new Constant(Boolean.parseBoolean((((TermPriContext)_localctx).BOOLEAN!=null?((TermPriContext)_localctx).BOOLEAN.getText():null)));
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(187); ((TermPriContext)_localctx).ID = match(ID);
				((TermPriContext)_localctx).node =  new VarRef((((TermPriContext)_localctx).ID!=null?((TermPriContext)_localctx).ID.getText():null)); System.out.print("push dword  ["+(((TermPriContext)_localctx).ID!=null?((TermPriContext)_localctx).ID.getText():null)+"]\n");
													  System.out.print("msg2: db \"%d\",10,0\n");
										              System.out.print("push dword msg2\n");	
								
						
						
						
					
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
		public ASTNode node;
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
		enterRule(_localctx, 26, RULE_comp);
		int _la;
		try {
			setState(285);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(191); valor();
				setState(196);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(192); match(LT);
					setState(193); valor();

							System.out.println("pop eax");
							System.out.println("pop ebx");
							System.out.println("cmp ebx,eax");
							System.out.println("jnl .else");
							
						
					}
				}

				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND) {
					{
					{
					setState(198); match(AND);
					setState(199); valor();
					setState(204);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(200); match(LT);
						setState(201); valor();
								
								System.out.println("pop eax");
								System.out.println("pop ebx");
								System.out.println("cmp ebx,eax");
								
								

								System.out.println("jnl .else");
								
								
								
								
								
						}
					}

					}
					}
					setState(210);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211); valor();
				setState(216);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(212); match(LT);
					setState(213); valor();

							System.out.println("pop eax");
							System.out.println("pop ebx");
							System.out.println("cmp ebx,eax");
							System.out.println("jl .elseIF");
							
						
					}
				}

				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OR) {
					{
					{
					setState(218); match(OR);
					setState(219); valor();
					setState(224);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(220); match(LT);
						setState(221); valor();
								
								System.out.println("pop eax");
								System.out.println("pop ebx");
								System.out.println("cmp ebx,eax");
								
								

								System.out.println("jl .elseIF");
								
								
								
								
								
						}
					}

					}
					}
					setState(230);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
					System.out.println("jump .else");
							System.out.println("\n.elseIF:");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(233); valor();
				setState(238);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(234); match(LT);
					setState(235); valor();

							System.out.println("pop eax");
							System.out.println("pop ebx");
							System.out.println("cmp ebx,eax");
							System.out.println("jnl .else");
							
						
					}
				}

				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND || _la==OR) {
					{
					{
					setState(243);
					switch (_input.LA(1)) {
					case AND:
						{
						setState(240); match(AND);
						}
						break;
					case OR:
						{
						setState(241); match(OR);
						 banderasOp=true; 
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(245); valor();
					setState(250);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(246); match(LT);
						setState(247); valor();
								
								System.out.println("pop eax");
								System.out.println("pop ebx");
								System.out.println("cmp ebx,eax");
								
								

								System.out.println("jl .elseIF");
								
								
								
								
								
						}
					}

					}
					}
					setState(256);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}

							System.out.println("jump .else");
							System.out.println("\n.elseIF:");
						
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(259); valor();
				setState(264);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(260); match(LT);
					setState(261); valor();

							
							System.out.println("pop eax");
							System.out.println("pop ebx");
							System.out.println("cmp ebx,eax");
							System.out.println("jl .else");
							
						
					}
				}

				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND || _la==OR) {
					{
					{
					setState(269);
					switch (_input.LA(1)) {
					case OR:
						{
						setState(266); match(OR);
						}
						break;
					case AND:
						{
						setState(267); match(AND);
						 banderasOp=true; 
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(271); valor();
					setState(276);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(272); match(LT);
						setState(273); valor();
							
									
								System.out.println("pop eax");
								System.out.println("pop ebx");
								System.out.println("cmp ebx,eax");
								

								System.out.println("jl .elseIF");
								
								
								
						}
					}

					}
					}
					setState(282);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}

							System.out.println("jump .else");
							System.out.println("\n.elseIF:");
						
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
		public ASTNode node;
		public Token NUMBER;
		public CompContext comp;
		public Token BOOLEAN;
		public Token ID;
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(HelloParser.PAR_CLOSE, 0); }
		public TerminalNode PAR_OP() { return getToken(HelloParser.PAR_OP, 0); }
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(HelloParser.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(HelloParser.BOOLEAN, 0); }
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
		enterRule(_localctx, 28, RULE_valor);
		try {
			setState(298);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(287); ((ValorContext)_localctx).NUMBER = match(NUMBER);
				((ValorContext)_localctx).node =  new Constant(Integer.parseInt((((ValorContext)_localctx).NUMBER!=null?((ValorContext)_localctx).NUMBER.getText():null)));  System.out.println("push "+(((ValorContext)_localctx).NUMBER!=null?((ValorContext)_localctx).NUMBER.getText():null)); 
				}
				break;
			case PAR_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(289); match(PAR_OP);
				setState(290); ((ValorContext)_localctx).comp = comp();
				 ((ValorContext)_localctx).node =  ((ValorContext)_localctx).comp.node;
				setState(292); match(PAR_CLOSE);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(294); ((ValorContext)_localctx).BOOLEAN = match(BOOLEAN);
				((ValorContext)_localctx).node =  new Constant(Boolean.parseBoolean((((ValorContext)_localctx).BOOLEAN!=null?((ValorContext)_localctx).BOOLEAN.getText():null)));
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(296); ((ValorContext)_localctx).ID = match(ID);
				((ValorContext)_localctx).node =  new VarRef((((ValorContext)_localctx).ID!=null?((ValorContext)_localctx).ID.getText():null));
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\37\u012f\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\7\2(\n\2\f\2\16\2+\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3<\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\7\5J\n\5\f\5\16\5M\13\5\3\5\3\5\3\5\3\5\3\5\7\5T\n\5\f\5"+
		"\16\5W\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\5\7m\n\7\3\b\3\b\3\b\3\b\3\b\3\b\7\bu\n\b\f\b\16"+
		"\bx\13\b\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0080\n\t\f\t\16\t\u0083\13\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0090\n\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u009d\n\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\7\f\u00a5\n\f\f\f\16\f\u00a8\13\f\3\r\3\r\3\r\3\r\3\r\3\r\7"+
		"\r\u00b0\n\r\f\r\16\r\u00b3\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\5\16\u00c0\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u00c7"+
		"\n\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00cf\n\17\7\17\u00d1\n\17\f"+
		"\17\16\17\u00d4\13\17\3\17\3\17\3\17\3\17\3\17\5\17\u00db\n\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\5\17\u00e3\n\17\7\17\u00e5\n\17\f\17\16\17\u00e8"+
		"\13\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00f1\n\17\3\17\3\17\3"+
		"\17\5\17\u00f6\n\17\3\17\3\17\3\17\3\17\3\17\5\17\u00fd\n\17\7\17\u00ff"+
		"\n\17\f\17\16\17\u0102\13\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u010b"+
		"\n\17\3\17\3\17\3\17\5\17\u0110\n\17\3\17\3\17\3\17\3\17\3\17\5\17\u0117"+
		"\n\17\7\17\u0119\n\17\f\17\16\17\u011c\13\17\3\17\3\17\5\17\u0120\n\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u012d\n\20"+
		"\3\20\2\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\2\u0147\2 \3\2\2"+
		"\2\4;\3\2\2\2\6=\3\2\2\2\bB\3\2\2\2\n[\3\2\2\2\fl\3\2\2\2\16n\3\2\2\2"+
		"\20y\3\2\2\2\22\u008f\3\2\2\2\24\u009c\3\2\2\2\26\u009e\3\2\2\2\30\u00a9"+
		"\3\2\2\2\32\u00bf\3\2\2\2\34\u011f\3\2\2\2\36\u012c\3\2\2\2 !\7\3\2\2"+
		"!\"\7\35\2\2\"#\7\27\2\2#)\b\2\1\2$%\5\4\3\2%&\b\2\1\2&(\3\2\2\2\'$\3"+
		"\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*,\3\2\2\2+)\3\2\2\2,-\7\30\2\2-"+
		".\b\2\1\2.\3\3\2\2\2/\60\5\6\4\2\60\61\b\3\1\2\61<\3\2\2\2\62\63\5\b\5"+
		"\2\63\64\b\3\1\2\64<\3\2\2\2\65\66\5\n\6\2\66\67\b\3\1\2\67<\3\2\2\28"+
		"9\5\f\7\29:\b\3\1\2:<\3\2\2\2;/\3\2\2\2;\62\3\2\2\2;\65\3\2\2\2;8\3\2"+
		"\2\2<\5\3\2\2\2=>\7\5\2\2>?\5\26\f\2?@\7\33\2\2@A\b\4\1\2A\7\3\2\2\2B"+
		"C\7\6\2\2CD\7\31\2\2DE\5\34\17\2EF\7\32\2\2FG\b\5\1\2GK\7\27\2\2HJ\5\4"+
		"\3\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2MK\3\2\2\2NO\7\30"+
		"\2\2OP\7\7\2\2PQ\b\5\1\2QU\7\27\2\2RT\5\4\3\2SR\3\2\2\2TW\3\2\2\2US\3"+
		"\2\2\2UV\3\2\2\2VX\3\2\2\2WU\3\2\2\2XY\7\30\2\2YZ\b\5\1\2Z\t\3\2\2\2["+
		"\\\7\4\2\2\\]\7\35\2\2]^\7\33\2\2^_\b\6\1\2_\13\3\2\2\2`a\7\35\2\2ab\7"+
		"\26\2\2bc\5\22\n\2cd\7\33\2\2de\b\7\1\2em\3\2\2\2fg\7\35\2\2gh\7\26\2"+
		"\2hi\5\16\b\2ij\7\33\2\2jk\b\7\1\2km\3\2\2\2l`\3\2\2\2lf\3\2\2\2m\r\3"+
		"\2\2\2no\5\20\t\2ov\b\b\1\2pq\7\t\2\2qr\5\20\t\2rs\b\b\1\2su\3\2\2\2t"+
		"p\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\17\3\2\2\2xv\3\2\2\2yz\5\24\13"+
		"\2z\u0081\b\t\1\2{|\7\13\2\2|}\5\24\13\2}~\b\t\1\2~\u0080\3\2\2\2\177"+
		"{\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\21\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\7\36\2\2\u0085\u0090\b\n\1"+
		"\2\u0086\u0087\7\31\2\2\u0087\u0088\5\16\b\2\u0088\u0089\b\n\1\2\u0089"+
		"\u008a\7\32\2\2\u008a\u0090\3\2\2\2\u008b\u008c\7\34\2\2\u008c\u0090\b"+
		"\n\1\2\u008d\u008e\7\35\2\2\u008e\u0090\b\n\1\2\u008f\u0084\3\2\2\2\u008f"+
		"\u0086\3\2\2\2\u008f\u008b\3\2\2\2\u008f\u008d\3\2\2\2\u0090\23\3\2\2"+
		"\2\u0091\u0092\7\36\2\2\u0092\u009d\b\13\1\2\u0093\u0094\7\31\2\2\u0094"+
		"\u0095\5\16\b\2\u0095\u0096\b\13\1\2\u0096\u0097\7\32\2\2\u0097\u009d"+
		"\3\2\2\2\u0098\u0099\7\34\2\2\u0099\u009d\b\13\1\2\u009a\u009b\7\35\2"+
		"\2\u009b\u009d\b\13\1\2\u009c\u0091\3\2\2\2\u009c\u0093\3\2\2\2\u009c"+
		"\u0098\3\2\2\2\u009c\u009a\3\2\2\2\u009d\25\3\2\2\2\u009e\u009f\5\30\r"+
		"\2\u009f\u00a6\b\f\1\2\u00a0\u00a1\7\t\2\2\u00a1\u00a2\5\30\r\2\u00a2"+
		"\u00a3\b\f\1\2\u00a3\u00a5\3\2\2\2\u00a4\u00a0\3\2\2\2\u00a5\u00a8\3\2"+
		"\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\27\3\2\2\2\u00a8\u00a6"+
		"\3\2\2\2\u00a9\u00aa\5\32\16\2\u00aa\u00b1\b\r\1\2\u00ab\u00ac\7\13\2"+
		"\2\u00ac\u00ad\5\32\16\2\u00ad\u00ae\b\r\1\2\u00ae\u00b0\3\2\2\2\u00af"+
		"\u00ab\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2"+
		"\2\2\u00b2\31\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5\7\36\2\2\u00b5\u00c0"+
		"\b\16\1\2\u00b6\u00b7\7\31\2\2\u00b7\u00b8\5\26\f\2\u00b8\u00b9\b\16\1"+
		"\2\u00b9\u00ba\7\32\2\2\u00ba\u00c0\3\2\2\2\u00bb\u00bc\7\34\2\2\u00bc"+
		"\u00c0\b\16\1\2\u00bd\u00be\7\35\2\2\u00be\u00c0\b\16\1\2\u00bf\u00b4"+
		"\3\2\2\2\u00bf\u00b6\3\2\2\2\u00bf\u00bb\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0"+
		"\33\3\2\2\2\u00c1\u00c6\5\36\20\2\u00c2\u00c3\7\21\2\2\u00c3\u00c4\5\36"+
		"\20\2\u00c4\u00c5\b\17\1\2\u00c5\u00c7\3\2\2\2\u00c6\u00c2\3\2\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7\u00d2\3\2\2\2\u00c8\u00c9\7\r\2\2\u00c9\u00ce\5\36"+
		"\20\2\u00ca\u00cb\7\21\2\2\u00cb\u00cc\5\36\20\2\u00cc\u00cd\b\17\1\2"+
		"\u00cd\u00cf\3\2\2\2\u00ce\u00ca\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1"+
		"\3\2\2\2\u00d0\u00c8\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\u0120\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00da\5\36"+
		"\20\2\u00d6\u00d7\7\21\2\2\u00d7\u00d8\5\36\20\2\u00d8\u00d9\b\17\1\2"+
		"\u00d9\u00db\3\2\2\2\u00da\u00d6\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00e6"+
		"\3\2\2\2\u00dc\u00dd\7\16\2\2\u00dd\u00e2\5\36\20\2\u00de\u00df\7\21\2"+
		"\2\u00df\u00e0\5\36\20\2\u00e0\u00e1\b\17\1\2\u00e1\u00e3\3\2\2\2\u00e2"+
		"\u00de\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00dc\3\2"+
		"\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\u00e9\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea\b\17\1\2\u00ea\u0120\3"+
		"\2\2\2\u00eb\u00f0\5\36\20\2\u00ec\u00ed\7\21\2\2\u00ed\u00ee\5\36\20"+
		"\2\u00ee\u00ef\b\17\1\2\u00ef\u00f1\3\2\2\2\u00f0\u00ec\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1\u0100\3\2\2\2\u00f2\u00f6\7\r\2\2\u00f3\u00f4\7\16"+
		"\2\2\u00f4\u00f6\b\17\1\2\u00f5\u00f2\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7\u00fc\5\36\20\2\u00f8\u00f9\7\21\2\2\u00f9\u00fa"+
		"\5\36\20\2\u00fa\u00fb\b\17\1\2\u00fb\u00fd\3\2\2\2\u00fc\u00f8\3\2\2"+
		"\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00f5\3\2\2\2\u00ff\u0102"+
		"\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0103\u0104\b\17\1\2\u0104\u0120\3\2\2\2\u0105\u010a\5"+
		"\36\20\2\u0106\u0107\7\21\2\2\u0107\u0108\5\36\20\2\u0108\u0109\b\17\1"+
		"\2\u0109\u010b\3\2\2\2\u010a\u0106\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u011a"+
		"\3\2\2\2\u010c\u0110\7\16\2\2\u010d\u010e\7\r\2\2\u010e\u0110\b\17\1\2"+
		"\u010f\u010c\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0116"+
		"\5\36\20\2\u0112\u0113\7\21\2\2\u0113\u0114\5\36\20\2\u0114\u0115\b\17"+
		"\1\2\u0115\u0117\3\2\2\2\u0116\u0112\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"\u0119\3\2\2\2\u0118\u010f\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2"+
		"\2\2\u011a\u011b\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u011a\3\2\2\2\u011d"+
		"\u011e\b\17\1\2\u011e\u0120\3\2\2\2\u011f\u00c1\3\2\2\2\u011f\u00d5\3"+
		"\2\2\2\u011f\u00eb\3\2\2\2\u011f\u0105\3\2\2\2\u0120\35\3\2\2\2\u0121"+
		"\u0122\7\36\2\2\u0122\u012d\b\20\1\2\u0123\u0124\7\31\2\2\u0124\u0125"+
		"\5\34\17\2\u0125\u0126\b\20\1\2\u0126\u0127\7\32\2\2\u0127\u012d\3\2\2"+
		"\2\u0128\u0129\7\34\2\2\u0129\u012d\b\20\1\2\u012a\u012b\7\35\2\2\u012b"+
		"\u012d\b\20\1\2\u012c\u0121\3\2\2\2\u012c\u0123\3\2\2\2\u012c\u0128\3"+
		"\2\2\2\u012c\u012a\3\2\2\2\u012d\37\3\2\2\2\36);KUlv\u0081\u008f\u009c"+
		"\u00a6\u00b1\u00bf\u00c6\u00ce\u00d2\u00da\u00e2\u00e6\u00f0\u00f5\u00fc"+
		"\u0100\u010a\u010f\u0116\u011a\u011f\u012c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}