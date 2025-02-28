
import java.awt.event.*;
import javax.swing.*;

public class ActionButton extends JFrame implements ActionListener {

    JButton b;
    JTextField tf;

    public ActionButton() {
        // Create JFrame
        JFrame f = new JFrame("Button Example");

        // Create and position JTextField
        tf = new JTextField();
        tf.setBounds(50, 50, 150, 20);

        // Create and position JButton
        b = new JButton("Click here");
        b.setBounds(50, 100, 95, 30);

        // Add ActionListener to the button
        b.addActionListener(this);

        // Initially disable the text field
        tf.setEnabled(false);

        // Add components to the frame
        f.add(b);
        f.add(tf);

        // Set frame properties
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle button click event
        if (e.getSource() == b) {
            tf.setEnabled(true);
            tf.setText("Welcome to Javatpoint");
        }
    }

    public static void main(String[] args) {
        new ActionButton();
    }
}