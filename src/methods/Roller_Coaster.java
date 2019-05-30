package methods;

import javax.swing.JOptionPane;

public class Roller_Coaster {
public static void main(String[] args) {
	String height = JOptionPane.showInputDialog(null, "How tall are you? (In inches; do not include anything but a number)");
	int Height = Integer.parseInt(height);
	if(Height > 48) {
		JOptionPane.showMessageDialog(null, "Enjoy the ride");
	}
	else {
	JOptionPane.showMessageDialog(null, "Grow more you little patato");
	}
	}
	
}

