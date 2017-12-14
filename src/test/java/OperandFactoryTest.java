package src.test.java;

import org.junit.Assert;
import org.junit.Test;
import src.main.java.IntegerOperand;
import src.main.java.OperandFactory;
import src.main.java.StringOperand;

public class OperandFactoryTest {

    @Test
    public void firstPatternLeftShouldBeTypeOfStringOperand(){
        Assert.assertTrue(OperandFactory.createLeft(1, 1)instanceof StringOperand);
    }

    @Test
    public void secondPatternLeftShouldBeTypeOfIntegerOperand() {
        Assert.assertTrue(OperandFactory.createLeft(2, 1)instanceof IntegerOperand);

    }

    @Test
    public void firstPatternRightShouldBeTypeOfStringOperand(){
        Assert.assertTrue(OperandFactory.createRight(2, 1)instanceof StringOperand);
    }

    @Test
    public void secondPatternRightShouldBeTypeOfIntegerOperand() {
        Assert.assertTrue(OperandFactory.createRight(1, 1)instanceof IntegerOperand);
    }

}
