package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class HTMLElement extends Node{

    private List<ElementAttribute> elementAttributes = new ArrayList<>();
    HtmlContent htmlContent;

    private String tagName;
    private String tagOpen;


    public List<ElementAttribute> getElementAttributes() {
        return elementAttributes;
    }

    public void setElementAttributes(List<ElementAttribute> elementAttributes) {
        this.elementAttributes = elementAttributes;
    }

    public HtmlContent getHtmlContent() {
        return htmlContent;
    }

    public void setHtmlContent(HtmlContent htmlContent) {
        this.htmlContent = htmlContent;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getTagOpen() {
        return tagOpen;
    }

    public void setTagOpen(String tagOpen) {
        this.tagOpen = tagOpen;
    }

    @Override
    public String toString() {
        return "HTMLElement{" +
                "elementAttributes=" + elementAttributes +
                ", htmlContent=" + htmlContent +
                ", tagName='" + tagName + '\'' +
                ", tagOpen='" + tagOpen + '\'' +
                '}'+"\n";    }
}
