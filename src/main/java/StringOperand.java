package src.main.java;

public class StringOperand extends Operand {

    private final String numberString[]={"One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};

    public StringOperand(int i) {
        super(i);
    }

    public String toString() {
        return numberString[this.i - 1];
    }
}
