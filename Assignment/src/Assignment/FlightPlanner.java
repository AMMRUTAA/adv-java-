package Assignment;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class FlightPlanner {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Flight Planner");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout()); // Added layout manager

        String[] cities = {"Oakland", "Sacramento", "San Jose", "San Francisco", "Eureka"};
        JComboBox<String> cityBox = new JComboBox<>(cities);

        String[] seatLocations = {"Window", "Middle", "Aisle"};
        JComboBox<String> seatBox = new JComboBox<>(seatLocations);

        String[] meals = {"Regular", "Vegetarian", "Kosher"};
        JComboBox<String> mealBox = new JComboBox<>(meals);

        JButton assignButton = new JButton("Assign");
        JButton exitButton = new JButton("Exit");

        // Action Listener for Assign Button
        assignButton.addActionListener(e -> {
            String message = "Destination: " + cityBox.getSelectedItem() +
                             "\nSeat Location: " + seatBox.getSelectedItem() +
                             "\nMeal: " + mealBox.getSelectedItem();
            JOptionPane.showMessageDialog(frame, message, "Your Assignment", JOptionPane.INFORMATION_MESSAGE);
        });

        // Action Listener for Exit Button
        exitButton.addActionListener(e -> System.exit(0));

        // Adding components to frame
        frame.add(new JLabel("Destination City"));
        frame.add(cityBox);
        frame.add(new JLabel("Seat Location"));
        frame.add(seatBox);
        frame.add(new JLabel("Meal Preference"));
        frame.add(mealBox);
        frame.add(assignButton);
        frame.add(exitButton);

        frame.setVisible(true); // Make the frame visible
    }


	}


