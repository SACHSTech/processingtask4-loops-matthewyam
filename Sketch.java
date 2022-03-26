import processing.core.PApplet;

public class Sketch extends PApplet {
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
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
    for (int boxX = 0; boxX<=(width/2); boxX += (width/2/10))
      {line(boxX, width/2, boxX, 0);
    }
    stroke(0);
    for (int boxY = 0; boxY<=(height/2); boxY +=(width/2/10)) 
      {line(width/2, boxY, 0, boxY);
    }
    //gradiant
    for (int gradiant = 0; gradiant <= (width/2); gradiant+=10) 
      for (int i = 0; i<width/2; i++){
      stroke(i, i, i);
      line(i,0+height/2,i,height);
      }

    //circle
    stroke(0);
    for (int circleY = 20; circleY <= (height/2)-20; circleY += width/2/5) {
      for (int circleX = (0+ (width/2)); circleX <= width; circleX += width/2/5) {
        fill(123,63,6);
        ellipse(circleX+25, circleY, 40, 40);
   
     }
    }

   //flower
    fill(255,0,0);
    int petalX = (width/4)*3;
    int petalY = (height/4)*3;
  
    translate(petalX,petalY);
    for (int petal = 0; petal < 8; petal++){
      ellipse(0, width/10, width/10, height/8);
      rotate(radians(45));
    }
    
    fill(0,255,0);
      ellipse(0, 0, (width/7), (width/7));
 
        
  }
}
  
  // define other methods down here.
  
