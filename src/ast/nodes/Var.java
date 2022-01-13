package ast.nodes;

import java.util.ArrayList;

public class Var {
    String varName;
   ArrayList<DotVar>  dotVar = new ArrayList<>();

    public String getVarName() {
        return varName;
    }

    public void setVarName(String varName) {
        this.varName = varName;
    }

    public ArrayList<DotVar> getDotVar() {
        return dotVar;
    }

    public void setDotVar(ArrayList<DotVar> dotVar) {
        this.dotVar = dotVar;
    }

    @Override
    public String toString() {
        return "Var{" +
                "varName='" + varName + '\'' +
                ",dotVar=" + dotVar+
                '}'+"\n" ;
    }
}
