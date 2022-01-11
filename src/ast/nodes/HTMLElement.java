package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class HTMLElement extends Node{
    private List<Attribute> attributes = new ArrayList<>();

    private String tagName;
    private String tagValue;

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getTagValue() {
        return tagValue;
    }

    public void setTagValue(String tagValue) {
        this.tagValue = tagValue;
    }

    @Override
    public String toString() {
        return "HTMLElement{" +
                "attributes=" + attributes +
                ", tagName='" + tagName + '\'' +
                ", tagValue='" + tagValue + '\'' +
                '}';
    }
}
