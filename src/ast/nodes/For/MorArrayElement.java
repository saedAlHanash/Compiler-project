package ast.nodes.For;

public class MorArrayElement {
    String comma;
    Expression expression;

    public String getComma() {
        return comma;
    }

    public void setComma(String comma) {
        this.comma = comma;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "MorArrayElement{\n\t" +
                "comma='" + comma + '\'' +
                ", expression=" + expression +"\n"+
                '}';
    }
}
