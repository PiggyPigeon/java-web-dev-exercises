package exercises.testComputer;


import exercises.technology.Laptop;
import exercises.technology.Smartphone;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class computerTest {
    @Test
    public void testLaptopsMethodWorks(){
        Laptop thinkPad = new Laptop(3, 6, true, 10.1);
        assertTrue(thinkPad.isClunky());
    }

    @Test
    public void testLaptopsConstructorWorks(){
        Laptop thinkPad = new Laptop(3, 6, true, 10.1);
        assertEquals(6, thinkPad.getRam(), .001);
    }
    @Test
    public void testLaptopsWeightWorks(){
        Laptop thinkPad = new Laptop(3, 6, true, 10.1);
        assertEquals(10.1, thinkPad.getWeight(), .001);
    }

    @Test
    public void testSmartphoneSelfies(){
        Smartphone pixel6 = new Smartphone(3, 6, true, 10);
        assertEquals(10, pixel6.getNumberOfSelfies(), .001);
    }

    @Test
    public void testSmartphoneTakeSelfies(){
        Smartphone pixel6 = new Smartphone(3, 6, true, 10);
        pixel6.takeSelfies(6);
        assertEquals(16, pixel6.getNumberOfSelfies(), .001);
    }

    @Test
    public void testSmartphoneConstructor(){
        Smartphone pixel6 = new Smartphone(3, 6, true, 10);
        assertTrue(pixel6.getRam() == 6);
    }






}