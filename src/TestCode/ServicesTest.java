/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import controller.Patient_Admit_Room;
import controller.Services;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Elham Robbani
 */
public class ServicesTest {
    
    Services se;
    
    @Before
    public void setup() throws Exception{
        se = new Services();
    }
    
    @Test
    public void test_Get_Data1() {
        assertEquals("shemonto", se.Get_Data1());
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
