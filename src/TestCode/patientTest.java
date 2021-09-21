/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import controller.PatientRec;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Elham Robbani
 */
public class patientTest {
    
   
    PatientRec pr;
    
    @Before
    public void setup() throws Exception{
        pr = new PatientRec();
    }
    
    @Test
    public void test_GetData() {
        assertEquals("shemonto", pr.Get_Data());
    }
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
