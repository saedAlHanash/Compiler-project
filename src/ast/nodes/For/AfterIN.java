package ast.nodes.For;

import ast.nodes.Array;
import ast.nodes.Var;

public class AfterIN {

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
        return "AfterIN{\n\t" +
                "var=" + var +
                ", array=" + array +"\n"+
                '}';
    }
}
