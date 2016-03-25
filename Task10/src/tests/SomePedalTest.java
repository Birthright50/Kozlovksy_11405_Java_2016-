package tests;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import our_classes.SomePedal;


/**
 * Created by Birthright on 25.02.2016.
 */
public class SomePedalTest {
    private static SomePedal somePedal;
    @BeforeClass
    public static void createPedal(){
        somePedal = (SomePedal) Config.ac.getBean("some_pedal");
    }
    @Test
    public void gasPedalShouldBeWork(){
        somePedal.gasPedal((byte) 100);
        Assert.assertTrue("going fast".equals(somePedal.getCurrent_act()));
        somePedal.gasPedal((byte) 50);
        Assert.assertTrue("going slow".equals(somePedal.getCurrent_act()));
    }
    @Test
    public void brakePedalShouldBeWork(){
        somePedal.brakePedal((byte) 100);
        Assert.assertTrue("brake fast".equals(somePedal.getCurrent_act()));
        somePedal.brakePedal((byte) 50);
        Assert.assertTrue("brake slow".equals(somePedal.getCurrent_act()));
    }
}