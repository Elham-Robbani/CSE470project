/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import model.Bill_Room;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Elham Robbani
 */
public class BillRoomTest {
    Bill_Room br;
    
    @Before
    public void setup() throws Exception{
        br = new Bill_Room();
    }
    
    @Test
    public void test_Get_Data1() {
        assertEquals("15000", br.Get_Data1());
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
