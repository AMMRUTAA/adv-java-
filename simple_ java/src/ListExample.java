import javax.swing.*;
import java.awt.event.*;

public class ListExample extends JFrame implements ActionListener {
	JLabel label ;JButton b;
	JList listl;
	ListExample()
	{
		JFrame f=new JFrame();
		label = new JLabel();
		label.setSize(500,100);
		b=new JButton("Show");
		b.setBounds(200,150,80,30 );
		final DefaultListModel<String> ll = new DefaultListModel<>();
		ll. addElement("C");
		ll.addElement("C++");
		ll.addElement("Java");
		ll.addElement("PHP");
		listl = new JList<>(ll);
		listl.setBounds (100,100,75,75);
		f.add(listl);f.add(b);f.add(label);
		f.setSize(450,450);
		f.setLayout(null);
		f.setVisible(true);
		b.addActionListener(this);
		
		
	}
	public void actionPerformed(ActionEvent e)
	{
		String data ="";
		if(listl.getSelectedIndex() != -1)
		{
			data = "Programming languages Selected: " + listl.getSelectedValue ();
			label.setText(data);
		}
		label.setText(data);
	}
			
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ListExample();

	}

}
