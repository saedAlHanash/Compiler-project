package ast.visitor;


import ast.nodes.*;
import ast.nodes.For.*;
import saed.HTMLParser;
import saed.HTMLParserBaseVisitor;

public class BaseVisitor extends HTMLParserBaseVisitor {


    @Override
    public HtmlDocument visitHtmlDocument(HTMLParser.HtmlDocumentContext ctx) {
        HtmlDocument htmlDocument = new HtmlDocument();
        for (int i = 0; i < ctx.htmlElements().size(); i++) {
            htmlDocument.getElements().add(visitHtmlElements(ctx.htmlElements(i)));
        }
        return htmlDocument;
    }

    @Override
    public HTMLElement visitHtmlElements(HTMLParser.HtmlElementsContext ctx) {
        return visitHtmlElement(ctx.htmlElement());
    }

    @Override
    public HTMLElement visitHtmlElement(HTMLParser.HtmlElementContext ctx) {
        HTMLElement htmlElement = new HTMLElement();
        htmlElement.setTagName(ctx.TAG_NAME(0).getText());
        htmlElement.setTagOpen(ctx.TAG_OPEN(0).getText());

        for (int i = 0; i < ctx.elementAttribute().size(); i++) {
            htmlElement.getAttributes().add(visitElementAttribute(ctx.elementAttribute(i)));
        }

        return htmlElement;
    }

    @Override
    public ElementAttribute visitElementAttribute(HTMLParser.ElementAttributeContext ctx) {
        ElementAttribute elementAttribute = new ElementAttribute();
        elementAttribute.setNgAttribute(visitNgAttribute(ctx.ngAttribute()));
        return elementAttribute;
    }

    @Override
    public NgAttribute visitNgAttribute(HTMLParser.NgAttributeContext ctx) {
        NgAttribute ngAttribute = new NgAttribute();
        ngAttribute.setNgFor(visitNg_for(ctx.ng_for()));
        return ngAttribute;
    }

    @Override
    public NgFor visitNg_for(HTMLParser.Ng_forContext ctx) {

        NgFor ngFor = new NgFor();

        ngFor.setNOT(ctx.NOT().getText());
        ngFor.setNG_FOR(ctx.NG_FOR().getText());
        ngFor.setQ_CLOSE(ctx.Q_CLOSE().getText());
        ngFor.setQ_OPEN(ctx.Q_OPEN().getText());
        ngFor.setForExpressionFirst(visitForExpressionFirst(ctx.forExpressionFirst()));
        ngFor.setForExpressionSecond(visitForExpressionSecund(ctx.forExpressionSecund()));

    /*    ngFor.setNOT(ctx.NOT().getText());
       ngFor.setNG_FOR(ctx.NG_FOR().getText());
       ngFor.setQ_CLOSE(ctx.Q_CLOSE().getText());
       ngFor.setQ_OPEN(ctx.Q_OPEN().getText());*/
        return ngFor;
    }

    @Override
    public ForExpressionFirst visitForExpressionFirst(HTMLParser.ForExpressionFirstContext ctx) {

        ForExpressionFirst forExpressionFirst = new ForExpressionFirst();
        if (ctx!=null){
            forExpressionFirst.setAfterIN(visitAfterIN(ctx.afterIN()));
            forExpressionFirst.setBeforIN(visitBeforIN(ctx.beforIN()));
            forExpressionFirst.setIn(ctx.IN().getText());
        }

        return forExpressionFirst;
    }

    @Override
    public ForExpressionSecond visitForExpressionSecund(HTMLParser.ForExpressionSecundContext ctx) {
        ForExpressionSecond forExpressionSecond = new ForExpressionSecond();

        if (ctx!=null){
            forExpressionSecond.setAfterIN(visitAfterIN(ctx.afterIN()));
            forExpressionSecond.setBeforIN(visitBeforIN(ctx.beforIN()));
            forExpressionSecond.setIn(ctx.IN().getText());
            forExpressionSecond.setSemiColumn(visitSemiColonn(ctx.semiColonn()));
        }


        return forExpressionSecond;
    }

    @Override
    public SemiColumn visitSemiColonn(HTMLParser.SemiColonnContext ctx) {
        SemiColumn semiColumn = new SemiColumn();
        if (ctx!=null){
            semiColumn.setEqual(ctx.EQUAL().getText());
            semiColumn.setIndex(ctx.INDEX().getText());
            if (ctx.NUMBER()!=null)
            semiColumn.setNumber(ctx.NUMBER().getText());
            if (ctx.SEMICOLONN()!=null)
            semiColumn.setSemiColumn(ctx.SEMICOLONN().getText());
            semiColumn.setVar(visitVar(ctx.var(0)));
        }


        return semiColumn;
    }

    @Override
    public BeforIN visitBeforIN(HTMLParser.BeforINContext ctx) {
        BeforIN beforIN = new BeforIN();
        beforIN.setExpression(visitExpression(ctx.expression()));
        beforIN.setMorVar(visitMorVar(ctx.morVar(0)));
        beforIN.setVar(visitVar(ctx.var()));
        return beforIN;
    }

    @Override
    public MorVar visitMorVar(HTMLParser.MorVarContext ctx) {
        MorVar morVar = new MorVar();
        if (ctx!=null){
            morVar.setComma(ctx.COMMA().getText());
            morVar.setVar(visitVar(ctx.var()));
        }

        return morVar;
    }

    @Override
    public AfterIN visitAfterIN(HTMLParser.AfterINContext ctx) {

        AfterIN afterIN = new AfterIN();
        afterIN.setArray(visitArray(ctx.array()));
        afterIN.setVar(visitVar(ctx.var()));
        return afterIN;
    }

    @Override
    public Array visitArray(HTMLParser.ArrayContext ctx) {
        Array array = new Array();

        if (array != null && ctx != null) {
            array.setArray(visitArray(ctx.array()));
            array.setArrayTagClose(ctx.ARRAY_TAG_CLOSE().getText());
            array.setArrayTagOpen(ctx.ARRAY_TAG_OPEN().getText());
            array.setExpression(visitExpression(ctx.expression()));
            array.setmMorArrayElement(visitMorArrayElement(ctx.morArrayElement(0)));
        }


        return array;
    }

    @Override
    public MorArrayElement visitMorArrayElement(HTMLParser.MorArrayElementContext ctx) {
        MorArrayElement morArrayElement = new MorArrayElement();
        morArrayElement.setComma(ctx.COMMA().getText());
        morArrayElement.setExpression(visitExpression(ctx.expression()));
        return morArrayElement;
    }

    @Override
    public Expression visitExpression(HTMLParser.ExpressionContext ctx) {
        Expression expression = new Expression();

        if (ctx!=null){
            expression.setArray(visitArray(ctx.array()));
            expression.setVar(visitVar(ctx.var()));
        }


        return expression;
    }

    @Override
    public Var visitVar(HTMLParser.VarContext ctx) {
        Var var = new Var();
        var.setVarName(ctx.VARNAME().getText());

        for (int i = 0; i < ctx.dotVar().size(); i++) {
            var.getDotVar().add(visitDotVar(ctx.dotVar(i)));
        }
        return var;
    }

    @Override
    public DotVar visitDotVar(HTMLParser.DotVarContext ctx) {
        DotVar dotVar = new DotVar();
        dotVar.setDot(ctx.DOT().getText());
        dotVar.setVar(visitVar(ctx.var()));
        return dotVar;
    }
    /*
    @Override
    public HtmlDocument visitHtmlDocument(HTMLParser.HtmlDocumentContext ctx) {
        HtmlDocument htmlDocument = new HtmlDocument();

        for (int i = 0; i < ctx.htmlEYad().size(); i++) {
            htmlDocument.getElements().add(visitHtmlEYad(ctx.htmlEYad(i)));
        }

        return htmlDocument;
    }

    @Override
    public Object visitScriptletOrSeaWs(HTMLParser.ScriptletOrSeaWsContext ctx) {
        return super.visitScriptletOrSeaWs(ctx);
    }

    @Override
    public HTMLElement visitHtmlEYad(HTMLParser.HtmlEYadContext ctx) {
        HTMLElement htmlElement = new HTMLElement();

        htmlElement.getAttributes().add(visitHtmlAttribute(ctx.htmlElement().htmlAttribute(0)));
        return htmlElement;
    }

    @Override
    public Object visitHtmlElement(HTMLParser.HtmlElementContext ctx) {
        return super.visitHtmlElement(ctx);
    }

    @Override
    public Object visitHtmlContent(HTMLParser.HtmlContentContext ctx) {
        return super.visitHtmlContent(ctx);
    }

    @Override
    public Attribute visitHtmlAttribute(HTMLParser.HtmlAttributeContext ctx) {
        return new Attribute();
    }

    @Override
    public Object visitHtmlChardata(HTMLParser.HtmlChardataContext ctx) {
        return super.visitHtmlChardata(ctx);
    }

    @Override
    public Object visitHtmlMisc(HTMLParser.HtmlMiscContext ctx) {
        return super.visitHtmlMisc(ctx);
    }

    @Override
    public Object visitHtmlComment(HTMLParser.HtmlCommentContext ctx) {
        return super.visitHtmlComment(ctx);
    }

    @Override
    public Object visitScript(HTMLParser.ScriptContext ctx) {
        return super.visitScript(ctx);
    }

    @Override
    public Object visitStyle(HTMLParser.StyleContext ctx) {
        return super.visitStyle(ctx);
    }

    @Override
    public Object visit(ParseTree tree) {
        return super.visit(tree);
    }

    @Override
    public Object visitChildren(RuleNode node) {
        return super.visitChildren(node);
    }

    @Override
    public Object visitTerminal(TerminalNode node) {
        return super.visitTerminal(node);
    }

    @Override
    public Object visitErrorNode(ErrorNode node) {
        return super.visitErrorNode(node);
    }

    @Override
    protected Object defaultResult() {
        return super.defaultResult();
    }

    @Override
    protected Object aggregateResult(Object aggregate, Object nextResult) {
        return super.aggregateResult(aggregate, nextResult);
    }

    @Override
    protected boolean shouldVisitNextChild(RuleNode node, Object currentResult) {
        return super.shouldVisitNextChild(node, currentResult);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }*/
}
