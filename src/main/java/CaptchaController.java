package src.main.java;

import java.util.Random;

public class CaptchaController {
    private RandomGen randomGen;
    private Captcha captcha;

    public CaptchaController(){
        Random oo7 = new Spy007();
        this.randomGen = new RandomGen(oo7);
        this.captcha = new Captcha(randomGen.getPattern(), randomGen.getOperand(), randomGen.getOperator(), randomGen.getPattern());
    }
    public String getPepo() {
        return this.captcha.toString();
    }
}
