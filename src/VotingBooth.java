import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {

		String age = JOptionPane.showInputDialog("How old are you?");
		int userAge = Integer.parseInt(age);
		if (userAge > 18) {
			JOptionPane.showInputDialog("Who should the next President be?");
		}
		else {
		
			JOptionPane.showMessageDialog(null, "Nobody cares what you think!!!");
		}

	}
}
