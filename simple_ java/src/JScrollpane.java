import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.FlowLayout;

public class JScrollpane {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JTextArea textArea = new JTextArea(20, 30);
        JScrollPane scrollPane = new JScrollPane(
            textArea,
            JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
            JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS
        );
        panel.add(scrollPane);
        frame.setContentPane(panel);
        frame.setSize(500, 500);
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }
}