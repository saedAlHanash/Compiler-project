package ast.nodes;

public class Array {
    String ArrayTagOpen;
    String ArrayTagClose;
    Array array ;
    Expression expression ;
    MorArrayElement mMorArrayElement ;

    public String getArrayTagOpen() {
        return ArrayTagOpen;
    }

    public void setArrayTagOpen(String arrayTagOpen) {
        ArrayTagOpen = arrayTagOpen;
    }

    public String getArrayTagClose() {
        return ArrayTagClose;
    }

    public void setArrayTagClose(String arrayTagClose) {
        ArrayTagClose = arrayTagClose;
    }

    public Array getArray() {
        return array;
    }

    public void setArray(Array array) {
        this.array = array;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public MorArrayElement getmMorArrayElement() {
        return mMorArrayElement;
    }

    public void setmMorArrayElement(MorArrayElement mMorArrayElement) {
        this.mMorArrayElement = mMorArrayElement;
    }

    @Override
    public String toString() {
        return "Array{" +
                "ArrayTagOpen='" + ArrayTagOpen + '\'' +
                ", ArrayTagClose='" + ArrayTagClose + '\'' +
                ",array=" + array +
                ",expression=" + expression +
                ",mMorArrayElement=" + mMorArrayElement +"\n"+
                 '}'+"\n";
    }
}
