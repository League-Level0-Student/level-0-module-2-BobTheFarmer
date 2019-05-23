//    Copyright (c) The League of Amazing Programmers 2013-2018
//    Level 0


package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
public static void main(String[] args) {
	

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
int ran = 0;
Random rando = new Random();
ran = rando.nextInt(4);
	// 3. Print out this variable

	// 4. Get the user to enter a question for the 8 ball
JOptionPane.showInputDialog(null, "I am a mmagic 8 ball, as me a question and I will answer it");
	// 5. If the random number is 0
if(ran == 0) {
	JOptionPane.showMessageDialog(null, "Yes");
}
else if (ran == 1) {
	JOptionPane.showMessageDialog(null, "No");
}
else if (ran == 2) {
	JOptionPane.showMessageDialog(null, "There is only one resourse that could answer that question");
	JOptionPane.showMessageDialog(null, "You must seek the amazing");
	JOptionPane.showMessageDialog(null, "The cool");	
	JOptionPane.showMessageDialog(null, "The awesome");
	JOptionPane.showMessageDialog(null, "Google");
}
else {
	JOptionPane.showMessageDialog(null, "UR MOM");
JOptionPane.showMessageDialog(null, "OOHHHHHHHHH GIT ROASTED PATATO");
}
// -- tell the user "No"

	// 7. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3

	// -- write your own answer

}
}
