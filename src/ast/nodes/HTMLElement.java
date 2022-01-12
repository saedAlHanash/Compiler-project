package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class HTMLElement extends Node{
    private List<ElementAttribute> attributes = new ArrayList<>();

    private String tagName;
    private String tagOpen;

    public List<ElementAttribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<ElementAttribute> attributes) {
        this.attributes = attributes;
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
                "attributes=" + attributes +
                ", tagName='" + tagName + '\'' +
                ", tagOpen='" + tagOpen + '\'' +
                '}';
    }
}
