package ast.nodes;

public class Constt {
    String charr;
    String number;
    String open_C;
    String close_C;
    Constt constt;

    @Override
    public String toString() {
        return "Constt{" +
                "c='" + charr + '\'' +
                ", number='" + number + '\'' +
                ", open_C='" + open_C + '\'' +
                ", close_C='" + close_C + '\'' +
                ",constt=" + constt +
               '}'+"\n";
    }

    public String getCharr() {
        return charr;
    }

    public void setCharr(String charr) {
        this.charr = charr;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getOpen_C() {
        return open_C;
    }

    public void setOpen_C(String open_C) {
        this.open_C = open_C;
    }

    public String getClose_C() {
        return close_C;
    }

    public void setClose_C(String close_C) {
        this.close_C = close_C;
    }

    public Constt getConstt() {
        return constt;
    }

    public void setConstt(Constt constt) {
        this.constt = constt;
    }
}
