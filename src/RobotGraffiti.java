import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	public static void main(String[] args) {
		Robot NAME = new Robot();
		
		for (int i = 1; i < 5; i++) {
			NAME.penDown();
			if (i == 1) {
				NAME.turn(15);
			}
			
			if (i == 2) {
				NAME.turn(120);
			}

			if (i == 3) {
				NAME.turn(-120);
			}
			
			if (i == 4) {
				NAME.turn(90);
			}
			
			NAME.move(100);
		}
		 
	}
}

