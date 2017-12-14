package src.test.java;

import org.junit.Assert;
import org.junit.Test;
import src.main.java.CaptchaController;

public class CaptchaControllerTest {



    @Test
    public void captchaController() {
        CaptchaController captchaController = new CaptchaController();
        String stringController = captchaController.getPepo();
        Assert.assertEquals("One + 1", stringController);
    }
}
