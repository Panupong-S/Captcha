package src.main.java;

public class OperandFactory {

    public static Operand createLeft(int pattern, int value) {
        if (pattern == 1)
            return new StringOperand(value);
        return new IntegerOperand(value);
    }

    public static Operand createRight(int pattern, int value) {
        if (pattern == 1)
            return new IntegerOperand(value);
        return new StringOperand(value);
    }
}
