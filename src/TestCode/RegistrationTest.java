/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import model.Bill_Room;
import model.Registration;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Elham Robbani
 */
public class RegistrationTest {
    
     Registration br;
    
    @Before
    public void setup() throws Exception{
        br = new Registration();
    }
    
    @Test
    public void test_register() {
        assertEquals("registered", br.register());
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
