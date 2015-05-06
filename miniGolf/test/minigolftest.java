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
    
    // Happy Path Testing
    @Test
    public final void getHappyCourseList() {
          String result = "Unknown";
          try {
              result = Main.getCourseList();
          } catch (Exception e ) {
              result = "Exception Thrown:" + e;
          }
          assertEquals("", "", result);
      }

    @Test
    public final void getHappyRoundList() {
          String result = "Unknown";
          try {
              result = Main.getRoundList();
          } catch (Exception e ) {
              result = "Exception Thrown:" + e;
          }
          assertEquals("", "", result);
      }

    @Test
    public final void getHappyScoreSoFar() {
          String result = "Unknown";
          try {
              int value;
              value = Main.scoreSoFar("Augusta National","Jamie");
              result = Integer.toString(value);
          } catch (Exception e ) {
              result = "Exception Thrown:" + e;
          }
          assertEquals("", "", result);
      }

    // Boundry Testing
    @Test
    public final void getBoundryScoreSoFar() {
          String result = "Unknown";
          try {
              int value;
              value = Main.scoreSoFar("River Hills","Jamie");
              result = Integer.toString(value);
          } catch (Exception e ) {
              result = "Exception Thrown:" + e;
          }
          assertEquals("", "", result);
    }
    
    // Exception Testing
    @Test
    public final void getExceptionScoreSoFar() {
          String result = "Unknown";
          try {
              int value;
              value = Main.scoreSoFar("River Hills","Jamie");
              result = Integer.toString(value);
          } catch (Exception e ) {
              result = "Exception Thrown:" + e;
          }
          assertEquals("", "", result);
    }
    
}
