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
		PROGRAM=1, BEGIN=2, END=3, BEGIN_BLOCK=4, END_BLOCK=5, DO=6, WRITE=7, 
		READ=8, PRINT=9, WHILE=10, FOR=11, IF=12, THEN=13, ELSE=14, OR=15, NOT=16, 
		AND=17, TRUE=18, FALSE=19, VAR=20, FLOAT=21, BOOLEAN=22, STRING=23, INTEGER=24, 
		OPERATORS=25, STR=26, DIGIT=27, ID=28, PLUS=29, MINUS=30, MULT=31, EQUALS=32, 
		DIV=33, RT=34, LT=35, LE=36, RE=37, LR=38, EQ=39, SMCOLON=40, OP=41, CP=42, 
		ATTRIB=43, DOT=44, COMMA=45, COLON=46, DBDOT=47, SPECCHARS=48, COMMENTS=49, 
		WS=50;
	public static final int
		RULE_myStartingRule = 0, RULE_program = 1, RULE_block = 2, RULE_statement = 3, 
		RULE_loops = 4, RULE_assignment = 5, RULE_writestatement = 6, RULE_readstatement = 7, 
		RULE_printstatement = 8, RULE_ifStatement = 9, RULE_whileStatement = 10, 
		RULE_expression = 11, RULE_relationop = 12, RULE_simpleExpression = 13, 
		RULE_ariExpression = 14, RULE_term = 15, RULE_termAri = 16, RULE_factor = 17, 
		RULE_factorAri = 18, RULE_variable = 19, RULE_addop = 20, RULE_multop = 21, 
		RULE_vardecl = 22, RULE_type = 23, RULE_relationals = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"myStartingRule", "program", "block", "statement", "loops", "assignment", 
			"writestatement", "readstatement", "printstatement", "ifStatement", "whileStatement", 
			"expression", "relationop", "simpleExpression", "ariExpression", "term", 
			"termAri", "factor", "factorAri", "variable", "addop", "multop", "vardecl", 
			"type", "relationals"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Program'", "'Begin'", "'End.'", "'begin'", "'end'", "'do'", "'write'", 
			"'read'", "'print'", "'while'", "'for'", "'if'", "'then'", "'else'", 
			"'or'", "'not'", "'and'", "'True'", "'False'", "'var'", "'float'", "'boolean'", 
			"'string'", "'integer'", null, null, null, null, "'+'", "'-'", "'*'", 
			"'='", "'/'", "'>'", "'<'", "'<='", "'>='", "'<>'", "'=='", "';'", "'('", 
			"')'", "':='", "'.'", "','", "':'", "'..'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAM", "BEGIN", "END", "BEGIN_BLOCK", "END_BLOCK", "DO", "WRITE", 
			"READ", "PRINT", "WHILE", "FOR", "IF", "THEN", "ELSE", "OR", "NOT", "AND", 
			"TRUE", "FALSE", "VAR", "FLOAT", "BOOLEAN", "STRING", "INTEGER", "OPERATORS", 
			"STR", "DIGIT", "ID", "PLUS", "MINUS", "MULT", "EQUALS", "DIV", "RT", 
			"LT", "LE", "RE", "LR", "EQ", "SMCOLON", "OP", "CP", "ATTRIB", "DOT", 
			"COMMA", "COLON", "DBDOT", "SPECCHARS", "COMMENTS", "WS"
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitMyStartingRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MyStartingRuleContext myStartingRule() throws RecognitionException {
		MyStartingRuleContext _localctx = new MyStartingRuleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_myStartingRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(50);
				program();
				}
				}
				setState(53); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(PROGRAM);
			setState(56);
			match(STR);
			setState(57);
			match(SMCOLON);
			setState(61);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(58);
					statement();
					}
					} 
				}
				setState(63);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(64);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(BEGIN_BLOCK);
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(67);
				variable();
				}
				break;
			}
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WRITE) | (1L << READ) | (1L << PRINT) | (1L << WHILE) | (1L << IF) | (1L << VAR) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << STRING) | (1L << INTEGER) | (1L << DIGIT) | (1L << ID) | (1L << OP))) != 0)) {
				{
				{
				setState(70);
				statement();
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
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
		public PrintstatementContext printstatement() {
			return getRuleContext(PrintstatementContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				vardecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				readstatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(81);
				writestatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(82);
				printstatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(83);
				loops();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(84);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitLoops(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopsContext loops() throws RecognitionException {
		LoopsContext _localctx = new LoopsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_loops);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
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
		public List<AriExpressionContext> ariExpression() {
			return getRuleContexts(AriExpressionContext.class);
		}
		public AriExpressionContext ariExpression(int i) {
			return getRuleContext(AriExpressionContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(97); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(97);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						setState(89);
						variable();
						setState(90);
						match(ATTRIB);
						setState(92);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
						case 1:
							{
							setState(91);
							expression();
							}
							break;
						}
						}
						break;
					case 2:
						{
						setState(94);
						ariExpression();
						setState(95);
						match(SMCOLON);
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(99); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitWritestatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WritestatementContext writestatement() throws RecognitionException {
		WritestatementContext _localctx = new WritestatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_writestatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(WRITE);
			setState(102);
			match(OP);
			setState(103);
			match(STR);
			setState(104);
			match(CP);
			setState(105);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitReadstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadstatementContext readstatement() throws RecognitionException {
		ReadstatementContext _localctx = new ReadstatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_readstatement);
		int _la;
		try {
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(READ);
				setState(108);
				match(OP);
				setState(109);
				expression();
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(110);
					match(COMMA);
					setState(111);
					expression();
					}
					}
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(ID);
				setState(118);
				match(CP);
				setState(119);
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

	public static class PrintstatementContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(MiniPascalParser.PRINT, 0); }
		public TerminalNode OP() { return getToken(MiniPascalParser.OP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CP() { return getToken(MiniPascalParser.CP, 0); }
		public TerminalNode SMCOLON() { return getToken(MiniPascalParser.SMCOLON, 0); }
		public PrintstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterPrintstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitPrintstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitPrintstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintstatementContext printstatement() throws RecognitionException {
		PrintstatementContext _localctx = new PrintstatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_printstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(PRINT);
			setState(123);
			match(OP);
			setState(124);
			expression();
			setState(125);
			match(CP);
			setState(126);
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

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MiniPascalParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(MiniPascalParser.THEN, 0); }
		public List<TerminalNode> COLON() { return getTokens(MiniPascalParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(MiniPascalParser.COLON, i);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(IF);
			setState(129);
			expression();
			setState(130);
			match(THEN);
			setState(131);
			match(COLON);
			setState(132);
			statement();
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(133);
				match(ELSE);
				setState(134);
				match(COLON);
				setState(135);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(WHILE);
			setState(139);
			expression();
			setState(140);
			match(DO);
			setState(141);
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
		public List<RelationopContext> relationop() {
			return getRuleContexts(RelationopContext.class);
		}
		public RelationopContext relationop(int i) {
			return getRuleContext(RelationopContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			simpleExpression();
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RT) | (1L << LT) | (1L << LE) | (1L << RE) | (1L << LR))) != 0)) {
				{
				{
				setState(144);
				relationop();
				setState(145);
				simpleExpression();
				}
				}
				setState(151);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitRelationop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationopContext relationop() throws RecognitionException {
		RelationopContext _localctx = new RelationopContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_relationop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitSimpleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_simpleExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(154);
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

			setState(157);
			term();
			setState(162);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					{
					}
					setState(159);
					term();
					}
					} 
				}
				setState(164);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class AriExpressionContext extends ParserRuleContext {
		public List<TermAriContext> termAri() {
			return getRuleContexts(TermAriContext.class);
		}
		public TermAriContext termAri(int i) {
			return getRuleContext(TermAriContext.class,i);
		}
		public List<TerminalNode> OPERATORS() { return getTokens(MiniPascalParser.OPERATORS); }
		public TerminalNode OPERATORS(int i) {
			return getToken(MiniPascalParser.OPERATORS, i);
		}
		public AriExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ariExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterAriExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitAriExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitAriExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AriExpressionContext ariExpression() throws RecognitionException {
		AriExpressionContext _localctx = new AriExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ariExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			termAri();
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPERATORS) {
				{
				{
				setState(166);
				match(OPERATORS);
				setState(167);
				termAri();
				}
				}
				setState(172);
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
		public List<TerminalNode> OPERATORS() { return getTokens(MiniPascalParser.OPERATORS); }
		public TerminalNode OPERATORS(int i) {
			return getToken(MiniPascalParser.OPERATORS, i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			factor();
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPERATORS) {
				{
				{
				setState(174);
				match(OPERATORS);
				setState(175);
				factor();
				}
				}
				setState(180);
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

	public static class TermAriContext extends ParserRuleContext {
		public List<FactorAriContext> factorAri() {
			return getRuleContexts(FactorAriContext.class);
		}
		public FactorAriContext factorAri(int i) {
			return getRuleContext(FactorAriContext.class,i);
		}
		public List<TerminalNode> OPERATORS() { return getTokens(MiniPascalParser.OPERATORS); }
		public TerminalNode OPERATORS(int i) {
			return getToken(MiniPascalParser.OPERATORS, i);
		}
		public TermAriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termAri; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterTermAri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitTermAri(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitTermAri(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermAriContext termAri() throws RecognitionException {
		TermAriContext _localctx = new TermAriContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_termAri);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			factorAri();
			setState(186);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(182);
					match(OPERATORS);
					setState(183);
					factorAri();
					}
					} 
				}
				setState(188);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		public TerminalNode OP() { return getToken(MiniPascalParser.OP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CP() { return getToken(MiniPascalParser.CP, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_factor);
		try {
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				variable();
				}
				break;
			case DIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				match(DIGIT);
				}
				break;
			case OP:
				enterOuterAlt(_localctx, 3);
				{
				setState(191);
				match(OP);
				setState(192);
				expression();
				setState(193);
				match(CP);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 4);
				{
				setState(195);
				match(NOT);
				setState(196);
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

	public static class FactorAriContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(MiniPascalParser.DIGIT, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode OP() { return getToken(MiniPascalParser.OP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CP() { return getToken(MiniPascalParser.CP, 0); }
		public FactorAriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factorAri; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterFactorAri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitFactorAri(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitFactorAri(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorAriContext factorAri() throws RecognitionException {
		FactorAriContext _localctx = new FactorAriContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_factorAri);
		try {
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				match(DIGIT);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				variable();
				}
				break;
			case OP:
				enterOuterAlt(_localctx, 3);
				{
				setState(201);
				match(OP);
				setState(202);
				expression();
				setState(203);
				match(CP);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitAddop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddopContext addop() throws RecognitionException {
		AddopContext _localctx = new AddopContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_addop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitMultop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultopContext multop() throws RecognitionException {
		MultopContext _localctx = new MultopContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_multop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
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
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode SMCOLON() { return getToken(MiniPascalParser.SMCOLON, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitVardecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardeclContext vardecl() throws RecognitionException {
		VardeclContext _localctx = new VardeclContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_vardecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			type();
			setState(214);
			variable();
			setState(215);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitRelationals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalsContext relationals() throws RecognitionException {
		RelationalsContext _localctx = new RelationalsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_relationals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u00e0\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\6\2\66\n\2\r\2\16\2\67\3\3\3\3\3\3\3\3\7\3>\n\3\f\3\16"+
		"\3A\13\3\3\3\3\3\3\4\3\4\5\4G\n\4\3\4\7\4J\n\4\f\4\16\4M\13\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5X\n\5\3\6\3\6\3\7\3\7\3\7\5\7_\n\7\3\7"+
		"\3\7\3\7\6\7d\n\7\r\7\16\7e\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\7\ts\n\t\f\t\16\tv\13\t\3\t\3\t\3\t\5\t{\n\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u008b\n\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\7\r\u0096\n\r\f\r\16\r\u0099\13\r\3\16\3\16\3"+
		"\17\5\17\u009e\n\17\3\17\3\17\3\17\7\17\u00a3\n\17\f\17\16\17\u00a6\13"+
		"\17\3\20\3\20\3\20\7\20\u00ab\n\20\f\20\16\20\u00ae\13\20\3\21\3\21\3"+
		"\21\7\21\u00b3\n\21\f\21\16\21\u00b6\13\21\3\22\3\22\3\22\7\22\u00bb\n"+
		"\22\f\22\16\22\u00be\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u00c8\n\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00d0\n\24\3\25\3\25\3"+
		"\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3?\2\33"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\7\3\2$(\3\2\37"+
		" \4\2\21\21\37 \5\2\23\23!!##\3\2\26\32\2\u00e1\2\65\3\2\2\2\49\3\2\2"+
		"\2\6D\3\2\2\2\bW\3\2\2\2\nY\3\2\2\2\fc\3\2\2\2\16g\3\2\2\2\20z\3\2\2\2"+
		"\22|\3\2\2\2\24\u0082\3\2\2\2\26\u008c\3\2\2\2\30\u0091\3\2\2\2\32\u009a"+
		"\3\2\2\2\34\u009d\3\2\2\2\36\u00a7\3\2\2\2 \u00af\3\2\2\2\"\u00b7\3\2"+
		"\2\2$\u00c7\3\2\2\2&\u00cf\3\2\2\2(\u00d1\3\2\2\2*\u00d3\3\2\2\2,\u00d5"+
		"\3\2\2\2.\u00d7\3\2\2\2\60\u00db\3\2\2\2\62\u00dd\3\2\2\2\64\66\5\4\3"+
		"\2\65\64\3\2\2\2\66\67\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\3\3\2\2\29:"+
		"\7\3\2\2:;\7\34\2\2;?\7*\2\2<>\5\b\5\2=<\3\2\2\2>A\3\2\2\2?@\3\2\2\2?"+
		"=\3\2\2\2@B\3\2\2\2A?\3\2\2\2BC\5\6\4\2C\5\3\2\2\2DF\7\6\2\2EG\5(\25\2"+
		"FE\3\2\2\2FG\3\2\2\2GK\3\2\2\2HJ\5\b\5\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2"+
		"KL\3\2\2\2LN\3\2\2\2MK\3\2\2\2NO\7\7\2\2O\7\3\2\2\2PX\5.\30\2QX\5\f\7"+
		"\2RX\5\20\t\2SX\5\16\b\2TX\5\22\n\2UX\5\n\6\2VX\5\24\13\2WP\3\2\2\2WQ"+
		"\3\2\2\2WR\3\2\2\2WS\3\2\2\2WT\3\2\2\2WU\3\2\2\2WV\3\2\2\2X\t\3\2\2\2"+
		"YZ\5\26\f\2Z\13\3\2\2\2[\\\5(\25\2\\^\7-\2\2]_\5\30\r\2^]\3\2\2\2^_\3"+
		"\2\2\2_d\3\2\2\2`a\5\36\20\2ab\7*\2\2bd\3\2\2\2c[\3\2\2\2c`\3\2\2\2de"+
		"\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\r\3\2\2\2gh\7\t\2\2hi\7+\2\2ij\7\34\2\2"+
		"jk\7,\2\2kl\7*\2\2l\17\3\2\2\2mn\7\n\2\2no\7+\2\2ot\5\30\r\2pq\7/\2\2"+
		"qs\5\30\r\2rp\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u{\3\2\2\2vt\3\2\2"+
		"\2wx\7\36\2\2xy\7,\2\2y{\7*\2\2zm\3\2\2\2zw\3\2\2\2{\21\3\2\2\2|}\7\13"+
		"\2\2}~\7+\2\2~\177\5\30\r\2\177\u0080\7,\2\2\u0080\u0081\7*\2\2\u0081"+
		"\23\3\2\2\2\u0082\u0083\7\16\2\2\u0083\u0084\5\30\r\2\u0084\u0085\7\17"+
		"\2\2\u0085\u0086\7\60\2\2\u0086\u008a\5\b\5\2\u0087\u0088\7\20\2\2\u0088"+
		"\u0089\7\60\2\2\u0089\u008b\5\b\5\2\u008a\u0087\3\2\2\2\u008a\u008b\3"+
		"\2\2\2\u008b\25\3\2\2\2\u008c\u008d\7\f\2\2\u008d\u008e\5\30\r\2\u008e"+
		"\u008f\7\b\2\2\u008f\u0090\5\b\5\2\u0090\27\3\2\2\2\u0091\u0097\5\34\17"+
		"\2\u0092\u0093\5\32\16\2\u0093\u0094\5\34\17\2\u0094\u0096\3\2\2\2\u0095"+
		"\u0092\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2"+
		"\2\2\u0098\31\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b\t\2\2\2\u009b\33"+
		"\3\2\2\2\u009c\u009e\t\3\2\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a4\5 \21\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\5 "+
		"\21\2\u00a2\u00a0\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4"+
		"\u00a5\3\2\2\2\u00a5\35\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00ac\5\"\22"+
		"\2\u00a8\u00a9\7\33\2\2\u00a9\u00ab\5\"\22\2\u00aa\u00a8\3\2\2\2\u00ab"+
		"\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\37\3\2\2"+
		"\2\u00ae\u00ac\3\2\2\2\u00af\u00b4\5$\23\2\u00b0\u00b1\7\33\2\2\u00b1"+
		"\u00b3\5$\23\2\u00b2\u00b0\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2"+
		"\2\2\u00b4\u00b5\3\2\2\2\u00b5!\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00bc"+
		"\5&\24\2\u00b8\u00b9\7\33\2\2\u00b9\u00bb\5&\24\2\u00ba\u00b8\3\2\2\2"+
		"\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd#\3"+
		"\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c8\5(\25\2\u00c0\u00c8\7\35\2\2\u00c1"+
		"\u00c2\7+\2\2\u00c2\u00c3\5\30\r\2\u00c3\u00c4\7,\2\2\u00c4\u00c8\3\2"+
		"\2\2\u00c5\u00c6\7\22\2\2\u00c6\u00c8\5$\23\2\u00c7\u00bf\3\2\2\2\u00c7"+
		"\u00c0\3\2\2\2\u00c7\u00c1\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8%\3\2\2\2"+
		"\u00c9\u00d0\7\35\2\2\u00ca\u00d0\5(\25\2\u00cb\u00cc\7+\2\2\u00cc\u00cd"+
		"\5\30\r\2\u00cd\u00ce\7,\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00c9\3\2\2\2\u00cf"+
		"\u00ca\3\2\2\2\u00cf\u00cb\3\2\2\2\u00d0\'\3\2\2\2\u00d1\u00d2\7\36\2"+
		"\2\u00d2)\3\2\2\2\u00d3\u00d4\t\4\2\2\u00d4+\3\2\2\2\u00d5\u00d6\t\5\2"+
		"\2\u00d6-\3\2\2\2\u00d7\u00d8\5\60\31\2\u00d8\u00d9\5(\25\2\u00d9\u00da"+
		"\7*\2\2\u00da/\3\2\2\2\u00db\u00dc\t\6\2\2\u00dc\61\3\2\2\2\u00dd\u00de"+
		"\t\2\2\2\u00de\63\3\2\2\2\25\67?FKW^cetz\u008a\u0097\u009d\u00a4\u00ac"+
		"\u00b4\u00bc\u00c7\u00cf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}