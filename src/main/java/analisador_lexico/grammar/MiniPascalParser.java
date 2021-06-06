// Generated from MiniPascal.g4 by ANTLR 4.7.2

package analisador_lexico.grammar;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniPascalParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, PROGRAM=3, BEGIN=4, END=5, BEGIN_BLOCK=6, END_BLOCK=7, 
		DO=8, WRITE=9, READ=10, PRINT=11, WHILE=12, FOR=13, IF=14, THEN=15, ELSE=16, 
		OR=17, NOT=18, AND=19, TRUE=20, FALSE=21, VAR=22, FLOAT=23, BOOLEAN=24, 
		STRING=25, INTEGER=26, OPERATORS=27, STR=28, DIGIT=29, ID=30, PLUS=31, 
		MINUS=32, MULT=33, EQUALS=34, DIV=35, RT=36, LT=37, LE=38, RE=39, LR=40, 
		EQ=41, SMCOLON=42, OP=43, CP=44, ATTRIB=45, DOT=46, COMMA=47, COLON=48, 
		DBDOT=49, SPECCHARS=50, COMMENTS=51, WS=52;
	public static final int
		RULE_myStartingRule = 0, RULE_program = 1, RULE_block = 2, RULE_statement = 3, 
		RULE_loops = 4, RULE_assignment = 5, RULE_writestatement = 6, RULE_readstatement = 7, 
		RULE_ifStatement = 8, RULE_whileStatement = 9, RULE_expression = 10, RULE_relationop = 11, 
		RULE_simpleExpression = 12, RULE_term = 13, RULE_factor = 14, RULE_variable = 15, 
		RULE_addop = 16, RULE_multop = 17, RULE_vardecl = 18, RULE_type = 19, 
		RULE_relationals = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"myStartingRule", "program", "block", "statement", "loops", "assignment", 
			"writestatement", "readstatement", "ifStatement", "whileStatement", "expression", 
			"relationop", "simpleExpression", "term", "factor", "variable", "addop", 
			"multop", "vardecl", "type", "relationals"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "'Program'", "'Begin'", "'End.'", "'begin'", "'end'", 
			"'do'", "'write'", "'read'", "'print'", "'while'", "'for'", "'if'", "'then'", 
			"'else'", "'or'", "'not'", "'and'", "'True'", "'False'", "'var'", "'float'", 
			"'boolean'", "'string'", "'integer'", null, null, null, null, "'+'", 
			"'-'", "'*'", "'='", "'/'", "'>'", "'<'", "'<='", "'>='", "'<>'", "'=='", 
			"';'", "'('", "')'", "':='", "'.'", "','", "':'", "'..'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "PROGRAM", "BEGIN", "END", "BEGIN_BLOCK", "END_BLOCK", 
			"DO", "WRITE", "READ", "PRINT", "WHILE", "FOR", "IF", "THEN", "ELSE", 
			"OR", "NOT", "AND", "TRUE", "FALSE", "VAR", "FLOAT", "BOOLEAN", "STRING", 
			"INTEGER", "OPERATORS", "STR", "DIGIT", "ID", "PLUS", "MINUS", "MULT", 
			"EQUALS", "DIV", "RT", "LT", "LE", "RE", "LR", "EQ", "SMCOLON", "OP", 
			"CP", "ATTRIB", "DOT", "COMMA", "COLON", "DBDOT", "SPECCHARS", "COMMENTS", 
			"WS"
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

	@Override
	public String getGrammarFileName() { return "MiniPascal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniPascalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MyStartingRuleContext extends ParserRuleContext {
		public List<ProgramContext> program() {
			return getRuleContexts(ProgramContext.class);
		}
		public ProgramContext program(int i) {
			return getRuleContext(ProgramContext.class,i);
		}
		public MyStartingRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myStartingRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterMyStartingRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitMyStartingRule(this);
		}
	}

	public final MyStartingRuleContext myStartingRule() throws RecognitionException {
		MyStartingRuleContext _localctx = new MyStartingRuleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_myStartingRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42);
				program();
				}
				}
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PROGRAM );
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

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(MiniPascalParser.PROGRAM, 0); }
		public TerminalNode STR() { return getToken(MiniPascalParser.STR, 0); }
		public TerminalNode SMCOLON() { return getToken(MiniPascalParser.SMCOLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(PROGRAM);
			setState(48);
			match(STR);
			setState(49);
			match(SMCOLON);
			setState(53);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(50);
					statement();
					}
					} 
				}
				setState(55);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(56);
			block();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode BEGIN_BLOCK() { return getToken(MiniPascalParser.BEGIN_BLOCK, 0); }
		public TerminalNode END_BLOCK() { return getToken(MiniPascalParser.END_BLOCK, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(BEGIN_BLOCK);
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(59);
				variable();
				}
				break;
			}
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WRITE) | (1L << READ) | (1L << WHILE) | (1L << IF) | (1L << VAR) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << STRING) | (1L << INTEGER) | (1L << ID))) != 0)) {
				{
				{
				setState(62);
				statement();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
			match(END_BLOCK);
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

	public static class StatementContext extends ParserRuleContext {
		public VardeclContext vardecl() {
			return getRuleContext(VardeclContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ReadstatementContext readstatement() {
			return getRuleContext(ReadstatementContext.class,0);
		}
		public WritestatementContext writestatement() {
			return getRuleContext(WritestatementContext.class,0);
		}
		public LoopsContext loops() {
			return getRuleContext(LoopsContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				vardecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				readstatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
				writestatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(74);
				loops();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(75);
				ifStatement();
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

	public static class LoopsContext extends ParserRuleContext {
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public LoopsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loops; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterLoops(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitLoops(this);
		}
	}

	public final LoopsContext loops() throws RecognitionException {
		LoopsContext _localctx = new LoopsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_loops);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			whileStatement();
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

	public static class AssignmentContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> ATTRIB() { return getTokens(MiniPascalParser.ATTRIB); }
		public TerminalNode ATTRIB(int i) {
			return getToken(MiniPascalParser.ATTRIB, i);
		}
		public List<TerminalNode> SMCOLON() { return getTokens(MiniPascalParser.SMCOLON); }
		public TerminalNode SMCOLON(int i) {
			return getToken(MiniPascalParser.SMCOLON, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(87); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(80);
					variable();
					setState(81);
					match(ATTRIB);
					setState(83);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NOT) | (1L << DIGIT) | (1L << ID) | (1L << PLUS) | (1L << MINUS))) != 0)) {
						{
						setState(82);
						expression();
						}
					}

					setState(85);
					match(SMCOLON);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(89); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class WritestatementContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(MiniPascalParser.WRITE, 0); }
		public TerminalNode OP() { return getToken(MiniPascalParser.OP, 0); }
		public TerminalNode STR() { return getToken(MiniPascalParser.STR, 0); }
		public TerminalNode CP() { return getToken(MiniPascalParser.CP, 0); }
		public TerminalNode SMCOLON() { return getToken(MiniPascalParser.SMCOLON, 0); }
		public WritestatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writestatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterWritestatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitWritestatement(this);
		}
	}

	public final WritestatementContext writestatement() throws RecognitionException {
		WritestatementContext _localctx = new WritestatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_writestatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(WRITE);
			setState(92);
			match(OP);
			setState(93);
			match(STR);
			setState(94);
			match(CP);
			setState(95);
			match(SMCOLON);
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

	public static class ReadstatementContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(MiniPascalParser.READ, 0); }
		public TerminalNode OP() { return getToken(MiniPascalParser.OP, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MiniPascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniPascalParser.COMMA, i);
		}
		public TerminalNode ID() { return getToken(MiniPascalParser.ID, 0); }
		public TerminalNode CP() { return getToken(MiniPascalParser.CP, 0); }
		public TerminalNode SMCOLON() { return getToken(MiniPascalParser.SMCOLON, 0); }
		public ReadstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterReadstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitReadstatement(this);
		}
	}

	public final ReadstatementContext readstatement() throws RecognitionException {
		ReadstatementContext _localctx = new ReadstatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_readstatement);
		int _la;
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(READ);
				setState(98);
				match(OP);
				setState(99);
				expression();
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(100);
					match(COMMA);
					setState(101);
					expression();
					}
					}
					setState(106);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				match(ID);
				setState(108);
				match(CP);
				setState(109);
				match(SMCOLON);
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

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MiniPascalParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(MiniPascalParser.THEN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(MiniPascalParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(IF);
			setState(113);
			expression();
			setState(114);
			match(THEN);
			setState(115);
			statement();
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(116);
				match(ELSE);
				setState(117);
				statement();
				}
				break;
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

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(MiniPascalParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DO() { return getToken(MiniPascalParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(WHILE);
			setState(121);
			expression();
			setState(122);
			match(DO);
			setState(123);
			statement();
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<SimpleExpressionContext> simpleExpression() {
			return getRuleContexts(SimpleExpressionContext.class);
		}
		public SimpleExpressionContext simpleExpression(int i) {
			return getRuleContext(SimpleExpressionContext.class,i);
		}
		public RelationopContext relationop() {
			return getRuleContext(RelationopContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expression);
		int _la;
		try {
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				simpleExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				simpleExpression();
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RT) | (1L << LT) | (1L << LE) | (1L << RE) | (1L << LR))) != 0)) {
					{
					setState(127);
					relationop();
					setState(128);
					simpleExpression();
					}
				}

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

	public static class RelationopContext extends ParserRuleContext {
		public TerminalNode RT() { return getToken(MiniPascalParser.RT, 0); }
		public TerminalNode LT() { return getToken(MiniPascalParser.LT, 0); }
		public TerminalNode LE() { return getToken(MiniPascalParser.LE, 0); }
		public TerminalNode RE() { return getToken(MiniPascalParser.RE, 0); }
		public TerminalNode LR() { return getToken(MiniPascalParser.LR, 0); }
		public RelationopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterRelationop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitRelationop(this);
		}
	}

	public final RelationopContext relationop() throws RecognitionException {
		RelationopContext _localctx = new RelationopContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_relationop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RT) | (1L << LT) | (1L << LE) | (1L << RE) | (1L << LR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class SimpleExpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(MiniPascalParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MiniPascalParser.MINUS, 0); }
		public List<AddopContext> addop() {
			return getRuleContexts(AddopContext.class);
		}
		public AddopContext addop(int i) {
			return getRuleContext(AddopContext.class,i);
		}
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterSimpleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitSimpleExpression(this);
		}
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_simpleExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(136);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(139);
			term();
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << PLUS) | (1L << MINUS))) != 0)) {
				{
				{
				{
				setState(140);
				addop();
				}
				setState(141);
				term();
				}
				}
				setState(147);
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
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<MultopContext> multop() {
			return getRuleContexts(MultopContext.class);
		}
		public MultopContext multop(int i) {
			return getRuleContext(MultopContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			factor();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << MULT) | (1L << DIV))) != 0)) {
				{
				{
				setState(149);
				multop();
				setState(150);
				factor();
				}
				}
				setState(156);
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
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode DIGIT() { return getToken(MiniPascalParser.DIGIT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(MiniPascalParser.NOT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_factor);
		try {
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				variable();
				}
				break;
			case DIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				match(DIGIT);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				match(T__0);
				setState(160);
				expression();
				setState(161);
				match(T__1);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 4);
				{
				setState(163);
				match(NOT);
				setState(164);
				factor();
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniPascalParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variable);
		try {
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				match(ID);
				setState(169);
				match(T__0);
				setState(170);
				expression();
				setState(171);
				match(T__1);
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

	public static class AddopContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(MiniPascalParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MiniPascalParser.MINUS, 0); }
		public TerminalNode OR() { return getToken(MiniPascalParser.OR, 0); }
		public AddopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterAddop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitAddop(this);
		}
	}

	public final AddopContext addop() throws RecognitionException {
		AddopContext _localctx = new AddopContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_addop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << PLUS) | (1L << MINUS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class MultopContext extends ParserRuleContext {
		public TerminalNode DIV() { return getToken(MiniPascalParser.DIV, 0); }
		public TerminalNode MULT() { return getToken(MiniPascalParser.MULT, 0); }
		public TerminalNode AND() { return getToken(MiniPascalParser.AND, 0); }
		public MultopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterMultop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitMultop(this);
		}
	}

	public final MultopContext multop() throws RecognitionException {
		MultopContext _localctx = new MultopContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_multop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << MULT) | (1L << DIV))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class VardeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode SMCOLON() { return getToken(MiniPascalParser.SMCOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MiniPascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniPascalParser.COMMA, i);
		}
		public VardeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterVardecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitVardecl(this);
		}
	}

	public final VardeclContext vardecl() throws RecognitionException {
		VardeclContext _localctx = new VardeclContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_vardecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			type();
			setState(180);
			variable();
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(181);
				match(COMMA);
				setState(182);
				variable();
				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(188);
			match(SMCOLON);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(MiniPascalParser.INTEGER, 0); }
		public TerminalNode STRING() { return getToken(MiniPascalParser.STRING, 0); }
		public TerminalNode FLOAT() { return getToken(MiniPascalParser.FLOAT, 0); }
		public TerminalNode BOOLEAN() { return getToken(MiniPascalParser.BOOLEAN, 0); }
		public TerminalNode VAR() { return getToken(MiniPascalParser.VAR, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << STRING) | (1L << INTEGER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class RelationalsContext extends ParserRuleContext {
		public TerminalNode RT() { return getToken(MiniPascalParser.RT, 0); }
		public TerminalNode LT() { return getToken(MiniPascalParser.LT, 0); }
		public TerminalNode LE() { return getToken(MiniPascalParser.LE, 0); }
		public TerminalNode RE() { return getToken(MiniPascalParser.RE, 0); }
		public TerminalNode LR() { return getToken(MiniPascalParser.LR, 0); }
		public RelationalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterRelationals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitRelationals(this);
		}
	}

	public final RelationalsContext relationals() throws RecognitionException {
		RelationalsContext _localctx = new RelationalsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_relationals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RT) | (1L << LT) | (1L << LE) | (1L << RE) | (1L << LR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\66\u00c5\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\6\2.\n\2\r\2\16\2/\3\3\3"+
		"\3\3\3\3\3\7\3\66\n\3\f\3\16\39\13\3\3\3\3\3\3\4\3\4\5\4?\n\4\3\4\7\4"+
		"B\n\4\f\4\16\4E\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5O\n\5\3\6\3\6"+
		"\3\7\3\7\3\7\5\7V\n\7\3\7\3\7\6\7Z\n\7\r\7\16\7[\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\7\ti\n\t\f\t\16\tl\13\t\3\t\3\t\3\t\5\tq\n\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\5\ny\n\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\5\f\u0085\n\f\5\f\u0087\n\f\3\r\3\r\3\16\5\16\u008c\n\16\3\16\3"+
		"\16\3\16\3\16\7\16\u0092\n\16\f\16\16\16\u0095\13\16\3\17\3\17\3\17\3"+
		"\17\7\17\u009b\n\17\f\17\16\17\u009e\13\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\5\20\u00a8\n\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00b0"+
		"\n\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u00ba\n\24\f\24\16"+
		"\24\u00bd\13\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\67\2\27\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\7\3\2&*\3\2!\"\4\2\23\23!\"\5\2"+
		"\25\25##%%\3\2\30\34\2\u00c7\2-\3\2\2\2\4\61\3\2\2\2\6<\3\2\2\2\bN\3\2"+
		"\2\2\nP\3\2\2\2\fY\3\2\2\2\16]\3\2\2\2\20p\3\2\2\2\22r\3\2\2\2\24z\3\2"+
		"\2\2\26\u0086\3\2\2\2\30\u0088\3\2\2\2\32\u008b\3\2\2\2\34\u0096\3\2\2"+
		"\2\36\u00a7\3\2\2\2 \u00af\3\2\2\2\"\u00b1\3\2\2\2$\u00b3\3\2\2\2&\u00b5"+
		"\3\2\2\2(\u00c0\3\2\2\2*\u00c2\3\2\2\2,.\5\4\3\2-,\3\2\2\2./\3\2\2\2/"+
		"-\3\2\2\2/\60\3\2\2\2\60\3\3\2\2\2\61\62\7\5\2\2\62\63\7\36\2\2\63\67"+
		"\7,\2\2\64\66\5\b\5\2\65\64\3\2\2\2\669\3\2\2\2\678\3\2\2\2\67\65\3\2"+
		"\2\28:\3\2\2\29\67\3\2\2\2:;\5\6\4\2;\5\3\2\2\2<>\7\b\2\2=?\5 \21\2>="+
		"\3\2\2\2>?\3\2\2\2?C\3\2\2\2@B\5\b\5\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2C"+
		"D\3\2\2\2DF\3\2\2\2EC\3\2\2\2FG\7\t\2\2G\7\3\2\2\2HO\5&\24\2IO\5\f\7\2"+
		"JO\5\20\t\2KO\5\16\b\2LO\5\n\6\2MO\5\22\n\2NH\3\2\2\2NI\3\2\2\2NJ\3\2"+
		"\2\2NK\3\2\2\2NL\3\2\2\2NM\3\2\2\2O\t\3\2\2\2PQ\5\24\13\2Q\13\3\2\2\2"+
		"RS\5 \21\2SU\7/\2\2TV\5\26\f\2UT\3\2\2\2UV\3\2\2\2VW\3\2\2\2WX\7,\2\2"+
		"XZ\3\2\2\2YR\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\r\3\2\2\2]^\7\13"+
		"\2\2^_\7-\2\2_`\7\36\2\2`a\7.\2\2ab\7,\2\2b\17\3\2\2\2cd\7\f\2\2de\7-"+
		"\2\2ej\5\26\f\2fg\7\61\2\2gi\5\26\f\2hf\3\2\2\2il\3\2\2\2jh\3\2\2\2jk"+
		"\3\2\2\2kq\3\2\2\2lj\3\2\2\2mn\7 \2\2no\7.\2\2oq\7,\2\2pc\3\2\2\2pm\3"+
		"\2\2\2q\21\3\2\2\2rs\7\20\2\2st\5\26\f\2tu\7\21\2\2ux\5\b\5\2vw\7\22\2"+
		"\2wy\5\b\5\2xv\3\2\2\2xy\3\2\2\2y\23\3\2\2\2z{\7\16\2\2{|\5\26\f\2|}\7"+
		"\n\2\2}~\5\b\5\2~\25\3\2\2\2\177\u0087\5\32\16\2\u0080\u0084\5\32\16\2"+
		"\u0081\u0082\5\30\r\2\u0082\u0083\5\32\16\2\u0083\u0085\3\2\2\2\u0084"+
		"\u0081\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\177\3\2\2"+
		"\2\u0086\u0080\3\2\2\2\u0087\27\3\2\2\2\u0088\u0089\t\2\2\2\u0089\31\3"+
		"\2\2\2\u008a\u008c\t\3\2\2\u008b\u008a\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\u0093\5\34\17\2\u008e\u008f\5\"\22\2\u008f\u0090"+
		"\5\34\17\2\u0090\u0092\3\2\2\2\u0091\u008e\3\2\2\2\u0092\u0095\3\2\2\2"+
		"\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\33\3\2\2\2\u0095\u0093"+
		"\3\2\2\2\u0096\u009c\5\36\20\2\u0097\u0098\5$\23\2\u0098\u0099\5\36\20"+
		"\2\u0099\u009b\3\2\2\2\u009a\u0097\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a"+
		"\3\2\2\2\u009c\u009d\3\2\2\2\u009d\35\3\2\2\2\u009e\u009c\3\2\2\2\u009f"+
		"\u00a8\5 \21\2\u00a0\u00a8\7\37\2\2\u00a1\u00a2\7\3\2\2\u00a2\u00a3\5"+
		"\26\f\2\u00a3\u00a4\7\4\2\2\u00a4\u00a8\3\2\2\2\u00a5\u00a6\7\24\2\2\u00a6"+
		"\u00a8\5\36\20\2\u00a7\u009f\3\2\2\2\u00a7\u00a0\3\2\2\2\u00a7\u00a1\3"+
		"\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\37\3\2\2\2\u00a9\u00b0\7 \2\2\u00aa\u00ab"+
		"\7 \2\2\u00ab\u00ac\7\3\2\2\u00ac\u00ad\5\26\f\2\u00ad\u00ae\7\4\2\2\u00ae"+
		"\u00b0\3\2\2\2\u00af\u00a9\3\2\2\2\u00af\u00aa\3\2\2\2\u00b0!\3\2\2\2"+
		"\u00b1\u00b2\t\4\2\2\u00b2#\3\2\2\2\u00b3\u00b4\t\5\2\2\u00b4%\3\2\2\2"+
		"\u00b5\u00b6\5(\25\2\u00b6\u00bb\5 \21\2\u00b7\u00b8\7\61\2\2\u00b8\u00ba"+
		"\5 \21\2\u00b9\u00b7\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\7,"+
		"\2\2\u00bf\'\3\2\2\2\u00c0\u00c1\t\6\2\2\u00c1)\3\2\2\2\u00c2\u00c3\t"+
		"\2\2\2\u00c3+\3\2\2\2\24/\67>CNU[jpx\u0084\u0086\u008b\u0093\u009c\u00a7"+
		"\u00af\u00bb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}