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
public class Course {
    private String courseName;
    private int holes;
    private int[][] par;

    public String getName() {
        return this.courseName;
    }

    public int getNumberOfHoles () {
        return this.holes;
    }

    public int parForHole ( int hole ) {
        return this.par[hole][1];
    }
}
