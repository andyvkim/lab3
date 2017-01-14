package kim.andy;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


/**
 * Created by andykim on 1/13/17.
 */
public class lab3Test {
    lab3 test3;
    @Before
    public void setUp() {test3 = new lab3();}

    @Test
    public void multiply() {
        int expected = 24;
        int actual = test3.multiply("m", 4);
        assertEquals(expected, actual);


    }
    @Test
    public void add(){
        int expected = 10;
        int actual = test3.add("a", 4);
        assertEquals(expected,actual);
    }

}
