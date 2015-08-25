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
  vertex(230,140);
  vertex(270,110);
  endShape();

  fill(255,255,255);
ellipse(mouseX,mouseY,30,30);
}

