package src.test.java;

import org.junit.Assert;
import org.junit.Test;
import src.main.java.StringOperand;

public class StringOperandTest {

    @Test
    public void itShouldBeOne(){
        StringOperand stringOperand = new StringOperand(1);
        Assert.assertEquals("One", stringOperand.toString());
    }

    @Test
    public void itShouldBeTwo(){
        StringOperand stringOperand = new StringOperand(2);
        Assert.assertEquals("Two", stringOperand.toString());
    }
}
