/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import controller.Patient_Admit_Room;
import controller.Patient_Discharge_roomRec1;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Elham Robbani
 */
public class PatientDischargeRoomRec1 {
    
    Patient_Discharge_roomRec1 pa;
    
    @Before
    public void setup() throws Exception{
        pa = new Patient_Discharge_roomRec1();
    }
    
    @Test
    public void test_Get_Data() {
        assertEquals("2018-04-15", pa.Get_Data());
    }
    
   

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
