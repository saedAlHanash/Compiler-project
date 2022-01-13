package ast.nodes.Switch;

import ast.nodes.Var;

public class NgSwitch {
    String ngSwitch;
    String not;
    String qOpen;
    String qClose;
    Var var;


    @Override
    public String toString() {
        return "NgSwitch{" +
                "ngFor='" + ngSwitch + '\'' +
                ", not='" + not + '\'' +
                ", qOpen='" + qOpen + '\'' +
                ", var=" + var + '\'' +
                ", qClose='" + qClose+
                 '}'+"\n";
    }

    public String getNgSwitch() {
        return ngSwitch;
    }

    public void setNgSwitch(String ngSwitch) {
        this.ngSwitch = ngSwitch;
    }

    public String getNot() {
        return not;
    }

    public void setNot(String not) {
        this.not = not;
    }

    public String getqOpen() {
        return qOpen;
    }

    public void setqOpen(String qOpen) {
        this.qOpen = qOpen;
    }

    public String getqClose() {
        return qClose;
    }

    public void setqClose(String qClose) {
        this.qClose = qClose;
    }

    public Var getVar() {
        return var;
    }

    public void setVar(Var var) {
        this.var = var;
    }
}
