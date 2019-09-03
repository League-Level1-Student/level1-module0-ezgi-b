void checkCatch(int y, int x){
  if(y==344){
    if(x>mouseX-5 && x<mouseX+55){
      score++;
      dropY=-10;
      randomX=(int) random(width);
    }else{
      if(score>0){
        score--;
      }
    }
    println("Your score is now " + score);
  }
}

void setup(){
  size(600,400);
}

int dropY=-10;
int randomX=(int) random(width);
int score = 0;

void draw(){
  background(255,200,200);
  noStroke();
  
  
  if(dropY>=410){
    dropY=-10;
    randomX=(int) random(width);
  }
  
  // drop
  fill(150,150,255);
  ellipse(randomX,dropY,10,20);
  dropY+=2;
  
  //bucket
  fill(100,100,100);
  rect(mouseX-5,335,60,15);
  rect(mouseX,350,50,50);
  strokeWeight(3);
  stroke(100,100,100);
  noFill();
  ellipse(mouseX+25,335,55,30);
  checkCatch(dropY,randomX);
  
  fill(0,0,0);
  textSize(16);
  text("Score: " + score, 520,380);
}
