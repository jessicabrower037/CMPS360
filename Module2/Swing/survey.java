package Swing;

import javax.swing.*;

public class Survey {

    public static void main(String[] args) {
        String[] questions = {
                "How many albums does the band Animal Collective have in their discography?\nA. 12 B. 6 C. 9",
                "In music, how many notes are part of a given scale?\nA.12 B.7 C.24",
                "On most guitars, how many strings are there\n A.6 B.7 C.4"
        };

        char[] answers = {'A', 'B', 'A'};
        char ans = ' ';
        int x, correct = 0;
        String entry;
        boolean isGood;
        StringBuilder incorrectQuestions = new StringBuilder();

        for (x = 0; x < questions.length; ++x) {
            isGood = false;
            int firstError = 0;
            while (!isGood) {
                isGood = true;
                entry = JOptionPane.showInputDialog(null, questions[x]);
                ans = entry.charAt(0);
                if (ans != 'A' && ans != 'B' && ans != 'C') {
                    isGood = false;
                    if (firstError == 0) {
                        questions[x] = questions[x] +
                                "\nYour answer must be A, B or C.";
                        firstError = 1;
                    }
                }
            }
            if (ans == answers[x]) {
                ++correct;
                JOptionPane.showMessageDialog(null, "Correct!");
            } else {
                incorrectQuestions.append("\nQuestion ").append(x + 1).append(": ").append(questions[x]);
                JOptionPane.showMessageDialog(null, "The correct answer is " + answers[x]);
            }
        }

        StringBuilder summaryMessage = new StringBuilder();
        summaryMessage.append("You received ").append(correct).append(" right and\n").append(questions.length - correct).append(" wrong");

        if (incorrectQuestions.length() > 0) {
            summaryMessage.append("\n\nIncorrect Questions:").append(incorrectQuestions);
        }

        JOptionPane.showMessageDialog(null, summaryMessage.toString());
    }
}
