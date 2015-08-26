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
background(50,200,240);
USA();
cursor();
 }
 public void USA()
 {
  fill(240,230,10);
  beginShape();
  vertex(30,80);
  vertex(50,100);
  vertex(60,80);
  vertex(150,100);
  vertex(250,100);
  vertex(230,120);
  vertex(270,110);
  vertex(280,100);
  vertex(300,100);
  vertex(300,100);
  vertex(305,110);
  vertex(310,110);
  vertex(315,120);
  vertex(310,140);
  vertex(320,140);
  vertex(330,140);
  vertex(350,115);
  vertex(375,80);
  vertex(390,90);
  vertex(390,110);
  //Maine
  vertex(375,125);
  vertex(350,160);
  vertex(375,160);
  vertex(375,170);
  vertex(350,180);
  vertex(340,200);
  vertex(335,220);
  vertex(320,240);
  vertex(345,260);
  vertex(330,280);
  vertex(310,300);
  vertex(340,370);
  vertex(320,360);
  vertex(270,300);
  vertex(230,300);
  vertex(215,330);
  vertex(200,360);
  //Texas
  vertex(180,330);
  vertex(170,310);
  vertex(160,310);
  vertex(140,290);
  vertex(100,275);
  vertex(65,260);
  vertex(30,200);
  vertex(30,80);
  endShape();
  
}
public void cursor()
{
  fill(255,0,0);
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
