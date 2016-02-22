/**
 * Bug Class: Creates charBug and nomBug objects.
 */

public class Bug {
  
  public static int MAXBUGS = 10;
  public static int numberOfBugs=0;
  public static int bugsMade=0;
  public static Bug[] bugs = new Bug[MAXBUGS];
  
  int bugType = BugVerse.myRand(1,2);
  
  public Bug(int bugType) { 
    
    if (bugType < 50) { // Need to look into how Adam's random number generator works.
      // make charBug
    } else if (bugType > 50) {// Need to look into how Adam's random number generator works.
      // make nomBug
    }
  }
  
  Bug() {
    bugs[bugsMade] = this;
    bugsMade++;
    numberOfBugs++;
  }

// BEWARE OF CHAR-BUG! SHE WILL STING YOU!  
  public static void charBug(double x, double y){
    
//hair
    StdDraw.setPenColor(.55, .51, .3);
    StdDraw.filledCircle(x, y + .13, .09);
    StdDraw.filledCircle(x, y + .2, .04);
    
//body
    StdDraw.setPenColor(.341, .467, .173);
    StdDraw.filledCircle(x, y, .12);
    
//face
    StdDraw.setPenColor(1.0, .96, .93);
    StdDraw.filledCircle(x, (y+.13), .06);
    
//eyes
   StdDraw.setPenColor(.48, .25, .0);
   StdDraw.filledCircle((x - .02), (y + .15), .01);
   StdDraw.filledCircle((x + .02), (y + .15), .01);

//mouth
    StdDraw.setPenColor(StdDraw.PINK);
    StdDraw.filledCircle(x , y + .106 , .012);    
  }
 
  // BEWARE OF NAOMI-BUG! SHE WILL BITE YOU!
  public static void nomBug(double x, double y){
    StdDraw.setPenColor(.78, .584, .671);
    StdDraw.filledCircle(x, y, .13);
    StdDraw.setPenColor(.431, .161, .278);
    StdDraw.filledCircle(x, y, .03);
    StdDraw.filledCircle(x, y+.13, .09);
  }
  
  
}
