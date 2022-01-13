package ast.nodes.For;

import ast.nodes.Expression;
import ast.nodes.MorVar;
import ast.nodes.Var;

public class BeforIN {

    Var var ;
    MorVar morVar;
    Expression expression;

    public Var getVar() {
        return var;
    }

    public void setVar(Var var) {
        this.var = var;
    }

    public MorVar getMorVar() {
        return morVar;
    }

    public void setMorVar(MorVar morVar) {
        this.morVar = morVar;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "BeforIN{\n\t" +
                "var=" + var +
                ", morVar=" + morVar +
                ", expression=" + expression +"\n"+
                '}';
    }
}
