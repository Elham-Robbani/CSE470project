/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import model.Bill_Room;
import model.Patient_Discharge_room;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Elham Robbani
 */
public class PatientDischargeRoom {
    
 Patient_Discharge_room pr;
    
    @Before
    public void setup() throws Exception{
        pr = new Patient_Discharge_room();
    }
    
    @Test
    public void test_discharge() {
        assertEquals("patient discharged", pr.discharge());
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
