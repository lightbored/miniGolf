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
import java.util.ArrayList;
import java.util.List;

/**
 * @author teamBLC
 * @author Corey Gunter
 * @author Jamie Banas
 * @author Chris Maxey
 */
public class minigolftest {
    private List<String> courseList = new ArrayList<>();
    private Round legalRound1;
    private int [] legalRound1CorrectScores;
    private Round badRound;

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
    public final void setAndGetPlayer() {
          String result = "Unknown";
          try {
              legalRound1.setPlayer("Jamie");
              result = legalRound1.getPlayer();
          } catch (Exception e ) {
              result = "Exception Thrown:" + e;
          }
          assertEquals("Jamie", result);
      }

    @Test
    public final void setAndGetCourse() {
          String result = "Unknown";
          try {
              legalRound1.setCourse("Pine Valley");
              result = legalRound1.getCourse();
          } catch (Exception e ) {
              result = "Exception Thrown:" + e;
          }
          assertEquals("Pine Valley", result);
      }

    @Test
    public final void getCurrentScore() {
          String result = "Unknown";
          try {
              int value;
              legalRound1.enterScore(2);
              legalRound1.enterScore(3);
              value = legalRound1.currentScore();
              result = Integer.toString(value);
          } catch (Exception e ) {
              result = "Exception Thrown:" + e;
          }
          assertEquals("5", result);
      }

    @Test
    public final void testNumberOfHolesPlayed() {
          String result = "Unknown";
          try {
              int value;
              legalRound1.enterScore(2);
              legalRound1.enterScore(3);
              value = legalRound1.numberOfHolesPlayed();
              result = Integer.toString(value);
          } catch (Exception e ) {
              result = "Exception Thrown:" + e;
          }
          assertEquals(2, result);
    }

    // Boundry Testing
    
    @Test
    public final void testFullRound() {
          String result = "Unknown";
          try {
              int value;
              legalRound1.enterScore(2);
              legalRound1.enterScore(3);
              legalRound1.enterScore(3);
              legalRound1.enterScore(4);
              legalRound1.enterScore(3);
              legalRound1.enterScore(2);
              legalRound1.enterScore(4);
              legalRound1.enterScore(3);
              legalRound1.enterScore(4);
              value = legalRound1.numberOfHolesPlayed();
              result = Integer.toString(value);
          } catch (Exception e ) {
              result = "Exception Thrown:" + e;
          }
          assertEquals(9, result);
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
