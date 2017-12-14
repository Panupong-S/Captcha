package src.main.java;

public class Operator {
    private int value;
    public Operator(int value) {
        this.value = value;
    }
    public String toString () {
        String operatorString[] = {"+", "-", "*", "/"};
        return operatorString[value-1];
    }
}
