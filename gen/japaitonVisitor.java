// Generated from D:/Vou trabalhar na Nuuvem/Java/japaiton/src\japaiton.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link japaitonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface japaitonVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link japaitonParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(japaitonParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(japaitonParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#funcao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncao(japaitonParser.FuncaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(japaitonParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(japaitonParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#escopo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscopo(japaitonParser.EscopoContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#blocoDeCodigo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocoDeCodigo(japaitonParser.BlocoDeCodigoContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#returnDeclaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnDeclaracao(japaitonParser.ReturnDeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#variaveis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariaveis(japaitonParser.VariaveisContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#declaracaoVariavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoVariavel(japaitonParser.DeclaracaoVariavelContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#listaVariaveis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaVariaveis(japaitonParser.ListaVariaveisContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#atribuicaoVariavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicaoVariavel(japaitonParser.AtribuicaoVariavelContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#atribuicaoMultiplaVariaveis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicaoMultiplaVariaveis(japaitonParser.AtribuicaoMultiplaVariaveisContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#atribuicaoValorVariavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicaoValorVariavel(japaitonParser.AtribuicaoValorVariavelContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#declaracaoConstante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoConstante(japaitonParser.DeclaracaoConstanteContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#listaConstantes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaConstantes(japaitonParser.ListaConstantesContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#atribuicaoConstante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicaoConstante(japaitonParser.AtribuicaoConstanteContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#valorConstante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValorConstante(japaitonParser.ValorConstanteContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#ifDeclaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfDeclaracao(japaitonParser.IfDeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#ifElseDeclaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseDeclaracao(japaitonParser.IfElseDeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#whileDeclaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileDeclaracao(japaitonParser.WhileDeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#printDeclaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintDeclaracao(japaitonParser.PrintDeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#printParametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintParametros(japaitonParser.PrintParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#scanfDeclaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScanfDeclaracao(japaitonParser.ScanfDeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#listaIDs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaIDs(japaitonParser.ListaIDsContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#idOrString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdOrString(japaitonParser.IdOrStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#expressoesDeclaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressoesDeclaracao(japaitonParser.ExpressoesDeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#listaExpressoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaExpressoes(japaitonParser.ListaExpressoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#condicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicao(japaitonParser.CondicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#expressoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressoes(japaitonParser.ExpressoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#expressaoString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoString(japaitonParser.ExpressaoStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#expressaoLogica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoLogica(japaitonParser.ExpressaoLogicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#operadoresLogicos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadoresLogicos(japaitonParser.OperadoresLogicosContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#expressaoIgualdade}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoIgualdade(japaitonParser.ExpressaoIgualdadeContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#operadorIgualdade}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorIgualdade(japaitonParser.OperadorIgualdadeContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoRelacional(japaitonParser.ExpressaoRelacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#operadorGrandeza}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorGrandeza(japaitonParser.OperadorGrandezaContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#expressaoGrandeza}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoGrandeza(japaitonParser.ExpressaoGrandezaContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#operadorAditivo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorAditivo(japaitonParser.OperadorAditivoContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#expressaoMultiplicativa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoMultiplicativa(japaitonParser.ExpressaoMultiplicativaContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#operadorMultiplicativo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorMultiplicativo(japaitonParser.OperadorMultiplicativoContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#expressaoNegativa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoNegativa(japaitonParser.ExpressaoNegativaContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#operadorNegacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorNegacao(japaitonParser.OperadorNegacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#expressaoPrimaria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoPrimaria(japaitonParser.ExpressaoPrimariaContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#chamadaFuncao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChamadaFuncao(japaitonParser.ChamadaFuncaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#listaArgumentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaArgumentos(japaitonParser.ListaArgumentosContext ctx);
	/**
	 * Visit a parse tree produced by {@link japaitonParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(japaitonParser.TypeContext ctx);
}