import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		String score;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String answer = JOptionPane.showInputDialog("How many months have 28 days?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by
		// one
		if (answer.equals("12") || answer.equals("All of them")) { JOptionPane.showMessageDialog(null, "Correct!"); }
			// 5. Otherwise, say "wrong" and tell them the answer
		else {
			JOptionPane.showMessageDialog(null, "WRONG!");
		}
			// 6. Add some more riddles

			// 2. Make a pop up to show the score.

		}
	}
