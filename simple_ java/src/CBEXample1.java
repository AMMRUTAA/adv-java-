import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CBEXample1 extends JFrame implements ActionListener {

    JFrame f;
    JLabel label;
    JButton b;
    JComboBox<String> cb;

    CBEXample1() {
        f = new JFrame("ComboBox Example");
        label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(400, 100);
        
        b = new JButton("Show");
        b.setBounds(200, 100, 75, 20);
        
        String languages[] = {"C", "C++", "C#", "Java", "PHP"};
        cb = new JComboBox<>(languages);
        cb.setBounds(50, 100, 90, 20);
        
        f.add(cb);
        f.add(label);
        f.add(b);
        f.setLayout(null); // Use null layout to set bounds manually
        
        f.setSize(350, 350);
        f.setVisible(true);
        
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String data = "Programming language Selected: " + cb.getItemAt(cb.getSelectedIndex());
        label.setText(data);
    }

    public static void main(String[] args) {
        new CBEXample1();
    }
}
