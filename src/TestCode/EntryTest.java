/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import model.Entry;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Elham Robbani
 */
public class EntryTest {
    
    Entry br;
    
    @Before
    public void setup() throws Exception{
        br = new Entry();
    }
    
    @Test
    public void test_entrance() {
        assertEquals("entered", br.entrance());
       
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
