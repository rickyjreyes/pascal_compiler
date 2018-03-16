// Generated from JcPascal.g4 by ANTLR 4.7

    import wci.intermediate.*;
    import wci.intermediate.symtabimpl.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JcPascalParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, PROGRAM=2, VAR=3, BEGIN=4, END=5, IF=6, THEN=7, ELSE=8, WHILE=9, 
		DO=10, CASE=11, OF=12, WHEN=13, OTHERWISE=14, REPEAT=15, UNTIL=16, FOR=17, 
		TO=18, DOWNTO=19, AND=20, OR=21, FUNCTION=22, PROCEDURE=23, LPAREN=24, 
		RPAREN=25, SEMI=26, COMMA=27, COLON=28, ARROW=29, ASSIGN=30, IDENTIFIER=31, 
		INTEGER_NUM=32, FLOAT_NUM=33, MUL_OP=34, DIV_OP=35, ADD_OP=36, SUB_OP=37, 
		EQUAL=38, NOT_EQUAL=39, LT=40, LE=41, GE=42, GT=43, NEWLINE=44, WS=45, 
		COMMENT_1=46, COMMENT_2=47;
	public static final int
		RULE_program = 0, RULE_header = 1, RULE_mainBlock = 2, RULE_block = 3, 
		RULE_declarations = 4, RULE_declList = 5, RULE_decl = 6, RULE_varList = 7, 
		RULE_varId = 8, RULE_typeId = 9, RULE_paramList = 10, RULE_paramId = 11, 
		RULE_funcTypeId = 12, RULE_procedureFunctionDEF = 13, RULE_functionDeclaration = 14, 
		RULE_procedureDeclaration = 15, RULE_formalParameterList = 16, RULE_formalParameterSection = 17, 
		RULE_parameterGroup = 18, RULE_compoundStmt = 19, RULE_stmt = 20, RULE_stmtList = 21, 
		RULE_assignmentStmt = 22, RULE_procedureStatement = 23, RULE_parameterList = 24, 
		RULE_actualParameter = 25, RULE_ifStatement = 26, RULE_whileStatement = 27, 
		RULE_caseStatement = 28, RULE_constList = 29, RULE_caseListElement = 30, 
		RULE_whenStatement = 31, RULE_whenListElement = 32, RULE_repeatStatement = 33, 
		RULE_forStatement = 34, RULE_forList = 35, RULE_initialValue = 36, RULE_finalValue = 37, 
		RULE_variable = 38, RULE_identifier = 39, RULE_compareExpr = 40, RULE_expr = 41, 
		RULE_simpleExpression = 42, RULE_term = 43, RULE_signedFactor = 44, RULE_factor = 45, 
		RULE_unsignedConstant = 46, RULE_functionCall = 47, RULE_mulDivOp = 48, 
		RULE_addSubOp = 49, RULE_compareOp = 50, RULE_sign = 51, RULE_number = 52;
	public static final String[] ruleNames = {
		"program", "header", "mainBlock", "block", "declarations", "declList", 
		"decl", "varList", "varId", "typeId", "paramList", "paramId", "funcTypeId", 
		"procedureFunctionDEF", "functionDeclaration", "procedureDeclaration", 
		"formalParameterList", "formalParameterSection", "parameterGroup", "compoundStmt", 
		"stmt", "stmtList", "assignmentStmt", "procedureStatement", "parameterList", 
		"actualParameter", "ifStatement", "whileStatement", "caseStatement", "constList", 
		"caseListElement", "whenStatement", "whenListElement", "repeatStatement", 
		"forStatement", "forList", "initialValue", "finalValue", "variable", "identifier", 
		"compareExpr", "expr", "simpleExpression", "term", "signedFactor", "factor", 
		"unsignedConstant", "functionCall", "mulDivOp", "addSubOp", "compareOp", 
		"sign", "number"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"'('", "')'", "';'", "','", "':'", "'=>'", "':='", null, null, null, "'*'", 
		"'/'", "'+'", "'-'", "'='", "'<>'", "'<'", "'<='", "'>='", "'>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "PROGRAM", "VAR", "BEGIN", "END", "IF", "THEN", "ELSE", "WHILE", 
		"DO", "CASE", "OF", "WHEN", "OTHERWISE", "REPEAT", "UNTIL", "FOR", "TO", 
		"DOWNTO", "AND", "OR", "FUNCTION", "PROCEDURE", "LPAREN", "RPAREN", "SEMI", 
		"COMMA", "COLON", "ARROW", "ASSIGN", "IDENTIFIER", "INTEGER_NUM", "FLOAT_NUM", 
		"MUL_OP", "DIV_OP", "ADD_OP", "SUB_OP", "EQUAL", "NOT_EQUAL", "LT", "LE", 
		"GE", "GT", "NEWLINE", "WS", "COMMENT_1", "COMMENT_2"
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
	public String getGrammarFileName() { return "JcPascal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JcPascalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public MainBlockContext mainBlock() {
			return getRuleContext(MainBlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JcPascalVisitor ) return ((JcPascalVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			header();
			setState(107);
			mainBlock();
			setState(108);
			match(T__0);
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

	public static class HeaderContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(JcPascalParser.PROGRAM, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JcPascalParser.IDENTIFIER, 0); }
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JcPascalVisitor ) return ((JcPascalVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(PROGRAM);
			setState(111);
			match(IDENTIFIER);
			setState(112);
			match(SEMI);
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

	public static class MainBlockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MainBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).enterMainBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).exitMainBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JcPascalVisitor ) return ((JcPascalVisitor<? extends T>)visitor).visitMainBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainBlockContext mainBlock() throws RecognitionException {
		MainBlockContext _localctx = new MainBlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mainBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
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
		public CompoundStmtContext compoundStmt() {
			return getRuleContext(CompoundStmtContext.class,0);
		}
		public List<DeclarationsContext> declarations() {
			return getRuleContexts(DeclarationsContext.class);
		}
		public DeclarationsContext declarations(int i) {
			return getRuleContext(DeclarationsContext.class,i);
		}
		public List<ProcedureFunctionDEFContext> procedureFunctionDEF() {
			return getRuleContexts(ProcedureFunctionDEFContext.class);
		}
		public ProcedureFunctionDEFContext procedureFunctionDEF(int i) {
			return getRuleContext(ProcedureFunctionDEFContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JcPascalVisitor ) return ((JcPascalVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR || _la==FUNCTION) {
				{
				setState(118);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VAR:
					{
					setState(116);
					declarations();
					}
					break;
				case FUNCTION:
					{
					setState(117);
					procedureFunctionDEF();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
			compoundStmt();
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

	public static class DeclarationsContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(JcPascalParser.VAR, 0); }
		public DeclListContext declList() {
			return getRuleContext(DeclListContext.class,0);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).exitDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JcPascalVisitor ) return ((JcPascalVisitor<? extends T>)visitor).visitDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declarations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(VAR);
			setState(126);
			declList();
			setState(127);
			match(SEMI);
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

	public static class DeclListContext extends ParserRuleContext {
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public DeclListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).enterDeclList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).exitDeclList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JcPascalVisitor ) return ((JcPascalVisitor<? extends T>)visitor).visitDeclList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclListContext declList() throws RecognitionException {
		DeclListContext _localctx = new DeclListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			decl();
			setState(134);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(130);
					match(SEMI);
					setState(131);
					decl();
					}
					} 
				}
				setState(136);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class DeclContext extends ParserRuleContext {
		public VarListContext varList() {
			return getRuleContext(VarListContext.class,0);
		}
		public TypeIdContext typeId() {
			return getRuleContext(TypeIdContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).exitDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JcPascalVisitor ) return ((JcPascalVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			varList();
			setState(138);
			match(COLON);
			setState(139);
			typeId();
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

	public static class VarListContext extends ParserRuleContext {
		public List<VarIdContext> varId() {
			return getRuleContexts(VarIdContext.class);
		}
		public VarIdContext varId(int i) {
			return getRuleContext(VarIdContext.class,i);
		}
		public VarListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).enterVarList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).exitVarList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JcPascalVisitor ) return ((JcPascalVisitor<? extends T>)visitor).visitVarList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarListContext varList() throws RecognitionException {
		VarListContext _localctx = new VarListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_varList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			varId();
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(142);
				match(COMMA);
				setState(143);
				varId();
				}
				}
				setState(148);
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

	public static class VarIdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JcPascalParser.IDENTIFIER, 0); }
		public VarIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).enterVarId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).exitVarId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JcPascalVisitor ) return ((JcPascalVisitor<? extends T>)visitor).visitVarId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarIdContext varId() throws RecognitionException {
		VarIdContext _localctx = new VarIdContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_varId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(IDENTIFIER);
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

	public static class TypeIdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JcPascalParser.IDENTIFIER, 0); }
		public TypeIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).enterTypeId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).exitTypeId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JcPascalVisitor ) return ((JcPascalVisitor<? extends T>)visitor).visitTypeId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeIdContext typeId() throws RecognitionException {
		TypeIdContext _localctx = new TypeIdContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_typeId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(IDENTIFIER);
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

	public static class ParamListContext extends ParserRuleContext {
		public List<ParamIdContext> paramId() {
			return getRuleContexts(ParamIdContext.class);
		}
		public ParamIdContext paramId(int i) {
			return getRuleContext(ParamIdContext.class,i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).enterParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).exitParamList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JcPascalVisitor ) return ((JcPascalVisitor<? extends T>)visitor).visitParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			paramId();
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(154);
				match(COMMA);
				setState(155);
				paramId();
				}
				}
				setState(160);
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

	public static class ParamIdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JcPascalParser.IDENTIFIER, 0); }
		public ParamIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).enterParamId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).exitParamId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JcPascalVisitor ) return ((JcPascalVisitor<? extends T>)visitor).visitParamId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamIdContext paramId() throws RecognitionException {
		ParamIdContext _localctx = new ParamIdContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_paramId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(IDENTIFIER);
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

	public static class FuncTypeIdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JcPascalParser.IDENTIFIER, 0); }
		public FuncTypeIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcTypeId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).enterFuncTypeId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).exitFuncTypeId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JcPascalVisitor ) return ((JcPascalVisitor<? extends T>)visitor).visitFuncTypeId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncTypeIdContext funcTypeId() throws RecognitionException {
		FuncTypeIdContext _localctx = new FuncTypeIdContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_funcTypeId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(IDENTIFIER);
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

	public static class ProcedureFunctionDEFContext extends ParserRuleContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JcPascalParser.SEMI, 0); }
		public ProcedureFunctionDEFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureFunctionDEF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).enterProcedureFunctionDEF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).exitProcedureFunctionDEF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JcPascalVisitor ) return ((JcPascalVisitor<? extends T>)visitor).visitProcedureFunctionDEF(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureFunctionDEFContext procedureFunctionDEF() throws RecognitionException {
		ProcedureFunctionDEFContext _localctx = new ProcedureFunctionDEFContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_procedureFunctionDEF);
		try {
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				functionDeclaration();
				setState(166);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				functionDeclaration();
				setState(169);
				match(SEMI);
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(JcPascalParser.FUNCTION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JcPascalParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(JcPascalParser.COLON, 0); }
		public TypeIdContext typeId() {
			return getRuleContext(TypeIdContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JcPascalParser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JcPascalVisitor ) return ((JcPascalVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(FUNCTION);
			setState(174);
			match(IDENTIFIER);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(175);
				formalParameterList();
				}
			}

			setState(178);
			match(COLON);
			setState(179);
			typeId();
			setState(180);
			match(SEMI);
			setState(181);
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

	public static class ProcedureDeclarationContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(JcPascalParser.PROCEDURE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JcPascalParser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public ProcedureDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).enterProcedureDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).exitProcedureDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JcPascalVisitor ) return ((JcPascalVisitor<? extends T>)visitor).visitProcedureDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureDeclarationContext procedureDeclaration() throws RecognitionException {
		ProcedureDeclarationContext _localctx = new ProcedureDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_procedureDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(PROCEDURE);
			setState(184);
			identifier();
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(185);
				formalParameterList();
				}
			}

			setState(188);
			match(SEMI);
			setState(189);
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

	public static class FormalParameterListContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JcPascalParser.LPAREN, 0); }
		public List<FormalParameterSectionContext> formalParameterSection() {
			return getRuleContexts(FormalParameterSectionContext.class);
		}
		public FormalParameterSectionContext formalParameterSection(int i) {
			return getRuleContext(FormalParameterSectionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(JcPascalParser.RPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(JcPascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(JcPascalParser.SEMI, i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JcPascalVisitor ) return ((JcPascalVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(LPAREN);
			setState(192);
			formalParameterSection();
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(193);
				match(SEMI);
				setState(194);
				formalParameterSection();
				}
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(200);
			match(RPAREN);
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

	public static class FormalParameterSectionContext extends ParserRuleContext {
		public ParameterGroupContext parameterGroup() {
			return getRuleContext(ParameterGroupContext.class,0);
		}
		public TerminalNode VAR() { return getToken(JcPascalParser.VAR, 0); }
		public TerminalNode FUNCTION() { return getToken(JcPascalParser.FUNCTION, 0); }
		public TerminalNode PROCEDURE() { return getToken(JcPascalParser.PROCEDURE, 0); }
		public FormalParameterSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).enterFormalParameterSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).exitFormalParameterSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JcPascalVisitor ) return ((JcPascalVisitor<? extends T>)visitor).visitFormalParameterSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterSectionContext formalParameterSection() throws RecognitionException {
		FormalParameterSectionContext _localctx = new FormalParameterSectionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_formalParameterSection);
		try {
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				parameterGroup();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				match(VAR);
				setState(204);
				parameterGroup();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 3);
				{
				setState(205);
				match(FUNCTION);
				setState(206);
				parameterGroup();
				}
				break;
			case PROCEDURE:
				enterOuterAlt(_localctx, 4);
				{
				setState(207);
				match(PROCEDURE);
				setState(208);
				parameterGroup();
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

	public static class ParameterGroupContext extends ParserRuleContext {
		public VarListContext varList() {
			return getRuleContext(VarListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JcPascalParser.COLON, 0); }
		public TypeIdContext typeId() {
			return getRuleContext(TypeIdContext.class,0);
		}
		public ParameterGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).enterParameterGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).exitParameterGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JcPascalVisitor ) return ((JcPascalVisitor<? extends T>)visitor).visitParameterGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterGroupContext parameterGroup() throws RecognitionException {
		ParameterGroupContext _localctx = new ParameterGroupContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_parameterGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			varList();
			setState(212);
			match(COLON);
			setState(213);
			typeId();
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

	public static class CompoundStmtContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(JcPascalParser.BEGIN, 0); }
		public StmtListContext stmtList() {
			return getRuleContext(StmtListContext.class,0);
		}
		public TerminalNode END() { return getToken(JcPascalParser.END, 0); }
		public CompoundStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).enterCompoundStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).exitCompoundStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JcPascalVisitor ) return ((JcPascalVisitor<? extends T>)visitor).visitCompoundStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStmtContext compoundStmt() throws RecognitionException {
		CompoundStmtContext _localctx = new CompoundStmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_compoundStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(BEGIN);
			setState(216);
			stmtList();
			setState(217);
			match(END);
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

	public static class StmtContext extends ParserRuleContext {
		public CompoundStmtContext compoundStmt() {
			return getRuleContext(CompoundStmtContext.class,0);
		}
		public AssignmentStmtContext assignmentStmt() {
			return getRuleContext(AssignmentStmtContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public WhenStatementContext whenStatement() {
			return getRuleContext(WhenStatementContext.class,0);
		}
		public CaseStatementContext caseStatement() {
			return getRuleContext(CaseStatementContext.class,0);
		}
		public RepeatStatementContext repeatStatement() {
			return getRuleContext(RepeatStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public ProcedureStatementContext procedureStatement() {
			return getRuleContext(ProcedureStatementContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JcPascalVisitor ) return ((JcPascalVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_stmt);
		try {
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				compoundStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				assignmentStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(222);
				whileStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(223);
				whenStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(224);
				caseStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(225);
				repeatStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(226);
				forStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(227);
				procedureStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
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

	public static class StmtListContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public StmtListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).enterStmtList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).exitStmtList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JcPascalVisitor ) return ((JcPascalVisitor<? extends T>)visitor).visitStmtList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtListContext stmtList() throws RecognitionException {
		StmtListContext _localctx = new StmtListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_stmtList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			stmt();
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(232);
				match(SEMI);
				setState(233);
				stmt();
				}
				}
				setState(238);
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

	public static class AssignmentStmtContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).enterAssignmentStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).exitAssignmentStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JcPascalVisitor ) return ((JcPascalVisitor<? extends T>)visitor).visitAssignmentStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStmtContext assignmentStmt() throws RecognitionException {
		AssignmentStmtContext _localctx = new AssignmentStmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_assignmentStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			variable();
			setState(240);
			match(ASSIGN);
			setState(241);
			expr();
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

	public static class ProcedureStatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JcPascalParser.LPAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JcPascalParser.RPAREN, 0); }
		public ProcedureStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).enterProcedureStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).exitProcedureStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JcPascalVisitor ) return ((JcPascalVisitor<? extends T>)visitor).visitProcedureStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureStatementContext procedureStatement() throws RecognitionException {
		ProcedureStatementContext _localctx = new ProcedureStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_procedureStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			identifier();
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(244);
				match(LPAREN);
				setState(245);
				parameterList();
				setState(246);
				match(RPAREN);
				}
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

	public static class ParameterListContext extends ParserRuleContext {
		public List<ActualParameterContext> actualParameter() {
			return getRuleContexts(ActualParameterContext.class);
		}
		public ActualParameterContext actualParameter(int i) {
			return getRuleContext(ActualParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JcPascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JcPascalParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JcPascalVisitor ) return ((JcPascalVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			actualParameter();
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(251);
				match(COMMA);
				setState(252);
				actualParameter();
				}
				}
				setState(257);
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

	public static class ActualParameterContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ActualParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).enterActualParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).exitActualParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JcPascalVisitor ) return ((JcPascalVisitor<? extends T>)visitor).visitActualParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActualParameterContext actualParameter() throws RecognitionException {
		ActualParameterContext _localctx = new ActualParameterContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_actualParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			expr();
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
		public TerminalNode IF() { return getToken(JcPascalParser.IF, 0); }
		public CompareExprContext compareExpr() {
			return getRuleContext(CompareExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(JcPascalParser.THEN, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(JcPascalParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JcPascalVisitor ) return ((JcPascalVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(IF);
			setState(261);
			compareExpr();
			setState(262);
			match(THEN);
			setState(263);
			stmt();
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(264);
				match(ELSE);
				setState(265);
				stmt();
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
		public TerminalNode WHILE() { return getToken(JcPascalParser.WHILE, 0); }
		public CompareExprContext compareExpr() {
			return getRuleContext(CompareExprContext.class,0);
		}
		public TerminalNode DO() { return getToken(JcPascalParser.DO, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JcPascalVisitor ) return ((JcPascalVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(WHILE);
			setState(269);
			compareExpr();
			setState(270);
			match(DO);
			setState(271);
			stmt();
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

	public static class CaseStatementContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(JcPascalParser.CASE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode OF() { return getToken(JcPascalParser.OF, 0); }
		public List<CaseListElementContext> caseListElement() {
			return getRuleContexts(CaseListElementContext.class);
		}
		public CaseListElementContext caseListElement(int i) {
			return getRuleContext(CaseListElementContext.class,i);
		}
		public TerminalNode END() { return getToken(JcPascalParser.END, 0); }
		public List<TerminalNode> SEMI() { return getTokens(JcPascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(JcPascalParser.SEMI, i);
		}
		public TerminalNode ELSE() { return getToken(JcPascalParser.ELSE, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public CaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).enterCaseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).exitCaseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JcPascalVisitor ) return ((JcPascalVisitor<? extends T>)visitor).visitCaseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseStatementContext caseStatement() throws RecognitionException {
		CaseStatementContext _localctx = new CaseStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_caseStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(CASE);
			setState(274);
			expr();
			setState(275);
			match(OF);
			setState(276);
			caseListElement();
			setState(281);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(277);
					match(SEMI);
					setState(278);
					caseListElement();
					}
					} 
				}
				setState(283);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(284);
				match(SEMI);
				setState(285);
				match(ELSE);
				setState(286);
				stmt();
				}
			}

			setState(289);
			match(END);
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

	public static class ConstListContext extends ParserRuleContext {
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JcPascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JcPascalParser.COMMA, i);
		}
		public ConstListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).enterConstList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).exitConstList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JcPascalVisitor ) return ((JcPascalVisitor<? extends T>)visitor).visitConstList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstListContext constList() throws RecognitionException {
		ConstListContext _localctx = new ConstListContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_constList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			number();
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(292);
				match(COMMA);
				setState(293);
				number();
				}
				}
				setState(298);
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

	public static class CaseListElementContext extends ParserRuleContext {
		public ConstListContext constList() {
			return getRuleContext(ConstListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JcPascalParser.COLON, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public CaseListElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseListElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).enterCaseListElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).exitCaseListElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JcPascalVisitor ) return ((JcPascalVisitor<? extends T>)visitor).visitCaseListElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseListElementContext caseListElement() throws RecognitionException {
		CaseListElementContext _localctx = new CaseListElementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_caseListElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			constList();
			setState(300);
			match(COLON);
			setState(301);
			stmt();
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

	public static class WhenStatementContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(JcPascalParser.WHEN, 0); }
		public List<WhenListElementContext> whenListElement() {
			return getRuleContexts(WhenListElementContext.class);
		}
		public WhenListElementContext whenListElement(int i) {
			return getRuleContext(WhenListElementContext.class,i);
		}
		public TerminalNode END() { return getToken(JcPascalParser.END, 0); }
		public List<TerminalNode> SEMI() { return getTokens(JcPascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(JcPascalParser.SEMI, i);
		}
		public TerminalNode OTHERWISE() { return getToken(JcPascalParser.OTHERWISE, 0); }
		public TerminalNode ARROW() { return getToken(JcPascalParser.ARROW, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public WhenStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).enterWhenStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).exitWhenStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JcPascalVisitor ) return ((JcPascalVisitor<? extends T>)visitor).visitWhenStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenStatementContext whenStatement() throws RecognitionException {
		WhenStatementContext _localctx = new WhenStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_whenStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(WHEN);
			setState(304);
			whenListElement();
			setState(309);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(305);
					match(SEMI);
					setState(306);
					whenListElement();
					}
					} 
				}
				setState(311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(312);
				match(SEMI);
				setState(313);
				match(OTHERWISE);
				setState(314);
				match(ARROW);
				setState(315);
				stmt();
				}
			}

			setState(318);
			match(END);
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

	public static class WhenListElementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(JcPascalParser.ARROW, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public WhenListElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenListElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).enterWhenListElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).exitWhenListElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JcPascalVisitor ) return ((JcPascalVisitor<? extends T>)visitor).visitWhenListElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenListElementContext whenListElement() throws RecognitionException {
		WhenListElementContext _localctx = new WhenListElementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_whenListElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			expr();
			setState(321);
			match(ARROW);
			setState(322);
			stmt();
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

	public static class RepeatStatementContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(JcPascalParser.REPEAT, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode UNTIL() { return getToken(JcPascalParser.UNTIL, 0); }
		public CompareExprContext compareExpr() {
			return getRuleContext(CompareExprContext.class,0);
		}
		public RepeatStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).enterRepeatStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).exitRepeatStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JcPascalVisitor ) return ((JcPascalVisitor<? extends T>)visitor).visitRepeatStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatStatementContext repeatStatement() throws RecognitionException {
		RepeatStatementContext _localctx = new RepeatStatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_repeatStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(REPEAT);
			setState(325);
			stmt();
			setState(326);
			match(UNTIL);
			setState(327);
			compareExpr();
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

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(JcPascalParser.FOR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JcPascalParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(JcPascalParser.ASSIGN, 0); }
		public ForListContext forList() {
			return getRuleContext(ForListContext.class,0);
		}
		public TerminalNode DO() { return getToken(JcPascalParser.DO, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JcPascalVisitor ) return ((JcPascalVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(FOR);
			setState(330);
			match(IDENTIFIER);
			setState(331);
			match(ASSIGN);
			setState(332);
			forList();
			setState(333);
			match(DO);
			setState(334);
			stmt();
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

	public static class ForListContext extends ParserRuleContext {
		public InitialValueContext initialValue() {
			return getRuleContext(InitialValueContext.class,0);
		}
		public FinalValueContext finalValue() {
			return getRuleContext(FinalValueContext.class,0);
		}
		public TerminalNode TO() { return getToken(JcPascalParser.TO, 0); }
		public TerminalNode DOWNTO() { return getToken(JcPascalParser.DOWNTO, 0); }
		public ForListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).enterForList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).exitForList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JcPascalVisitor ) return ((JcPascalVisitor<? extends T>)visitor).visitForList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForListContext forList() throws RecognitionException {
		ForListContext _localctx = new ForListContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_forList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			initialValue();
			setState(337);
			_la = _input.LA(1);
			if ( !(_la==TO || _la==DOWNTO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(338);
			finalValue();
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

	public static class InitialValueContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InitialValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).enterInitialValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).exitInitialValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JcPascalVisitor ) return ((JcPascalVisitor<? extends T>)visitor).visitInitialValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitialValueContext initialValue() throws RecognitionException {
		InitialValueContext _localctx = new InitialValueContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_initialValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			expr();
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

	public static class FinalValueContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FinalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).enterFinalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).exitFinalValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JcPascalVisitor ) return ((JcPascalVisitor<? extends T>)visitor).visitFinalValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinalValueContext finalValue() throws RecognitionException {
		FinalValueContext _localctx = new FinalValueContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_finalValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			expr();
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
		public TerminalNode IDENTIFIER() { return getToken(JcPascalParser.IDENTIFIER, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JcPascalVisitor ) return ((JcPascalVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(IDENTIFIER);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JcPascalParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JcPascalVisitor ) return ((JcPascalVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(IDENTIFIER);
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

	public static class CompareExprContext extends ParserRuleContext {
		public List<SimpleExpressionContext> simpleExpression() {
			return getRuleContexts(SimpleExpressionContext.class);
		}
		public SimpleExpressionContext simpleExpression(int i) {
			return getRuleContext(SimpleExpressionContext.class,i);
		}
		public CompareOpContext compareOp() {
			return getRuleContext(CompareOpContext.class,0);
		}
		public CompareExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).enterCompareExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).exitCompareExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JcPascalVisitor ) return ((JcPascalVisitor<? extends T>)visitor).visitCompareExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareExprContext compareExpr() throws RecognitionException {
		CompareExprContext _localctx = new CompareExprContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_compareExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			simpleExpression();
			setState(349);
			compareOp();
			setState(350);
			simpleExpression();
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
		public TypeSpec type = null;
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
			this.type = ctx.type;
		}
	}
	public static class SimpleExprContext extends ExprContext {
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public SimpleExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).enterSimpleExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).exitSimpleExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JcPascalVisitor ) return ((JcPascalVisitor<? extends T>)visitor).visitSimpleExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_expr);
		try {
			_localctx = new SimpleExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			simpleExpression();
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
		public TypeSpec type = null;
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
	 
		public SimpleExpressionContext() { }
		public void copyFrom(SimpleExpressionContext ctx) {
			super.copyFrom(ctx);
			this.type = ctx.type;
		}
	}
	public static class AddSubExprContext extends SimpleExpressionContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<AddSubOpContext> addSubOp() {
			return getRuleContexts(AddSubOpContext.class);
		}
		public AddSubOpContext addSubOp(int i) {
			return getRuleContext(AddSubOpContext.class,i);
		}
		public AddSubExprContext(SimpleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).enterAddSubExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).exitAddSubExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JcPascalVisitor ) return ((JcPascalVisitor<? extends T>)visitor).visitAddSubExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_simpleExpression);
		int _la;
		try {
			_localctx = new AddSubExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			term();
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << ADD_OP) | (1L << SUB_OP))) != 0)) {
				{
				{
				setState(355);
				addSubOp();
				setState(356);
				term();
				}
				}
				setState(362);
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
		public TypeSpec type = null;
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
			this.type = ctx.type;
		}
	}
	public static class MulDivExprContext extends TermContext {
		public List<SignedFactorContext> signedFactor() {
			return getRuleContexts(SignedFactorContext.class);
		}
		public SignedFactorContext signedFactor(int i) {
			return getRuleContext(SignedFactorContext.class,i);
		}
		public List<MulDivOpContext> mulDivOp() {
			return getRuleContexts(MulDivOpContext.class);
		}
		public MulDivOpContext mulDivOp(int i) {
			return getRuleContext(MulDivOpContext.class,i);
		}
		public MulDivExprContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).enterMulDivExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).exitMulDivExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JcPascalVisitor ) return ((JcPascalVisitor<? extends T>)visitor).visitMulDivExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_term);
		int _la;
		try {
			_localctx = new MulDivExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			signedFactor();
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << MUL_OP) | (1L << DIV_OP))) != 0)) {
				{
				{
				setState(364);
				mulDivOp();
				setState(365);
				signedFactor();
				}
				}
				setState(371);
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

	public static class SignedFactorContext extends ParserRuleContext {
		public TypeSpec type = null;
		public SignedFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedFactor; }
	 
		public SignedFactorContext() { }
		public void copyFrom(SignedFactorContext ctx) {
			super.copyFrom(ctx);
			this.type = ctx.type;
		}
	}
	public static class SignedNumberContext extends SignedFactorContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public SignedNumberContext(SignedFactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).enterSignedNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).exitSignedNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JcPascalVisitor ) return ((JcPascalVisitor<? extends T>)visitor).visitSignedNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignedFactorContext signedFactor() throws RecognitionException {
		SignedFactorContext _localctx = new SignedFactorContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_signedFactor);
		int _la;
		try {
			_localctx = new SignedNumberContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ADD_OP || _la==SUB_OP) {
				{
				setState(372);
				sign();
				}
			}

			setState(375);
			factor();
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
		public TypeSpec type = null;
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
			this.type = ctx.type;
		}
	}
	public static class VariableExprContext extends FactorContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VariableExprContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).enterVariableExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).exitVariableExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JcPascalVisitor ) return ((JcPascalVisitor<? extends T>)visitor).visitVariableExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallExpContext extends FactorContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionCallExpContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).enterFunctionCallExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).exitFunctionCallExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JcPascalVisitor ) return ((JcPascalVisitor<? extends T>)visitor).visitFunctionCallExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnsignedConstantExpContext extends FactorContext {
		public UnsignedConstantContext unsignedConstant() {
			return getRuleContext(UnsignedConstantContext.class,0);
		}
		public UnsignedConstantExpContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).enterUnsignedConstantExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).exitUnsignedConstantExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JcPascalVisitor ) return ((JcPascalVisitor<? extends T>)visitor).visitUnsignedConstantExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExprContext extends FactorContext {
		public TerminalNode LPAREN() { return getToken(JcPascalParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JcPascalParser.RPAREN, 0); }
		public ParenExprContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).exitParenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JcPascalVisitor ) return ((JcPascalVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_factor);
		try {
			setState(384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new VariableExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				variable();
				}
				break;
			case 2:
				_localctx = new ParenExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(378);
				match(LPAREN);
				setState(379);
				expr();
				setState(380);
				match(RPAREN);
				}
				break;
			case 3:
				_localctx = new UnsignedConstantExpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(382);
				unsignedConstant();
				}
				break;
			case 4:
				_localctx = new FunctionCallExpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(383);
				functionCall();
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

	public static class UnsignedConstantContext extends ParserRuleContext {
		public TypeSpec type = null;
		public UnsignedConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedConstant; }
	 
		public UnsignedConstantContext() { }
		public void copyFrom(UnsignedConstantContext ctx) {
			super.copyFrom(ctx);
			this.type = ctx.type;
		}
	}
	public static class UnsignedNumberExprContext extends UnsignedConstantContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public UnsignedNumberExprContext(UnsignedConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).enterUnsignedNumberExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).exitUnsignedNumberExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JcPascalVisitor ) return ((JcPascalVisitor<? extends T>)visitor).visitUnsignedNumberExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsignedConstantContext unsignedConstant() throws RecognitionException {
		UnsignedConstantContext _localctx = new UnsignedConstantContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_unsignedConstant);
		try {
			_localctx = new UnsignedNumberExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			number();
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

	public static class FunctionCallContext extends ParserRuleContext {
		public TypeSpec type = null;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JcPascalParser.LPAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JcPascalParser.RPAREN, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JcPascalVisitor ) return ((JcPascalVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			identifier();
			setState(389);
			match(LPAREN);
			setState(390);
			parameterList();
			setState(391);
			match(RPAREN);
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

	public static class MulDivOpContext extends ParserRuleContext {
		public TerminalNode MUL_OP() { return getToken(JcPascalParser.MUL_OP, 0); }
		public TerminalNode DIV_OP() { return getToken(JcPascalParser.DIV_OP, 0); }
		public TerminalNode AND() { return getToken(JcPascalParser.AND, 0); }
		public MulDivOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulDivOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).enterMulDivOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).exitMulDivOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JcPascalVisitor ) return ((JcPascalVisitor<? extends T>)visitor).visitMulDivOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulDivOpContext mulDivOp() throws RecognitionException {
		MulDivOpContext _localctx = new MulDivOpContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_mulDivOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << MUL_OP) | (1L << DIV_OP))) != 0)) ) {
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

	public static class AddSubOpContext extends ParserRuleContext {
		public TerminalNode ADD_OP() { return getToken(JcPascalParser.ADD_OP, 0); }
		public TerminalNode SUB_OP() { return getToken(JcPascalParser.SUB_OP, 0); }
		public TerminalNode OR() { return getToken(JcPascalParser.OR, 0); }
		public AddSubOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addSubOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).enterAddSubOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).exitAddSubOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JcPascalVisitor ) return ((JcPascalVisitor<? extends T>)visitor).visitAddSubOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddSubOpContext addSubOp() throws RecognitionException {
		AddSubOpContext _localctx = new AddSubOpContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_addSubOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << ADD_OP) | (1L << SUB_OP))) != 0)) ) {
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

	public static class CompareOpContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(JcPascalParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(JcPascalParser.NOT_EQUAL, 0); }
		public TerminalNode LT() { return getToken(JcPascalParser.LT, 0); }
		public TerminalNode LE() { return getToken(JcPascalParser.LE, 0); }
		public TerminalNode GE() { return getToken(JcPascalParser.GE, 0); }
		public TerminalNode GT() { return getToken(JcPascalParser.GT, 0); }
		public CompareOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).enterCompareOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).exitCompareOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JcPascalVisitor ) return ((JcPascalVisitor<? extends T>)visitor).visitCompareOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareOpContext compareOp() throws RecognitionException {
		CompareOpContext _localctx = new CompareOpContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_compareOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOT_EQUAL) | (1L << LT) | (1L << LE) | (1L << GE) | (1L << GT))) != 0)) ) {
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

	public static class SignContext extends ParserRuleContext {
		public TerminalNode ADD_OP() { return getToken(JcPascalParser.ADD_OP, 0); }
		public TerminalNode SUB_OP() { return getToken(JcPascalParser.SUB_OP, 0); }
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).enterSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).exitSign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JcPascalVisitor ) return ((JcPascalVisitor<? extends T>)visitor).visitSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			_la = _input.LA(1);
			if ( !(_la==ADD_OP || _la==SUB_OP) ) {
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

	public static class NumberContext extends ParserRuleContext {
		public TypeSpec type = null;
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
			this.type = ctx.type;
		}
	}
	public static class FloatConstContext extends NumberContext {
		public TerminalNode FLOAT_NUM() { return getToken(JcPascalParser.FLOAT_NUM, 0); }
		public FloatConstContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).enterFloatConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).exitFloatConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JcPascalVisitor ) return ((JcPascalVisitor<? extends T>)visitor).visitFloatConst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerConstContext extends NumberContext {
		public TerminalNode INTEGER_NUM() { return getToken(JcPascalParser.INTEGER_NUM, 0); }
		public IntegerConstContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).enterIntegerConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JcPascalListener ) ((JcPascalListener)listener).exitIntegerConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JcPascalVisitor ) return ((JcPascalVisitor<? extends T>)visitor).visitIntegerConst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_number);
		try {
			setState(403);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_NUM:
				_localctx = new IntegerConstContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(401);
				match(INTEGER_NUM);
				}
				break;
			case FLOAT_NUM:
				_localctx = new FloatConstContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(402);
				match(FLOAT_NUM);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u0198\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\7\5y\n\5\f\5\16\5|\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7\u0087"+
		"\n\7\f\7\16\7\u008a\13\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\7\t\u0093\n\t\f\t"+
		"\16\t\u0096\13\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\7\f\u009f\n\f\f\f\16\f"+
		"\u00a2\13\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00ae"+
		"\n\17\3\20\3\20\3\20\5\20\u00b3\n\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\5\21\u00bd\n\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u00c6\n"+
		"\22\f\22\16\22\u00c9\13\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u00d4\n\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00e8\n\26\3\27\3\27\3\27\7\27"+
		"\u00ed\n\27\f\27\16\27\u00f0\13\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\5\31\u00fb\n\31\3\32\3\32\3\32\7\32\u0100\n\32\f\32\16\32\u0103"+
		"\13\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u010d\n\34\3\35\3"+
		"\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u011a\n\36\f\36"+
		"\16\36\u011d\13\36\3\36\3\36\3\36\5\36\u0122\n\36\3\36\3\36\3\37\3\37"+
		"\3\37\7\37\u0129\n\37\f\37\16\37\u012c\13\37\3 \3 \3 \3 \3!\3!\3!\3!\7"+
		"!\u0136\n!\f!\16!\u0139\13!\3!\3!\3!\3!\5!\u013f\n!\3!\3!\3\"\3\"\3\""+
		"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3\'\3\'\3("+
		"\3(\3)\3)\3*\3*\3*\3*\3+\3+\3,\3,\3,\3,\7,\u0169\n,\f,\16,\u016c\13,\3"+
		"-\3-\3-\3-\7-\u0172\n-\f-\16-\u0175\13-\3.\5.\u0178\n.\3.\3.\3/\3/\3/"+
		"\3/\3/\3/\3/\5/\u0183\n/\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62"+
		"\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\5\66\u0196\n\66\3\66\2\2\67\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL"+
		"NPRTVXZ\\^`bdfhj\2\7\3\2\24\25\4\2\26\26$%\4\2\27\27&\'\3\2(-\3\2&\'\2"+
		"\u0187\2l\3\2\2\2\4p\3\2\2\2\6t\3\2\2\2\bz\3\2\2\2\n\177\3\2\2\2\f\u0083"+
		"\3\2\2\2\16\u008b\3\2\2\2\20\u008f\3\2\2\2\22\u0097\3\2\2\2\24\u0099\3"+
		"\2\2\2\26\u009b\3\2\2\2\30\u00a3\3\2\2\2\32\u00a5\3\2\2\2\34\u00ad\3\2"+
		"\2\2\36\u00af\3\2\2\2 \u00b9\3\2\2\2\"\u00c1\3\2\2\2$\u00d3\3\2\2\2&\u00d5"+
		"\3\2\2\2(\u00d9\3\2\2\2*\u00e7\3\2\2\2,\u00e9\3\2\2\2.\u00f1\3\2\2\2\60"+
		"\u00f5\3\2\2\2\62\u00fc\3\2\2\2\64\u0104\3\2\2\2\66\u0106\3\2\2\28\u010e"+
		"\3\2\2\2:\u0113\3\2\2\2<\u0125\3\2\2\2>\u012d\3\2\2\2@\u0131\3\2\2\2B"+
		"\u0142\3\2\2\2D\u0146\3\2\2\2F\u014b\3\2\2\2H\u0152\3\2\2\2J\u0156\3\2"+
		"\2\2L\u0158\3\2\2\2N\u015a\3\2\2\2P\u015c\3\2\2\2R\u015e\3\2\2\2T\u0162"+
		"\3\2\2\2V\u0164\3\2\2\2X\u016d\3\2\2\2Z\u0177\3\2\2\2\\\u0182\3\2\2\2"+
		"^\u0184\3\2\2\2`\u0186\3\2\2\2b\u018b\3\2\2\2d\u018d\3\2\2\2f\u018f\3"+
		"\2\2\2h\u0191\3\2\2\2j\u0195\3\2\2\2lm\5\4\3\2mn\5\6\4\2no\7\3\2\2o\3"+
		"\3\2\2\2pq\7\4\2\2qr\7!\2\2rs\7\34\2\2s\5\3\2\2\2tu\5\b\5\2u\7\3\2\2\2"+
		"vy\5\n\6\2wy\5\34\17\2xv\3\2\2\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2"+
		"\2{}\3\2\2\2|z\3\2\2\2}~\5(\25\2~\t\3\2\2\2\177\u0080\7\5\2\2\u0080\u0081"+
		"\5\f\7\2\u0081\u0082\7\34\2\2\u0082\13\3\2\2\2\u0083\u0088\5\16\b\2\u0084"+
		"\u0085\7\34\2\2\u0085\u0087\5\16\b\2\u0086\u0084\3\2\2\2\u0087\u008a\3"+
		"\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\r\3\2\2\2\u008a\u0088"+
		"\3\2\2\2\u008b\u008c\5\20\t\2\u008c\u008d\7\36\2\2\u008d\u008e\5\24\13"+
		"\2\u008e\17\3\2\2\2\u008f\u0094\5\22\n\2\u0090\u0091\7\35\2\2\u0091\u0093"+
		"\5\22\n\2\u0092\u0090\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2"+
		"\u0094\u0095\3\2\2\2\u0095\21\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0098"+
		"\7!\2\2\u0098\23\3\2\2\2\u0099\u009a\7!\2\2\u009a\25\3\2\2\2\u009b\u00a0"+
		"\5\30\r\2\u009c\u009d\7\35\2\2\u009d\u009f\5\30\r\2\u009e\u009c\3\2\2"+
		"\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\27"+
		"\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\7!\2\2\u00a4\31\3\2\2\2\u00a5"+
		"\u00a6\7!\2\2\u00a6\33\3\2\2\2\u00a7\u00a8\5\36\20\2\u00a8\u00a9\7\34"+
		"\2\2\u00a9\u00ae\3\2\2\2\u00aa\u00ab\5\36\20\2\u00ab\u00ac\7\34\2\2\u00ac"+
		"\u00ae\3\2\2\2\u00ad\u00a7\3\2\2\2\u00ad\u00aa\3\2\2\2\u00ae\35\3\2\2"+
		"\2\u00af\u00b0\7\30\2\2\u00b0\u00b2\7!\2\2\u00b1\u00b3\5\"\22\2\u00b2"+
		"\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\7\36"+
		"\2\2\u00b5\u00b6\5\24\13\2\u00b6\u00b7\7\34\2\2\u00b7\u00b8\5\b\5\2\u00b8"+
		"\37\3\2\2\2\u00b9\u00ba\7\31\2\2\u00ba\u00bc\5P)\2\u00bb\u00bd\5\"\22"+
		"\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf"+
		"\7\34\2\2\u00bf\u00c0\5\b\5\2\u00c0!\3\2\2\2\u00c1\u00c2\7\32\2\2\u00c2"+
		"\u00c7\5$\23\2\u00c3\u00c4\7\34\2\2\u00c4\u00c6\5$\23\2\u00c5\u00c3\3"+
		"\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\u00ca\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cb\7\33\2\2\u00cb#\3\2\2\2"+
		"\u00cc\u00d4\5&\24\2\u00cd\u00ce\7\5\2\2\u00ce\u00d4\5&\24\2\u00cf\u00d0"+
		"\7\30\2\2\u00d0\u00d4\5&\24\2\u00d1\u00d2\7\31\2\2\u00d2\u00d4\5&\24\2"+
		"\u00d3\u00cc\3\2\2\2\u00d3\u00cd\3\2\2\2\u00d3\u00cf\3\2\2\2\u00d3\u00d1"+
		"\3\2\2\2\u00d4%\3\2\2\2\u00d5\u00d6\5\20\t\2\u00d6\u00d7\7\36\2\2\u00d7"+
		"\u00d8\5\24\13\2\u00d8\'\3\2\2\2\u00d9\u00da\7\6\2\2\u00da\u00db\5,\27"+
		"\2\u00db\u00dc\7\7\2\2\u00dc)\3\2\2\2\u00dd\u00e8\5(\25\2\u00de\u00e8"+
		"\5.\30\2\u00df\u00e8\5\66\34\2\u00e0\u00e8\58\35\2\u00e1\u00e8\5@!\2\u00e2"+
		"\u00e8\5:\36\2\u00e3\u00e8\5D#\2\u00e4\u00e8\5F$\2\u00e5\u00e8\5\60\31"+
		"\2\u00e6\u00e8\3\2\2\2\u00e7\u00dd\3\2\2\2\u00e7\u00de\3\2\2\2\u00e7\u00df"+
		"\3\2\2\2\u00e7\u00e0\3\2\2\2\u00e7\u00e1\3\2\2\2\u00e7\u00e2\3\2\2\2\u00e7"+
		"\u00e3\3\2\2\2\u00e7\u00e4\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e6\3\2"+
		"\2\2\u00e8+\3\2\2\2\u00e9\u00ee\5*\26\2\u00ea\u00eb\7\34\2\2\u00eb\u00ed"+
		"\5*\26\2\u00ec\u00ea\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee"+
		"\u00ef\3\2\2\2\u00ef-\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f2\5N(\2\u00f2"+
		"\u00f3\7 \2\2\u00f3\u00f4\5T+\2\u00f4/\3\2\2\2\u00f5\u00fa\5P)\2\u00f6"+
		"\u00f7\7\32\2\2\u00f7\u00f8\5\62\32\2\u00f8\u00f9\7\33\2\2\u00f9\u00fb"+
		"\3\2\2\2\u00fa\u00f6\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\61\3\2\2\2\u00fc"+
		"\u0101\5\64\33\2\u00fd\u00fe\7\35\2\2\u00fe\u0100\5\64\33\2\u00ff\u00fd"+
		"\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102"+
		"\63\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0105\5T+\2\u0105\65\3\2\2\2\u0106"+
		"\u0107\7\b\2\2\u0107\u0108\5R*\2\u0108\u0109\7\t\2\2\u0109\u010c\5*\26"+
		"\2\u010a\u010b\7\n\2\2\u010b\u010d\5*\26\2\u010c\u010a\3\2\2\2\u010c\u010d"+
		"\3\2\2\2\u010d\67\3\2\2\2\u010e\u010f\7\13\2\2\u010f\u0110\5R*\2\u0110"+
		"\u0111\7\f\2\2\u0111\u0112\5*\26\2\u01129\3\2\2\2\u0113\u0114\7\r\2\2"+
		"\u0114\u0115\5T+\2\u0115\u0116\7\16\2\2\u0116\u011b\5> \2\u0117\u0118"+
		"\7\34\2\2\u0118\u011a\5> \2\u0119\u0117\3\2\2\2\u011a\u011d\3\2\2\2\u011b"+
		"\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u0121\3\2\2\2\u011d\u011b\3\2"+
		"\2\2\u011e\u011f\7\34\2\2\u011f\u0120\7\n\2\2\u0120\u0122\5*\26\2\u0121"+
		"\u011e\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\7\7"+
		"\2\2\u0124;\3\2\2\2\u0125\u012a\5j\66\2\u0126\u0127\7\35\2\2\u0127\u0129"+
		"\5j\66\2\u0128\u0126\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a"+
		"\u012b\3\2\2\2\u012b=\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012e\5<\37\2"+
		"\u012e\u012f\7\36\2\2\u012f\u0130\5*\26\2\u0130?\3\2\2\2\u0131\u0132\7"+
		"\17\2\2\u0132\u0137\5B\"\2\u0133\u0134\7\34\2\2\u0134\u0136\5B\"\2\u0135"+
		"\u0133\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2"+
		"\2\2\u0138\u013e\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013b\7\34\2\2\u013b"+
		"\u013c\7\20\2\2\u013c\u013d\7\37\2\2\u013d\u013f\5*\26\2\u013e\u013a\3"+
		"\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\7\7\2\2\u0141"+
		"A\3\2\2\2\u0142\u0143\5T+\2\u0143\u0144\7\37\2\2\u0144\u0145\5*\26\2\u0145"+
		"C\3\2\2\2\u0146\u0147\7\21\2\2\u0147\u0148\5*\26\2\u0148\u0149\7\22\2"+
		"\2\u0149\u014a\5R*\2\u014aE\3\2\2\2\u014b\u014c\7\23\2\2\u014c\u014d\7"+
		"!\2\2\u014d\u014e\7 \2\2\u014e\u014f\5H%\2\u014f\u0150\7\f\2\2\u0150\u0151"+
		"\5*\26\2\u0151G\3\2\2\2\u0152\u0153\5J&\2\u0153\u0154\t\2\2\2\u0154\u0155"+
		"\5L\'\2\u0155I\3\2\2\2\u0156\u0157\5T+\2\u0157K\3\2\2\2\u0158\u0159\5"+
		"T+\2\u0159M\3\2\2\2\u015a\u015b\7!\2\2\u015bO\3\2\2\2\u015c\u015d\7!\2"+
		"\2\u015dQ\3\2\2\2\u015e\u015f\5V,\2\u015f\u0160\5f\64\2\u0160\u0161\5"+
		"V,\2\u0161S\3\2\2\2\u0162\u0163\5V,\2\u0163U\3\2\2\2\u0164\u016a\5X-\2"+
		"\u0165\u0166\5d\63\2\u0166\u0167\5X-\2\u0167\u0169\3\2\2\2\u0168\u0165"+
		"\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b"+
		"W\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u0173\5Z.\2\u016e\u016f\5b\62\2\u016f"+
		"\u0170\5Z.\2\u0170\u0172\3\2\2\2\u0171\u016e\3\2\2\2\u0172\u0175\3\2\2"+
		"\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174Y\3\2\2\2\u0175\u0173"+
		"\3\2\2\2\u0176\u0178\5h\65\2\u0177\u0176\3\2\2\2\u0177\u0178\3\2\2\2\u0178"+
		"\u0179\3\2\2\2\u0179\u017a\5\\/\2\u017a[\3\2\2\2\u017b\u0183\5N(\2\u017c"+
		"\u017d\7\32\2\2\u017d\u017e\5T+\2\u017e\u017f\7\33\2\2\u017f\u0183\3\2"+
		"\2\2\u0180\u0183\5^\60\2\u0181\u0183\5`\61\2\u0182\u017b\3\2\2\2\u0182"+
		"\u017c\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0181\3\2\2\2\u0183]\3\2\2\2"+
		"\u0184\u0185\5j\66\2\u0185_\3\2\2\2\u0186\u0187\5P)\2\u0187\u0188\7\32"+
		"\2\2\u0188\u0189\5\62\32\2\u0189\u018a\7\33\2\2\u018aa\3\2\2\2\u018b\u018c"+
		"\t\3\2\2\u018cc\3\2\2\2\u018d\u018e\t\4\2\2\u018ee\3\2\2\2\u018f\u0190"+
		"\t\5\2\2\u0190g\3\2\2\2\u0191\u0192\t\6\2\2\u0192i\3\2\2\2\u0193\u0196"+
		"\7\"\2\2\u0194\u0196\7#\2\2\u0195\u0193\3\2\2\2\u0195\u0194\3\2\2\2\u0196"+
		"k\3\2\2\2\33xz\u0088\u0094\u00a0\u00ad\u00b2\u00bc\u00c7\u00d3\u00e7\u00ee"+
		"\u00fa\u0101\u010c\u011b\u0121\u012a\u0137\u013e\u016a\u0173\u0177\u0182"+
		"\u0195";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}