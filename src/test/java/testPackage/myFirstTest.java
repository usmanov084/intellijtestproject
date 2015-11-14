package testPackage;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by hasan on 07/11/2015.
 */
public class myFirstTest {
    @Test
    public void testTestTest(){

        String greeting = getGreetingValue();
        assertEquals("Hello",greeting);
        // validate that the name is having more than 1 characters
        String name= "Testing";
        assertTrue(name.length() > 1);
        assertTrue(name.contains("ing"));
        
    }


    public String getGreetingValue() {
        return "hello";
    }
}
