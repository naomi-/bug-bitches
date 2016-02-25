/**
 * Lab 12 - CSF Winter 2016
 * Charlie Fornaca
 * Naomi Touchet
 * 
 * This is the BugVerse!! By Naomi and Charlie
 */

public class BugVerse {
  
  //initial values for velocity
  public static double vx = 0.015, vy = 0.023;     // velocity
  
  // initial values for charBug
  public static double cx = 0.320, cy = 0.860;     // position
  public static double ocx = 0.480, ocy = 0.860;     // old position
  
  // initial values for nomBug
  public static double nx = 0.480, ny = 0.100;     // position
  public static double onx = 0.230, ony = 0.320;     // old position
  
  // initial values for wyBug
  public static double wx = 0.220, wy = 0.360;     // position
  public static double owx = 0.380, owy = 0.360;     // old position
  
  public static double radius = 0.17;              // radius (originally 0.05)
  
  public static void main(String[] args) { 
    
    
    StdDraw.setCanvasSize(500, 500);        
    // set the scale of the coordinate system
    StdDraw.setXscale(-1.0, 1.0);
    StdDraw.setYscale(-1.0, 1.0);
    
    
    //sets up background
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
          vx=vx+.01;
          //decrease velocity towards y
        }
        if(c=='s'){
          //up the y axis velocity
          vy=vy+.01;
        }
        if(c=='d'){
          //reset the velocity
          vx = 0.015; vy = 0.023; 
        }
      } 
    }
  }
  
  public static void charMove(){
    // bounce off wall according to law of elastic collision for charBug
    if (Math.abs(cx + vx) > 1.0 - radius) vx = -vx;
    if (Math.abs(cy + vy) > 1.0 - radius) vy = -vy;
    
    // update position for charBug
    cx = cx + vx; 
    cy = cy + vy; 
    
    // Draw the charBug
    Bug.charBug(cx, cy);
    
    // display and pause for 20 ms
    StdDraw.show(20); 
  }
  
  public static void nomMove(){
    
    // bounce off wall according to law of elastic collision for nomBug
    if (Math.abs(nx + vx) > 1.0 - radius) vx = -vx;
    if (Math.abs(ny + vy) > 1.0 - radius) vy = -vy;
    
    // update position for nomBug
    nx = nx + vx;
    ny = ny + vy;
    
    //Draw the nomBug
    Bug.nomBug(nx, ny);
    
    // display and pause for 20 ms
    StdDraw.show(20); 
  }
  
  public static void wyMove(){
    // bounce off wall according to law of elastic collision for wyBug
    if (Math.abs(wx + vx) > 1.0 - radius) vx = -vx;
    if (Math.abs(wy + vy) > 1.0 - radius) vy = -vy;
    // update position for wyBug
    wx = wx + vx; 
    wy = wy + vy; 
    
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
