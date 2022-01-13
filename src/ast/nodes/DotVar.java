package ast.nodes;

public class DotVar {
    String  dot;
    Var var;


    public String getDot() {
        return dot;
    }

    public void setDot(String dot) {
        this.dot = dot;
    }

    public Var getVar() {
        return var;
    }

    public void setVar(Var var) {
        this.var = var;
    }

    @Override
    public String toString() {
        return "DotVar{" +
                "dot='" + dot + '\'' +
                ",var=" + var +
                '}'+"\n";
    }
}
