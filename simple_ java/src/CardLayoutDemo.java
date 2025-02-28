import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CardLayoutDemo extends JFrame {
    private int currentCard = 1;
    private CardLayout cardLayout; // Renaming the layout object to avoid conflict

    public CardLayoutDemo() {
        setTitle("Card Layout Example");
        setSize(300, 150);

        JPanel cardPanel = new JPanel();
        cardLayout = new CardLayout();
        cardPanel.setLayout(cardLayout); // Set the layout correctly

        // Creating cards (JPanels with labels)
        JPanel jp1 = new JPanel();
        JPanel jp2 = new JPanel();
        JPanel jp3 = new JPanel();
        JPanel jp4 = new JPanel();

        jp1.add(new JLabel("Card 1"));
        jp2.add(new JLabel("Card 2"));
        jp3.add(new JLabel("Card 3"));
        jp4.add(new JLabel("Card 4"));

        // Adding the cards to the cardPanel.
        cardPanel.add(jp1, "1");
        cardPanel.add(jp2, "2");
        cardPanel.add(jp3, "3");
        cardPanel.add(jp4, "4");

        // Creating button panel.
        JPanel buttonPanel = new JPanel();

        // Adding buttons to navigate cards.
        JButton firstBtn = new JButton("First");
        JButton nextBtn = new JButton("Next");
        JButton previousBtn = new JButton("Previous");
        JButton lastBtn = new JButton("Last");

        buttonPanel.add(firstBtn);
        buttonPanel.add(nextBtn);
        buttonPanel.add(previousBtn);
        buttonPanel.add(lastBtn);

        // Add ActionListeners to buttons.

        // First button
        firstBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.first(cardPanel); // Corrected method call
                currentCard = 1;
            }
        });

        // Last button
        lastBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.last(cardPanel); // Corrected method call
                currentCard = 4;
            }
        });

        // Next button
        nextBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (currentCard < 4) {
                    currentCard++;
                    cardLayout.show(cardPanel, "" + currentCard); // Corrected method call
                }
            }
        });

        // Previous button
        previousBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (currentCard > 1) {
                    currentCard--;
                    cardLayout.show(cardPanel, "" + currentCard); // Corrected method call
                }
            }
        });

        // Add cardPanel and buttonPanel to the frame.
        getContentPane().add(cardPanel, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CardLayoutDemo();
    }
}
