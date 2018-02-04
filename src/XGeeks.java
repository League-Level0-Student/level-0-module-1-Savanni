//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0




import javax.swing.JOptionPane;

/*
* Everyone has a superpower. Mine is writing recipes. This program will store
* the superpowers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's superpower is writing recipes".
*/
public class XGeeks {
public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
String kpower = "the lame ability to make a loud noise that is not that loud, but slightly annoying.";
String bpower = "being edgy and using the dark theme of Eclipse";
String npower = "not being able to spell anything correctly";
String name;

		// 2. Ask the user to enter a name. Store their answer in a variable.
name = JOptionPane.showInputDialog("What's your name dude");
		// 3. Show the superpower in a pop-up, depending on the name entered. 
if(name.equals("Kellen")){
	
JOptionPane.showMessageDialog(null, "Kellen's superpower is " + kpower);
}
if(name.equals("Nathan")) {
	JOptionPane.showMessageDialog(null, "Nathan's superpower is " + npower );
}
if(name.equals("Brandon")) {
	JOptionPane.showMessageDialog(null, "Brandon's superpower is " + bpower);
}
	}
}

