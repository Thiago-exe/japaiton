// Generated from D:/Vou trabalhar na Nuuvem/Java/japaiton/src\japaiton.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link japaitonParser}.
 */
public interface japaitonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link japaitonParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(japaitonParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(japaitonParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(japaitonParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(japaitonParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#funcao}.
	 * @param ctx the parse tree
	 */
	void enterFuncao(japaitonParser.FuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#funcao}.
	 * @param ctx the parse tree
	 */
	void exitFuncao(japaitonParser.FuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(japaitonParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(japaitonParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(japaitonParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(japaitonParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#escopo}.
	 * @param ctx the parse tree
	 */
	void enterEscopo(japaitonParser.EscopoContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#escopo}.
	 * @param ctx the parse tree
	 */
	void exitEscopo(japaitonParser.EscopoContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#blocoDeCodigo}.
	 * @param ctx the parse tree
	 */
	void enterBlocoDeCodigo(japaitonParser.BlocoDeCodigoContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#blocoDeCodigo}.
	 * @param ctx the parse tree
	 */
	void exitBlocoDeCodigo(japaitonParser.BlocoDeCodigoContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#returnDeclaracao}.
	 * @param ctx the parse tree
	 */
	void enterReturnDeclaracao(japaitonParser.ReturnDeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#returnDeclaracao}.
	 * @param ctx the parse tree
	 */
	void exitReturnDeclaracao(japaitonParser.ReturnDeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#variaveis}.
	 * @param ctx the parse tree
	 */
	void enterVariaveis(japaitonParser.VariaveisContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#variaveis}.
	 * @param ctx the parse tree
	 */
	void exitVariaveis(japaitonParser.VariaveisContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#declaracaoVariavel}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoVariavel(japaitonParser.DeclaracaoVariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#declaracaoVariavel}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoVariavel(japaitonParser.DeclaracaoVariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#listaVariaveis}.
	 * @param ctx the parse tree
	 */
	void enterListaVariaveis(japaitonParser.ListaVariaveisContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#listaVariaveis}.
	 * @param ctx the parse tree
	 */
	void exitListaVariaveis(japaitonParser.ListaVariaveisContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#atribuicaoVariavel}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicaoVariavel(japaitonParser.AtribuicaoVariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#atribuicaoVariavel}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicaoVariavel(japaitonParser.AtribuicaoVariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#atribuicaoMultiplaVariaveis}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicaoMultiplaVariaveis(japaitonParser.AtribuicaoMultiplaVariaveisContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#atribuicaoMultiplaVariaveis}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicaoMultiplaVariaveis(japaitonParser.AtribuicaoMultiplaVariaveisContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#atribuicaoValorVariavel}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicaoValorVariavel(japaitonParser.AtribuicaoValorVariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#atribuicaoValorVariavel}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicaoValorVariavel(japaitonParser.AtribuicaoValorVariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#declaracaoConstante}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoConstante(japaitonParser.DeclaracaoConstanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#declaracaoConstante}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoConstante(japaitonParser.DeclaracaoConstanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#listaConstantes}.
	 * @param ctx the parse tree
	 */
	void enterListaConstantes(japaitonParser.ListaConstantesContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#listaConstantes}.
	 * @param ctx the parse tree
	 */
	void exitListaConstantes(japaitonParser.ListaConstantesContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#atribuicaoConstante}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicaoConstante(japaitonParser.AtribuicaoConstanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#atribuicaoConstante}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicaoConstante(japaitonParser.AtribuicaoConstanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#valorConstante}.
	 * @param ctx the parse tree
	 */
	void enterValorConstante(japaitonParser.ValorConstanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#valorConstante}.
	 * @param ctx the parse tree
	 */
	void exitValorConstante(japaitonParser.ValorConstanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#ifDeclaracao}.
	 * @param ctx the parse tree
	 */
	void enterIfDeclaracao(japaitonParser.IfDeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#ifDeclaracao}.
	 * @param ctx the parse tree
	 */
	void exitIfDeclaracao(japaitonParser.IfDeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#ifElseDeclaracao}.
	 * @param ctx the parse tree
	 */
	void enterIfElseDeclaracao(japaitonParser.IfElseDeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#ifElseDeclaracao}.
	 * @param ctx the parse tree
	 */
	void exitIfElseDeclaracao(japaitonParser.IfElseDeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#whileDeclaracao}.
	 * @param ctx the parse tree
	 */
	void enterWhileDeclaracao(japaitonParser.WhileDeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#whileDeclaracao}.
	 * @param ctx the parse tree
	 */
	void exitWhileDeclaracao(japaitonParser.WhileDeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#printDeclaracao}.
	 * @param ctx the parse tree
	 */
	void enterPrintDeclaracao(japaitonParser.PrintDeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#printDeclaracao}.
	 * @param ctx the parse tree
	 */
	void exitPrintDeclaracao(japaitonParser.PrintDeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#printParametros}.
	 * @param ctx the parse tree
	 */
	void enterPrintParametros(japaitonParser.PrintParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#printParametros}.
	 * @param ctx the parse tree
	 */
	void exitPrintParametros(japaitonParser.PrintParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#scanfDeclaracao}.
	 * @param ctx the parse tree
	 */
	void enterScanfDeclaracao(japaitonParser.ScanfDeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#scanfDeclaracao}.
	 * @param ctx the parse tree
	 */
	void exitScanfDeclaracao(japaitonParser.ScanfDeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#listaIDs}.
	 * @param ctx the parse tree
	 */
	void enterListaIDs(japaitonParser.ListaIDsContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#listaIDs}.
	 * @param ctx the parse tree
	 */
	void exitListaIDs(japaitonParser.ListaIDsContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#idOrString}.
	 * @param ctx the parse tree
	 */
	void enterIdOrString(japaitonParser.IdOrStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#idOrString}.
	 * @param ctx the parse tree
	 */
	void exitIdOrString(japaitonParser.IdOrStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#expressoesDeclaracao}.
	 * @param ctx the parse tree
	 */
	void enterExpressoesDeclaracao(japaitonParser.ExpressoesDeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#expressoesDeclaracao}.
	 * @param ctx the parse tree
	 */
	void exitExpressoesDeclaracao(japaitonParser.ExpressoesDeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#listaExpressoes}.
	 * @param ctx the parse tree
	 */
	void enterListaExpressoes(japaitonParser.ListaExpressoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#listaExpressoes}.
	 * @param ctx the parse tree
	 */
	void exitListaExpressoes(japaitonParser.ListaExpressoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#condicao}.
	 * @param ctx the parse tree
	 */
	void enterCondicao(japaitonParser.CondicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#condicao}.
	 * @param ctx the parse tree
	 */
	void exitCondicao(japaitonParser.CondicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#expressoes}.
	 * @param ctx the parse tree
	 */
	void enterExpressoes(japaitonParser.ExpressoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#expressoes}.
	 * @param ctx the parse tree
	 */
	void exitExpressoes(japaitonParser.ExpressoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#expressaoString}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoString(japaitonParser.ExpressaoStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#expressaoString}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoString(japaitonParser.ExpressaoStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#expressaoLogica}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoLogica(japaitonParser.ExpressaoLogicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#expressaoLogica}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoLogica(japaitonParser.ExpressaoLogicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#operadoresLogicos}.
	 * @param ctx the parse tree
	 */
	void enterOperadoresLogicos(japaitonParser.OperadoresLogicosContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#operadoresLogicos}.
	 * @param ctx the parse tree
	 */
	void exitOperadoresLogicos(japaitonParser.OperadoresLogicosContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#expressaoIgualdade}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoIgualdade(japaitonParser.ExpressaoIgualdadeContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#expressaoIgualdade}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoIgualdade(japaitonParser.ExpressaoIgualdadeContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#operadorIgualdade}.
	 * @param ctx the parse tree
	 */
	void enterOperadorIgualdade(japaitonParser.OperadorIgualdadeContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#operadorIgualdade}.
	 * @param ctx the parse tree
	 */
	void exitOperadorIgualdade(japaitonParser.OperadorIgualdadeContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoRelacional(japaitonParser.ExpressaoRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoRelacional(japaitonParser.ExpressaoRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#operadorGrandeza}.
	 * @param ctx the parse tree
	 */
	void enterOperadorGrandeza(japaitonParser.OperadorGrandezaContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#operadorGrandeza}.
	 * @param ctx the parse tree
	 */
	void exitOperadorGrandeza(japaitonParser.OperadorGrandezaContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#expressaoGrandeza}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoGrandeza(japaitonParser.ExpressaoGrandezaContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#expressaoGrandeza}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoGrandeza(japaitonParser.ExpressaoGrandezaContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#operadorAditivo}.
	 * @param ctx the parse tree
	 */
	void enterOperadorAditivo(japaitonParser.OperadorAditivoContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#operadorAditivo}.
	 * @param ctx the parse tree
	 */
	void exitOperadorAditivo(japaitonParser.OperadorAditivoContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#expressaoMultiplicativa}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoMultiplicativa(japaitonParser.ExpressaoMultiplicativaContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#expressaoMultiplicativa}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoMultiplicativa(japaitonParser.ExpressaoMultiplicativaContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#operadorMultiplicativo}.
	 * @param ctx the parse tree
	 */
	void enterOperadorMultiplicativo(japaitonParser.OperadorMultiplicativoContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#operadorMultiplicativo}.
	 * @param ctx the parse tree
	 */
	void exitOperadorMultiplicativo(japaitonParser.OperadorMultiplicativoContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#expressaoNegativa}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoNegativa(japaitonParser.ExpressaoNegativaContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#expressaoNegativa}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoNegativa(japaitonParser.ExpressaoNegativaContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#operadorNegacao}.
	 * @param ctx the parse tree
	 */
	void enterOperadorNegacao(japaitonParser.OperadorNegacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#operadorNegacao}.
	 * @param ctx the parse tree
	 */
	void exitOperadorNegacao(japaitonParser.OperadorNegacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#expressaoPrimaria}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoPrimaria(japaitonParser.ExpressaoPrimariaContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#expressaoPrimaria}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoPrimaria(japaitonParser.ExpressaoPrimariaContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#chamadaFuncao}.
	 * @param ctx the parse tree
	 */
	void enterChamadaFuncao(japaitonParser.ChamadaFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#chamadaFuncao}.
	 * @param ctx the parse tree
	 */
	void exitChamadaFuncao(japaitonParser.ChamadaFuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#listaArgumentos}.
	 * @param ctx the parse tree
	 */
	void enterListaArgumentos(japaitonParser.ListaArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#listaArgumentos}.
	 * @param ctx the parse tree
	 */
	void exitListaArgumentos(japaitonParser.ListaArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link japaitonParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(japaitonParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link japaitonParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(japaitonParser.TypeContext ctx);
}