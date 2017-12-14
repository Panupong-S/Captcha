package src.main.java;

import java.util.Random;

public class Spy007 extends Random {
    public int token = 0;
    public int expectedBound = 0;

    public int nextInt(int i){
        expectedBound = i;
        token++;
        return 9;
    }
}
