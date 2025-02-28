import javax.swing.*;
import java.awt.*;
// class GridLayout extend JFrame
//joural:write a program to get ip address of  the given host name 
public class glayout1 extends JFrame {
	glayout1() {
		// Creating object P1  of JPanel class 
		JPanel p1= new JPanel();
		// set the layout 
		p1.setLayout(new GridLayout(4,2));
		// Creating object of "FlowLayout" class 
		FlowLayout Layout = new FlowLayout ();
		//Creating object P2 of JPanel class
		JPanel p2 = new JPanel();
		// set the layout
		p2.setLayout(Layout);
		// declaration of objects of JLabel class.
		JLabel one,two,three ,four;
		// Declaration of object of JTextField class.
		JTextField tname,tsalary,tcode,tdesig;
		// Declaration of objects of JButton class.
		JButton buttonSave,buttonExit;
		// Initilaization of object
		// "one" of JLabel class.
		one = new JLabel("NAME");
		tname = new JTextField(20);
		// Initialization of object 
		//"two" of JLabel class.
		two = new JLabel ("CODE");
		// Intialization of object 
		//"tcode" of JTextField class
		tcode = new JTextField (20);
		// Initialization of object 
		// "three = of JLabel claass.
		three = new JLabel ("DESIGNATION");
		tdesig = new JTextField(20);
		four = new JLabel("SALARY");
		tsalary = new JTextField (20);
		buttonSave = new JButton ("SAVE");
		buttonExit  = new JButton ("EXIT");
		p1.add(one);
		p1.add(tname);
		p1.add(two);
		p1.add(tcode);
		p1.add(three);
		p1.add(tdesig);
		p1.add(four);
		p1.add(tsalary);
		p2.add(buttonSave);
		p2.add(buttonExit);
		add(p1,"North");
		add(p2,"South");
		setVisible(true);
		this.setSize(400,180);
		
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new glayout1();
		

	}

}
