package src.main.java;

public class Captcha {

    private Operand left;
    private Operand right;
    private Operator operator;
    private StringOperand stringOpreand;
    private IntegerOperand integerOperand;

    private int pattern;
    private final String numberString[]={"One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};

    public String toString() {
        return String.format("%s %s %s",getLeft(), getOperator(), getRight());
    }

    public Captcha(int pattern, int left, int operator, int right) {
        this.left = OperandFactory.createLeft(pattern,left);
        this.right = OperandFactory.createRight(pattern,right);
        this.operator = new Operator(operator);
        this.pattern = pattern;
    }

    public Operand getLeft() {
        return this.left;
    }

    public Operand getRight() {
        return this.right;
    }

    public Operator getOperator() {
        return operator;
    }

}
