package ast.nodes;

import java.util.ArrayList;

public class HtmlContent {
    ArrayList<HTMLElement> ListHtmlElement = new ArrayList<>();
    HtmlChardata htmlChardata;

    @Override
    public String toString() {
        return "HtmlContent{" +
                "ListHtmlElement=" + ListHtmlElement +
                ", htmlChardata=" + htmlChardata +
                '}'+"\n";
    }

    public HtmlChardata getHtmlChardata() {
        return htmlChardata;
    }

    public void setHtmlChardata(HtmlChardata htmlChardata) {
        this.htmlChardata = htmlChardata;
    }

    public ArrayList<HTMLElement> getListHtmlElement() {
        return ListHtmlElement;
    }

    public void setListHtmlElement(ArrayList<HTMLElement> listHtmlElement) {
        ListHtmlElement = listHtmlElement;
    }
}
