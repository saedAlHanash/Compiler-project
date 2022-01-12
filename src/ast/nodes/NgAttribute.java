package ast.nodes;

import ast.nodes.For.NgFor;

public class NgAttribute {
    NgFor ngFor = new NgFor();

    public NgFor getNgFor() {
        return ngFor;
    }

    public void setNgFor(NgFor ngFor) {
        this.ngFor = ngFor;
    }

    @Override
    public String toString() {
        return "NgAttribute{" +
                "ngFor=" + ngFor +
                '}';
    }
}
