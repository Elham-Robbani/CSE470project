/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import model.NewUser;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Elham Robbani
 */
public class NewUserTest {
    
   NewUser br;
    
    @Before
    public void setup() throws Exception{
        br = new NewUser();
    }
    
    @Test
    public void test_user() {
         assertEquals("welcome", br.user());
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
