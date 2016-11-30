// Generated from Hello.g4 by ANTLR 4.4

	package ejemplo;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAMA=1, VAR=2, PRINTLN=3, IF=4, ELSE=5, ELSEIF=6, PLUS=7, MINUS=8, 
		MULT=9, DIV=10, AND=11, OR=12, NOT=13, GT=14, LT=15, GEQ=16, LEQ=17, EQ=18, 
		NEQ=19, ASSIGN=20, BRACKET_OP=21, BRACKET_CLOSE=22, PAR_OP=23, PAR_CLOSE=24, 
		PUNTO_COMA=25, BOOLEAN=26, ID=27, NUMBER=28, WS=29;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'"
	};
	public static final String[] ruleNames = {
		"PROGRAMA", "VAR", "PRINTLN", "IF", "ELSE", "ELSEIF", "PLUS", "MINUS", 
		"MULT", "DIV", "AND", "OR", "NOT", "GT", "LT", "GEQ", "LEQ", "EQ", "NEQ", 
		"ASSIGN", "BRACKET_OP", "BRACKET_CLOSE", "PAR_OP", "PAR_CLOSE", "PUNTO_COMA", 
		"BOOLEAN", "ID", "NUMBER", "WS"
	};


	public HelloLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Hello.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 27: NUMBER_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void NUMBER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:  break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\37\u00ac\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0096\n\33\3\34\3\34\7\34\u009a\n"+
		"\34\f\34\16\34\u009d\13\34\3\35\6\35\u00a0\n\35\r\35\16\35\u00a1\3\35"+
		"\3\35\3\36\6\36\u00a7\n\36\r\36\16\36\u00a8\3\36\3\36\2\2\37\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37\3\2\6\5"+
		"\2C\\aac|\6\2\62;C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\u00af\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\3=\3\2"+
		"\2\2\5E\3\2\2\2\7I\3\2\2\2\tQ\3\2\2\2\13T\3\2\2\2\rY\3\2\2\2\17`\3\2\2"+
		"\2\21b\3\2\2\2\23d\3\2\2\2\25f\3\2\2\2\27h\3\2\2\2\31k\3\2\2\2\33n\3\2"+
		"\2\2\35p\3\2\2\2\37r\3\2\2\2!t\3\2\2\2#w\3\2\2\2%z\3\2\2\2\'}\3\2\2\2"+
		")\u0080\3\2\2\2+\u0082\3\2\2\2-\u0084\3\2\2\2/\u0086\3\2\2\2\61\u0088"+
		"\3\2\2\2\63\u008a\3\2\2\2\65\u0095\3\2\2\2\67\u0097\3\2\2\29\u009f\3\2"+
		"\2\2;\u00a6\3\2\2\2=>\7r\2\2>?\7t\2\2?@\7q\2\2@A\7i\2\2AB\7t\2\2BC\7c"+
		"\2\2CD\7o\2\2D\4\3\2\2\2EF\7x\2\2FG\7c\2\2GH\7t\2\2H\6\3\2\2\2IJ\7r\2"+
		"\2JK\7t\2\2KL\7k\2\2LM\7p\2\2MN\7v\2\2NO\7n\2\2OP\7p\2\2P\b\3\2\2\2QR"+
		"\7k\2\2RS\7h\2\2S\n\3\2\2\2TU\7g\2\2UV\7n\2\2VW\7u\2\2WX\7g\2\2X\f\3\2"+
		"\2\2YZ\7g\2\2Z[\7n\2\2[\\\7u\2\2\\]\7g\2\2]^\7k\2\2^_\7h\2\2_\16\3\2\2"+
		"\2`a\7-\2\2a\20\3\2\2\2bc\7/\2\2c\22\3\2\2\2de\7,\2\2e\24\3\2\2\2fg\7"+
		"\61\2\2g\26\3\2\2\2hi\7(\2\2ij\7(\2\2j\30\3\2\2\2kl\7~\2\2lm\7~\2\2m\32"+
		"\3\2\2\2no\7#\2\2o\34\3\2\2\2pq\7@\2\2q\36\3\2\2\2rs\7>\2\2s \3\2\2\2"+
		"tu\7@\2\2uv\7?\2\2v\"\3\2\2\2wx\7>\2\2xy\7?\2\2y$\3\2\2\2z{\7?\2\2{|\7"+
		"?\2\2|&\3\2\2\2}~\7#\2\2~\177\7?\2\2\177(\3\2\2\2\u0080\u0081\7?\2\2\u0081"+
		"*\3\2\2\2\u0082\u0083\7}\2\2\u0083,\3\2\2\2\u0084\u0085\7\177\2\2\u0085"+
		".\3\2\2\2\u0086\u0087\7*\2\2\u0087\60\3\2\2\2\u0088\u0089\7+\2\2\u0089"+
		"\62\3\2\2\2\u008a\u008b\7=\2\2\u008b\64\3\2\2\2\u008c\u008d\7v\2\2\u008d"+
		"\u008e\7t\2\2\u008e\u008f\7w\2\2\u008f\u0096\7g\2\2\u0090\u0091\7h\2\2"+
		"\u0091\u0092\7c\2\2\u0092\u0093\7n\2\2\u0093\u0094\7u\2\2\u0094\u0096"+
		"\7g\2\2\u0095\u008c\3\2\2\2\u0095\u0090\3\2\2\2\u0096\66\3\2\2\2\u0097"+
		"\u009b\t\2\2\2\u0098\u009a\t\3\2\2\u0099\u0098\3\2\2\2\u009a\u009d\3\2"+
		"\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c8\3\2\2\2\u009d\u009b"+
		"\3\2\2\2\u009e\u00a0\t\4\2\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\b\35"+
		"\2\2\u00a4:\3\2\2\2\u00a5\u00a7\t\5\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8"+
		"\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ab\b\36\3\2\u00ab<\3\2\2\2\7\2\u0095\u009b\u00a1\u00a8\4\3\35\2\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}