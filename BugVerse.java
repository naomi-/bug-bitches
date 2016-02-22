/**
 * Lab 12 - CSF Winter 2016
 * Charlie Fornaca
 * Naomi Touchet
 * 
 * This is the BugVerse!! By Naomi and Charlie
 */

public class BugVerse {
  
  // initial values for charBug
  public static double cx = 0.320, cy = 0.860;     // position
  public static double ocx = 0.480, ocy = 0.860;     // old position
  public static double cvx = 0.015, cvy = 0.023;     // velocity
  
  // initial values for nomBug
  public static double nx = 0.480, ny = 0.100;     // position
  public static double onx = 0.230, ony = 0.320;     // old position
  public static double nvx = 0.015, nvy = 0.023;     // velocity
  
  public static double radius = 0.05;              // radius
  
  public static void main(String[] args) { 
    
    
    StdDraw.setCanvasSize(1000, 1000);        
    // set the scale of the coordinate system
    StdDraw.setXscale(-1.0, 1.0);
    StdDraw.setYscale(-1.0, 1.0);
    
    
    //sets up background
    
    StdDraw.setPenColor(.212, .063, .255);
    StdDraw.filledSquare(0, 0, 1);
    
    //Does this need to be a wav file?
    StdAudio.play("BugDeath.mp3"); 
    
    //main animation loop
    while (true)  { 
      
      if(!(StdDraw.mousePressed())){
        charMove();
        nomMove();
      }
      
      if(StdDraw.mouseX()==nx && StdDraw.mouseY()==ny){
       StdAudio.play("BugDeath.mp3"); 
      }
      
    }
  }
  
  public static void charMove(){
    // bounce off wall according to law of elastic collision for charBug
    if (Math.abs(cx + cvx) > 1.0 - radius) cvx = -cvx;
    if (Math.abs(cy + cvy) > 1.0 - radius) cvy = -cvy;
    
    // update position for charBug
    cx = cx + cvx; 
    cy = cy + cvy; 
    
    // clear the background for charBug
    StdDraw.setPenColor(StdDraw.BLUE);
    StdDraw.filledSquare(ocx, ocy, radius+.01);
    ocx = cx;
    ocy = cy;
    
    // Draw the charBug
    Bug.charBug(cx, cy);
    
    // display and pause for 20 ms
    StdDraw.show(20); 
  }
  
  public static void nomMove(){
    
    // bounce off wall according to law of elastic collision for nomBug
    if (Math.abs(nx + nvx) > 1.0 - radius) nvx = -nvx;
    if (Math.abs(ny + nvy) > 1.0 - radius) nvy = -nvy;
    
    // update position for nomBug
    nx = nx + nvx;
    ny = ny + nvy;
    
    // clear the background for nomBug
    StdDraw.setPenColor(StdDraw.BLUE);
    StdDraw.filledSquare(onx, ony, radius+.01);
    onx = nx;
    ony = ny;
    
    //Draw the nomBug
    Bug.nomBug(nx, ny);
    
    // display and pause for 20 ms
    StdDraw.show(20); 
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
