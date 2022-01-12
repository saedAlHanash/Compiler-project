// Generated from C:/Users/saed/Desktop/Helpers/Compiler-project/src\HTMLParser.g4 by ANTLR 4.9.1
package saed;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HTMLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HTMLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlDocument(HTMLParser.HtmlDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#scriptletOrSeaWs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptletOrSeaWs(HTMLParser.ScriptletOrSeaWsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElements(HTMLParser.HtmlElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#elementAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementAttribute(HTMLParser.ElementAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElement(HTMLParser.HtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContent(HTMLParser.HtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttribute(HTMLParser.HtmlAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#ngAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgAttribute(HTMLParser.NgAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#ng_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNg_for(HTMLParser.Ng_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#forExpressionFirst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForExpressionFirst(HTMLParser.ForExpressionFirstContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#forExpressionSecund}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForExpressionSecund(HTMLParser.ForExpressionSecundContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#beforIN}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeforIN(HTMLParser.BeforINContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#afterIN}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAfterIN(HTMLParser.AfterINContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(HTMLParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#dotVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotVar(HTMLParser.DotVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#morVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMorVar(HTMLParser.MorVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#semiColonn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemiColonn(HTMLParser.SemiColonnContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(HTMLParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(HTMLParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#morArrayElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMorArrayElement(HTMLParser.MorArrayElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#constt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstt(HTMLParser.ConsttContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlChardata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlChardata(HTMLParser.HtmlChardataContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlMisc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlMisc(HTMLParser.HtmlMiscContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlComment(HTMLParser.HtmlCommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(HTMLParser.ScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#style}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyle(HTMLParser.StyleContext ctx);
}