/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import controller.PatientRec;
import controller.Patient_Admit_Room;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Elham Robbani
 */
public class PatientAdmitRoomTest {
    
   Patient_Admit_Room pa;
    
    @Before
    public void setup() throws Exception{
        pa = new Patient_Admit_Room();
    }
    
    @Test
    public void test_fillcombo() {
        assertEquals("3", pa.fillcombo());
    }
    
   
    
    @Test
    public void test_GetRecord() {
        assertEquals("2", pa.GetRecord());
    }
    
    @Test
    public void test_GetData1() {
        assertEquals("M", pa.Get_Data1());
    }
    
   

    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
