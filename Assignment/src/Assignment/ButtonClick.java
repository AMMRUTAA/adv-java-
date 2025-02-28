package Assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonClick {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Click Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");

        ActionListener listener = e -> JOptionPane.showMessageDialog(frame, e.getActionCommand() + " was clicked!");

        button1.addActionListener(listener);
        button2.addActionListener(listener);
        button3.addActionListener(listener);
        button4.addActionListener(listener);

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);

        frame.setVisible(true);
    }
}