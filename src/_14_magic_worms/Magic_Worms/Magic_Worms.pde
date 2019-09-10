void setup(){
  size(700,700);
  background(235,80,150);
}



void draw(){
  background(0,0,0);
  for(int i=0; i<300; i++){
    noStroke();
    if(i%3==0){
      fill(200,250,220);
    }
    if(i%3==1){
      fill(10,20,180);
    }
     if(i%3==2){
      fill(10,250,180);
    }
    
    
    if(getWormX(i)%10<3){
      ellipse(getWormX(i)-8,getWormY(i),4,4);
      ellipse(getWormX(i),getWormY(i)-8,4,4);
      ellipse(getWormX(i)+8,getWormY(i),4,4);
      ellipse(getWormX(i),getWormY(i)+8,4,4);
    }else if(getWormX(i)%10<5){
      ellipse(getWormX(i)-10,getWormY(i),2,2);
      ellipse(getWormX(i),getWormY(i)-10,2,2);
      ellipse(getWormX(i)+10,getWormY(i),2,2);
      ellipse(getWormX(i),getWormY(i)+10,2,2);
    }else if(getWormX(i)%10<7){
     ellipse(getWormX(i),getWormY(i),6,2);
     ellipse(getWormX(i),getWormY(i),2,6);
    }else{
      ellipse(getWormX(i),getWormY(i),10,2);
      ellipse(getWormX(i),getWormY(i),2,10);
    }
  }
}







 float frequency = .001;
 float noiseInterval = PI;

 void makeMagical() {
     fill( 0, 0, 0, 10 );
     rect(0, 0, width, height);
     noStroke();
 }

 float getWormX(int i) {
     return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
 }

 float getWormY(int i) {
     return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
 }
