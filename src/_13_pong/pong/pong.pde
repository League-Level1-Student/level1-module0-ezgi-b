import ddf.minim.*;
Minim minim;
AudioSample sound;
PImage backgroundImage;

void setup(){
  backgroundImage = loadImage("Bricks.jpg");
  minim = new Minim (this);
  sound=minim.loadSample("pong.wav", 128);
  size(500,600);
  background(100,10,100);
}

int ballX=10;
int addToX=3;

int ballY=10;
int addToY=3;

void draw(){
  image(backgroundImage,0,0);
  image(backgroundImage, 0, 0, width, height);
  
  noStroke();
  fill(100,50,50);
  rect(mouseX-40,585,80,15);
  
  fill(200,75,125);
  strokeWeight(3);
  stroke(250,125,175);
  ellipse(ballX,ballY,30,30);
  
  if(ballX>=width-10){
    addToX=-3;
  }
  if(ballX<=10){
    addToX=3;
  }
  
  
  
  
  if(ballY>=height-10){
    addToY=-3;
    sound.trigger();
  }
  if(ballY<=10){
    addToY=3;
  }
  
  if(ballY>=575 && ballX>=mouseX-40 && ballX<=mouseX+40){
    addToY=addToY*-1;
  }
  
  ballX+=addToX;
  ballY+=addToY;
}
