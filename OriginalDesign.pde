void setup()
{
size(400,400);
}
void draw()
{
background(0,0,255);
 
  fill(0,255,0);
  beginShape();
  vertex(50,100);
  vertex(50,100);
  vertex(60,80);
  vertex(150,100);
  vertex(250,100);
  vertex(230,120);
  vertex(270,110);
  vertex(280,100);
  vertex(300,100);
  vertex(305,110);
  vertex(310,110);
  vertex(315,140);
  vertex(320,140);
  vertex(330,140);
  vertex(350,115);
  vertex(390,90);
  vertex(390,110);
  //Maine
  vertex(365,125);
  vertex(375,115);
  vertex(350,160);
  vertex(375,160);
  vertex(375,170);
  vertex(350,170);
  vertex(335,220);
  vertex(320,240);
  vertex(370,370);
  vertex(50,370);
  endShape();

  fill(255,255,255);
ellipse(mouseX,mouseY,30,30);
}

