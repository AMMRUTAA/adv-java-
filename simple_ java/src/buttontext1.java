import java.awt.event.*;
import javax.swing.*;

public class buttontext1 extends JFrame implements ActionListener {
    JButton b;
    JTextField tf;

    public buttontext1() {
        JFrame f = new JFrame("Button Example");
        tf = new JTextField();
        tf.setBounds(50, 50, 150, 20);
        b = new JButton("Click Here");
        b.setBounds(50, 100, 95, 30);
        b.addActionListener(this);
        tf.setEnabled(false);
        f.add(b);
        f.add(tf);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            tf.setEnabled(true);
            tf.setText("Welcome to Javatpoint.");
        }
    }

    public static void main(String args[]) {
        new buttontext1();
    }
}
