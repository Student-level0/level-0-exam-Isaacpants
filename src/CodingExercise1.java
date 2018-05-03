import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

	public static void main(String[] args) {
		Robot r2d2 = new Robot();
		r2d2.hide();
		// 3. ask the user what color they would like the Robot to draw
		String c = JOptionPane.showInputDialog("Wut color black or blue");
		// 4. use an if/else statement to set the pen color that the user requested
		// (minimum of 2 colors)
		if (c.equals("blue")) {
			r2d2.setPenColor(0, 17, 255);

		} else {

		}
		// 2. set the pen width to 10
		r2d2.penDown();
		r2d2.setPenWidth(10);
		r2d2.setSpeed(1000);

		// 1. make the Robot draw a shape
		for (int i = 0; i < 4; i++) {
			r2d2.move(90);
			r2d2.turn(90);
		}

	}

}
