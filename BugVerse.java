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
  
  // initial values for wyBug
  public static double wx = 0.220, wy = 0.360;     // position
  public static double owx = 0.380, owy = 0.360;     // old position
  public static double wvx = 0.015, wvy = 0.023;     // velocity
  
  public static double radius = 0.17;              // radius (originally 0.05)
  
  public static void main(String[] args) { 
    
    
    StdDraw.setCanvasSize(500, 500);        
    // set the scale of the coordinate system
    StdDraw.setXscale(-1.0, 1.0);
    StdDraw.setYscale(-1.0, 1.0);
    
    
    //sets up background
    
    //StdDraw.setPenColor(.212, .063, .255);
    //StdDraw.filledSquare(0, 0, 1);
    String background = "bugbackground2.png";
    StdDraw.picture(0,0, background);
    
    int counter = 0;
    
    //main animation loop
    
    while (true)  { 
      
      counter++;
      
      if(counter>3){
        StdDraw.picture(0,0, background);
        counter=0;
      }
      
      if(!(StdDraw.mousePressed())){
        nomMove();
        charMove();
        wyMove();
      }
      
      if(StdDraw.hasNextKeyTyped()){
        char c = StdDraw.nextKeyTyped();
        if(c=='f'){
          //up the velocity towards x
          cvx=cvx+.01;
          nvx=nvx+.01;
          wvx=wvx+.01;
        }
        if(c=='s'){
          //up the y axis velocity
          cvy=cvy+.01;
          nvy=nvy+.01;
          wvy=wvy+.01;
        }
        if(c=='d'){
          //reset the velocity
          cvx = 0.015; cvy = 0.023; 
          nvx = 0.015; nvy = 0.023;
          wvx = 0.015; wvy = 0.023;
        }
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
    
    //Draw the nomBug
    Bug.nomBug(nx, ny);
    
    // display and pause for 20 ms
    StdDraw.show(20); 
  }
  
  public static void wyMove(){
    // bounce off wall according to law of elastic collision for wyBug
    if (Math.abs(wx + wvx) > 1.0 - radius) wvx = -wvx;
    if (Math.abs(wy + wvy) > 1.0 - radius) wvy = -wvy;
    // update position for wyBug
    wx = wx + wvx; 
    wy = wy + wvy; 
    
    // Draw the wyBug
    Bug.wyBug(wx, wy);
    
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
