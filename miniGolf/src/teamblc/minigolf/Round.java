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
    
    private String playerName;  // Hold player name
    private String courseName;  // Hold course name
    private int[][] score;      // Hold hole number and score ([0] not used)
        
    public void setPlayer ( String name ) {
        this.playerName = name;
    }

    public String getPlayer () {
        return this.playerName;
    }
    
    public void setCourse ( String name ) {
        this.courseName = name;
    }

    public String getCourse () {
        return this.courseName;
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
        
    } 
    
    public int[][] scoreDetail() {
        
        return this.score;
    }
}