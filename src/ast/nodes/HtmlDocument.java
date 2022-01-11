package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class HtmlDocument extends Node {
    private List<HTMLElement> elements = new ArrayList<HTMLElement>();

    public void setElements(List<HTMLElement> elements) {
        this.elements = elements;
    }

    public List<HTMLElement> getElements() {
        return elements;
    }

    @Override
    public String toString() {
        return "HtmlDocument{" +
                "elements=" + elements +
                '}';
    }
}
