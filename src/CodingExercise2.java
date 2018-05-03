
/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;

/**
 * Write a program that asks the user for their age. Tell them which year they
 * were born. If they are over 30, tell them they are too old to play this game.
 **/

public class CodingExercise2 {
	public static void main(String[] args) {
		String ag = JOptionPane.showInputDialog("How old r u");
		int a = Integer.parseInt(ag);
	JOptionPane.showMessageDialog(null, 2018-a);
		if (a > 30) {
			JOptionPane.showMessageDialog(null, "U 2 OLD SON");

		}

	}
}
