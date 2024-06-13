import javax.swing.JButton;
import javax.swing.JFrame;

public class Level2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Level 2: Button");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Click Me");
        frame.getContentPane().add(button);

        frame.setVisible(true);
    }
}
