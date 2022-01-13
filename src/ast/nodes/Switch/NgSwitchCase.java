package ast.nodes.Switch;

import ast.nodes.Constt;
import ast.nodes.Var;

public class NgSwitchCase {

    public static int test=1;
    String ngSwitch;
    String not;
    String qOpen;
    String qClose;
    Var var;
    Constt constt;


    @Override
    public String toString() {
        if (test==1){
            return "NgSwitchCase{" +
                    "ngSwitch='" + ngSwitch + '\'' +
                    ", not='" + not + '\'' +
                    ", qOpen='" + qOpen + '\'' +
                    ", var=" + var +
                    ", qClose='" + qClose + '\'' +
                    ", const=" + constt +
                    '}'+"\n";
        }
        else
            return "";

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

    public Constt getConstt() {
        return constt;
    }

    public void setConstt(Constt constt) {
        this.constt = constt;
    }
}
