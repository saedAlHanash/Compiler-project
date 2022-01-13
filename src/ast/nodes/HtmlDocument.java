package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class HtmlDocument extends Node {

    private List<HtmlElements> elements = new ArrayList<HtmlElements>();

    @Override
    public String toString() {
        return "HtmlDocument{" +
                "elements=" + elements +
                '}'+"\n";
    }

    public List<HtmlElements> getElements() {
        return elements;
    }

    public void setElements(List<HtmlElements> elements) {
        this.elements = elements;
    }
}
