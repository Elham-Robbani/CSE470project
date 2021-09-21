/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import model.Bill_RoomRec;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Elham Robbani
 */
public class BillRoomRecTest {
    
     Bill_RoomRec br;
    
    @Before
    public void setup() throws Exception{
        br = new Bill_RoomRec();
    }
    
    @Test
    public void test_Get_Data(){
        assertEquals("20000", br.Get_Data());
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
