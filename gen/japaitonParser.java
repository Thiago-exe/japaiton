// Generated from D:/Vou trabalhar na Nuuvem/Java/japaiton/src\japaiton.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class japaitonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, INT=4, FLOAT=5, STR=6, BOOL=7, VOID=8, IF=9, ELSE=10, 
		WHILE=11, CONST=12, VAR=13, END=14, RETURN=15, PRINT=16, SCANF=17, INTEGER=18, 
		FLOAT_NUMBER=19, STRING=20, BOOLEAN=21, ID=22, EQUAL=23, LPAREN=24, RPAREN=25, 
		COMMA=26, SEMICOLON=27, COLON=28, PLUS=29, MINUS=30, ASTERISK=31, SLASH=32, 
		EQUALS=33, NOTEQUALS=34, GREATEREQUAL=35, LESSEQUAL=36, GREATER=37, LESS=38, 
		NOT=39, WHITESPACE=40, COMMENT=41;
	public static final int
		RULE_programa = 0, RULE_main = 1, RULE_funcao = 2, RULE_parametros = 3, 
		RULE_parametro = 4, RULE_escopo = 5, RULE_blocoDeCodigo = 6, RULE_returnDeclaracao = 7, 
		RULE_variaveis = 8, RULE_declaracaoVariavel = 9, RULE_listaVariaveis = 10, 
		RULE_atribuicaoVariavel = 11, RULE_atribuicaoMultiplaVariaveis = 12, RULE_atribuicaoValorVariavel = 13, 
		RULE_declaracaoConstante = 14, RULE_listaConstantes = 15, RULE_atribuicaoConstante = 16, 
		RULE_valorConstante = 17, RULE_ifDeclaracao = 18, RULE_ifElseDeclaracao = 19, 
		RULE_whileDeclaracao = 20, RULE_printDeclaracao = 21, RULE_printParametros = 22, 
		RULE_scanfDeclaracao = 23, RULE_listaIDs = 24, RULE_idOrString = 25, RULE_expressoesDeclaracao = 26, 
		RULE_listaExpressoes = 27, RULE_condicao = 28, RULE_expressoes = 29, RULE_expressaoString = 30, 
		RULE_expressaoLogica = 31, RULE_operadoresLogicos = 32, RULE_expressaoIgualdade = 33, 
		RULE_operadorIgualdade = 34, RULE_expressaoRelacional = 35, RULE_operadorGrandeza = 36, 
		RULE_expressaoGrandeza = 37, RULE_operadorAditivo = 38, RULE_expressaoMultiplicativa = 39, 
		RULE_operadorMultiplicativo = 40, RULE_expressaoNegativa = 41, RULE_operadorNegacao = 42, 
		RULE_expressaoPrimaria = 43, RULE_chamadaFuncao = 44, RULE_listaArgumentos = 45, 
		RULE_type = 46;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "main", "funcao", "parametros", "parametro", "escopo", "blocoDeCodigo", 
			"returnDeclaracao", "variaveis", "declaracaoVariavel", "listaVariaveis", 
			"atribuicaoVariavel", "atribuicaoMultiplaVariaveis", "atribuicaoValorVariavel", 
			"declaracaoConstante", "listaConstantes", "atribuicaoConstante", "valorConstante", 
			"ifDeclaracao", "ifElseDeclaracao", "whileDeclaracao", "printDeclaracao", 
			"printParametros", "scanfDeclaracao", "listaIDs", "idOrString", "expressoesDeclaracao", 
			"listaExpressoes", "condicao", "expressoes", "expressaoString", "expressaoLogica", 
			"operadoresLogicos", "expressaoIgualdade", "operadorIgualdade", "expressaoRelacional", 
			"operadorGrandeza", "expressaoGrandeza", "operadorAditivo", "expressaoMultiplicativa", 
			"operadorMultiplicativo", "expressaoNegativa", "operadorNegacao", "expressaoPrimaria", 
			"chamadaFuncao", "listaArgumentos", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", "'AND'", "'OR'", "'int'", "'float'", "'str'", "'bool'", 
			"'void'", "'if'", "'else'", "'while'", "'const'", "'var'", "'end'", "'return'", 
			"'print'", "'scanf'", null, null, null, null, null, "'='", "'('", "')'", 
			"','", "';'", "':'", "'+'", "'-'", "'*'", "'/'", "'=='", "'!='", "'>='", 
			"'<='", "'>'", "'<'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "INT", "FLOAT", "STR", "BOOL", "VOID", "IF", 
			"ELSE", "WHILE", "CONST", "VAR", "END", "RETURN", "PRINT", "SCANF", "INTEGER", 
			"FLOAT_NUMBER", "STRING", "BOOLEAN", "ID", "EQUAL", "LPAREN", "RPAREN", 
			"COMMA", "SEMICOLON", "COLON", "PLUS", "MINUS", "ASTERISK", "SLASH", 
			"EQUALS", "NOTEQUALS", "GREATEREQUAL", "LESSEQUAL", "GREATER", "LESS", 
			"NOT", "WHITESPACE", "COMMENT"
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
	public String getGrammarFileName() { return "japaiton.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public japaitonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<FuncaoContext> funcao() {
			return getRuleContexts(FuncaoContext.class);
		}
		public FuncaoContext funcao(int i) {
			return getRuleContext(FuncaoContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof japaitonVisitor ) return ((japaitonVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(94);
				funcao();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			main();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(japaitonParser.COLON, 0); }
		public EscopoContext escopo() {
			return getRuleContext(EscopoContext.class,0);
		}
		public TerminalNode END() { return getToken(japaitonParser.END, 0); }
		public VariaveisContext variaveis() {
			return getRuleContext(VariaveisContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof japaitonVisitor ) return ((japaitonVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__0);
			setState(103);
			match(COLON);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(104);
				variaveis();
				}
			}

			setState(107);
			escopo();
			setState(108);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(japaitonParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(japaitonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(japaitonParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(japaitonParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public EscopoContext escopo() {
			return getRuleContext(EscopoContext.class,0);
		}
		public TerminalNode END() { return getToken(japaitonParser.END, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public VariaveisContext variaveis() {
			return getRuleContext(VariaveisContext.class,0);
		}
		public FuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).enterFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).exitFuncao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof japaitonVisitor ) return ((japaitonVisitor<? extends T>)visitor).visitFuncao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(ID);
			setState(111);
			match(LPAREN);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 496L) != 0)) {
				{
				setState(112);
				parametros();
				}
			}

			setState(115);
			match(RPAREN);
			setState(116);
			match(COLON);
			setState(117);
			type();
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(118);
				variaveis();
				}
			}

			setState(121);
			escopo();
			setState(122);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametrosContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(japaitonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(japaitonParser.COMMA, i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof japaitonVisitor ) return ((japaitonVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			parametro();
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(125);
				match(COMMA);
				setState(126);
				parametro();
				}
				}
				setState(131);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametroContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(japaitonParser.ID, 0); }
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).exitParametro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof japaitonVisitor ) return ((japaitonVisitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			type();
			setState(133);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EscopoContext extends ParserRuleContext {
		public List<BlocoDeCodigoContext> blocoDeCodigo() {
			return getRuleContexts(BlocoDeCodigoContext.class);
		}
		public BlocoDeCodigoContext blocoDeCodigo(int i) {
			return getRuleContext(BlocoDeCodigoContext.class,i);
		}
		public EscopoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escopo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).enterEscopo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).exitEscopo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof japaitonVisitor ) return ((japaitonVisitor<? extends T>)visitor).visitEscopo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscopoContext escopo() throws RecognitionException {
		EscopoContext _localctx = new EscopoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_escopo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4426240L) != 0)) {
				{
				{
				setState(135);
				blocoDeCodigo();
				}
				}
				setState(140);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlocoDeCodigoContext extends ParserRuleContext {
		public IfDeclaracaoContext ifDeclaracao() {
			return getRuleContext(IfDeclaracaoContext.class,0);
		}
		public IfElseDeclaracaoContext ifElseDeclaracao() {
			return getRuleContext(IfElseDeclaracaoContext.class,0);
		}
		public WhileDeclaracaoContext whileDeclaracao() {
			return getRuleContext(WhileDeclaracaoContext.class,0);
		}
		public AtribuicaoValorVariavelContext atribuicaoValorVariavel() {
			return getRuleContext(AtribuicaoValorVariavelContext.class,0);
		}
		public PrintDeclaracaoContext printDeclaracao() {
			return getRuleContext(PrintDeclaracaoContext.class,0);
		}
		public ScanfDeclaracaoContext scanfDeclaracao() {
			return getRuleContext(ScanfDeclaracaoContext.class,0);
		}
		public ReturnDeclaracaoContext returnDeclaracao() {
			return getRuleContext(ReturnDeclaracaoContext.class,0);
		}
		public BlocoDeCodigoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blocoDeCodigo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).enterBlocoDeCodigo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).exitBlocoDeCodigo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof japaitonVisitor ) return ((japaitonVisitor<? extends T>)visitor).visitBlocoDeCodigo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocoDeCodigoContext blocoDeCodigo() throws RecognitionException {
		BlocoDeCodigoContext _localctx = new BlocoDeCodigoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_blocoDeCodigo);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				ifDeclaracao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				ifElseDeclaracao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
				whileDeclaracao();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(144);
				atribuicaoValorVariavel();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(145);
				printDeclaracao();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(146);
				scanfDeclaracao();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(147);
				returnDeclaracao();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnDeclaracaoContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(japaitonParser.RETURN, 0); }
		public ExpressoesDeclaracaoContext expressoesDeclaracao() {
			return getRuleContext(ExpressoesDeclaracaoContext.class,0);
		}
		public ReturnDeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnDeclaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).enterReturnDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).exitReturnDeclaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof japaitonVisitor ) return ((japaitonVisitor<? extends T>)visitor).visitReturnDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnDeclaracaoContext returnDeclaracao() throws RecognitionException {
		ReturnDeclaracaoContext _localctx = new ReturnDeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_returnDeclaracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(RETURN);
			setState(151);
			expressoesDeclaracao();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariaveisContext extends ParserRuleContext {
		public DeclaracaoVariavelContext declaracaoVariavel() {
			return getRuleContext(DeclaracaoVariavelContext.class,0);
		}
		public BlocoDeCodigoContext blocoDeCodigo() {
			return getRuleContext(BlocoDeCodigoContext.class,0);
		}
		public VariaveisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variaveis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).enterVariaveis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).exitVariaveis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof japaitonVisitor ) return ((japaitonVisitor<? extends T>)visitor).visitVariaveis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariaveisContext variaveis() throws RecognitionException {
		VariaveisContext _localctx = new VariaveisContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variaveis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			declaracaoVariavel();
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(154);
				blocoDeCodigo();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoVariavelContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(japaitonParser.VAR, 0); }
		public TerminalNode COLON() { return getToken(japaitonParser.COLON, 0); }
		public List<ListaVariaveisContext> listaVariaveis() {
			return getRuleContexts(ListaVariaveisContext.class);
		}
		public ListaVariaveisContext listaVariaveis(int i) {
			return getRuleContext(ListaVariaveisContext.class,i);
		}
		public DeclaracaoVariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoVariavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).enterDeclaracaoVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).exitDeclaracaoVariavel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof japaitonVisitor ) return ((japaitonVisitor<? extends T>)visitor).visitDeclaracaoVariavel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoVariavelContext declaracaoVariavel() throws RecognitionException {
		DeclaracaoVariavelContext _localctx = new DeclaracaoVariavelContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declaracaoVariavel);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(VAR);
			setState(158);
			match(COLON);
			setState(162);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(159);
					listaVariaveis();
					}
					} 
				}
				setState(164);
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
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaVariaveisContext extends ParserRuleContext {
		public AtribuicaoVariavelContext atribuicaoVariavel() {
			return getRuleContext(AtribuicaoVariavelContext.class,0);
		}
		public AtribuicaoMultiplaVariaveisContext atribuicaoMultiplaVariaveis() {
			return getRuleContext(AtribuicaoMultiplaVariaveisContext.class,0);
		}
		public AtribuicaoValorVariavelContext atribuicaoValorVariavel() {
			return getRuleContext(AtribuicaoValorVariavelContext.class,0);
		}
		public DeclaracaoConstanteContext declaracaoConstante() {
			return getRuleContext(DeclaracaoConstanteContext.class,0);
		}
		public ListaVariaveisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaVariaveis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).enterListaVariaveis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).exitListaVariaveis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof japaitonVisitor ) return ((japaitonVisitor<? extends T>)visitor).visitListaVariaveis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaVariaveisContext listaVariaveis() throws RecognitionException {
		ListaVariaveisContext _localctx = new ListaVariaveisContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_listaVariaveis);
		try {
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				atribuicaoVariavel();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				atribuicaoMultiplaVariaveis();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				atribuicaoValorVariavel();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(168);
				declaracaoConstante();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtribuicaoVariavelContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(japaitonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(japaitonParser.ID, i);
		}
		public List<TerminalNode> COLON() { return getTokens(japaitonParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(japaitonParser.COLON, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(japaitonParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(japaitonParser.SEMICOLON, i);
		}
		public AtribuicaoVariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicaoVariavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).enterAtribuicaoVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).exitAtribuicaoVariavel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof japaitonVisitor ) return ((japaitonVisitor<? extends T>)visitor).visitAtribuicaoVariavel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicaoVariavelContext atribuicaoVariavel() throws RecognitionException {
		AtribuicaoVariavelContext _localctx = new AtribuicaoVariavelContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_atribuicaoVariavel);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(176); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(171);
					match(ID);
					setState(172);
					match(COLON);
					setState(173);
					type();
					setState(174);
					match(SEMICOLON);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(178); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtribuicaoMultiplaVariaveisContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(japaitonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(japaitonParser.ID, i);
		}
		public TerminalNode COLON() { return getToken(japaitonParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(japaitonParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(japaitonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(japaitonParser.COMMA, i);
		}
		public AtribuicaoMultiplaVariaveisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicaoMultiplaVariaveis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).enterAtribuicaoMultiplaVariaveis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).exitAtribuicaoMultiplaVariaveis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof japaitonVisitor ) return ((japaitonVisitor<? extends T>)visitor).visitAtribuicaoMultiplaVariaveis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicaoMultiplaVariaveisContext atribuicaoMultiplaVariaveis() throws RecognitionException {
		AtribuicaoMultiplaVariaveisContext _localctx = new AtribuicaoMultiplaVariaveisContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_atribuicaoMultiplaVariaveis);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(ID);
			setState(183); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(181);
				match(COMMA);
				setState(182);
				match(ID);
				}
				}
				setState(185); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMA );
			setState(187);
			match(COLON);
			setState(188);
			type();
			setState(189);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtribuicaoValorVariavelContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(japaitonParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(japaitonParser.EQUAL, 0); }
		public ExpressoesDeclaracaoContext expressoesDeclaracao() {
			return getRuleContext(ExpressoesDeclaracaoContext.class,0);
		}
		public AtribuicaoValorVariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicaoValorVariavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).enterAtribuicaoValorVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).exitAtribuicaoValorVariavel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof japaitonVisitor ) return ((japaitonVisitor<? extends T>)visitor).visitAtribuicaoValorVariavel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicaoValorVariavelContext atribuicaoValorVariavel() throws RecognitionException {
		AtribuicaoValorVariavelContext _localctx = new AtribuicaoValorVariavelContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_atribuicaoValorVariavel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(ID);
			setState(192);
			match(EQUAL);
			setState(193);
			expressoesDeclaracao();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoConstanteContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(japaitonParser.CONST, 0); }
		public ListaConstantesContext listaConstantes() {
			return getRuleContext(ListaConstantesContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(japaitonParser.SEMICOLON, 0); }
		public DeclaracaoConstanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoConstante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).enterDeclaracaoConstante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).exitDeclaracaoConstante(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof japaitonVisitor ) return ((japaitonVisitor<? extends T>)visitor).visitDeclaracaoConstante(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoConstanteContext declaracaoConstante() throws RecognitionException {
		DeclaracaoConstanteContext _localctx = new DeclaracaoConstanteContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_declaracaoConstante);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(CONST);
			setState(196);
			listaConstantes();
			setState(197);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListaConstantesContext extends ParserRuleContext {
		public List<AtribuicaoConstanteContext> atribuicaoConstante() {
			return getRuleContexts(AtribuicaoConstanteContext.class);
		}
		public AtribuicaoConstanteContext atribuicaoConstante(int i) {
			return getRuleContext(AtribuicaoConstanteContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(japaitonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(japaitonParser.COMMA, i);
		}
		public ListaConstantesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaConstantes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).enterListaConstantes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).exitListaConstantes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof japaitonVisitor ) return ((japaitonVisitor<? extends T>)visitor).visitListaConstantes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaConstantesContext listaConstantes() throws RecognitionException {
		ListaConstantesContext _localctx = new ListaConstantesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_listaConstantes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(199);
				atribuicaoConstante();
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(200);
					match(COMMA);
					setState(201);
					atribuicaoConstante();
					}
					}
					setState(206);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtribuicaoConstanteContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(japaitonParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(japaitonParser.EQUAL, 0); }
		public ValorConstanteContext valorConstante() {
			return getRuleContext(ValorConstanteContext.class,0);
		}
		public AtribuicaoConstanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicaoConstante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).enterAtribuicaoConstante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).exitAtribuicaoConstante(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof japaitonVisitor ) return ((japaitonVisitor<? extends T>)visitor).visitAtribuicaoConstante(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicaoConstanteContext atribuicaoConstante() throws RecognitionException {
		AtribuicaoConstanteContext _localctx = new AtribuicaoConstanteContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_atribuicaoConstante);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(ID);
			setState(210);
			match(EQUAL);
			setState(211);
			valorConstante();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValorConstanteContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(japaitonParser.INTEGER, 0); }
		public TerminalNode FLOAT_NUMBER() { return getToken(japaitonParser.FLOAT_NUMBER, 0); }
		public TerminalNode STRING() { return getToken(japaitonParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(japaitonParser.BOOLEAN, 0); }
		public ValorConstanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valorConstante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).enterValorConstante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).exitValorConstante(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof japaitonVisitor ) return ((japaitonVisitor<? extends T>)visitor).visitValorConstante(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorConstanteContext valorConstante() throws RecognitionException {
		ValorConstanteContext _localctx = new ValorConstanteContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_valorConstante);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3932160L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfDeclaracaoContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(japaitonParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(japaitonParser.LPAREN, 0); }
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(japaitonParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(japaitonParser.COLON, 0); }
		public EscopoContext escopo() {
			return getRuleContext(EscopoContext.class,0);
		}
		public TerminalNode END() { return getToken(japaitonParser.END, 0); }
		public IfDeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifDeclaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).enterIfDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).exitIfDeclaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof japaitonVisitor ) return ((japaitonVisitor<? extends T>)visitor).visitIfDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfDeclaracaoContext ifDeclaracao() throws RecognitionException {
		IfDeclaracaoContext _localctx = new IfDeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ifDeclaracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(IF);
			setState(216);
			match(LPAREN);
			setState(217);
			condicao();
			setState(218);
			match(RPAREN);
			setState(219);
			match(COLON);
			setState(220);
			escopo();
			setState(221);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfElseDeclaracaoContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(japaitonParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(japaitonParser.LPAREN, 0); }
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(japaitonParser.RPAREN, 0); }
		public List<TerminalNode> COLON() { return getTokens(japaitonParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(japaitonParser.COLON, i);
		}
		public List<EscopoContext> escopo() {
			return getRuleContexts(EscopoContext.class);
		}
		public EscopoContext escopo(int i) {
			return getRuleContext(EscopoContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(japaitonParser.ELSE, 0); }
		public TerminalNode END() { return getToken(japaitonParser.END, 0); }
		public IfElseDeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifElseDeclaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).enterIfElseDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).exitIfElseDeclaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof japaitonVisitor ) return ((japaitonVisitor<? extends T>)visitor).visitIfElseDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfElseDeclaracaoContext ifElseDeclaracao() throws RecognitionException {
		IfElseDeclaracaoContext _localctx = new IfElseDeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ifElseDeclaracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(IF);
			setState(224);
			match(LPAREN);
			setState(225);
			condicao();
			setState(226);
			match(RPAREN);
			setState(227);
			match(COLON);
			setState(228);
			escopo();
			setState(229);
			match(ELSE);
			setState(230);
			match(COLON);
			setState(231);
			escopo();
			setState(232);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileDeclaracaoContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(japaitonParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(japaitonParser.LPAREN, 0); }
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(japaitonParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(japaitonParser.COLON, 0); }
		public EscopoContext escopo() {
			return getRuleContext(EscopoContext.class,0);
		}
		public TerminalNode END() { return getToken(japaitonParser.END, 0); }
		public WhileDeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileDeclaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).enterWhileDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).exitWhileDeclaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof japaitonVisitor ) return ((japaitonVisitor<? extends T>)visitor).visitWhileDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileDeclaracaoContext whileDeclaracao() throws RecognitionException {
		WhileDeclaracaoContext _localctx = new WhileDeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_whileDeclaracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(WHILE);
			setState(235);
			match(LPAREN);
			setState(236);
			condicao();
			setState(237);
			match(RPAREN);
			setState(238);
			match(COLON);
			setState(239);
			escopo();
			setState(240);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrintDeclaracaoContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(japaitonParser.PRINT, 0); }
		public TerminalNode LPAREN() { return getToken(japaitonParser.LPAREN, 0); }
		public List<PrintParametrosContext> printParametros() {
			return getRuleContexts(PrintParametrosContext.class);
		}
		public PrintParametrosContext printParametros(int i) {
			return getRuleContext(PrintParametrosContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(japaitonParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(japaitonParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(japaitonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(japaitonParser.COMMA, i);
		}
		public PrintDeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printDeclaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).enterPrintDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).exitPrintDeclaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof japaitonVisitor ) return ((japaitonVisitor<? extends T>)visitor).visitPrintDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintDeclaracaoContext printDeclaracao() throws RecognitionException {
		PrintDeclaracaoContext _localctx = new PrintDeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_printDeclaracao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(PRINT);
			setState(243);
			match(LPAREN);
			setState(244);
			printParametros();
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(245);
				match(COMMA);
				setState(246);
				printParametros();
				}
				}
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(252);
			match(RPAREN);
			setState(253);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrintParametrosContext extends ParserRuleContext {
		public IdOrStringContext idOrString() {
			return getRuleContext(IdOrStringContext.class,0);
		}
		public ListaExpressoesContext listaExpressoes() {
			return getRuleContext(ListaExpressoesContext.class,0);
		}
		public ChamadaFuncaoContext chamadaFuncao() {
			return getRuleContext(ChamadaFuncaoContext.class,0);
		}
		public PrintParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printParametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).enterPrintParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).exitPrintParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof japaitonVisitor ) return ((japaitonVisitor<? extends T>)visitor).visitPrintParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintParametrosContext printParametros() throws RecognitionException {
		PrintParametrosContext _localctx = new PrintParametrosContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_printParametros);
		try {
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				idOrString();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				listaExpressoes();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(257);
				chamadaFuncao();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ScanfDeclaracaoContext extends ParserRuleContext {
		public TerminalNode SCANF() { return getToken(japaitonParser.SCANF, 0); }
		public TerminalNode LPAREN() { return getToken(japaitonParser.LPAREN, 0); }
		public ListaIDsContext listaIDs() {
			return getRuleContext(ListaIDsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(japaitonParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(japaitonParser.SEMICOLON, 0); }
		public ScanfDeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scanfDeclaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).enterScanfDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).exitScanfDeclaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof japaitonVisitor ) return ((japaitonVisitor<? extends T>)visitor).visitScanfDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScanfDeclaracaoContext scanfDeclaracao() throws RecognitionException {
		ScanfDeclaracaoContext _localctx = new ScanfDeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_scanfDeclaracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(SCANF);
			setState(261);
			match(LPAREN);
			setState(262);
			listaIDs();
			setState(263);
			match(RPAREN);
			setState(264);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListaIDsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(japaitonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(japaitonParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(japaitonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(japaitonParser.COMMA, i);
		}
		public ListaIDsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaIDs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).enterListaIDs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).exitListaIDs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof japaitonVisitor ) return ((japaitonVisitor<? extends T>)visitor).visitListaIDs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaIDsContext listaIDs() throws RecognitionException {
		ListaIDsContext _localctx = new ListaIDsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_listaIDs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(ID);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(267);
				match(COMMA);
				setState(268);
				match(ID);
				}
				}
				setState(273);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdOrStringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(japaitonParser.STRING, 0); }
		public TerminalNode ID() { return getToken(japaitonParser.ID, 0); }
		public IdOrStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idOrString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).enterIdOrString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).exitIdOrString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof japaitonVisitor ) return ((japaitonVisitor<? extends T>)visitor).visitIdOrString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdOrStringContext idOrString() throws RecognitionException {
		IdOrStringContext _localctx = new IdOrStringContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_idOrString);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==ID) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressoesDeclaracaoContext extends ParserRuleContext {
		public ExpressoesContext expressoes() {
			return getRuleContext(ExpressoesContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(japaitonParser.SEMICOLON, 0); }
		public ExpressoesDeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressoesDeclaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).enterExpressoesDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).exitExpressoesDeclaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof japaitonVisitor ) return ((japaitonVisitor<? extends T>)visitor).visitExpressoesDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressoesDeclaracaoContext expressoesDeclaracao() throws RecognitionException {
		ExpressoesDeclaracaoContext _localctx = new ExpressoesDeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expressoesDeclaracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			expressoes();
			setState(277);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListaExpressoesContext extends ParserRuleContext {
		public List<ExpressoesContext> expressoes() {
			return getRuleContexts(ExpressoesContext.class);
		}
		public ExpressoesContext expressoes(int i) {
			return getRuleContext(ExpressoesContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(japaitonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(japaitonParser.COMMA, i);
		}
		public ListaExpressoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaExpressoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).enterListaExpressoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).exitListaExpressoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof japaitonVisitor ) return ((japaitonVisitor<? extends T>)visitor).visitListaExpressoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaExpressoesContext listaExpressoes() throws RecognitionException {
		ListaExpressoesContext _localctx = new ListaExpressoesContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_listaExpressoes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			expressoes();
			setState(284);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(280);
					match(COMMA);
					setState(281);
					expressoes();
					}
					} 
				}
				setState(286);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CondicaoContext extends ParserRuleContext {
		public ExpressoesContext expressoes() {
			return getRuleContext(ExpressoesContext.class,0);
		}
		public CondicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).enterCondicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).exitCondicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof japaitonVisitor ) return ((japaitonVisitor<? extends T>)visitor).visitCondicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicaoContext condicao() throws RecognitionException {
		CondicaoContext _localctx = new CondicaoContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_condicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			expressoes();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressoesContext extends ParserRuleContext {
		public ExpressaoLogicaContext expressaoLogica() {
			return getRuleContext(ExpressaoLogicaContext.class,0);
		}
		public ExpressaoGrandezaContext expressaoGrandeza() {
			return getRuleContext(ExpressaoGrandezaContext.class,0);
		}
		public ExpressaoIgualdadeContext expressaoIgualdade() {
			return getRuleContext(ExpressaoIgualdadeContext.class,0);
		}
		public ExpressaoMultiplicativaContext expressaoMultiplicativa() {
			return getRuleContext(ExpressaoMultiplicativaContext.class,0);
		}
		public ExpressaoNegativaContext expressaoNegativa() {
			return getRuleContext(ExpressaoNegativaContext.class,0);
		}
		public ExpressaoPrimariaContext expressaoPrimaria() {
			return getRuleContext(ExpressaoPrimariaContext.class,0);
		}
		public ExpressaoRelacionalContext expressaoRelacional() {
			return getRuleContext(ExpressaoRelacionalContext.class,0);
		}
		public ExpressaoStringContext expressaoString() {
			return getRuleContext(ExpressaoStringContext.class,0);
		}
		public ExpressoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).enterExpressoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).exitExpressoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof japaitonVisitor ) return ((japaitonVisitor<? extends T>)visitor).visitExpressoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressoesContext expressoes() throws RecognitionException {
		ExpressoesContext _localctx = new ExpressoesContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_expressoes);
		try {
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				expressaoLogica();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				expressaoGrandeza();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(291);
				expressaoIgualdade();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(292);
				expressaoMultiplicativa();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(293);
				expressaoNegativa();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(294);
				expressaoPrimaria();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(295);
				expressaoRelacional();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(296);
				expressaoString();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoStringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(japaitonParser.STRING, 0); }
		public ExpressaoStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).enterExpressaoString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).exitExpressaoString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof japaitonVisitor ) return ((japaitonVisitor<? extends T>)visitor).visitExpressaoString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoStringContext expressaoString() throws RecognitionException {
		ExpressaoStringContext _localctx = new ExpressaoStringContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_expressaoString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(STRING);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoLogicaContext extends ParserRuleContext {
		public List<ExpressaoIgualdadeContext> expressaoIgualdade() {
			return getRuleContexts(ExpressaoIgualdadeContext.class);
		}
		public ExpressaoIgualdadeContext expressaoIgualdade(int i) {
			return getRuleContext(ExpressaoIgualdadeContext.class,i);
		}
		public List<OperadoresLogicosContext> operadoresLogicos() {
			return getRuleContexts(OperadoresLogicosContext.class);
		}
		public OperadoresLogicosContext operadoresLogicos(int i) {
			return getRuleContext(OperadoresLogicosContext.class,i);
		}
		public ExpressaoLogicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoLogica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).enterExpressaoLogica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).exitExpressaoLogica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof japaitonVisitor ) return ((japaitonVisitor<? extends T>)visitor).visitExpressaoLogica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoLogicaContext expressaoLogica() throws RecognitionException {
		ExpressaoLogicaContext _localctx = new ExpressaoLogicaContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_expressaoLogica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			expressaoIgualdade();
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1 || _la==T__2) {
				{
				{
				setState(302);
				operadoresLogicos();
				setState(303);
				expressaoIgualdade();
				}
				}
				setState(309);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperadoresLogicosContext extends ParserRuleContext {
		public OperadoresLogicosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadoresLogicos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).enterOperadoresLogicos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).exitOperadoresLogicos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof japaitonVisitor ) return ((japaitonVisitor<? extends T>)visitor).visitOperadoresLogicos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadoresLogicosContext operadoresLogicos() throws RecognitionException {
		OperadoresLogicosContext _localctx = new OperadoresLogicosContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_operadoresLogicos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==T__2) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoIgualdadeContext extends ParserRuleContext {
		public List<ExpressaoRelacionalContext> expressaoRelacional() {
			return getRuleContexts(ExpressaoRelacionalContext.class);
		}
		public ExpressaoRelacionalContext expressaoRelacional(int i) {
			return getRuleContext(ExpressaoRelacionalContext.class,i);
		}
		public List<OperadorIgualdadeContext> operadorIgualdade() {
			return getRuleContexts(OperadorIgualdadeContext.class);
		}
		public OperadorIgualdadeContext operadorIgualdade(int i) {
			return getRuleContext(OperadorIgualdadeContext.class,i);
		}
		public ExpressaoIgualdadeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoIgualdade; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).enterExpressaoIgualdade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).exitExpressaoIgualdade(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof japaitonVisitor ) return ((japaitonVisitor<? extends T>)visitor).visitExpressaoIgualdade(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoIgualdadeContext expressaoIgualdade() throws RecognitionException {
		ExpressaoIgualdadeContext _localctx = new ExpressaoIgualdadeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_expressaoIgualdade);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			expressaoRelacional();
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUALS || _la==NOTEQUALS) {
				{
				{
				setState(313);
				operadorIgualdade();
				setState(314);
				expressaoRelacional();
				}
				}
				setState(320);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperadorIgualdadeContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(japaitonParser.EQUALS, 0); }
		public TerminalNode NOTEQUALS() { return getToken(japaitonParser.NOTEQUALS, 0); }
		public OperadorIgualdadeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorIgualdade; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).enterOperadorIgualdade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).exitOperadorIgualdade(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof japaitonVisitor ) return ((japaitonVisitor<? extends T>)visitor).visitOperadorIgualdade(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorIgualdadeContext operadorIgualdade() throws RecognitionException {
		OperadorIgualdadeContext _localctx = new OperadorIgualdadeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_operadorIgualdade);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			_la = _input.LA(1);
			if ( !(_la==EQUALS || _la==NOTEQUALS) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoRelacionalContext extends ParserRuleContext {
		public List<ExpressaoGrandezaContext> expressaoGrandeza() {
			return getRuleContexts(ExpressaoGrandezaContext.class);
		}
		public ExpressaoGrandezaContext expressaoGrandeza(int i) {
			return getRuleContext(ExpressaoGrandezaContext.class,i);
		}
		public List<OperadorGrandezaContext> operadorGrandeza() {
			return getRuleContexts(OperadorGrandezaContext.class);
		}
		public OperadorGrandezaContext operadorGrandeza(int i) {
			return getRuleContext(OperadorGrandezaContext.class,i);
		}
		public ExpressaoRelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoRelacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).enterExpressaoRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).exitExpressaoRelacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof japaitonVisitor ) return ((japaitonVisitor<? extends T>)visitor).visitExpressaoRelacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoRelacionalContext expressaoRelacional() throws RecognitionException {
		ExpressaoRelacionalContext _localctx = new ExpressaoRelacionalContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_expressaoRelacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			expressaoGrandeza();
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 515396075520L) != 0)) {
				{
				{
				setState(324);
				operadorGrandeza();
				setState(325);
				expressaoGrandeza();
				}
				}
				setState(331);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperadorGrandezaContext extends ParserRuleContext {
		public TerminalNode GREATEREQUAL() { return getToken(japaitonParser.GREATEREQUAL, 0); }
		public TerminalNode LESSEQUAL() { return getToken(japaitonParser.LESSEQUAL, 0); }
		public TerminalNode GREATER() { return getToken(japaitonParser.GREATER, 0); }
		public TerminalNode LESS() { return getToken(japaitonParser.LESS, 0); }
		public OperadorGrandezaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorGrandeza; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).enterOperadorGrandeza(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).exitOperadorGrandeza(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof japaitonVisitor ) return ((japaitonVisitor<? extends T>)visitor).visitOperadorGrandeza(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorGrandezaContext operadorGrandeza() throws RecognitionException {
		OperadorGrandezaContext _localctx = new OperadorGrandezaContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_operadorGrandeza);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 515396075520L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoGrandezaContext extends ParserRuleContext {
		public List<ExpressaoMultiplicativaContext> expressaoMultiplicativa() {
			return getRuleContexts(ExpressaoMultiplicativaContext.class);
		}
		public ExpressaoMultiplicativaContext expressaoMultiplicativa(int i) {
			return getRuleContext(ExpressaoMultiplicativaContext.class,i);
		}
		public List<OperadorAditivoContext> operadorAditivo() {
			return getRuleContexts(OperadorAditivoContext.class);
		}
		public OperadorAditivoContext operadorAditivo(int i) {
			return getRuleContext(OperadorAditivoContext.class,i);
		}
		public ExpressaoGrandezaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoGrandeza; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).enterExpressaoGrandeza(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).exitExpressaoGrandeza(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof japaitonVisitor ) return ((japaitonVisitor<? extends T>)visitor).visitExpressaoGrandeza(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoGrandezaContext expressaoGrandeza() throws RecognitionException {
		ExpressaoGrandezaContext _localctx = new ExpressaoGrandezaContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_expressaoGrandeza);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			expressaoMultiplicativa();
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(335);
				operadorAditivo();
				setState(336);
				expressaoMultiplicativa();
				}
				}
				setState(342);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperadorAditivoContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(japaitonParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(japaitonParser.MINUS, 0); }
		public OperadorAditivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorAditivo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).enterOperadorAditivo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).exitOperadorAditivo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof japaitonVisitor ) return ((japaitonVisitor<? extends T>)visitor).visitOperadorAditivo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorAditivoContext operadorAditivo() throws RecognitionException {
		OperadorAditivoContext _localctx = new OperadorAditivoContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_operadorAditivo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoMultiplicativaContext extends ParserRuleContext {
		public List<ExpressaoNegativaContext> expressaoNegativa() {
			return getRuleContexts(ExpressaoNegativaContext.class);
		}
		public ExpressaoNegativaContext expressaoNegativa(int i) {
			return getRuleContext(ExpressaoNegativaContext.class,i);
		}
		public List<OperadorMultiplicativoContext> operadorMultiplicativo() {
			return getRuleContexts(OperadorMultiplicativoContext.class);
		}
		public OperadorMultiplicativoContext operadorMultiplicativo(int i) {
			return getRuleContext(OperadorMultiplicativoContext.class,i);
		}
		public ExpressaoMultiplicativaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoMultiplicativa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).enterExpressaoMultiplicativa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).exitExpressaoMultiplicativa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof japaitonVisitor ) return ((japaitonVisitor<? extends T>)visitor).visitExpressaoMultiplicativa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoMultiplicativaContext expressaoMultiplicativa() throws RecognitionException {
		ExpressaoMultiplicativaContext _localctx = new ExpressaoMultiplicativaContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_expressaoMultiplicativa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			expressaoNegativa();
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ASTERISK || _la==SLASH) {
				{
				{
				setState(346);
				operadorMultiplicativo();
				setState(347);
				expressaoNegativa();
				}
				}
				setState(353);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperadorMultiplicativoContext extends ParserRuleContext {
		public TerminalNode ASTERISK() { return getToken(japaitonParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(japaitonParser.SLASH, 0); }
		public OperadorMultiplicativoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorMultiplicativo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).enterOperadorMultiplicativo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).exitOperadorMultiplicativo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof japaitonVisitor ) return ((japaitonVisitor<? extends T>)visitor).visitOperadorMultiplicativo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorMultiplicativoContext operadorMultiplicativo() throws RecognitionException {
		OperadorMultiplicativoContext _localctx = new OperadorMultiplicativoContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_operadorMultiplicativo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			_la = _input.LA(1);
			if ( !(_la==ASTERISK || _la==SLASH) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoNegativaContext extends ParserRuleContext {
		public ExpressaoPrimariaContext expressaoPrimaria() {
			return getRuleContext(ExpressaoPrimariaContext.class,0);
		}
		public OperadorNegacaoContext operadorNegacao() {
			return getRuleContext(OperadorNegacaoContext.class,0);
		}
		public ExpressaoNegativaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoNegativa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).enterExpressaoNegativa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).exitExpressaoNegativa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof japaitonVisitor ) return ((japaitonVisitor<? extends T>)visitor).visitExpressaoNegativa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoNegativaContext expressaoNegativa() throws RecognitionException {
		ExpressaoNegativaContext _localctx = new ExpressaoNegativaContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_expressaoNegativa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS || _la==NOT) {
				{
				setState(356);
				operadorNegacao();
				}
			}

			setState(359);
			expressaoPrimaria();
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperadorNegacaoContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(japaitonParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(japaitonParser.NOT, 0); }
		public OperadorNegacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorNegacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).enterOperadorNegacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).exitOperadorNegacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof japaitonVisitor ) return ((japaitonVisitor<? extends T>)visitor).visitOperadorNegacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorNegacaoContext operadorNegacao() throws RecognitionException {
		OperadorNegacaoContext _localctx = new OperadorNegacaoContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_operadorNegacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			_la = _input.LA(1);
			if ( !(_la==MINUS || _la==NOT) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoPrimariaContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(japaitonParser.INTEGER, 0); }
		public TerminalNode FLOAT_NUMBER() { return getToken(japaitonParser.FLOAT_NUMBER, 0); }
		public TerminalNode STRING() { return getToken(japaitonParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(japaitonParser.BOOLEAN, 0); }
		public TerminalNode ID() { return getToken(japaitonParser.ID, 0); }
		public ChamadaFuncaoContext chamadaFuncao() {
			return getRuleContext(ChamadaFuncaoContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(japaitonParser.LPAREN, 0); }
		public ExpressoesContext expressoes() {
			return getRuleContext(ExpressoesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(japaitonParser.RPAREN, 0); }
		public ExpressaoPrimariaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoPrimaria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).enterExpressaoPrimaria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).exitExpressaoPrimaria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof japaitonVisitor ) return ((japaitonVisitor<? extends T>)visitor).visitExpressaoPrimaria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoPrimariaContext expressaoPrimaria() throws RecognitionException {
		ExpressaoPrimariaContext _localctx = new ExpressaoPrimariaContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_expressaoPrimaria);
		try {
			setState(373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(363);
				match(INTEGER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(364);
				match(FLOAT_NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(365);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(366);
				match(BOOLEAN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(367);
				match(ID);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(368);
				chamadaFuncao();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(369);
				match(LPAREN);
				setState(370);
				expressoes();
				setState(371);
				match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ChamadaFuncaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(japaitonParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(japaitonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(japaitonParser.RPAREN, 0); }
		public ListaArgumentosContext listaArgumentos() {
			return getRuleContext(ListaArgumentosContext.class,0);
		}
		public ChamadaFuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamadaFuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).enterChamadaFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).exitChamadaFuncao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof japaitonVisitor ) return ((japaitonVisitor<? extends T>)visitor).visitChamadaFuncao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChamadaFuncaoContext chamadaFuncao() throws RecognitionException {
		ChamadaFuncaoContext _localctx = new ChamadaFuncaoContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_chamadaFuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(ID);
			setState(376);
			match(LPAREN);
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 550854459392L) != 0)) {
				{
				setState(377);
				listaArgumentos();
				}
			}

			setState(380);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListaArgumentosContext extends ParserRuleContext {
		public List<ExpressoesContext> expressoes() {
			return getRuleContexts(ExpressoesContext.class);
		}
		public ExpressoesContext expressoes(int i) {
			return getRuleContext(ExpressoesContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(japaitonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(japaitonParser.COMMA, i);
		}
		public ListaArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaArgumentos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).enterListaArgumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).exitListaArgumentos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof japaitonVisitor ) return ((japaitonVisitor<? extends T>)visitor).visitListaArgumentos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaArgumentosContext listaArgumentos() throws RecognitionException {
		ListaArgumentosContext _localctx = new ListaArgumentosContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_listaArgumentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			expressoes();
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(383);
				match(COMMA);
				setState(384);
				expressoes();
				}
				}
				setState(389);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(japaitonParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(japaitonParser.FLOAT, 0); }
		public TerminalNode STR() { return getToken(japaitonParser.STR, 0); }
		public TerminalNode BOOL() { return getToken(japaitonParser.BOOL, 0); }
		public TerminalNode VOID() { return getToken(japaitonParser.VOID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof japaitonListener ) ((japaitonListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof japaitonVisitor ) return ((japaitonVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 496L) != 0)) ) {
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
		"\u0004\u0001)\u0189\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0001\u0000\u0005\u0000`\b\u0000\n\u0000\f\u0000"+
		"c\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001j\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002r\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002x\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u0080\b\u0003"+
		"\n\u0003\f\u0003\u0083\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0005\u0005\u0089\b\u0005\n\u0005\f\u0005\u008c\t\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u0095\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b"+
		"\u0001\b\u0003\b\u009c\b\b\u0001\t\u0001\t\u0001\t\u0005\t\u00a1\b\t\n"+
		"\t\f\t\u00a4\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00aa\b\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000b\u00b1"+
		"\b\u000b\u000b\u000b\f\u000b\u00b2\u0001\f\u0001\f\u0001\f\u0004\f\u00b8"+
		"\b\f\u000b\f\f\f\u00b9\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00cb\b\u000f\n\u000f\f\u000f"+
		"\u00ce\t\u000f\u0003\u000f\u00d0\b\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005"+
		"\u0015\u00f8\b\u0015\n\u0015\f\u0015\u00fb\t\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0103\b\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u010e\b\u0018\n\u0018"+
		"\f\u0018\u0111\t\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u011b\b\u001b"+
		"\n\u001b\f\u001b\u011e\t\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0003\u001d\u012a\b\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u0132\b\u001f\n\u001f\f\u001f"+
		"\u0135\t\u001f\u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0005!\u013d"+
		"\b!\n!\f!\u0140\t!\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0005#"+
		"\u0148\b#\n#\f#\u014b\t#\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0005"+
		"%\u0153\b%\n%\f%\u0156\t%\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0005\'\u015e\b\'\n\'\f\'\u0161\t\'\u0001(\u0001(\u0001)\u0003)\u0166"+
		"\b)\u0001)\u0001)\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0003+\u0176\b+\u0001,\u0001,\u0001,\u0003"+
		",\u017b\b,\u0001,\u0001,\u0001-\u0001-\u0001-\u0005-\u0182\b-\n-\f-\u0185"+
		"\t-\u0001.\u0001.\u0001.\u0000\u0000/\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRTVXZ\\\u0000\t\u0001\u0000\u0012\u0015\u0002\u0000\u0014\u0014\u0016"+
		"\u0016\u0001\u0000\u0002\u0003\u0001\u0000!\"\u0001\u0000#&\u0001\u0000"+
		"\u001d\u001e\u0001\u0000\u001f \u0002\u0000\u001e\u001e\'\'\u0001\u0000"+
		"\u0004\b\u0188\u0000a\u0001\u0000\u0000\u0000\u0002f\u0001\u0000\u0000"+
		"\u0000\u0004n\u0001\u0000\u0000\u0000\u0006|\u0001\u0000\u0000\u0000\b"+
		"\u0084\u0001\u0000\u0000\u0000\n\u008a\u0001\u0000\u0000\u0000\f\u0094"+
		"\u0001\u0000\u0000\u0000\u000e\u0096\u0001\u0000\u0000\u0000\u0010\u0099"+
		"\u0001\u0000\u0000\u0000\u0012\u009d\u0001\u0000\u0000\u0000\u0014\u00a9"+
		"\u0001\u0000\u0000\u0000\u0016\u00b0\u0001\u0000\u0000\u0000\u0018\u00b4"+
		"\u0001\u0000\u0000\u0000\u001a\u00bf\u0001\u0000\u0000\u0000\u001c\u00c3"+
		"\u0001\u0000\u0000\u0000\u001e\u00cf\u0001\u0000\u0000\u0000 \u00d1\u0001"+
		"\u0000\u0000\u0000\"\u00d5\u0001\u0000\u0000\u0000$\u00d7\u0001\u0000"+
		"\u0000\u0000&\u00df\u0001\u0000\u0000\u0000(\u00ea\u0001\u0000\u0000\u0000"+
		"*\u00f2\u0001\u0000\u0000\u0000,\u0102\u0001\u0000\u0000\u0000.\u0104"+
		"\u0001\u0000\u0000\u00000\u010a\u0001\u0000\u0000\u00002\u0112\u0001\u0000"+
		"\u0000\u00004\u0114\u0001\u0000\u0000\u00006\u0117\u0001\u0000\u0000\u0000"+
		"8\u011f\u0001\u0000\u0000\u0000:\u0129\u0001\u0000\u0000\u0000<\u012b"+
		"\u0001\u0000\u0000\u0000>\u012d\u0001\u0000\u0000\u0000@\u0136\u0001\u0000"+
		"\u0000\u0000B\u0138\u0001\u0000\u0000\u0000D\u0141\u0001\u0000\u0000\u0000"+
		"F\u0143\u0001\u0000\u0000\u0000H\u014c\u0001\u0000\u0000\u0000J\u014e"+
		"\u0001\u0000\u0000\u0000L\u0157\u0001\u0000\u0000\u0000N\u0159\u0001\u0000"+
		"\u0000\u0000P\u0162\u0001\u0000\u0000\u0000R\u0165\u0001\u0000\u0000\u0000"+
		"T\u0169\u0001\u0000\u0000\u0000V\u0175\u0001\u0000\u0000\u0000X\u0177"+
		"\u0001\u0000\u0000\u0000Z\u017e\u0001\u0000\u0000\u0000\\\u0186\u0001"+
		"\u0000\u0000\u0000^`\u0003\u0004\u0002\u0000_^\u0001\u0000\u0000\u0000"+
		"`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000"+
		"\u0000bd\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000de\u0003\u0002"+
		"\u0001\u0000e\u0001\u0001\u0000\u0000\u0000fg\u0005\u0001\u0000\u0000"+
		"gi\u0005\u001c\u0000\u0000hj\u0003\u0010\b\u0000ih\u0001\u0000\u0000\u0000"+
		"ij\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000kl\u0003\n\u0005\u0000"+
		"lm\u0005\u000e\u0000\u0000m\u0003\u0001\u0000\u0000\u0000no\u0005\u0016"+
		"\u0000\u0000oq\u0005\u0018\u0000\u0000pr\u0003\u0006\u0003\u0000qp\u0001"+
		"\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000"+
		"st\u0005\u0019\u0000\u0000tu\u0005\u001c\u0000\u0000uw\u0003\\.\u0000"+
		"vx\u0003\u0010\b\u0000wv\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000"+
		"xy\u0001\u0000\u0000\u0000yz\u0003\n\u0005\u0000z{\u0005\u000e\u0000\u0000"+
		"{\u0005\u0001\u0000\u0000\u0000|\u0081\u0003\b\u0004\u0000}~\u0005\u001a"+
		"\u0000\u0000~\u0080\u0003\b\u0004\u0000\u007f}\u0001\u0000\u0000\u0000"+
		"\u0080\u0083\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0007\u0001\u0000\u0000\u0000"+
		"\u0083\u0081\u0001\u0000\u0000\u0000\u0084\u0085\u0003\\.\u0000\u0085"+
		"\u0086\u0005\u0016\u0000\u0000\u0086\t\u0001\u0000\u0000\u0000\u0087\u0089"+
		"\u0003\f\u0006\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0089\u008c\u0001"+
		"\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001"+
		"\u0000\u0000\u0000\u008b\u000b\u0001\u0000\u0000\u0000\u008c\u008a\u0001"+
		"\u0000\u0000\u0000\u008d\u0095\u0003$\u0012\u0000\u008e\u0095\u0003&\u0013"+
		"\u0000\u008f\u0095\u0003(\u0014\u0000\u0090\u0095\u0003\u001a\r\u0000"+
		"\u0091\u0095\u0003*\u0015\u0000\u0092\u0095\u0003.\u0017\u0000\u0093\u0095"+
		"\u0003\u000e\u0007\u0000\u0094\u008d\u0001\u0000\u0000\u0000\u0094\u008e"+
		"\u0001\u0000\u0000\u0000\u0094\u008f\u0001\u0000\u0000\u0000\u0094\u0090"+
		"\u0001\u0000\u0000\u0000\u0094\u0091\u0001\u0000\u0000\u0000\u0094\u0092"+
		"\u0001\u0000\u0000\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0095\r\u0001"+
		"\u0000\u0000\u0000\u0096\u0097\u0005\u000f\u0000\u0000\u0097\u0098\u0003"+
		"4\u001a\u0000\u0098\u000f\u0001\u0000\u0000\u0000\u0099\u009b\u0003\u0012"+
		"\t\u0000\u009a\u009c\u0003\f\u0006\u0000\u009b\u009a\u0001\u0000\u0000"+
		"\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u0011\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0005\r\u0000\u0000\u009e\u00a2\u0005\u001c\u0000\u0000"+
		"\u009f\u00a1\u0003\u0014\n\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a3\u0013\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a5\u00aa\u0003\u0016\u000b\u0000\u00a6"+
		"\u00aa\u0003\u0018\f\u0000\u00a7\u00aa\u0003\u001a\r\u0000\u00a8\u00aa"+
		"\u0003\u001c\u000e\u0000\u00a9\u00a5\u0001\u0000\u0000\u0000\u00a9\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00a8"+
		"\u0001\u0000\u0000\u0000\u00aa\u0015\u0001\u0000\u0000\u0000\u00ab\u00ac"+
		"\u0005\u0016\u0000\u0000\u00ac\u00ad\u0005\u001c\u0000\u0000\u00ad\u00ae"+
		"\u0003\\.\u0000\u00ae\u00af\u0005\u001b\u0000\u0000\u00af\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b0\u00ab\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001"+
		"\u0000\u0000\u0000\u00b3\u0017\u0001\u0000\u0000\u0000\u00b4\u00b7\u0005"+
		"\u0016\u0000\u0000\u00b5\u00b6\u0005\u001a\u0000\u0000\u00b6\u00b8\u0005"+
		"\u0016\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001"+
		"\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005"+
		"\u001c\u0000\u0000\u00bc\u00bd\u0003\\.\u0000\u00bd\u00be\u0005\u001b"+
		"\u0000\u0000\u00be\u0019\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005\u0016"+
		"\u0000\u0000\u00c0\u00c1\u0005\u0017\u0000\u0000\u00c1\u00c2\u00034\u001a"+
		"\u0000\u00c2\u001b\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005\f\u0000\u0000"+
		"\u00c4\u00c5\u0003\u001e\u000f\u0000\u00c5\u00c6\u0005\u001b\u0000\u0000"+
		"\u00c6\u001d\u0001\u0000\u0000\u0000\u00c7\u00cc\u0003 \u0010\u0000\u00c8"+
		"\u00c9\u0005\u001a\u0000\u0000\u00c9\u00cb\u0003 \u0010\u0000\u00ca\u00c8"+
		"\u0001\u0000\u0000\u0000\u00cb\u00ce\u0001\u0000\u0000\u0000\u00cc\u00ca"+
		"\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00d0"+
		"\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00cf\u00c7"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u001f"+
		"\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005\u0016\u0000\u0000\u00d2\u00d3"+
		"\u0005\u0017\u0000\u0000\u00d3\u00d4\u0003\"\u0011\u0000\u00d4!\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d6\u0007\u0000\u0000\u0000\u00d6#\u0001\u0000"+
		"\u0000\u0000\u00d7\u00d8\u0005\t\u0000\u0000\u00d8\u00d9\u0005\u0018\u0000"+
		"\u0000\u00d9\u00da\u00038\u001c\u0000\u00da\u00db\u0005\u0019\u0000\u0000"+
		"\u00db\u00dc\u0005\u001c\u0000\u0000\u00dc\u00dd\u0003\n\u0005\u0000\u00dd"+
		"\u00de\u0005\u000e\u0000\u0000\u00de%\u0001\u0000\u0000\u0000\u00df\u00e0"+
		"\u0005\t\u0000\u0000\u00e0\u00e1\u0005\u0018\u0000\u0000\u00e1\u00e2\u0003"+
		"8\u001c\u0000\u00e2\u00e3\u0005\u0019\u0000\u0000\u00e3\u00e4\u0005\u001c"+
		"\u0000\u0000\u00e4\u00e5\u0003\n\u0005\u0000\u00e5\u00e6\u0005\n\u0000"+
		"\u0000\u00e6\u00e7\u0005\u001c\u0000\u0000\u00e7\u00e8\u0003\n\u0005\u0000"+
		"\u00e8\u00e9\u0005\u000e\u0000\u0000\u00e9\'\u0001\u0000\u0000\u0000\u00ea"+
		"\u00eb\u0005\u000b\u0000\u0000\u00eb\u00ec\u0005\u0018\u0000\u0000\u00ec"+
		"\u00ed\u00038\u001c\u0000\u00ed\u00ee\u0005\u0019\u0000\u0000\u00ee\u00ef"+
		"\u0005\u001c\u0000\u0000\u00ef\u00f0\u0003\n\u0005\u0000\u00f0\u00f1\u0005"+
		"\u000e\u0000\u0000\u00f1)\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005\u0010"+
		"\u0000\u0000\u00f3\u00f4\u0005\u0018\u0000\u0000\u00f4\u00f9\u0003,\u0016"+
		"\u0000\u00f5\u00f6\u0005\u001a\u0000\u0000\u00f6\u00f8\u0003,\u0016\u0000"+
		"\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f8\u00fb\u0001\u0000\u0000\u0000"+
		"\u00f9\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000"+
		"\u00fa\u00fc\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000"+
		"\u00fc\u00fd\u0005\u0019\u0000\u0000\u00fd\u00fe\u0005\u001b\u0000\u0000"+
		"\u00fe+\u0001\u0000\u0000\u0000\u00ff\u0103\u00032\u0019\u0000\u0100\u0103"+
		"\u00036\u001b\u0000\u0101\u0103\u0003X,\u0000\u0102\u00ff\u0001\u0000"+
		"\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0102\u0101\u0001\u0000"+
		"\u0000\u0000\u0103-\u0001\u0000\u0000\u0000\u0104\u0105\u0005\u0011\u0000"+
		"\u0000\u0105\u0106\u0005\u0018\u0000\u0000\u0106\u0107\u00030\u0018\u0000"+
		"\u0107\u0108\u0005\u0019\u0000\u0000\u0108\u0109\u0005\u001b\u0000\u0000"+
		"\u0109/\u0001\u0000\u0000\u0000\u010a\u010f\u0005\u0016\u0000\u0000\u010b"+
		"\u010c\u0005\u001a\u0000\u0000\u010c\u010e\u0005\u0016\u0000\u0000\u010d"+
		"\u010b\u0001\u0000\u0000\u0000\u010e\u0111\u0001\u0000\u0000\u0000\u010f"+
		"\u010d\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110"+
		"1\u0001\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0112\u0113"+
		"\u0007\u0001\u0000\u0000\u01133\u0001\u0000\u0000\u0000\u0114\u0115\u0003"+
		":\u001d\u0000\u0115\u0116\u0005\u001b\u0000\u0000\u01165\u0001\u0000\u0000"+
		"\u0000\u0117\u011c\u0003:\u001d\u0000\u0118\u0119\u0005\u001a\u0000\u0000"+
		"\u0119\u011b\u0003:\u001d\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011b"+
		"\u011e\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011c"+
		"\u011d\u0001\u0000\u0000\u0000\u011d7\u0001\u0000\u0000\u0000\u011e\u011c"+
		"\u0001\u0000\u0000\u0000\u011f\u0120\u0003:\u001d\u0000\u01209\u0001\u0000"+
		"\u0000\u0000\u0121\u012a\u0003>\u001f\u0000\u0122\u012a\u0003J%\u0000"+
		"\u0123\u012a\u0003B!\u0000\u0124\u012a\u0003N\'\u0000\u0125\u012a\u0003"+
		"R)\u0000\u0126\u012a\u0003V+\u0000\u0127\u012a\u0003F#\u0000\u0128\u012a"+
		"\u0003<\u001e\u0000\u0129\u0121\u0001\u0000\u0000\u0000\u0129\u0122\u0001"+
		"\u0000\u0000\u0000\u0129\u0123\u0001\u0000\u0000\u0000\u0129\u0124\u0001"+
		"\u0000\u0000\u0000\u0129\u0125\u0001\u0000\u0000\u0000\u0129\u0126\u0001"+
		"\u0000\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u0129\u0128\u0001"+
		"\u0000\u0000\u0000\u012a;\u0001\u0000\u0000\u0000\u012b\u012c\u0005\u0014"+
		"\u0000\u0000\u012c=\u0001\u0000\u0000\u0000\u012d\u0133\u0003B!\u0000"+
		"\u012e\u012f\u0003@ \u0000\u012f\u0130\u0003B!\u0000\u0130\u0132\u0001"+
		"\u0000\u0000\u0000\u0131\u012e\u0001\u0000\u0000\u0000\u0132\u0135\u0001"+
		"\u0000\u0000\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0133\u0134\u0001"+
		"\u0000\u0000\u0000\u0134?\u0001\u0000\u0000\u0000\u0135\u0133\u0001\u0000"+
		"\u0000\u0000\u0136\u0137\u0007\u0002\u0000\u0000\u0137A\u0001\u0000\u0000"+
		"\u0000\u0138\u013e\u0003F#\u0000\u0139\u013a\u0003D\"\u0000\u013a\u013b"+
		"\u0003F#\u0000\u013b\u013d\u0001\u0000\u0000\u0000\u013c\u0139\u0001\u0000"+
		"\u0000\u0000\u013d\u0140\u0001\u0000\u0000\u0000\u013e\u013c\u0001\u0000"+
		"\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013fC\u0001\u0000\u0000"+
		"\u0000\u0140\u013e\u0001\u0000\u0000\u0000\u0141\u0142\u0007\u0003\u0000"+
		"\u0000\u0142E\u0001\u0000\u0000\u0000\u0143\u0149\u0003J%\u0000\u0144"+
		"\u0145\u0003H$\u0000\u0145\u0146\u0003J%\u0000\u0146\u0148\u0001\u0000"+
		"\u0000\u0000\u0147\u0144\u0001\u0000\u0000\u0000\u0148\u014b\u0001\u0000"+
		"\u0000\u0000\u0149\u0147\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000"+
		"\u0000\u0000\u014aG\u0001\u0000\u0000\u0000\u014b\u0149\u0001\u0000\u0000"+
		"\u0000\u014c\u014d\u0007\u0004\u0000\u0000\u014dI\u0001\u0000\u0000\u0000"+
		"\u014e\u0154\u0003N\'\u0000\u014f\u0150\u0003L&\u0000\u0150\u0151\u0003"+
		"N\'\u0000\u0151\u0153\u0001\u0000\u0000\u0000\u0152\u014f\u0001\u0000"+
		"\u0000\u0000\u0153\u0156\u0001\u0000\u0000\u0000\u0154\u0152\u0001\u0000"+
		"\u0000\u0000\u0154\u0155\u0001\u0000\u0000\u0000\u0155K\u0001\u0000\u0000"+
		"\u0000\u0156\u0154\u0001\u0000\u0000\u0000\u0157\u0158\u0007\u0005\u0000"+
		"\u0000\u0158M\u0001\u0000\u0000\u0000\u0159\u015f\u0003R)\u0000\u015a"+
		"\u015b\u0003P(\u0000\u015b\u015c\u0003R)\u0000\u015c\u015e\u0001\u0000"+
		"\u0000\u0000\u015d\u015a\u0001\u0000\u0000\u0000\u015e\u0161\u0001\u0000"+
		"\u0000\u0000\u015f\u015d\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000"+
		"\u0000\u0000\u0160O\u0001\u0000\u0000\u0000\u0161\u015f\u0001\u0000\u0000"+
		"\u0000\u0162\u0163\u0007\u0006\u0000\u0000\u0163Q\u0001\u0000\u0000\u0000"+
		"\u0164\u0166\u0003T*\u0000\u0165\u0164\u0001\u0000\u0000\u0000\u0165\u0166"+
		"\u0001\u0000\u0000\u0000\u0166\u0167\u0001\u0000\u0000\u0000\u0167\u0168"+
		"\u0003V+\u0000\u0168S\u0001\u0000\u0000\u0000\u0169\u016a\u0007\u0007"+
		"\u0000\u0000\u016aU\u0001\u0000\u0000\u0000\u016b\u0176\u0005\u0012\u0000"+
		"\u0000\u016c\u0176\u0005\u0013\u0000\u0000\u016d\u0176\u0005\u0014\u0000"+
		"\u0000\u016e\u0176\u0005\u0015\u0000\u0000\u016f\u0176\u0005\u0016\u0000"+
		"\u0000\u0170\u0176\u0003X,\u0000\u0171\u0172\u0005\u0018\u0000\u0000\u0172"+
		"\u0173\u0003:\u001d\u0000\u0173\u0174\u0005\u0019\u0000\u0000\u0174\u0176"+
		"\u0001\u0000\u0000\u0000\u0175\u016b\u0001\u0000\u0000\u0000\u0175\u016c"+
		"\u0001\u0000\u0000\u0000\u0175\u016d\u0001\u0000\u0000\u0000\u0175\u016e"+
		"\u0001\u0000\u0000\u0000\u0175\u016f\u0001\u0000\u0000\u0000\u0175\u0170"+
		"\u0001\u0000\u0000\u0000\u0175\u0171\u0001\u0000\u0000\u0000\u0176W\u0001"+
		"\u0000\u0000\u0000\u0177\u0178\u0005\u0016\u0000\u0000\u0178\u017a\u0005"+
		"\u0018\u0000\u0000\u0179\u017b\u0003Z-\u0000\u017a\u0179\u0001\u0000\u0000"+
		"\u0000\u017a\u017b\u0001\u0000\u0000\u0000\u017b\u017c\u0001\u0000\u0000"+
		"\u0000\u017c\u017d\u0005\u0019\u0000\u0000\u017dY\u0001\u0000\u0000\u0000"+
		"\u017e\u0183\u0003:\u001d\u0000\u017f\u0180\u0005\u001a\u0000\u0000\u0180"+
		"\u0182\u0003:\u001d\u0000\u0181\u017f\u0001\u0000\u0000\u0000\u0182\u0185"+
		"\u0001\u0000\u0000\u0000\u0183\u0181\u0001\u0000\u0000\u0000\u0183\u0184"+
		"\u0001\u0000\u0000\u0000\u0184[\u0001\u0000\u0000\u0000\u0185\u0183\u0001"+
		"\u0000\u0000\u0000\u0186\u0187\u0007\b\u0000\u0000\u0187]\u0001\u0000"+
		"\u0000\u0000\u001caiqw\u0081\u008a\u0094\u009b\u00a2\u00a9\u00b2\u00b9"+
		"\u00cc\u00cf\u00f9\u0102\u010f\u011c\u0129\u0133\u013e\u0149\u0154\u015f"+
		"\u0165\u0175\u017a\u0183";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}