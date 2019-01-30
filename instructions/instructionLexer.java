// Generated from instruction.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class instructionLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		WS=10, RELOP=11, MUX3=12, MUX2=13, OPT=14, CONSTANT=15, TRUE=16, ID=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"WS", "RELOP", "MUX3", "MUX2", "OPT", "CONSTANT", "TRUE", "ID"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "':'", "'('", "')'", "'='", "'+'", "'-'", "'*'", "'/'", null, 
		"'rel_op'", "'Mux3'", "'Mux2'", "'Opt'", "'C()'", "'True'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "WS", "RELOP", 
		"MUX3", "MUX2", "OPT", "CONSTANT", "TRUE", "ID"
	};
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


	public instructionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "instruction.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23c\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\13\6\139\n\13\r\13\16\13:\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\7\22_\n\22\f\22\16\22"+
		"b\13\22\2\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23\3\2\5\5\2\13\f\17\17\"\"\4\2C\\c|\6\2\62;C"+
		"\\aac|\2d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\3%\3\2\2\2\5\'\3\2\2\2\7)\3\2\2\2\t+\3\2\2\2\13-\3\2\2\2"+
		"\r/\3\2\2\2\17\61\3\2\2\2\21\63\3\2\2\2\23\65\3\2\2\2\258\3\2\2\2\27>"+
		"\3\2\2\2\31E\3\2\2\2\33J\3\2\2\2\35O\3\2\2\2\37S\3\2\2\2!W\3\2\2\2#\\"+
		"\3\2\2\2%&\7.\2\2&\4\3\2\2\2\'(\7<\2\2(\6\3\2\2\2)*\7*\2\2*\b\3\2\2\2"+
		"+,\7+\2\2,\n\3\2\2\2-.\7?\2\2.\f\3\2\2\2/\60\7-\2\2\60\16\3\2\2\2\61\62"+
		"\7/\2\2\62\20\3\2\2\2\63\64\7,\2\2\64\22\3\2\2\2\65\66\7\61\2\2\66\24"+
		"\3\2\2\2\679\t\2\2\28\67\3\2\2\29:\3\2\2\2:8\3\2\2\2:;\3\2\2\2;<\3\2\2"+
		"\2<=\b\13\2\2=\26\3\2\2\2>?\7t\2\2?@\7g\2\2@A\7n\2\2AB\7a\2\2BC\7q\2\2"+
		"CD\7r\2\2D\30\3\2\2\2EF\7O\2\2FG\7w\2\2GH\7z\2\2HI\7\65\2\2I\32\3\2\2"+
		"\2JK\7O\2\2KL\7w\2\2LM\7z\2\2MN\7\64\2\2N\34\3\2\2\2OP\7Q\2\2PQ\7r\2\2"+
		"QR\7v\2\2R\36\3\2\2\2ST\7E\2\2TU\7*\2\2UV\7+\2\2V \3\2\2\2WX\7V\2\2XY"+
		"\7t\2\2YZ\7w\2\2Z[\7g\2\2[\"\3\2\2\2\\`\t\3\2\2]_\t\4\2\2^]\3\2\2\2_b"+
		"\3\2\2\2`^\3\2\2\2`a\3\2\2\2a$\3\2\2\2b`\3\2\2\2\5\2:`\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}