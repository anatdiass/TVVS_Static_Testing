import javax.swing.JPanel;
import java.awt.EventQueue;
import javax.swing.*;

public class Snake extends JFrame {
    private Board b;

    public Snake() {
        JPanel jp = new JPanel();
        int i;
        initUI(jp);
    }

    private void initUI(JPanel j) {
        add(new Board());

        setResizable(false); //setResizable(false);
        pack();

        setTitle("Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            JFrame ex = new Snake();
            ex.setVisible(true);
        });
    }
}
