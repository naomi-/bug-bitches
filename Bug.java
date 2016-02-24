/**
 * Bug Class: Creates bugSquad objects.
 */

public class Bug {

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

//hair
    StdDraw.setPenColor(.671, .502, .635);
    StdDraw.filledCircle(x, y + .13, .09);
    
 // Nombug's fabulous body
    StdDraw.setPenColor(.78, .584, .671);
    StdDraw.filledCircle(x, y, .13);
    StdDraw.setPenColor(.431, .161, .278);
    StdDraw.filledCircle(x, y, .03);
    
//face
    StdDraw.setPenColor(1.0, .87, .68);
    StdDraw.filledCircle(x, (y+.13), .06);
    
//eyes
   StdDraw.setPenColor(.55, .66, .44);
   StdDraw.filledCircle((x - .02), (y + .15), .01);
   StdDraw.filledCircle((x + .02), (y + .15), .01);

//mouth
    StdDraw.setPenColor(StdDraw.PINK);
    StdDraw.filledCircle(x , y + .106 , .012);   
    
  }

// WYBUG IS HARMLESS  
  public static void wyBug(double x, double y){
    
//hair
    StdDraw.setPenColor(.863, .576, 0);
    StdDraw.filledCircle(x, y + .13, .09);
    
//body
    StdDraw.setPenColor(.341, .467, .173);
    StdDraw.filledCircle(x - .1, y, .12);
    StdDraw.filledCircle(x - .2, y, .10);
    StdDraw.filledCircle(x - .3, y, .10);
    StdDraw.filledCircle(x - .4, y, .8);
    StdDraw.filledCircle(x - .5, y, .8);
    StdDraw.filledCircle(x - .6, y, .7);
    
//face
    StdDraw.setPenColor(.945, 0.08, .733);
    StdDraw.filledCircle(x, (y+.15), .05);
    
//eyes
   StdDraw.setPenColor(.02, .573, .729);
   StdDraw.filledCircle((x - .02), (y + .15), .01);
   StdDraw.filledCircle((x + .02), (y + .15), .01);
   
  }
  
}
