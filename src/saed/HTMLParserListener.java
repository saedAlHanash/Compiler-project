// Generated from C:/Users/saed/Desktop/Helpers/Compiler-project/src\HTMLParser.g4 by ANTLR 4.9.1
package saed;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HTMLParser}.
 */
public interface HTMLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void enterHtmlDocument(HTMLParser.HtmlDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void exitHtmlDocument(HTMLParser.HtmlDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#scriptletOrSeaWs}.
	 * @param ctx the parse tree
	 */
	void enterScriptletOrSeaWs(HTMLParser.ScriptletOrSeaWsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#scriptletOrSeaWs}.
	 * @param ctx the parse tree
	 */
	void exitScriptletOrSeaWs(HTMLParser.ScriptletOrSeaWsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlElements}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElements(HTMLParser.HtmlElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlElements}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElements(HTMLParser.HtmlElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#elementAttribute}.
	 * @param ctx the parse tree
	 */
	void enterElementAttribute(HTMLParser.ElementAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#elementAttribute}.
	 * @param ctx the parse tree
	 */
	void exitElementAttribute(HTMLParser.ElementAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(HTMLParser.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(HTMLParser.HtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent(HTMLParser.HtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent(HTMLParser.HtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttribute(HTMLParser.HtmlAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttribute(HTMLParser.HtmlAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#ngAttribute}.
	 * @param ctx the parse tree
	 */
	void enterNgAttribute(HTMLParser.NgAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#ngAttribute}.
	 * @param ctx the parse tree
	 */
	void exitNgAttribute(HTMLParser.NgAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#ng_for}.
	 * @param ctx the parse tree
	 */
	void enterNg_for(HTMLParser.Ng_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#ng_for}.
	 * @param ctx the parse tree
	 */
	void exitNg_for(HTMLParser.Ng_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#forExpressionFirst}.
	 * @param ctx the parse tree
	 */
	void enterForExpressionFirst(HTMLParser.ForExpressionFirstContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#forExpressionFirst}.
	 * @param ctx the parse tree
	 */
	void exitForExpressionFirst(HTMLParser.ForExpressionFirstContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#forExpressionSecund}.
	 * @param ctx the parse tree
	 */
	void enterForExpressionSecund(HTMLParser.ForExpressionSecundContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#forExpressionSecund}.
	 * @param ctx the parse tree
	 */
	void exitForExpressionSecund(HTMLParser.ForExpressionSecundContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#beforIN}.
	 * @param ctx the parse tree
	 */
	void enterBeforIN(HTMLParser.BeforINContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#beforIN}.
	 * @param ctx the parse tree
	 */
	void exitBeforIN(HTMLParser.BeforINContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#afterIN}.
	 * @param ctx the parse tree
	 */
	void enterAfterIN(HTMLParser.AfterINContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#afterIN}.
	 * @param ctx the parse tree
	 */
	void exitAfterIN(HTMLParser.AfterINContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(HTMLParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(HTMLParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#dotVar}.
	 * @param ctx the parse tree
	 */
	void enterDotVar(HTMLParser.DotVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#dotVar}.
	 * @param ctx the parse tree
	 */
	void exitDotVar(HTMLParser.DotVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#morVar}.
	 * @param ctx the parse tree
	 */
	void enterMorVar(HTMLParser.MorVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#morVar}.
	 * @param ctx the parse tree
	 */
	void exitMorVar(HTMLParser.MorVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#semiColonn}.
	 * @param ctx the parse tree
	 */
	void enterSemiColonn(HTMLParser.SemiColonnContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#semiColonn}.
	 * @param ctx the parse tree
	 */
	void exitSemiColonn(HTMLParser.SemiColonnContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(HTMLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(HTMLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(HTMLParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(HTMLParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#morArrayElement}.
	 * @param ctx the parse tree
	 */
	void enterMorArrayElement(HTMLParser.MorArrayElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#morArrayElement}.
	 * @param ctx the parse tree
	 */
	void exitMorArrayElement(HTMLParser.MorArrayElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#constt}.
	 * @param ctx the parse tree
	 */
	void enterConstt(HTMLParser.ConsttContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#constt}.
	 * @param ctx the parse tree
	 */
	void exitConstt(HTMLParser.ConsttContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void enterHtmlChardata(HTMLParser.HtmlChardataContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void exitHtmlChardata(HTMLParser.HtmlChardataContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void enterHtmlMisc(HTMLParser.HtmlMiscContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void exitHtmlMisc(HTMLParser.HtmlMiscContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlComment}.
	 * @param ctx the parse tree
	 */
	void enterHtmlComment(HTMLParser.HtmlCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlComment}.
	 * @param ctx the parse tree
	 */
	void exitHtmlComment(HTMLParser.HtmlCommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(HTMLParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(HTMLParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#style}.
	 * @param ctx the parse tree
	 */
	void enterStyle(HTMLParser.StyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#style}.
	 * @param ctx the parse tree
	 */
	void exitStyle(HTMLParser.StyleContext ctx);
}