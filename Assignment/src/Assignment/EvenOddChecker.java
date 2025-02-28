package Assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EvenOddChecker {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Even or Odd Checker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        JTextField numberField = new JTextField(10);
        JButton checkButton = new JButton("Check");
        JTextField resultField = new JTextField(15);
        resultField.setEditable(false);

        checkButton.addActionListener(e -> {
            try {
                int num = Integer.parseInt(numberField.getText());
                String result = (num % 2 == 0) ? "Even" : "Odd";
                resultField.setText(result);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Enter a valid number", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        frame.add(new JLabel("Enter a number:"));
        frame.add(numberField);
        frame.add(checkButton);
        frame.add(new JLabel("Result:"));
        frame.add(resultField);

        frame.setVisible(true);
    }
}
