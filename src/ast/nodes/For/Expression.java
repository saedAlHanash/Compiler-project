package ast.nodes.For;

public class Expression {
    Var var;
    Array array;


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
        return "Expression{\n\t" +
                "var=" + var +
                ", array=" + array +"\n"+
                '}';
    }
}
