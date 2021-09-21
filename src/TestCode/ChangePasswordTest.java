/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import controller.ChangePassword;
import controller.Patient_Admit_Room;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Elham Robbani
 */
public class ChangePasswordTest {
    
  ChangePassword pa;
    
    @Before
    public void setup() throws Exception{
        pa = new  ChangePassword();
    }
    
    @Test
    public void test_pass() {
        assertEquals("changed", pa.pass());
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
