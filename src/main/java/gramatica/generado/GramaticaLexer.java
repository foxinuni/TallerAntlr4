package gramatica.generado;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GramaticaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, IDENTIFICADOR=15, INT=16, 
		DECIMAL=17, STRING=18, ASIGNACION=19, OPERADORCOMPARACION=20, OPERADORLOGICO=21, 
		FINALIZADOR=22, BLANCO=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "IDENTIFICADOR", "INT", "DECIMAL", 
			"STRING", "ASIGNACION", "OPERADORCOMPARACION", "OPERADORLOGICO", "FINALIZADOR", 
			"BLANCO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Escribir'", "'si'", "'('", "')'", "'{'", "'}'", "'sino'", "'mientras'", 
			"'+'", "'-'", "'*'", "'/'", "'^'", "'%'", null, null, null, null, "'='", 
			null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "IDENTIFICADOR", "INT", "DECIMAL", "STRING", "ASIGNACION", 
			"OPERADORCOMPARACION", "OPERADORLOGICO", "FINALIZADOR", "BLANCO"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public GramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0017\u0099\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0005\u000e`\b\u000e\n\u000e\f\u000ec\t\u000e\u0001\u000f"+
		"\u0004\u000ff\b\u000f\u000b\u000f\f\u000fg\u0001\u0010\u0004\u0010k\b"+
		"\u0010\u000b\u0010\f\u0010l\u0001\u0010\u0001\u0010\u0004\u0010q\b\u0010"+
		"\u000b\u0010\f\u0010r\u0001\u0011\u0001\u0011\u0005\u0011w\b\u0011\n\u0011"+
		"\f\u0011z\t\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0089\b\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u008f\b\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0004\u0016\u0094\b\u0016\u000b\u0016\f\u0016\u0095"+
		"\u0001\u0016\u0001\u0016\u0000\u0000\u0017\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017\u0001\u0000\u0006\u0002\u0000"+
		"AZaz\u0003\u000009AZaz\u0001\u000009\u0003\u0000\n\n\r\r\"\"\u0002\u0000"+
		"<<>>\u0003\u0000\t\n\r\r  \u00a3\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-"+
		"\u0001\u0000\u0000\u0000\u0001/\u0001\u0000\u0000\u0000\u00038\u0001\u0000"+
		"\u0000\u0000\u0005;\u0001\u0000\u0000\u0000\u0007=\u0001\u0000\u0000\u0000"+
		"\t?\u0001\u0000\u0000\u0000\u000bA\u0001\u0000\u0000\u0000\rC\u0001\u0000"+
		"\u0000\u0000\u000fH\u0001\u0000\u0000\u0000\u0011Q\u0001\u0000\u0000\u0000"+
		"\u0013S\u0001\u0000\u0000\u0000\u0015U\u0001\u0000\u0000\u0000\u0017W"+
		"\u0001\u0000\u0000\u0000\u0019Y\u0001\u0000\u0000\u0000\u001b[\u0001\u0000"+
		"\u0000\u0000\u001d]\u0001\u0000\u0000\u0000\u001fe\u0001\u0000\u0000\u0000"+
		"!j\u0001\u0000\u0000\u0000#t\u0001\u0000\u0000\u0000%}\u0001\u0000\u0000"+
		"\u0000\'\u0088\u0001\u0000\u0000\u0000)\u008e\u0001\u0000\u0000\u0000"+
		"+\u0090\u0001\u0000\u0000\u0000-\u0093\u0001\u0000\u0000\u0000/0\u0005"+
		"E\u0000\u000001\u0005s\u0000\u000012\u0005c\u0000\u000023\u0005r\u0000"+
		"\u000034\u0005i\u0000\u000045\u0005b\u0000\u000056\u0005i\u0000\u0000"+
		"67\u0005r\u0000\u00007\u0002\u0001\u0000\u0000\u000089\u0005s\u0000\u0000"+
		"9:\u0005i\u0000\u0000:\u0004\u0001\u0000\u0000\u0000;<\u0005(\u0000\u0000"+
		"<\u0006\u0001\u0000\u0000\u0000=>\u0005)\u0000\u0000>\b\u0001\u0000\u0000"+
		"\u0000?@\u0005{\u0000\u0000@\n\u0001\u0000\u0000\u0000AB\u0005}\u0000"+
		"\u0000B\f\u0001\u0000\u0000\u0000CD\u0005s\u0000\u0000DE\u0005i\u0000"+
		"\u0000EF\u0005n\u0000\u0000FG\u0005o\u0000\u0000G\u000e\u0001\u0000\u0000"+
		"\u0000HI\u0005m\u0000\u0000IJ\u0005i\u0000\u0000JK\u0005e\u0000\u0000"+
		"KL\u0005n\u0000\u0000LM\u0005t\u0000\u0000MN\u0005r\u0000\u0000NO\u0005"+
		"a\u0000\u0000OP\u0005s\u0000\u0000P\u0010\u0001\u0000\u0000\u0000QR\u0005"+
		"+\u0000\u0000R\u0012\u0001\u0000\u0000\u0000ST\u0005-\u0000\u0000T\u0014"+
		"\u0001\u0000\u0000\u0000UV\u0005*\u0000\u0000V\u0016\u0001\u0000\u0000"+
		"\u0000WX\u0005/\u0000\u0000X\u0018\u0001\u0000\u0000\u0000YZ\u0005^\u0000"+
		"\u0000Z\u001a\u0001\u0000\u0000\u0000[\\\u0005%\u0000\u0000\\\u001c\u0001"+
		"\u0000\u0000\u0000]a\u0007\u0000\u0000\u0000^`\u0007\u0001\u0000\u0000"+
		"_^\u0001\u0000\u0000\u0000`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000"+
		"\u0000ab\u0001\u0000\u0000\u0000b\u001e\u0001\u0000\u0000\u0000ca\u0001"+
		"\u0000\u0000\u0000df\u0007\u0002\u0000\u0000ed\u0001\u0000\u0000\u0000"+
		"fg\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000"+
		"\u0000h \u0001\u0000\u0000\u0000ik\u0007\u0002\u0000\u0000ji\u0001\u0000"+
		"\u0000\u0000kl\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001"+
		"\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000np\u0005.\u0000\u0000oq\u0007"+
		"\u0002\u0000\u0000po\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000"+
		"rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000s\"\u0001\u0000\u0000"+
		"\u0000tx\u0005\"\u0000\u0000uw\b\u0003\u0000\u0000vu\u0001\u0000\u0000"+
		"\u0000wz\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000"+
		"\u0000\u0000y{\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000{|\u0005"+
		"\"\u0000\u0000|$\u0001\u0000\u0000\u0000}~\u0005=\u0000\u0000~&\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0005=\u0000\u0000\u0080\u0089\u0005=\u0000"+
		"\u0000\u0081\u0082\u0005!\u0000\u0000\u0082\u0089\u0005=\u0000\u0000\u0083"+
		"\u0089\u0007\u0004\u0000\u0000\u0084\u0085\u0005<\u0000\u0000\u0085\u0089"+
		"\u0005=\u0000\u0000\u0086\u0087\u0005>\u0000\u0000\u0087\u0089\u0005="+
		"\u0000\u0000\u0088\u007f\u0001\u0000\u0000\u0000\u0088\u0081\u0001\u0000"+
		"\u0000\u0000\u0088\u0083\u0001\u0000\u0000\u0000\u0088\u0084\u0001\u0000"+
		"\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089(\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0005|\u0000\u0000\u008b\u008f\u0005|\u0000\u0000\u008c"+
		"\u008d\u0005&\u0000\u0000\u008d\u008f\u0005&\u0000\u0000\u008e\u008a\u0001"+
		"\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008f*\u0001\u0000"+
		"\u0000\u0000\u0090\u0091\u0005;\u0000\u0000\u0091,\u0001\u0000\u0000\u0000"+
		"\u0092\u0094\u0007\u0005\u0000\u0000\u0093\u0092\u0001\u0000\u0000\u0000"+
		"\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000"+
		"\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000"+
		"\u0097\u0098\u0006\u0016\u0000\u0000\u0098.\u0001\u0000\u0000\u0000\t"+
		"\u0000aglrx\u0088\u008e\u0095\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}