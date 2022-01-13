package ast.nodes;

import java.util.ArrayList;

public class HtmlElements {
    HTMLElement htmlElement;

    @Override
    public String toString() {
        return "HtmlElements{" +
                "htmlElement=" + htmlElement +
                '}'+"\n";
    }

    public HTMLElement getHtmlElement() {
        return htmlElement;
    }

    public void setHtmlElement(HTMLElement htmlElement) {
        this.htmlElement = htmlElement;
    }
}
