import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PasswordValidation {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Password Validation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 200);
        frame.setLayout(new FlowLayout());

        JLabel instructionLabel = new JLabel("Please Enter Your Password:");
        instructionLabel.setFont(new Font("Arial", Font.BOLD, 14));

        JPasswordField passwordField = new JPasswordField(15);
        JButton validateButton = new JButton("Validate");
        JButton exitButton = new JButton("Exit");

        frame.getContentPane().setBackground(Color.YELLOW);

        validateButton.addActionListener(e -> {
            String correctPassword = "admin123"; // Set your password here
            String enteredPassword = new String(passwordField.getPassword());

            if (enteredPassword.equals(correctPassword)) {
                JOptionPane.showMessageDialog(frame, "You've passed security!", "Access Granted", JOptionPane.WARNING_MESSAGE);
            } else {
                int retry = JOptionPane.showConfirmDialog(frame, "Incorrect password - Try Again?", "Access Denied", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
                if (retry == JOptionPane.NO_OPTION) {
                    System.exit(0);
                }
            }
        });

        exitButton.addActionListener(e -> System.exit(0));

        frame.add(instructionLabel);
        frame.add(passwordField);
        frame.add(validateButton);
        frame.add(exitButton);

        frame.setVisible(true);
    }
}
