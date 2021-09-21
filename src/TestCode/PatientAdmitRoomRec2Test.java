/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import controller.Patient_Admit_Room;
import controller.Patient_Admit_roomRec1;
import controller.Patient_Admit_roomRec2;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Elham Robbani
 */
public class PatientAdmitRoomRec2Test {
    
    Patient_Admit_roomRec2 pa2;
    
    
    @Before
    public void setup() throws Exception{
        pa2 = new Patient_Admit_roomRec2();
    }
    
    @Test
    public void test_Get_Data() {
        assertEquals("Shankar Kumar", pa2.Get_Data());
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
