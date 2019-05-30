package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery {

	public static void main(String[] args) {
		
		Random rando = new Random();
		int a = rando.nextInt(100);
		int b = rando.nextInt(100);
		int c = rando.nextInt(100);
		int d = rando.nextInt(100);
		int e = rando.nextInt(100);
		JOptionPane.showMessageDialog(null, "Story Time");
		JOptionPane.showMessageDialog(null, "This is a true story");
		JOptionPane.showMessageDialog(null, "ur broke cuz you boght like 400 lottery tickets");
		JOptionPane.showMessageDialog(null, "You lost them all exepct for one");
		JOptionPane.showMessageDialog(null, "The numbers on your ticket are, " + a + ", " + b + ", " + c + ", " + d + ", and " + e + ".");
		JOptionPane.showMessageDialog(null, "You lost so now your broke lolololoollololololololol");
	}
	

}
