package ast.nodes;

public class ElementAttribute {
    Attribute hAttribute = new Attribute();
    NgAttribute ngAttribute = new NgAttribute();

    public Attribute getAttribute() {
        return hAttribute;
    }

    public void setAttribute(Attribute attribute) {
        this.hAttribute = attribute;
    }

    public NgAttribute getNgAttribute() {
        return ngAttribute;
    }

    public void setNgAttribute(NgAttribute ngAttribute) {
        this.ngAttribute = ngAttribute;
    }

    @Override
    public String toString() {
        return "ElementAttribute{" +
                "hAttribute=" + hAttribute +
                ", ngAttribute=" + ngAttribute +
                '}';
    }
}
