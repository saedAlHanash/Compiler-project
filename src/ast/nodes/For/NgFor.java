package ast.nodes.For;

import ast.nodes.Node;

public class NgFor extends Node {

    String NG_FOR;
    String NOT;
    String Q_OPEN;
    String Q_CLOSE;

    ForExpressionFirst forExpressionFirst ;
    ForExpressionSecond forExpressionSecond ;


    public String getNG_FOR() {
        return NG_FOR;
    }

    public void setNG_FOR(String NG_FOR) {
        this.NG_FOR = NG_FOR;
    }

    public String getNOT() {
        return NOT;
    }

    public void setNOT(String NOT) {
        this.NOT = NOT;
    }

    public String getQ_OPEN() {
        return Q_OPEN;
    }

    public void setQ_OPEN(String q_OPEN) {
        Q_OPEN = q_OPEN;
    }

    public String getQ_CLOSE() {
        return Q_CLOSE;
    }

    public void setQ_CLOSE(String q_CLOSE) {
        Q_CLOSE = q_CLOSE;
    }

    public ForExpressionFirst getForExpressionFirst() {
        return forExpressionFirst;
    }

    public void setForExpressionFirst(ForExpressionFirst forExpressionFirst) {
        this.forExpressionFirst = forExpressionFirst;
    }

    public ForExpressionSecond getForExpressionSecond() {
        return forExpressionSecond;
    }

    public void setForExpressionSecond(ForExpressionSecond forExpressionSecond) {
        this.forExpressionSecond = forExpressionSecond;
    }

    @Override
    public String toString() {
        return "NgFor{\n\t" +
                "NG_FOR='" + NG_FOR + '\'' +
                ", NOT='" + NOT + '\'' +
                ", Q_OPEN='" + Q_OPEN + '\'' +
                ", Q_CLOSE='" + Q_CLOSE + '\'' +
                ", forExpressionFirst=" + forExpressionFirst +
                ", forExpressionSecond=" + forExpressionSecond +"\n"+
                '}';
    }
}
