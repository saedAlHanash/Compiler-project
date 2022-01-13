package ast.nodes;

public class HtmlChardata {
    String text;

    @Override
    public String toString() {
        return "HtmlChardata{" +
                "text='" + text + '\'' +
                '}'+"\n";
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
