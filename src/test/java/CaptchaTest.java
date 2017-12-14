package src.test.java;

import org.junit.Assert;
import org.junit.Test;
import src.main.java.Captcha;
import src.main.java.Operator;

public class CaptchaTest {

    private final int DUMMY_OPERATOR = 1;
    private final int DUMMY_RIGHT = 1;
    private final int DUMMY_LEFT = 1;
    private final int DUMMY_PATTERN = 1;

    @Test
    public void captchaStringShouldBeOnePlus1(){
        Captcha captcha = new Captcha(1,1,1,1);
        String output = captcha.toString();
        Assert.assertEquals("One + 1", output);
    }

    @Test
    public void captchaStringShouldBe1PlusOne(){
        Captcha captcha = new Captcha(2,1,1,1);
        String output = captcha.toString();
        Assert.assertEquals("1 + One", output);
    }

    @Test
    public void operatorShouldBeTypeOfOperator() {
        Captcha captcha = new Captcha(DUMMY_PATTERN,DUMMY_LEFT,1,DUMMY_RIGHT);
        Assert.assertTrue(captcha.getOperator() instanceof Operator);
    }
}