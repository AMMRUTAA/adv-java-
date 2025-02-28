import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Graphics;
public class bt extends JFrame implements ActionListener
{
	JButton b1;
	public bt()
	{
		JFrame f = new JFrame ("HELLO");
		b1=new JButton("Click Me");
		b1.addActionListener(this);
		b1.setBounds(200,200,250,100);
		b1.setFont(new Font("Arial", Font.PLAIN, 40));
		f.add(b1);
		f.setSize(700,700);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		String text = (String)e.getActionCommand();
		if(text.equals("Click Me"))
		{
			b1.setText("TYIT");
			b1.setForeground(Color.blue);	
		}
		else
		{
			b1.setText("Click Me");
		}
	}

	public static void main(String[] args) {
		bt b=new bt();

	}

}