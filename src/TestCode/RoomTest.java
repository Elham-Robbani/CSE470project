/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import controller.Patient_Admit_Room;
import controller.Room;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Elham Robbani
 */
public class RoomTest {
    
   Room ro;
    
    @Before
    public void setup() throws Exception{
        ro = new Room();
    }
    
    @Test
    public void test_Get_Data() {
        assertEquals("Booked", ro.Get_Data());
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
