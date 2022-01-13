package ast.nodes;

import ast.nodes.For.NgFor;
import ast.nodes.Switch.NgSwitch;
import ast.nodes.Switch.NgSwitchCase;
import ast.nodes.Switch.NgSwitchDefault;

public class NgAttribute {
    NgFor ngFor;
    NgSwitch ngSwitch;
    NgSwitchCase ngSwitchCase;
    NgSwitchDefault ngSwitchDefault;

    String ng_for() {
        if (this.ngFor != null)
            return "ngFor=" + ngFor;
        else
            return "";

    }

    String ng_switch() {
        if (this.ngSwitch != null)
            return ",ngSwitch=" + ngSwitch;
        else
            return "";

    }

    String ng_switch_case() {
        if (this.ngSwitchCase != null)
            return ",ngSwitchCase=" + ngSwitchCase;
        else
            return "";

    }

    String ng_switch_default() {
        if (this.ngSwitchDefault != null)
            return ",ngSwitchDefault=" + ngSwitchDefault;
        else
            return "";

    }

    @Override
    public String toString() {
        return "NgAttribute{" +
                ng_for() +
                ng_switch() +
                ng_switch_case() +
                ng_switch_default() +
                '}' + "\n";
    }

    public NgFor getNgFor() {
        return ngFor;
    }

    public void setNgFor(NgFor ngFor) {
        this.ngFor = ngFor;
    }

    public NgSwitch getNgSwitch() {
        return ngSwitch;
    }

    public void setNgSwitch(NgSwitch ngSwitch) {
        this.ngSwitch = ngSwitch;
    }

    public NgSwitchCase getNgSwitchCase() {
        return ngSwitchCase;
    }

    public void setNgSwitchCase(NgSwitchCase ngSwitchCase) {
        this.ngSwitchCase = ngSwitchCase;
    }

    public NgSwitchDefault getNgSwitchDefault() {
        return ngSwitchDefault;
    }

    public void setNgSwitchDefault(NgSwitchDefault ngSwitchDefault) {
        this.ngSwitchDefault = ngSwitchDefault;
    }
}
