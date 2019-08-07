package _04_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {

	public static void main(String[] args) {
		String first = JOptionPane.showInputDialog("Are you happy?");
		String second;
		if (first.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing what you're doing");
		}
		else if (first.equals("no")) {
			second = JOptionPane.showInputDialog("Do you want to be happy?");
		
		if (second.equals("no")) {
			JOptionPane.showMessageDialog(null, "Keep doing what you're doing");
		}
		else if(second.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Change something");
		}
		}
		
	}
}
