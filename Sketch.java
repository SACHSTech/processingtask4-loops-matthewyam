import processing.core.PApplet;

public class Sketch extends PApplet {
	
  int c1 = color(255);
  int c2 = color(0);
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(500, 500);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255, 255, 255);


  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
    //10x10 box
    stroke(0);
    for (int boxX = width/10; boxX<=(width/2); boxX +=20) 
      {line(boxX, 0, boxX, height/2);
    }
    stroke(0);
    for (int boxY = height/10; boxY<=(height/2); boxY +=20) 
      {line(width/2, boxY, 0, boxY);
    }
    //gradiant
    stroke(0);
    for (int gradiant = 20; gradiant <= (width/2); gradiant+=20) {
      ;
    
      for (int i = 0; i<width/2; i++){
      stroke(c1, i, c2);
      line(i,0+height/2,i,height);
      }
    }
  }
  
  // define other methods down here.
}