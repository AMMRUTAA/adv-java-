package Assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PizzaOrder {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Pizza Order");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        // Pizza Size Options
        JRadioButton small = new JRadioButton("Small");
        JRadioButton medium = new JRadioButton("Medium");
        JRadioButton large = new JRadioButton("Large", true);
        ButtonGroup sizeGroup = new ButtonGroup();
        sizeGroup.add(small);
        sizeGroup.add(medium);
        sizeGroup.add(large);

        // Crust Options
        JRadioButton thinCrust = new JRadioButton("Thin Crust", true);
        JRadioButton thickCrust = new JRadioButton("Thick Crust");
        ButtonGroup crustGroup = new ButtonGroup();
        crustGroup.add(thinCrust);
        crustGroup.add(thickCrust);

        // Toppings
        JCheckBox cheese = new JCheckBox("Extra Cheese");
        JCheckBox mushrooms = new JCheckBox("Mushrooms");
        JCheckBox olives = new JCheckBox("Olives");
        JCheckBox onions = new JCheckBox("Onions", true);
        JCheckBox greenPeppers = new JCheckBox("Green Peppers");
        JCheckBox tomatoes = new JCheckBox("Tomatoes");

        // Order Type
        JRadioButton dineIn = new JRadioButton("Eat In");
        JRadioButton takeOut = new JRadioButton("Take Out", true);
        ButtonGroup orderTypeGroup = new ButtonGroup();
        orderTypeGroup.add(dineIn);
        orderTypeGroup.add(takeOut);

        // Buttons
        JButton buildPizza = new JButton("Build Pizza");
        JButton exit = new JButton("Exit");

        buildPizza.addActionListener(e -> {
            String order = (takeOut.isSelected() ? "Take Out" : "Eat In") + "\n";
            order += (small.isSelected() ? "Small" : medium.isSelected() ? "Medium" : "Large") + " Pizza\n";
            order += (thinCrust.isSelected() ? "Thin Crust" : "Thick Crust") + "\n";

            if (cheese.isSelected()) order += "Extra Cheese\n";
            if (mushrooms.isSelected()) order += "Mushrooms\n";
            if (olives.isSelected()) order += "Olives\n";
            if (onions.isSelected()) order += "Onions\n";
            if (greenPeppers.isSelected()) order += "Green Peppers\n";
            if (tomatoes.isSelected()) order += "Tomatoes\n";

            JOptionPane.showMessageDialog(frame, order, "Your Pizza", JOptionPane.INFORMATION_MESSAGE);
        });

        exit.addActionListener(e -> System.exit(0));

        // Adding components to the frame
        frame.add(new JLabel("Size"));
        frame.add(small);
        frame.add(medium);
        frame.add(large);
        frame.add(new JLabel("Crust"));
        frame.add(thinCrust);
        frame.add(thickCrust);
        frame.add(new JLabel("Toppings"));
        frame.add(cheese);
        frame.add(mushrooms);
        frame.add(olives);
        frame.add(onions);
        frame.add(greenPeppers);
        frame.add(tomatoes);
        frame.add(dineIn);
        frame.add(takeOut);
        frame.add(buildPizza);
        frame.add(exit);

        frame.setVisible(true);
    }
}