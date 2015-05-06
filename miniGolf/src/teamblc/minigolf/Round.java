/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamblc.minigolf;

/**
 * @author teamBLC
 * @author Corey Gunter
 * @author Jamie Banas
 * @author Chris Maxey
 */
public class Round {
    
    private int playerID;
    private String playerName;
    private String courseName;
    private int[] score;
        
    public void setPlayer ( int id, String name ) {
       this.playerID = id;
       this.playerName = name;
    }

    public void setCourse ( String name ) {
       this.courseName = name;
    }
    
    public String toString () {
       return "Course: " + courseName + "\nPlayer Name: " + this.playerName;
    }
    
    public int currentScore () { // Display the user's score so far (this is the number of strokes above or below par, for the holes played so far);
        
        return 0;
    }
    
    public int numberOfHolesPlayed () { //Returns the number of completed holes in this round;
        
        return 0;
    }    
    
    public synchronized void enterScore(int strokes) { //Enter a score for the next hole.  (Note the current design doesn't allow a player to skip holes, they must be played in order);
      // some thread critical stuff
      // here
    } 
    
    public int[] scoreDetail() {
        
        return this.score;
    }
}