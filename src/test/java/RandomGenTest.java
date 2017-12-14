package src.test.java;

import org.junit.Assert;
import org.junit.Test;
import src.main.java.RandomGen;
import src.main.java.Spy007;

import java.util.Random;

public class RandomGenTest {

    /*class Spy007 extends Random {
        public int token = 0;
        public int expectedBound = 0;

        public int nextInt(int i){
            expectedBound = i;
            token++;
            return 9;
        }
    }*/

    /*class RandomGenerator{
        Random random;
        public RandomGenerator(Random someRandom){
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
    }*/

    /*@Test
    public void randomGennerateTest(){
        RandomGen randomGen = new RandomGen();
        Assert.assertTrue(randomGen instanceof RandomGen );
    }*/

    @Test
    public void randomGenneratePatternTest(){
        Random oo7 = new Spy007();
        RandomGen randomGenerator = new RandomGen(oo7);
        randomGenerator.getPattern();
        Assert.assertEquals(1,((Spy007)oo7).token);
        Assert.assertEquals(2,((Spy007)oo7).expectedBound);
    }

    @Test
    public void randomGennerateOperatorTest() {
        Random oo7 = new Spy007();
        RandomGen randomGenerator = new RandomGen(oo7);
        randomGenerator.getOperator();
        Assert.assertEquals(1,((Spy007)oo7).token);
        Assert.assertEquals(4,((Spy007)oo7).expectedBound);
    }

    @Test
    public void randomGennerateOperandTest(){
        Random oo7 = new Spy007();
        RandomGen randomGenerator = new RandomGen(oo7);
        randomGenerator.getOperand();
        Assert.assertEquals(1,((Spy007)oo7).token);
        Assert.assertEquals(10,((Spy007)oo7).expectedBound);
    }
}
