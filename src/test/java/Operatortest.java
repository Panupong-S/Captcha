package src.test.java;

import org.junit.Assert;
import org.junit.Test;
import src.main.java.Operator;

public class Operatortest {
    @Test
    public void isShouldBePlus() {
        Operator operator = new Operator(1);
        Assert.assertEquals("+", operator.toString());
    }
    @Test
    public void isShouldBeMinus() {
        Operator operator = new Operator(2);
        Assert.assertEquals("-", operator.toString());
    }
    @Test
    public void isShouldBeMultiply() {
        Operator operator = new Operator(3);
        Assert.assertEquals("*", operator.toString());
    }
    @Test
    public void isShouldBeDivide() {
        Operator operator = new Operator(4);
        Assert.assertEquals("/", operator.toString());
    }


}
