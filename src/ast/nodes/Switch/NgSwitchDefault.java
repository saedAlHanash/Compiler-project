package ast.nodes.Switch;

public class NgSwitchDefault {
    String defaultt;


    @Override
    public String toString() {
        return "NgSwitchDefault{" +
                "defaultt='" + defaultt + '\'' +
                '}' + "\n";
    }

    public String getDefaultt() {
        return defaultt;
    }

    public void setDefaultt(String defaultt) {
        this.defaultt = defaultt;
    }
}
