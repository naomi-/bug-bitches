/**
 * Lab 12 - CSF Winter 2016
 * Charlie Fornaca
 * Naomi Touchet
 * 
 * This is the BugVerse!! By Naomi and Charlie
 */
public class BugVerse {
  
  
  public static void main(String[] args) { 
    
    // Adam's code that I straight-up stole
    
    StdDraw.setCanvasSize(500,500);        
// set the scale of the coordinate system
    StdDraw.setXscale(-1.0, 1.0);
    StdDraw.setYscale(-1.0, 1.0);
    
    // initial values
    double rx = 0.320, ry = 0.860;     // position
    double orx = 0.480, ory = 0.860;     // old position
    double vx = 0.015, vy = 0.023;     // velocity
    
    double radius = 0.05;              // radius
    
    StdDraw.setPenColor(StdDraw.BLUE);
    StdDraw.filledSquare(0, 0, 1);
    
    // main animation loop
    while (true)  { 
      
      // bounce off wall according to law of elastic collision
      if (Math.abs(rx + vx) > 1.0 - radius) vx = -vx;
      if (Math.abs(ry + vy) > 1.0 - radius) vy = -vy;
      
      // update position
      rx = rx + vx; 
      ry = ry + vy; 
      
      // clear the background
      StdDraw.setPenColor(StdDraw.BLUE);
      StdDraw.filledSquare(orx, ory, radius+.01);
      orx = rx;
      ory = ry;
      
      // Make this into bugs
      // draw ball on the screen
      StdDraw.setPenColor(StdDraw.BLACK); 
      StdDraw.filledCircle(rx, ry, radius); 
      
      // display and pause for 20 ms
      StdDraw.show(20); 
    } 
  }
  
// Adam's Random Number Generator  
  /* myRand(int low, int high) returns a random integer, low<=r<=high
   * Paramaters: low, and high -- the range for the random number
   * Returns: the random integer
   */
  public static int myRand(int low, int high) {
    int rand=0;
    
    rand=((int)((Math.random()*(high-low+1))+low));
    
    return rand;
    
  } 
}
