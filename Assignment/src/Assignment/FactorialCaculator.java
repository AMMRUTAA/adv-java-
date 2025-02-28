package Assignment;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FactorialCaculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Factorial Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        JTextField numberField = new JTextField(10);
        JButton calculateButton = new JButton("Calculate");
        JTextField resultField = new JTextField(15);
        resultField.setEditable(false);

        calculateButton.addActionListener(e -> {
            try {
                int num = Integer.parseInt(numberField.getText());
                long fact = 1;
                for (int i = 1; i <= num; i++) {
                    fact *= i;
                }
                resultField.setText(String.valueOf(fact));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Enter a valid number", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        frame.add(new JLabel("Enter a number:"));
        frame.add(numberField);
        frame.add(calculateButton);
        frame.add(new JLabel("Factorial:"));
        frame.add(resultField);

        frame.setVisible(true);
    }
}
