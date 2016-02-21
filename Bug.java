/**
 * Bug Class: Creates charBug and nomBug objects.
 */

public class Bug {
  
  public static int MAXBUGS = 10;
  public static int numberOfBugs=0;
  public static int bugsMade=0;
  public static Bug[] bug = new Bug[MAXBUGS];
  
  int bugType = myRand(1,2);
  
  public Bug(int bugType) { 
    
    if (bugType < ) { // Need to look into how Adam's random number generator works.
      // make charBug
    } else if (bugType > ) {// Need to look into how Adam's random number generator works.
      // make nomBug
    }
  }
  
  Bug() {
    bugs[bugsMade] = this;
    bugsMade++;
    numberOfBugs++;
  }
  
  public void charBug(){
    
    
//hair
    StdDraw.setPenColor(153, 124, 9);
    StdDraw.filledEllipse(200.0, 116.0, 90.0, 90.0);
    StdDraw.filledEllipse(200.0, 60.0, 40.0, 40.0);
    
//body
    StdDraw.setPenColor(172, 145, 230);
    StdDraw.filledEllipse(200.0, 233.0, 200.0, 220.0);
    
//legs
    StdDraw.filledRectangle(40.0, 180.0, 325.0, 20.0);
    StdDraw.filledRectangle(40.0, 220.0, 325.0, 20.0);
    StdDraw.filledRectangle(40.0, 260.0, 325.0, 20.0);
    
//face
    StdDraw.setPenColor(242, 202, 175);
    StdDraw.filledEllipse(200.0, 116.0, 64.0, 55.0);
    
//eyes
    StdDraw.setPenColor(26, 25, 26);
    StdDraw.filledEllipse(189.0, 116.0, 10.0, 10.0);
    StdDraw.filledEllipse(215.0, 116.0, 10.0, 10.0);
    
//mouth
    StdDraw.setPenColor(199, 58, 58);
    StdDraw.filledEllipse(203.0, 130.0, 10.0, 10.0);
    
  }
  
  public void nomBug(){
    
  }
  
  
}
