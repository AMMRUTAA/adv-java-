
import javax.swing.*;

public class JPassExample {
	public static void main(String[] args)
	{
		JFrame f= new JFrame("JPassword Example");
		JPasswordField value = new JPasswordField();
		JLabel l1 = new JLabel("Password");
		l1.setBounds(20,100,80,30);
		value.setBounds (100,100,200,30);
		f.add (l1);
		f.add(value);
		f.setSize(600,600);
		f.setLayout(null);
		f.setVisible(true);
	}

}
