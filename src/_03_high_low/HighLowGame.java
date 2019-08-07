//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _03_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(99);
		random = random + 1;
		
		// 2. Print out the random variable above
		System.out.println(random);
		// 11. Repeat steps 1 to 10 ten times
		
			// 1. Ask the user for a guess using a pop-up window, and save their response 
		for (int i = 0; i < 10; i++) {
			String Guess = JOptionPane.showInputDialog("Guess a number  between 1 and 100  (You have 10 guesses)");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			int guess = Integer.parseInt(Guess);
			// 5. if the guess is correct
			if (guess == random) {
				JOptionPane.showMessageDialog(null, "You guessed correctly!!!");
				System.exit(0);
			}
				// 6. Win
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			else if(guess > random) {
				JOptionPane.showMessageDialog(null, "Your guess is too high");
			}
			// 7. if the guess is high
				// 8. Tell them it's too high
			else if (guess < random) {
				JOptionPane.showMessageDialog(null, "Your guess is too low");
			}
			// 9. if the guess is low
				// 10. Tell them it's too low

		// 13. Tell them they lose
			else if (i == 8) {
				JOptionPane.showMessageDialog(null, "Last guess!");
			}
		}
	}

}


