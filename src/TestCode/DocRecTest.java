/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import controller.DocRec;
import controller.Patient_Admit_Room;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Elham Robbani
 */
public class DocRecTest {
   DocRec pa;
    
    @Before
    public void setup() throws Exception{
        pa = new DocRec();
    }
    
    @Test
    public void test_Get_Data() {
        assertEquals("Madan Chopra", pa.Get_Data());
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
