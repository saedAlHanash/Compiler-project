package ast.nodes.For;

public class ForExpressionSecond {
    String In;
    AfterIN afterIN ;
    BeforIN beforIN ;
    SemiColumn semiColumn ;


    public String getIn() {
        return In;
    }

    public void setIn(String in) {
        In = in;
    }

    public AfterIN getAfterIN() {
        return afterIN;
    }

    public void setAfterIN(AfterIN afterIN) {
        this.afterIN = afterIN;
    }

    public BeforIN getBeforIN() {
        return beforIN;
    }

    public void setBeforIN(BeforIN beforIN) {
        this.beforIN = beforIN;
    }

    public SemiColumn getSemiColumn() {
        return semiColumn;
    }

    public void setSemiColumn(SemiColumn semiColumn) {
        this.semiColumn = semiColumn;
    }

    @Override
    public String toString() {
        return "forExpressionSecond{\n\t" +
                "In='" + In + '\'' +
                ", afterIN=" + afterIN +
                ", beforIN=" + beforIN +
                ", semiColumn=" + semiColumn +"\n"+
                '}';
    }
}
