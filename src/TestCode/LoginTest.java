/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import controller.Patient_Admit_Room;
import controller.login;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Elham Robbani
 */
public class LoginTest {
    
    login pa;
    
    @Before
    public void setup() throws Exception{
        pa = new login();
    }
    
    @Test
    public void test_loginMessage(){
        assertEquals("logged in", pa.loginMessage());
    }
    
    public void test_verificationMessage(){
        assertEquals("verified", pa.verificationMessage());
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
