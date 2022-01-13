package ast.nodes;

public class Expression {
    Var var;
    Array array;
    Constt constt;


    public Constt getConstt() {
        return constt;
    }

    public void setConstt(Constt constt) {
        this.constt = constt;
    }

    public Var getVar() {
        return var;
    }

    public void setVar(Var var) {
        this.var = var;
    }

    public Array getArray() {
        return array;
    }

    public void setArray(Array array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "Expression{" +
                "var=" + var +
                ",array=" + array +
                ",constt=" + constt +
                '}'+"\n";
    }
}
