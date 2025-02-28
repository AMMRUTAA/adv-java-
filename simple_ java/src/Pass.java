import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Pass extends JFrame implements ActionListener {
    JLabel label; // Declaration of label field
    JTextField text; // Declaration of text field
    JPasswordField value; // Declaration of password field
    JButton b; // Declaration of button

    public Pass() {
        JFrame f = new JFrame("Password Field Example");
        JLabel l1 = new JLabel("Username:");
        l1.setBounds(20, 20, 80, 30);
        text = new JTextField();
        text.setBounds(100, 20, 100, 30);
        JLabel l2 = new JLabel("Password:");
        l2.setBounds(20, 75, 80, 30);
        value = new JPasswordField();
        value.setBounds(100, 75, 100, 30);
        
        // Initializing the label and setting its bounds
        label = new JLabel(); 
        label.setBounds(20, 200, 450, 50); // Added this line to initialize the label
        
        // Initializing the button and setting its bounds
        b = new JButton("Submit"); 
        b.setBounds(100, 150, 100, 30); // Added this line to initialize the button
        
        // Adding components to the frame
        f.add(l1);
        f.add(text);
        f.add(l2);
        f.add(value);
        f.add(b);
        f.add(label);
        
        // Setting frame properties
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Adding action listener to the button
        b.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String data = "Username: " + text.getText();
            data += ", Password: " + new String(value.getPassword());
            label.setText(data); // Displaying the username and password in the label
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public static void main(String[] args) {
        new Pass();
    }
}

