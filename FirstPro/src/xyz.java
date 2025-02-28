

import javax.swing.*;


public class xyz 
{
	xyz()
	{
		JFrame f= new JFrame ("Button Example"); // Creating the instance of JFrame Class
		JButton b= new JButton(); // Creating the instance of JButton class 
		b.setText("Click Me");
		b.setBounds (50,100,150,170); // Setting Position & width,height of the button
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Closing JFrame
	}
	

	public static void main(String[] args) 
	{
		xyz b= new xyz();
	}

}
