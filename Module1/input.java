import javax.swing.JOptionPane;
import java.util.Random;

public class input {
    public static void main(String[] args) {

        Random random = new Random();

        // random number (1-100)
        int correctNumber = random.nextInt(100) + 1;

        int maxAttempts = 15;
        int attempts = 0;

        while (attempts < maxAttempts) {
            // guess user prompt
            String userInput = JOptionPane.showInputDialog("Guess a number between 1 and 100:");
            if (userInput == null) {
                break;
            }

            // parse user input
            try {
                int userGuess = Integer.parseInt(userInput);

                if (userGuess == correctNumber) {
                    JOptionPane.showMessageDialog(null, "You guessed the correct number!");
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect. Try again!");
                    attempts++;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Please enter a valid number.");
            }
        }

        // reveals the correct number after a set of incorrect attempts (15 in this instance)
        if (attempts == maxAttempts) {
            JOptionPane.showMessageDialog(null, "Oh no! You've reached the maximum number of attempts. The correct number was: " + correctNumber);
        }
    }
}
