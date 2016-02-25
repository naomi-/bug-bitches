/**
 * Lab 12 - CSF Winter 2016
 * Charlie Fornaca
 * Naomi Touchet
 * 
 * This is the BugVerse!! By Naomi and Charlie
 */

public class BugVerse {
  
  
  public static void main(String[] args) { 
    
    StdDraw.setCanvasSize(500, 500);        
    // set the scale of the coordinate system
    StdDraw.setXscale(-1.0, 1.0);
    StdDraw.setYscale(-1.0, 1.0);
    
    //Give instructions to viewer
    StdDraw.setPenColor(StdDraw.WHITE);
    StdDraw.filledSquare(0,0,250);
    
    char play = ' ';
    
    StdDraw.setPenColor(StdDraw.BLACK);
    StdDraw.text(0,.4,"Welcome to the world of bugs!");
    StdDraw.text(0,.3, "Use the number keys from 1 - 5 to make bugs.");
    StdDraw.text(0,.2, "Press 6 to kill a bug.");
    StdDraw.text(0,.1, "The b key takes you to a new bug world.");
    StdDraw.text(0, 0, "The f, d, and s keys make the bugs move in different ways.");
    StdDraw.text(0,-.1,"Click your mouse to pause the game.");
    StdDraw.text(0,-.2,"Press p if you're ready to start!");
    
    //sets up background
    int bgCounter = 0;
    String background = "bugbackground2.png";
    
    while(play!='p'){
    if(StdDraw.hasNextKeyTyped()){
      play = StdDraw.nextKeyTyped();
    }
    }
    
    int counter = 0;
    
    if(play=='p'){
      //let's play!
      
      //main animation loop
      while (true)  { 
        
        counter++;
        
        //clear the trails
        if(counter>3){
          StdDraw.picture(0,0, background);
          counter=0;
        }
        
        //pause if the mouse is pressed
        if(!(StdDraw.mousePressed())){
          Bug.drawBugs();
        }
        
        //accept user input and act accordingly (make bugs, change bug movement, change the background)
        if(StdDraw.hasNextKeyTyped()){
          char c = StdDraw.nextKeyTyped();
          if(c=='1'){
            //Make a new charBug
            Bug newBug = new Bug(1);
          }
          if(c=='2'){
            //Make a new nomBug
            Bug newBug = new Bug(2);
          }
          if(c=='3'){
            //Make a new wyBug
            Bug newBug = new Bug(3);
          }
          if(c=='4'){
            //Make a new basBug
            Bug newBug = new Bug(4);
          }
          if(c=='5'){
            //Make a new adBug
            Bug newBug = new Bug(5);
          }
          if(c=='6'){
            Bug.bugsMade--;
            StdAudio.play("bugdeath.wav");
          }
          if(c=='f'){
            //let's go faster!
            Bug.vx = Bug.vx+0.01; Bug.vy=0.01;
            
          }
          if(c=='s'){
            //let's go slower!
            Bug.vx = Bug.vx-0.01; Bug.vy = Bug.vy-0.01;
          }
          if(c=='d'){
            //reset the velocity
            Bug.vx = 0.015; Bug.vy = 0.023; 
          }
          if(c=='b'){
            if(bgCounter%2==0){
              background = "bugbackground.png";
              bgCounter++;
            }else{
              background = "bugbackground2.png";
              bgCounter++;
            }
          }
        } 
      }
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
