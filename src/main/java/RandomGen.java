package src.main.java;

import java.util.Random;

public class RandomGen {

    Random random;
    public RandomGen(Random someRandom){
        this.random = someRandom;
    }
    public int getPattern(){
        return  1 + random.nextInt(2);
    }

    public int getOperator() {
        return 1 + random.nextInt(4);
    }

    public int getOperand(){
        return  random.nextInt(10);
    }
}
