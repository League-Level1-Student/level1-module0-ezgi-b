import ddf.minim.*;

PImage pictureOfRecord;
int angle =0;


Minim minim;
AudioPlayer song;



void setup(){ 
  minim = new Minim(this);
  song = minim.loadFile("awesomeTrack.mp3", 512);
  size(600,600);                                
  pictureOfRecord= loadImage("record.jpg");
  pictureOfRecord.resize(height,width);
  image(pictureOfRecord, 0, 0);
   
}



void draw(){
  
  if(mousePressed==true){
  rotateImage(pictureOfRecord, angle);
  image(pictureOfRecord, 0, 0);
  if(keyCode==66){
    angle+=3;
  }else{
    angle-=3;
  }
  song.play();
  }else{
  song.pause();
  }
}

void rotateImage(PImage image, int amountToRotate){
  translate(width/2, height/2);
  rotate(amountToRotate*TWO_PI/360);
  translate(-image.width/2, -image.height/2);
}
