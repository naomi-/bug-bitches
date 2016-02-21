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
    
    StdDraw.setCanvasSize(1000, 1000);        
    // set the scale of the coordinate system
    StdDraw.setXscale(-1.0, 1.0);
    StdDraw.setYscale(-1.0, 1.0);
    
    // initial values for charBug
    double cx = 0.320, cy = 0.860;     // position
    double ocx = 0.480, ocy = 0.860;     // old position
    double cvx = 0.015, cvy = 0.023;     // velocity
    
    // initial values for nomBug
    double nx = 0.480, ny = 0.100;     // position
    double onx = 0.230, ony = 0.320;     // old position
    double nvx = 0.015, nvy = 0.023;     // velocity
    
    double radius = 0.05;              // radius
    
    //sets up background
    
    StdDraw.setPenColor(StdDraw.BLUE);
    StdDraw.filledSquare(0, 0, 1);
    
     //main animation loop
    while (true)  { 
      
      // bounce off wall according to law of elastic collision for charBug
      if (Math.abs(cx + cvx) > 1.0 - radius) cvx = -cvx;
      if (Math.abs(cy + cvy) > 1.0 - radius) cvy = -cvy;
      
      // bounce off wall according to law of elastic collision for nomBug
      if (Math.abs(nx + nvx) > 1.0 - radius) nvx = -nvx;
      if (Math.abs(ny + nvy) > 1.0 - radius) nvy = -nvy;
      
      // update position for charBug
      cx = cx + cvx; 
      cy = cy + cvy; 
      
      // update position for nomBug
      nx = nx + nvx;
      ny = ny + nvy;
      
      // clear the background for charBug
      //StdDraw.setPenColor(StdDraw.BLUE);
      //StdDraw.filledSquare(ocx, ocy, radius+.01);
      //ocx = cx;
      //ocy = cy;
      
      // clear the background for charBug
      //StdDraw.setPenColor(StdDraw.BLUE);
      //StdDraw.filledSquare(onx, ony, radius+.01);
      //onx = nx;
      //ony = ny;
      
      // Draw the charBug
      Bug.charBug(cx, cy);
      
     //Draw the nomBug
     StdDraw.setPenColor(153, 124, 9);
     StdDraw.filledCircle(nx, ny, radius);
      
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
