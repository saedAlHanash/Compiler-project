package ast.visitor;


import ast.nodes.*;
import ast.nodes.For.*;
import ast.nodes.Switch.NgSwitch;
import ast.nodes.Switch.NgSwitchCase;
import ast.nodes.Switch.NgSwitchDefault;
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
    public HtmlElements visitHtmlElements(HTMLParser.HtmlElementsContext ctx) {
        HtmlElements htmlElements = new HtmlElements();
        if (ctx != null)
            htmlElements.setHtmlElement(visitHtmlElement(ctx.htmlElement()));
        return htmlElements;
    }

    @Override
    public HTMLElement visitHtmlElement(HTMLParser.HtmlElementContext ctx) {
        HTMLElement htmlElement = new HTMLElement();
        if (ctx != null) {
            if (ctx.TAG_NAME(0) != null)
                htmlElement.setTagName(ctx.TAG_NAME(0).getText());
            if (ctx.TAG_OPEN(0) != null)
                htmlElement.setTagOpen(ctx.TAG_OPEN(0).getText());

            if (ctx.htmlContent() != null)
                htmlElement.setHtmlContent(visitHtmlContent(ctx.htmlContent()));

            for (int i = 0; i < ctx.elementAttribute().size(); i++) {
                htmlElement.getElementAttributes().add(visitElementAttribute(ctx.elementAttribute(i)));
            }
        }


        return htmlElement;
    }

    @Override
    public HtmlContent visitHtmlContent(HTMLParser.HtmlContentContext ctx) {
        HtmlContent htmlContent = new HtmlContent();
        if (ctx != null) {
            for (int i = 0; i < ctx.htmlElement().size(); i++) {
                htmlContent.getListHtmlElement().add(visitHtmlElement(ctx.htmlElement(i)));
            }
            if (ctx.htmlChardata(0) != null)
                htmlContent.setHtmlChardata(visitHtmlChardata(ctx.htmlChardata(0)));
        }

        return htmlContent;
    }

    @Override
    public ElementAttribute visitElementAttribute(HTMLParser.ElementAttributeContext ctx) {
        ElementAttribute elementAttribute = new ElementAttribute();
        if (ctx != null)
            elementAttribute.setNgAttribute(visitNgAttribute(ctx.ngAttribute()));
        return elementAttribute;
    }

    @Override
    public NgAttribute visitNgAttribute(HTMLParser.NgAttributeContext ctx) {
        NgAttribute ngAttribute = new NgAttribute();
        if (ctx != null) {
            if (ctx.ng_for() != null)
                ngAttribute.setNgFor(visitNg_for(ctx.ng_for()));
            if (ctx.ng_switch() != null)
                ngAttribute.setNgSwitch(visitNg_switch(ctx.ng_switch()));
            if (ctx.ng_switch_case() != null)
                ngAttribute.setNgSwitchCase(visitNg_switch_case(ctx.ng_switch_case()));
            if (ctx.ng_switch_default() != null)
                ngAttribute.setNgSwitchDefault(visitNg_switch_default(ctx.ng_switch_default()));
        }

        return ngAttribute;
    }

    @Override
    public NgSwitchDefault visitNg_switch_default(HTMLParser.Ng_switch_defaultContext ctx) {
        NgSwitchDefault ngSwitchDefault = new NgSwitchDefault();
        if (ctx != null) {
            ngSwitchDefault.setDefaultt(ctx.NG_SWITCH_DEFAULT().getText());
        }
        return ngSwitchDefault;
    }

    @Override
    public NgSwitchCase visitNg_switch_case(HTMLParser.Ng_switch_caseContext ctx) {
        NgSwitchCase ngSwitchCase = new NgSwitchCase();
        if (ctx != null) {
            ngSwitchCase.setNgSwitch(ctx.NG_SWITCH_CASE().getText());
            ngSwitchCase.setNot(ctx.NOT().getText());
            ngSwitchCase.setqOpen(ctx.Q_OPEN().getText());
            ngSwitchCase.setqClose(ctx.Q_CLOSE().getText());
            ngSwitchCase.setVar(visitVar(ctx.var()));
            if (ctx.constt() != null)
                ngSwitchCase.setConstt(visitConstt(ctx.constt()));
        }

        return ngSwitchCase;
    }

    @Override
    public HtmlChardata visitHtmlChardata(HTMLParser.HtmlChardataContext ctx) {
        HtmlChardata htmlChardata = new HtmlChardata();
        if (ctx != null) {
            if (ctx.HTML_TEXT() != null)
                htmlChardata.setText(ctx.HTML_TEXT().getText());
        }

        return htmlChardata;
    }

    @Override
    public NgSwitch visitNg_switch(HTMLParser.Ng_switchContext ctx) {
        NgSwitch ngSwitch = new NgSwitch();
        if (ctx != null) {
            ngSwitch.setNgSwitch(ctx.NG_SWITCH().getText());
            ngSwitch.setNot(ctx.NOT().getText());
            ngSwitch.setqOpen(ctx.Q_OPEN().getText());
            ngSwitch.setqClose(ctx.Q_CLOSE().getText());
            if (ctx.var() != null)
                ngSwitch.setVar(visitVar(ctx.var()));
        }

        return ngSwitch;
    }

    @Override
    public NgFor visitNg_for(HTMLParser.Ng_forContext ctx) {

        NgFor ngFor = new NgFor();
        if (ctx != null) {
            ngFor.setNOT(ctx.NOT().getText());
            ngFor.setNG_FOR(ctx.NG_FOR().getText());
            ngFor.setQ_CLOSE(ctx.Q_CLOSE().getText());
            ngFor.setQ_OPEN(ctx.Q_OPEN().getText());
            if (ctx.forExpressionFirst() != null)
                ngFor.setForExpressionFirst(visitForExpressionFirst(ctx.forExpressionFirst()));
            if (ctx.forExpressionSecund() != null)
                ngFor.setForExpressionSecond(visitForExpressionSecund(ctx.forExpressionSecund()));
        }

        return ngFor;
    }

    @Override
    public ForExpressionFirst visitForExpressionFirst(HTMLParser.ForExpressionFirstContext ctx) {

        ForExpressionFirst forExpressionFirst = new ForExpressionFirst();
        if (ctx != null) {
            if (ctx.afterIN() != null)
                forExpressionFirst.setAfterIN(visitAfterIN(ctx.afterIN()));
            if (ctx.beforIN() != null)
                forExpressionFirst.setBeforIN(visitBeforIN(ctx.beforIN()));
            forExpressionFirst.setIn(ctx.IN().getText());
        }

        return forExpressionFirst;
    }

    @Override
    public ForExpressionSecond visitForExpressionSecund(HTMLParser.ForExpressionSecundContext ctx) {
        ForExpressionSecond forExpressionSecond = new ForExpressionSecond();

        if (ctx != null) {
            if (ctx.afterIN() != null)
                forExpressionSecond.setAfterIN(visitAfterIN(ctx.afterIN()));
            if (ctx.beforIN() != null)
                forExpressionSecond.setBeforIN(visitBeforIN(ctx.beforIN()));
            forExpressionSecond.setIn(ctx.IN().getText());
            if (ctx.semiColonn() != null)
                forExpressionSecond.setSemiColumn(visitSemiColonn(ctx.semiColonn()));
        }


        return forExpressionSecond;
    }

    @Override
    public SemiColumn visitSemiColonn(HTMLParser.SemiColonnContext ctx) {
        SemiColumn semiColumn = new SemiColumn();
        if (ctx != null) {
            semiColumn.setEqual(ctx.EQUAL().getText());
            semiColumn.setIndex(ctx.INDEX().getText());
            if (ctx.NUMBER() != null)
                semiColumn.setNumber(ctx.NUMBER().getText());
            if (ctx.SEMICOLONN() != null)
                semiColumn.setSemiColumn(ctx.SEMICOLONN().getText());
            if (ctx.var(0) != null)
                semiColumn.setVar(visitVar(ctx.var(0)));
        }


        return semiColumn;
    }

    @Override
    public BeforIN visitBeforIN(HTMLParser.BeforINContext ctx) {
        BeforIN beforIN = new BeforIN();
        if (ctx.expression() != null)
            beforIN.setExpression(visitExpression(ctx.expression()));
        if (ctx.morVar(0) != null)
            beforIN.setMorVar(visitMorVar(ctx.morVar(0)));
        if (ctx.var() != null)
            beforIN.setVar(visitVar(ctx.var()));
        return beforIN;
    }

    @Override
    public MorVar visitMorVar(HTMLParser.MorVarContext ctx) {
        MorVar morVar = new MorVar();
        if (ctx != null) {
            morVar.setComma(ctx.COMMA().getText());
            if (ctx.var() != null)
                morVar.setVar(visitVar(ctx.var()));
        }

        return morVar;
    }

    @Override
    public AfterIN visitAfterIN(HTMLParser.AfterINContext ctx) {

        AfterIN afterIN = new AfterIN();
        if (ctx.array() != null)
            afterIN.setArray(visitArray(ctx.array()));
        if (ctx.var() != null)
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
            if (ctx.morArrayElement(0)!=null)
            array.setmMorArrayElement(visitMorArrayElement(ctx.morArrayElement(0)));
        }


        return array;
    }

    @Override
    public MorArrayElement visitMorArrayElement(HTMLParser.MorArrayElementContext ctx) {
        MorArrayElement morArrayElement = new MorArrayElement();
        morArrayElement.setComma(ctx.COMMA().getText());
        if (ctx.expression()!=null)
        morArrayElement.setExpression(visitExpression(ctx.expression()));
        return morArrayElement;
    }

    @Override
    public Expression visitExpression(HTMLParser.ExpressionContext ctx) {
        Expression expression = new Expression();

        if (ctx != null) {
            expression.setArray(visitArray(ctx.array()));
            expression.setVar(visitVar(ctx.var()));
            expression.setConstt(visitConstt(ctx.constt()));
        }


        return expression;
    }

    @Override
    public Constt visitConstt(HTMLParser.ConsttContext ctx) {
        Constt constt = new Constt();
        if (ctx != null) {
            constt.setCharr(ctx.OPEN_C().getText());
            constt.setOpen_C(ctx.OPEN_C().getText());
            constt.setClose_C(ctx.CLOSE_C().getText());
            constt.setNumber(ctx.NUMBER().getText());
            constt.setConstt(visitConstt(ctx.constt()));
        }
        return constt;
    }

    @Override
    public Var visitVar(HTMLParser.VarContext ctx) {
        Var var = new Var();

        if (ctx != null) {
            var.setVarName(ctx.VARNAME().getText());

            for (int i = 0; i < ctx.dotVar().size(); i++) {
                var.getDotVar().add(visitDotVar(ctx.dotVar(i)));
            }
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
