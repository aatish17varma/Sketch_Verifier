// Generated from /Users/aatishvarma/School/Research/chipmunk_2/chipmunk/instructions/instruction.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class instructionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		WS=10, RELOP=11, MUX3=12, MUX2=13, OPT=14, CONSTANT=15, TRUE=16, ID=17;
	public static final int
		RULE_state_var = 0, RULE_packet_field = 1, RULE_state_var_with_comma = 2, 
		RULE_state_vars = 3, RULE_packet_field_with_comma = 4, RULE_packet_fields = 5, 
		RULE_guarded_update_with_comma = 6, RULE_guarded_updates = 7, RULE_guarded_update = 8, 
		RULE_guard = 9, RULE_update = 10, RULE_expr = 11, RULE_instruction = 12;
	public static final String[] ruleNames = {
		"state_var", "packet_field", "state_var_with_comma", "state_vars", "packet_field_with_comma", 
		"packet_fields", "guarded_update_with_comma", "guarded_updates", "guarded_update", 
		"guard", "update", "expr", "instruction"
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

	@Override
	public String getGrammarFileName() { return "instruction.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public instructionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class State_varContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(instructionParser.ID, 0); }
		public State_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state_var; }
	}

	public final State_varContext state_var() throws RecognitionException {
		State_varContext _localctx = new State_varContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_state_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(ID);
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

	public static class Packet_fieldContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(instructionParser.ID, 0); }
		public Packet_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packet_field; }
	}

	public final Packet_fieldContext packet_field() throws RecognitionException {
		Packet_fieldContext _localctx = new Packet_fieldContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packet_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(ID);
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

	public static class State_var_with_commaContext extends ParserRuleContext {
		public State_varContext state_var() {
			return getRuleContext(State_varContext.class,0);
		}
		public State_var_with_commaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state_var_with_comma; }
	}

	public final State_var_with_commaContext state_var_with_comma() throws RecognitionException {
		State_var_with_commaContext _localctx = new State_var_with_commaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_state_var_with_comma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(T__0);
			setState(31);
			state_var();
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

	public static class State_varsContext extends ParserRuleContext {
		public State_varContext state_var() {
			return getRuleContext(State_varContext.class,0);
		}
		public List<State_var_with_commaContext> state_var_with_comma() {
			return getRuleContexts(State_var_with_commaContext.class);
		}
		public State_var_with_commaContext state_var_with_comma(int i) {
			return getRuleContext(State_var_with_commaContext.class,i);
		}
		public State_varsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state_vars; }
	}

	public final State_varsContext state_vars() throws RecognitionException {
		State_varsContext _localctx = new State_varsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_state_vars);
		int _la;
		try {
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				state_var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				state_var();
				setState(36); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(35);
					state_var_with_comma();
					}
					}
					setState(38); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
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

	public static class Packet_field_with_commaContext extends ParserRuleContext {
		public Packet_fieldContext packet_field() {
			return getRuleContext(Packet_fieldContext.class,0);
		}
		public Packet_field_with_commaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packet_field_with_comma; }
	}

	public final Packet_field_with_commaContext packet_field_with_comma() throws RecognitionException {
		Packet_field_with_commaContext _localctx = new Packet_field_with_commaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_packet_field_with_comma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(T__0);
			setState(43);
			packet_field();
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

	public static class Packet_fieldsContext extends ParserRuleContext {
		public Packet_fieldContext packet_field() {
			return getRuleContext(Packet_fieldContext.class,0);
		}
		public List<Packet_field_with_commaContext> packet_field_with_comma() {
			return getRuleContexts(Packet_field_with_commaContext.class);
		}
		public Packet_field_with_commaContext packet_field_with_comma(int i) {
			return getRuleContext(Packet_field_with_commaContext.class,i);
		}
		public Packet_fieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packet_fields; }
	}

	public final Packet_fieldsContext packet_fields() throws RecognitionException {
		Packet_fieldsContext _localctx = new Packet_fieldsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_packet_fields);
		int _la;
		try {
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				packet_field();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				packet_field();
				setState(48); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(47);
					packet_field_with_comma();
					}
					}
					setState(50); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
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

	public static class Guarded_update_with_commaContext extends ParserRuleContext {
		public Guarded_updateContext guarded_update() {
			return getRuleContext(Guarded_updateContext.class,0);
		}
		public Guarded_update_with_commaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guarded_update_with_comma; }
	}

	public final Guarded_update_with_commaContext guarded_update_with_comma() throws RecognitionException {
		Guarded_update_with_commaContext _localctx = new Guarded_update_with_commaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_guarded_update_with_comma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__0);
			setState(55);
			guarded_update();
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

	public static class Guarded_updatesContext extends ParserRuleContext {
		public Guarded_updateContext guarded_update() {
			return getRuleContext(Guarded_updateContext.class,0);
		}
		public List<Guarded_update_with_commaContext> guarded_update_with_comma() {
			return getRuleContexts(Guarded_update_with_commaContext.class);
		}
		public Guarded_update_with_commaContext guarded_update_with_comma(int i) {
			return getRuleContext(Guarded_update_with_commaContext.class,i);
		}
		public Guarded_updatesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guarded_updates; }
	}

	public final Guarded_updatesContext guarded_updates() throws RecognitionException {
		Guarded_updatesContext _localctx = new Guarded_updatesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_guarded_updates);
		int _la;
		try {
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				guarded_update();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				guarded_update();
				setState(60); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(59);
					guarded_update_with_comma();
					}
					}
					setState(62); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
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

	public static class Guarded_updateContext extends ParserRuleContext {
		public GuardContext guard() {
			return getRuleContext(GuardContext.class,0);
		}
		public UpdateContext update() {
			return getRuleContext(UpdateContext.class,0);
		}
		public Guarded_updateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guarded_update; }
	}

	public final Guarded_updateContext guarded_update() throws RecognitionException {
		Guarded_updateContext _localctx = new Guarded_updateContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_guarded_update);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			guard();
			setState(67);
			match(T__1);
			setState(68);
			update();
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

	public static class GuardContext extends ParserRuleContext {
		public GuardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guard; }
	 
		public GuardContext() { }
		public void copyFrom(GuardContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RelOpContext extends GuardContext {
		public TerminalNode RELOP() { return getToken(instructionParser.RELOP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RelOpContext(GuardContext ctx) { copyFrom(ctx); }
	}
	public static class TrueContext extends GuardContext {
		public TerminalNode TRUE() { return getToken(instructionParser.TRUE, 0); }
		public TrueContext(GuardContext ctx) { copyFrom(ctx); }
	}

	public final GuardContext guard() throws RecognitionException {
		GuardContext _localctx = new GuardContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_guard);
		try {
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELOP:
				_localctx = new RelOpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				match(RELOP);
				setState(71);
				match(T__2);
				setState(72);
				expr(0);
				setState(73);
				match(T__0);
				setState(74);
				expr(0);
				setState(75);
				match(T__3);
				}
				break;
			case TRUE:
				_localctx = new TrueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				match(TRUE);
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

	public static class UpdateContext extends ParserRuleContext {
		public State_varContext state_var() {
			return getRuleContext(State_varContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update; }
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_update);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			state_var();
			setState(81);
			match(T__4);
			setState(82);
			expr(0);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PacketFieldContext extends ExprContext {
		public Packet_fieldContext packet_field() {
			return getRuleContext(Packet_fieldContext.class,0);
		}
		public PacketFieldContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprWithOpContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprWithOpContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class OptContext extends ExprContext {
		public TerminalNode OPT() { return getToken(instructionParser.OPT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OptContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Mux2Context extends ExprContext {
		public TerminalNode MUX2() { return getToken(instructionParser.MUX2, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Mux2Context(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ConstantContext extends ExprContext {
		public TerminalNode CONSTANT() { return getToken(instructionParser.CONSTANT, 0); }
		public ConstantContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Mux3Context extends ExprContext {
		public TerminalNode MUX3() { return getToken(instructionParser.MUX3, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Mux3Context(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class StateVarContext extends ExprContext {
		public State_varContext state_var() {
			return getRuleContext(State_varContext.class,0);
		}
		public StateVarContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprWithParenContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprWithParenContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				_localctx = new StateVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(85);
				state_var();
				}
				break;
			case 2:
				{
				_localctx = new PacketFieldContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(86);
				packet_field();
				}
				break;
			case 3:
				{
				_localctx = new ExprWithParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87);
				match(T__2);
				setState(88);
				expr(0);
				setState(89);
				match(T__3);
				}
				break;
			case 4:
				{
				_localctx = new Mux3Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(91);
				match(MUX3);
				setState(92);
				match(T__2);
				setState(93);
				expr(0);
				setState(94);
				match(T__0);
				setState(95);
				expr(0);
				setState(96);
				match(T__0);
				setState(97);
				expr(0);
				setState(98);
				match(T__3);
				}
				break;
			case 5:
				{
				_localctx = new Mux2Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(100);
				match(MUX2);
				setState(101);
				match(T__2);
				setState(102);
				expr(0);
				setState(103);
				match(T__0);
				setState(104);
				expr(0);
				setState(105);
				match(T__3);
				}
				break;
			case 6:
				{
				_localctx = new OptContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(107);
				match(OPT);
				setState(108);
				match(T__2);
				setState(109);
				expr(0);
				setState(110);
				match(T__3);
				}
				break;
			case 7:
				{
				_localctx = new ConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(112);
				match(CONSTANT);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprWithOpContext(new ExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(115);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(116);
					((ExprWithOpContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
						((ExprWithOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(117);
					expr(7);
					}
					} 
				}
				setState(122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InstructionContext extends ParserRuleContext {
		public State_varsContext state_vars() {
			return getRuleContext(State_varsContext.class,0);
		}
		public Packet_fieldsContext packet_fields() {
			return getRuleContext(Packet_fieldsContext.class,0);
		}
		public Guarded_updatesContext guarded_updates() {
			return getRuleContext(Guarded_updatesContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_instruction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			state_vars();
			setState(124);
			packet_fields();
			setState(125);
			guarded_updates();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23\u0082\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\6\5\'\n\5\r\5\16\5(\5\5+\n\5\3\6\3\6\3\6\3\7\3\7\3\7\6\7\63\n\7\r\7"+
		"\16\7\64\5\7\67\n\7\3\b\3\b\3\b\3\t\3\t\3\t\6\t?\n\t\r\t\16\t@\5\tC\n"+
		"\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13Q\n\13"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\rt\n"+
		"\r\3\r\3\r\3\r\7\ry\n\r\f\r\16\r|\13\r\3\16\3\16\3\16\3\16\3\16\2\3\30"+
		"\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\3\3\2\b\13\2\u0082\2\34\3\2\2\2"+
		"\4\36\3\2\2\2\6 \3\2\2\2\b*\3\2\2\2\n,\3\2\2\2\f\66\3\2\2\2\168\3\2\2"+
		"\2\20B\3\2\2\2\22D\3\2\2\2\24P\3\2\2\2\26R\3\2\2\2\30s\3\2\2\2\32}\3\2"+
		"\2\2\34\35\7\23\2\2\35\3\3\2\2\2\36\37\7\23\2\2\37\5\3\2\2\2 !\7\3\2\2"+
		"!\"\5\2\2\2\"\7\3\2\2\2#+\5\2\2\2$&\5\2\2\2%\'\5\6\4\2&%\3\2\2\2\'(\3"+
		"\2\2\2(&\3\2\2\2()\3\2\2\2)+\3\2\2\2*#\3\2\2\2*$\3\2\2\2+\t\3\2\2\2,-"+
		"\7\3\2\2-.\5\4\3\2.\13\3\2\2\2/\67\5\4\3\2\60\62\5\4\3\2\61\63\5\n\6\2"+
		"\62\61\3\2\2\2\63\64\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\67\3\2\2\2"+
		"\66/\3\2\2\2\66\60\3\2\2\2\67\r\3\2\2\289\7\3\2\29:\5\22\n\2:\17\3\2\2"+
		"\2;C\5\22\n\2<>\5\22\n\2=?\5\16\b\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3"+
		"\2\2\2AC\3\2\2\2B;\3\2\2\2B<\3\2\2\2C\21\3\2\2\2DE\5\24\13\2EF\7\4\2\2"+
		"FG\5\26\f\2G\23\3\2\2\2HI\7\r\2\2IJ\7\5\2\2JK\5\30\r\2KL\7\3\2\2LM\5\30"+
		"\r\2MN\7\6\2\2NQ\3\2\2\2OQ\7\22\2\2PH\3\2\2\2PO\3\2\2\2Q\25\3\2\2\2RS"+
		"\5\2\2\2ST\7\7\2\2TU\5\30\r\2U\27\3\2\2\2VW\b\r\1\2Wt\5\2\2\2Xt\5\4\3"+
		"\2YZ\7\5\2\2Z[\5\30\r\2[\\\7\6\2\2\\t\3\2\2\2]^\7\16\2\2^_\7\5\2\2_`\5"+
		"\30\r\2`a\7\3\2\2ab\5\30\r\2bc\7\3\2\2cd\5\30\r\2de\7\6\2\2et\3\2\2\2"+
		"fg\7\17\2\2gh\7\5\2\2hi\5\30\r\2ij\7\3\2\2jk\5\30\r\2kl\7\6\2\2lt\3\2"+
		"\2\2mn\7\20\2\2no\7\5\2\2op\5\30\r\2pq\7\6\2\2qt\3\2\2\2rt\7\21\2\2sV"+
		"\3\2\2\2sX\3\2\2\2sY\3\2\2\2s]\3\2\2\2sf\3\2\2\2sm\3\2\2\2sr\3\2\2\2t"+
		"z\3\2\2\2uv\f\b\2\2vw\t\2\2\2wy\5\30\r\txu\3\2\2\2y|\3\2\2\2zx\3\2\2\2"+
		"z{\3\2\2\2{\31\3\2\2\2|z\3\2\2\2}~\5\b\5\2~\177\5\f\7\2\177\u0080\5\20"+
		"\t\2\u0080\33\3\2\2\2\13(*\64\66@BPsz";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}