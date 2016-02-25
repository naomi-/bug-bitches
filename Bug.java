/**
 * Bug Class: Creates bugSquad objects.
 */

public class Bug {
  
  public static int maxbugs = 10; 
  public static Bug[] bugs = new Bug[maxbugs];
  public static int bugsMade=0;
  
  private int type = 0;
  
    //initial values for velocity
  public static double vx = 0.015, vy = 0.023;     // velocity
  
  // initial values for charBug
  public static double cx = 0.320, cy = 0.860;     // position
  public static double ocx = 0.480, ocy = 0.860;     // old position
  
  // initial values for nomBug
  public static double nx = 0.420, ny = 0.960;     // position
  public static double onx = 0.580, ony = 0.960;     // old position
  
  // initial values for wyBug
  public static double wx = 0.220, wy = 0.760;     // position
  public static double owx = 0.380, owy = 0.760;     // old position
  
  // initial values for basBug
  public static double bx = 0.120, by = 0.660;     // position
  public static double obx = 0.280, oby = 0.660;     // old position
  
  // initial values for adBug
  public static double ax = 0.020, ay = 0.550;     // position
  public static double oax = 0.180, oay = 0.550;     // old position
  
  public static double radius = 0.17;              // radius (originally 0.05)
  
  Bug(int type){
    bugs[bugsMade]=this;
    bugsMade++;
    switch(type) {
      case 1: this.type=type;
      break;
      case 2: this.type=type;
      break;
      case 3: this.type=type;
      break;
      case 4: this.type=type;
      break;
      case 5: this.type=type;
      break;
      
    }
  }
  
  public static void drawBugs(){
    for(int i=0;i<bugsMade;i++){
      int x = bugs[i].type;
      switch(x){
        case 1: charMove();
        break;
        case 2: nomMove();
        break;
        case 3: wyMove();
        break;
        case 4: basMove();
        break;
        case 5: adMove();
        break;
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
  
  public static void basMove(){
    // bounce off wall according to law of elastic collision for basBug
    if (Math.abs(bx + vx) > 1.0 - radius) vx = -vx;
    if (Math.abs(by + vy) > 1.0 - radius) vy = -vy;
    // update position for basBug
    bx = bx + vx; 
    by = by + vy; 
    
    // Draw the basBug
    Bug.basBug(bx, by);
    
    // display and pause for 20 ms
    StdDraw.show(20); 
  }
  
    
  public static void adMove(){
    // bounce off wall according to law of elastic collision for adBug
    if (Math.abs(ax + vx) > 1.0 - radius) vx = -vx;
    if (Math.abs(ay + vy) > 1.0 - radius) vy = -vy;
    // update position for adBug
    ax = ax + vx; 
    ay = ay + vy; 
    
    // Draw the adBug
    Bug.adBug(ax, ay);
    
    // display and pause for 20 ms
    StdDraw.show(20); 
  }
  
// BEWARE OF CHAR-BUG! SHE WILL STING YOU!  
  public static void charBug(double x, double y){
    
//hair
    StdDraw.setPenColor(.694, .592, .102);
    StdDraw.filledCircle(x, y + .13, .09);
    StdDraw.filledCircle(x, y + .2, .04);
    
//body
    StdDraw.setPenColor(.533, 0, .224);
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
    
//Naomi wanted purple hair
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
    StdDraw.setPenColor(.129, .047, .596);
    StdDraw.filledCircle(x - .1, y, .12);
    
    StdDraw.setPenColor(.02, .573, .729);
    StdDraw.filledCircle(x - .2, y, .10);
    
    StdDraw.setPenColor(.129, .047, .596);
    StdDraw.filledCircle(x - .3, y, .10);
    
    StdDraw.setPenColor(.02, .573, .729);
    StdDraw.filledCircle(x - .4, y, .08);
    
    StdDraw.setPenColor(.129, .047, .596);
    StdDraw.filledCircle(x - .5, y, .07);
    
    StdDraw.setPenColor(.02, .573, .729);
    StdDraw.filledCircle(x - .6, y, .06);
    
    
//hair
    StdDraw.setPenColor(.863, .576, 0);
    StdDraw.filledCircle(x, y + .13, .09);
    
//face
    StdDraw.setPenColor(.976, .878, .812);
    StdDraw.filledCircle(x, (y+.15), .05);
    
//eyes
    StdDraw.setPenColor(.02, .573, .729);
    StdDraw.filledCircle((x - .02), (y + .15), .01);
    StdDraw.filledCircle((x + .02), (y + .15), .01);  
  }
  
  
  
  
// BASBUG ISN'T EVEN IN CSF (YET)!  
  public static void basBug(double x, double y){
//body
    StdDraw.setPenColor(.129, .047, .596);
    StdDraw.filledCircle(x + .1, y, .12);
    
    StdDraw.setPenColor(.533, 0, .224);
    StdDraw.filledCircle(x + .2, y, .10);
    
    StdDraw.setPenColor(.129, .047, .596);
    StdDraw.filledCircle(x + .3, y, .10);
    
    StdDraw.setPenColor(.533, 0, .224);
    StdDraw.filledCircle(x + .4, y, .08);
    
    StdDraw.setPenColor(.129, .047, .596);
    StdDraw.filledCircle(x + .5, y, .07);
    
    StdDraw.setPenColor(.533, 0, .224);
    StdDraw.filledCircle(x + .6, y, .06);
    
//hair
    StdDraw.setPenColor(1.0, .898, .4);
    StdDraw.filledCircle(x, y + .13, .09);
    StdDraw.filledCircle(x, y + .2, .04);
    
//face
    StdDraw.setPenColor(.976, .878, .812);
    StdDraw.filledCircle(x, (y+.15), .05);
    
//eyes
    StdDraw.setPenColor(.227, .18, .827);
    StdDraw.filledCircle((x - .02), (y + .15), .01);
    StdDraw.filledCircle((x + .02), (y + .15), .01);
    
  }  
  
  
  
  
  
// ADBUG IS A WISE AND COOL PROFESSOR THAT LIKES ALIENS
  public static void adBug(double x, double y){
    
//hair
    StdDraw.setPenColor(.118, .09, .063);
    StdDraw.filledCircle(x, y + .13, .09);
    
    //body
    StdDraw.setPenColor(.118, .114, .133);
    StdDraw.filledCircle(x, y, .13);
    StdDraw.setPenColor(.227, .18, .827);
    StdDraw.filledCircle(x, y, .03);
    
//face
    StdDraw.setPenColor(1.0, .87, .68);
    StdDraw.filledCircle(x, (y+.15), .05);
    
//eyes
    StdDraw.setPenColor(.48, .25, .0);
    StdDraw.filledCircle((x - .02), (y + .15), .01);
    StdDraw.filledCircle((x + .02), (y + .15), .01); 
    
  }
  
}
