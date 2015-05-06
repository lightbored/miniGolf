/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import teamblc.minigolf.*;

/**
 * @author teamBLC
 * @author Corey Gunter
 * @author Jamie Banas
 * @author Chris Maxey
 */
public class minigolftest {
    
    public minigolftest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public final void getCourseList() {
          String result = "Unknown";
          try {
              result = newRound.newRound("River Hills", "Jamie");
          } catch (Exception e ) {
              result = "Exception Thrown:" + e;
          }
          assertEquals("", "", result);
      }
}
