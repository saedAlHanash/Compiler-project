package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class HTMLTag extends HTMLElement {
    private String name;
    private List<Attribute> attributes = new ArrayList<Attribute>();
    private List<HTMLElement> content = new ArrayList<HTMLElement>();
    private String textContent;


    public void setContent(List<HTMLElement> content) {
        this.content = content;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    public String getName() {
        return name;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public List<HTMLElement> getContent() {
        return content;
    }

    public String getTextContent() {
        return textContent;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    @Override
    public String toString(){
        return "tag name: "+ getName() + "\n \t" + "content: " + getTextContent();
    }

}

