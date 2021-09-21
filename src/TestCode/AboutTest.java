/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import view.About;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Elham Robbani
 */
public class AboutTest {
    
   About ab;
    
    @Before
    public void setup() throws Exception{
        ab = new About();
    }
    
    @Test
    public void test_seeing() {
        assertEquals("it is viewed", ab.seeing());
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
