import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

public void setup()
{
size(400,400);
}
public void draw()
{
background(0,0,255);
 
  fill(0,255,0);
  beginShape();
  vertex(50,100);
  vertex(50,100);
  vertex(60,80);
  vertex(150,100);
  vertex(250,100);
  vertex(230,140);
  vertex(270,110);
  endShape();

  fill(255,255,255);
ellipse(mouseX,mouseY,30,30);
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
