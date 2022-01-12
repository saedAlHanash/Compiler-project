package ast.nodes.For;

public class MorVar {
    String comma;
    Var var ;


    public String getComma() {
        return comma;
    }

    public void setComma(String comma) {
        this.comma = comma;
    }

    public Var getVar() {
        return var;
    }

    public void setVar(Var var) {
        this.var = var;
    }

    @Override
    public String toString() {
        return "MorVar{\n\t" +
                "comma='" + comma + '\'' +
                ", var=" + var +"\n"+
                '}';
    }
}
