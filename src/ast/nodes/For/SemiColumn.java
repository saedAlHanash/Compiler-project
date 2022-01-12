package ast.nodes.For;

public class SemiColumn {
    String semiColumn;
    String equal;
    String  index;
    String  number;
    Var var ;

    public String getSemiColumn() {
        return semiColumn;
    }

    public void setSemiColumn(String semiColumn) {
        this.semiColumn = semiColumn;
    }

    public String getEqual() {
        return equal;
    }

    public void setEqual(String equal) {
        this.equal = equal;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Var getVar() {
        return var;
    }

    public void setVar(Var var) {
        this.var = var;
    }

    @Override
    public String toString() {
        return "SemiColumn{\n\t" +
                "semiColumn='" + semiColumn + '\'' +
                ", equal='" + equal + '\'' +
                ", index=" + index +
                ", number=" + number +
                ", var=" + var +"\n"+
                '}';
    }
}
