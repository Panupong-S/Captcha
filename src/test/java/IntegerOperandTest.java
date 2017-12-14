package src.test.java;

import org.junit.Assert;
import org.junit.Test;
import src.main.java.IntegerOperand;

public class IntegerOperandTest {

    @Test
    public void isShouldBe1(){
        IntegerOperand integerOperand = new IntegerOperand(1);
        Assert.assertEquals("1", integerOperand.toString());
    }
    @Test
    public void isShouldBe2(){
        IntegerOperand integerOperand = new IntegerOperand(2);
        Assert.assertEquals("2", integerOperand.toString());
    }
}
