
import javax.swing.JFrame;

public class twoSquareViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setSize(300, 400);
        frame.setTitle("Two Squares");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        TwoSquareComponent square = new TwoSquareComponent();


        frame.setVisible(true);

    }
}