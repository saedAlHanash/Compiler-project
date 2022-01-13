package ast.nodes.For;

public class ForExpressionFirst {

    String in;
    BeforIN beforIN ;
    AfterIN afterIN ;

    public String getIn() {
        return in;
    }

    public void setIn(String in) {
        this.in = in;
    }

    public BeforIN getBeforIN() {
        return beforIN;
    }

    public void setBeforIN(BeforIN beforIN) {
        this.beforIN = beforIN;
    }

    public AfterIN getAfterIN() {
        return afterIN;
    }

    public void setAfterIN(AfterIN afterIN) {
        this.afterIN = afterIN;
    }

    @Override
    public String toString() {
        return "ForExpressionFirst{" +
                "in='" + in + '\'' +
                ", beforIN=" + beforIN +
                ", afterIN=" + afterIN +
                '}'+"\n";
    }
}
