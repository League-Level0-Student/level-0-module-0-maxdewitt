import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	
	Robot jeff = new Robot("vic");
	jeff.penDown();
	jeff.setSpeed(150);
	jeff.turn(360);
	jeff.move(-250);
	jeff.move(250);
	jeff.turn(90);
	jeff.move(250);
	jeff.turn(90);
	jeff.move(250);
	jeff.turn(90);
	jeff.move(250);
	}
}
