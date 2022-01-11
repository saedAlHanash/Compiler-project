// Generated from C:/Users/saed/Desktop/Helpers/Compiler-project/src\HTMLParser.g4 by ANTLR 4.9.1
package eyad;
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
	 * Enter a parse tree produced by {@link HTMLParser#containerHtmlContent}.
	 * @param ctx the parse tree
	 */
	void enterContainerHtmlContent(HTMLParser.ContainerHtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#containerHtmlContent}.
	 * @param ctx the parse tree
	 */
	void exitContainerHtmlContent(HTMLParser.ContainerHtmlContentContext ctx);
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
	 * Enter a parse tree produced by {@link HTMLParser#htmlStructure}.
	 * @param ctx the parse tree
	 */
	void enterHtmlStructure(HTMLParser.HtmlStructureContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlStructure}.
	 * @param ctx the parse tree
	 */
	void exitHtmlStructure(HTMLParser.HtmlStructureContext ctx);
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
	 * Enter a parse tree produced by {@link HTMLParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void enterAttributeValue(HTMLParser.AttributeValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void exitAttributeValue(HTMLParser.AttributeValueContext ctx);
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
	 * Enter a parse tree produced by {@link HTMLParser#cpAttribute}.
	 * @param ctx the parse tree
	 */
	void enterCpAttribute(HTMLParser.CpAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#cpAttribute}.
	 * @param ctx the parse tree
	 */
	void exitCpAttribute(HTMLParser.CpAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#cp_show}.
	 * @param ctx the parse tree
	 */
	void enterCp_show(HTMLParser.Cp_showContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#cp_show}.
	 * @param ctx the parse tree
	 */
	void exitCp_show(HTMLParser.Cp_showContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#cp_for}.
	 * @param ctx the parse tree
	 */
	void enterCp_for(HTMLParser.Cp_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#cp_for}.
	 * @param ctx the parse tree
	 */
	void exitCp_for(HTMLParser.Cp_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#cp_if}.
	 * @param ctx the parse tree
	 */
	void enterCp_if(HTMLParser.Cp_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#cp_if}.
	 * @param ctx the parse tree
	 */
	void exitCp_if(HTMLParser.Cp_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#cp_hide}.
	 * @param ctx the parse tree
	 */
	void enterCp_hide(HTMLParser.Cp_hideContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#cp_hide}.
	 * @param ctx the parse tree
	 */
	void exitCp_hide(HTMLParser.Cp_hideContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#cp_switch}.
	 * @param ctx the parse tree
	 */
	void enterCp_switch(HTMLParser.Cp_switchContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#cp_switch}.
	 * @param ctx the parse tree
	 */
	void exitCp_switch(HTMLParser.Cp_switchContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#cp_switch_case}.
	 * @param ctx the parse tree
	 */
	void enterCp_switch_case(HTMLParser.Cp_switch_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#cp_switch_case}.
	 * @param ctx the parse tree
	 */
	void exitCp_switch_case(HTMLParser.Cp_switch_caseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#cp_switchDefault}.
	 * @param ctx the parse tree
	 */
	void enterCp_switchDefault(HTMLParser.Cp_switchDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#cp_switchDefault}.
	 * @param ctx the parse tree
	 */
	void exitCp_switchDefault(HTMLParser.Cp_switchDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#event}.
	 * @param ctx the parse tree
	 */
	void enterEvent(HTMLParser.EventContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#event}.
	 * @param ctx the parse tree
	 */
	void exitEvent(HTMLParser.EventContext ctx);
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
	 * Enter a parse tree produced by {@link HTMLParser#binding}.
	 * @param ctx the parse tree
	 */
	void enterBinding(HTMLParser.BindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#binding}.
	 * @param ctx the parse tree
	 */
	void exitBinding(HTMLParser.BindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#binding_exp}.
	 * @param ctx the parse tree
	 */
	void enterBinding_exp(HTMLParser.Binding_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#binding_exp}.
	 * @param ctx the parse tree
	 */
	void exitBinding_exp(HTMLParser.Binding_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#bindingPipe}.
	 * @param ctx the parse tree
	 */
	void enterBindingPipe(HTMLParser.BindingPipeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#bindingPipe}.
	 * @param ctx the parse tree
	 */
	void exitBindingPipe(HTMLParser.BindingPipeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#expr_Bin}.
	 * @param ctx the parse tree
	 */
	void enterExpr_Bin(HTMLParser.Expr_BinContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#expr_Bin}.
	 * @param ctx the parse tree
	 */
	void exitExpr_Bin(HTMLParser.Expr_BinContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#value_Bin}.
	 * @param ctx the parse tree
	 */
	void enterValue_Bin(HTMLParser.Value_BinContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#value_Bin}.
	 * @param ctx the parse tree
	 */
	void exitValue_Bin(HTMLParser.Value_BinContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#for_ExprFirst}.
	 * @param ctx the parse tree
	 */
	void enterFor_ExprFirst(HTMLParser.For_ExprFirstContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#for_ExprFirst}.
	 * @param ctx the parse tree
	 */
	void exitFor_ExprFirst(HTMLParser.For_ExprFirstContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#for_ExprSecond}.
	 * @param ctx the parse tree
	 */
	void enterFor_ExprSecond(HTMLParser.For_ExprSecondContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#for_ExprSecond}.
	 * @param ctx the parse tree
	 */
	void exitFor_ExprSecond(HTMLParser.For_ExprSecondContext ctx);
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
	 * Enter a parse tree produced by {@link HTMLParser#afterSemiColonn}.
	 * @param ctx the parse tree
	 */
	void enterAfterSemiColonn(HTMLParser.AfterSemiColonnContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#afterSemiColonn}.
	 * @param ctx the parse tree
	 */
	void exitAfterSemiColonn(HTMLParser.AfterSemiColonnContext ctx);
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
	 * Enter a parse tree produced by {@link HTMLParser#constOperation}.
	 * @param ctx the parse tree
	 */
	void enterConstOperation(HTMLParser.ConstOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#constOperation}.
	 * @param ctx the parse tree
	 */
	void exitConstOperation(HTMLParser.ConstOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#constSide}.
	 * @param ctx the parse tree
	 */
	void enterConstSide(HTMLParser.ConstSideContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#constSide}.
	 * @param ctx the parse tree
	 */
	void exitConstSide(HTMLParser.ConstSideContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#simple_var}.
	 * @param ctx the parse tree
	 */
	void enterSimple_var(HTMLParser.Simple_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#simple_var}.
	 * @param ctx the parse tree
	 */
	void exitSimple_var(HTMLParser.Simple_varContext ctx);
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
	 * Enter a parse tree produced by {@link HTMLParser#boolen}.
	 * @param ctx the parse tree
	 */
	void enterBoolen(HTMLParser.BoolenContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#boolen}.
	 * @param ctx the parse tree
	 */
	void exitBoolen(HTMLParser.BoolenContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#booleanSide}.
	 * @param ctx the parse tree
	 */
	void enterBooleanSide(HTMLParser.BooleanSideContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#booleanSide}.
	 * @param ctx the parse tree
	 */
	void exitBooleanSide(HTMLParser.BooleanSideContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#logic}.
	 * @param ctx the parse tree
	 */
	void enterLogic(HTMLParser.LogicContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#logic}.
	 * @param ctx the parse tree
	 */
	void exitLogic(HTMLParser.LogicContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#logicSide}.
	 * @param ctx the parse tree
	 */
	void enterLogicSide(HTMLParser.LogicSideContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#logicSide}.
	 * @param ctx the parse tree
	 */
	void exitLogicSide(HTMLParser.LogicSideContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#mathOperation}.
	 * @param ctx the parse tree
	 */
	void enterMathOperation(HTMLParser.MathOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#mathOperation}.
	 * @param ctx the parse tree
	 */
	void exitMathOperation(HTMLParser.MathOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#operationSideWithPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterOperationSideWithPlusMinus(HTMLParser.OperationSideWithPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#operationSideWithPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitOperationSideWithPlusMinus(HTMLParser.OperationSideWithPlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#operationSide}.
	 * @param ctx the parse tree
	 */
	void enterOperationSide(HTMLParser.OperationSideContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#operationSide}.
	 * @param ctx the parse tree
	 */
	void exitOperationSide(HTMLParser.OperationSideContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#operationSideWithDivMultRemain}.
	 * @param ctx the parse tree
	 */
	void enterOperationSideWithDivMultRemain(HTMLParser.OperationSideWithDivMultRemainContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#operationSideWithDivMultRemain}.
	 * @param ctx the parse tree
	 */
	void exitOperationSideWithDivMultRemain(HTMLParser.OperationSideWithDivMultRemainContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#operationElement}.
	 * @param ctx the parse tree
	 */
	void enterOperationElement(HTMLParser.OperationElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#operationElement}.
	 * @param ctx the parse tree
	 */
	void exitOperationElement(HTMLParser.OperationElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#anotherObj}.
	 * @param ctx the parse tree
	 */
	void enterAnotherObj(HTMLParser.AnotherObjContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#anotherObj}.
	 * @param ctx the parse tree
	 */
	void exitAnotherObj(HTMLParser.AnotherObjContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#objectt}.
	 * @param ctx the parse tree
	 */
	void enterObjectt(HTMLParser.ObjecttContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#objectt}.
	 * @param ctx the parse tree
	 */
	void exitObjectt(HTMLParser.ObjecttContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#expr_object}.
	 * @param ctx the parse tree
	 */
	void enterExpr_object(HTMLParser.Expr_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#expr_object}.
	 * @param ctx the parse tree
	 */
	void exitExpr_object(HTMLParser.Expr_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#one_line_condition}.
	 * @param ctx the parse tree
	 */
	void enterOne_line_condition(HTMLParser.One_line_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#one_line_condition}.
	 * @param ctx the parse tree
	 */
	void exitOne_line_condition(HTMLParser.One_line_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#one_line_exp}.
	 * @param ctx the parse tree
	 */
	void enterOne_line_exp(HTMLParser.One_line_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#one_line_exp}.
	 * @param ctx the parse tree
	 */
	void exitOne_line_exp(HTMLParser.One_line_expContext ctx);
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
	 * Enter a parse tree produced by {@link HTMLParser#anotherArrayElement}.
	 * @param ctx the parse tree
	 */
	void enterAnotherArrayElement(HTMLParser.AnotherArrayElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#anotherArrayElement}.
	 * @param ctx the parse tree
	 */
	void exitAnotherArrayElement(HTMLParser.AnotherArrayElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#arrayElementExp}.
	 * @param ctx the parse tree
	 */
	void enterArrayElementExp(HTMLParser.ArrayElementExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#arrayElementExp}.
	 * @param ctx the parse tree
	 */
	void exitArrayElementExp(HTMLParser.ArrayElementExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#arrayIndex}.
	 * @param ctx the parse tree
	 */
	void enterArrayIndex(HTMLParser.ArrayIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#arrayIndex}.
	 * @param ctx the parse tree
	 */
	void exitArrayIndex(HTMLParser.ArrayIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#array_element}.
	 * @param ctx the parse tree
	 */
	void enterArray_element(HTMLParser.Array_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#array_element}.
	 * @param ctx the parse tree
	 */
	void exitArray_element(HTMLParser.Array_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(HTMLParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(HTMLParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#function_expr}.
	 * @param ctx the parse tree
	 */
	void enterFunction_expr(HTMLParser.Function_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#function_expr}.
	 * @param ctx the parse tree
	 */
	void exitFunction_expr(HTMLParser.Function_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#functionParameter}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameter(HTMLParser.FunctionParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#functionParameter}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameter(HTMLParser.FunctionParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#anotherFunctionParameter}.
	 * @param ctx the parse tree
	 */
	void enterAnotherFunctionParameter(HTMLParser.AnotherFunctionParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#anotherFunctionParameter}.
	 * @param ctx the parse tree
	 */
	void exitAnotherFunctionParameter(HTMLParser.AnotherFunctionParameterContext ctx);
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