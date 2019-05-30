import javax.swing.JOptionPane;

public class Voting_Booth {
		public static void main(String[] args) {
			String height = JOptionPane.showInputDialog(null, "How old are you?" );
			int Height = Integer.parseInt(height);
			if(Height > 18) {
			String hi =	JOptionPane.showInputDialog(null, "Who do you want to be president");
JOptionPane.showMessageDialog(null, "What have you done! Now " + hi + " is president you foolish patato");
			}
			else {
			JOptionPane.showMessageDialog(null, "No one cares what you think");
			}
			}
}
