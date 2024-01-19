import javax.swing.JOptionPane;
import java.util.Random;

public class rand {
    public static void main(String[] args) {
        Random random = new Random();

        // random number generator
        int randomNumber = random.nextInt(100);
        JOptionPane.showMessageDialog(null, "Generated Random Number: " + randomNumber);
    }
}
