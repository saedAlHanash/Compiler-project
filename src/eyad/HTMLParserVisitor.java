// Generated from C:/Users/saed/Desktop/Helpers/Compiler-project/src\HTMLParser.g4 by ANTLR 4.9.1
package eyad;
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
	 * Visit a parse tree produced by {@link HTMLParser#containerHtmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainerHtmlContent(HTMLParser.ContainerHtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElement(HTMLParser.HtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlStructure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlStructure(HTMLParser.HtmlStructureContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContent(HTMLParser.HtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#attributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeValue(HTMLParser.AttributeValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttribute(HTMLParser.HtmlAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#cpAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCpAttribute(HTMLParser.CpAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#cp_show}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCp_show(HTMLParser.Cp_showContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#cp_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCp_for(HTMLParser.Cp_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#cp_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCp_if(HTMLParser.Cp_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#cp_hide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCp_hide(HTMLParser.Cp_hideContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#cp_switch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCp_switch(HTMLParser.Cp_switchContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#cp_switch_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCp_switch_case(HTMLParser.Cp_switch_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#cp_switchDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCp_switchDefault(HTMLParser.Cp_switchDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent(HTMLParser.EventContext ctx);
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
	 * Visit a parse tree produced by {@link HTMLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(HTMLParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#binding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinding(HTMLParser.BindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#binding_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinding_exp(HTMLParser.Binding_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#bindingPipe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBindingPipe(HTMLParser.BindingPipeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#expr_Bin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_Bin(HTMLParser.Expr_BinContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#value_Bin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_Bin(HTMLParser.Value_BinContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#for_ExprFirst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_ExprFirst(HTMLParser.For_ExprFirstContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#for_ExprSecond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_ExprSecond(HTMLParser.For_ExprSecondContext ctx);
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
	 * Visit a parse tree produced by {@link HTMLParser#afterSemiColonn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAfterSemiColonn(HTMLParser.AfterSemiColonnContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#constt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstt(HTMLParser.ConsttContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#constOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstOperation(HTMLParser.ConstOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#constSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstSide(HTMLParser.ConstSideContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#simple_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_var(HTMLParser.Simple_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#dotVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotVar(HTMLParser.DotVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(HTMLParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#boolen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolen(HTMLParser.BoolenContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#booleanSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanSide(HTMLParser.BooleanSideContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#logic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic(HTMLParser.LogicContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#logicSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicSide(HTMLParser.LogicSideContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#mathOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathOperation(HTMLParser.MathOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#operationSideWithPlusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationSideWithPlusMinus(HTMLParser.OperationSideWithPlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#operationSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationSide(HTMLParser.OperationSideContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#operationSideWithDivMultRemain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationSideWithDivMultRemain(HTMLParser.OperationSideWithDivMultRemainContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#operationElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationElement(HTMLParser.OperationElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#anotherObj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnotherObj(HTMLParser.AnotherObjContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#objectt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectt(HTMLParser.ObjecttContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#expr_object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_object(HTMLParser.Expr_objectContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#one_line_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOne_line_condition(HTMLParser.One_line_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#one_line_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOne_line_exp(HTMLParser.One_line_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(HTMLParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#anotherArrayElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnotherArrayElement(HTMLParser.AnotherArrayElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#arrayElementExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayElementExp(HTMLParser.ArrayElementExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#arrayIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayIndex(HTMLParser.ArrayIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#array_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_element(HTMLParser.Array_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(HTMLParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#function_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_expr(HTMLParser.Function_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#functionParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameter(HTMLParser.FunctionParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#anotherFunctionParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnotherFunctionParameter(HTMLParser.AnotherFunctionParameterContext ctx);
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