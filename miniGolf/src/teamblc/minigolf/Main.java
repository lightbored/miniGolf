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
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    
    static public Round newRound ( String courseName, String playerName ){ //This method creates and stores a new round object, and returns a reference to that Round object.
        Round roundData = new Round();
        return roundData;
    }
        
    static public Round getRound (String player, String courseName ) { //This method looks up the Round object.  Note it isn't specified how you store Round objects, but a likely choice is some sort of “Collection”.  Keep in mind the garbage collection requirements for this object, discussed above.
        Round roundData = new Round();
        return roundData;
    }

    static public Course getCourse ( String courseName ) { //Returns a Course object.  These must be persisted to storage but there aren't many courses so creating a “Collection” to hold them all, read from a file say, is reasonable.  However exactly how you do this is an implementation detail.
        Course courseData = new Course();
        return courseData;
    }

    static public int scoreSoFar( String courseName, String playerName ) { //This method looks up the round information and returns it's score so far to the swipe station, to display.  (Yes it is redundant with Round.currentScore(), but the customer insisted — probably has a nephew or niece who is a “computer expert”.)
        
    return 0;
    }

    static public void enterStrokes ( String courseName, String playerName, int strokes ) { //This method is redundant.  It also will be used by the swipe-station once a player hits the button for their number of strokes for that hole.
    
    }

    static public String getCourseList (){
        
        return "list";
    }
    
    static public String getRoundList (){
        
        return "list";
    }    
}
