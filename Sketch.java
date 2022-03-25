import processing.core.PApplet;

public class Sketch extends PApplet {
	
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
    for (int boxX = 0; boxX<=(width/2); boxX +=20)
      {line(boxX, width/2, boxX, 0);
    }
    stroke(0);
    for (int boxY = 0; boxY<=(height/2); boxY +=20) 
      {line(width/2, boxY, 0, boxY);
    }
    //gradiant
    for (int gradiant = 0; gradiant <= (width/2); gradiant+=10) {
      ;
    
      for (int i = 0; i<width/2; i++){
      stroke(i, i, i);
      line(i,0+height/2,i,height);
      }

    //circle
    stroke(0);
    for (int circleY = 40; circleY <= (height/2)-20; circleY += 50) {
      for (int circleX = (0+ (width/2)); circleX <= width-50; circleX += 50) {
        ellipse(circleX+25, circleY, 40, 40);
    }
  }
}
  
  // define other methods down here.
}
}