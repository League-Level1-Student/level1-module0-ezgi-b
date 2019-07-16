package _01_houses;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
static Robot Walle = new Robot();
public static void main(String[] args) {
	
	int color = 0;
	int height = 0;
	boolean point = true;
	Walle.miniaturize();
	Walle.setPenWidth(10);
	Walle.setSpeed(90);
	Walle.moveTo(50, 500);
	Walle.turn(90);
	for(int i=0; i<7; i++) {
		height+=30;
		color+=30;
		Walle.penDown();
		Walle.setPenColor(0, color, 0);
		Walle.move(30);
		Walle.turn(-90);
		buildHouse(height, color);
	}
	for(int i=0; i<6; i++) {
		height-=30;
		color-=30;
		Walle.penDown();
		Walle.setPenColor(0, color, 0);
		Walle.move(30);
		Walle.turn(-90);
		buildHouse(height, color);
	}
	
	Walle.moveTo(50, 200);
	Walle.turn(-90);
	Walle.setPenColor(200, 0, 0);
	for(int i=0; i<5; i++) {
		if(i%2==0) {
			point=false;
			Walle.setPenColor(200, 0, 0);
		}else {
			point=true;
			Walle.setPenColor(0, 0, 200);
		}
		buildHouseTypes(point);
		Walle.penDown();
		Walle.setPenColor(0, color, 0);
		Walle.move(30);
		Walle.turn(-90);
		}
}

private static void buildHouse(int h, int r) {
	Walle.setPenWidth(10);
	Walle.setPenColor(r, 0, 0);
	Walle.move(h);
	Walle.turn(45);
	Walle.move(30);
	Walle.turn(90);
	Walle.move(30);
	Walle.turn(45);
	Walle.move(h);
	Walle.turn(-90);
	
}
private static void buildHouseTypes(boolean s) {
	Walle.setPenWidth(10);
	Walle.move(90);
	if(s==true) {
		Walle.turn(45);
		Walle.move(30);
		Walle.turn(90);
		Walle.move(30);
		Walle.turn(45);
	} else {
		Walle.turn(90);
		Walle.move(50);
		Walle.turn(90);
	}
	Walle.move(90);
	Walle.turn(-90);

}
}
