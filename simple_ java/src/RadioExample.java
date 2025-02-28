import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class RadioExample extends JFrame implements ItemListener
{
JRadioButton r1,r2,r3;
ButtonGroup bgrp;
JTextField tl;
public RadioExample(String title) {
	super(title);
	JFrame f = new JFrame();
	f.setLayout( new FlowLayout());
	r1 = new JRadioButton("r1");
	r2 = new JRadioButton("r2");
	r3 = new JRadioButton("r3");
	bgrp = new ButtonGroup();
	bgrp.add(r1);
	bgrp.add(r2);
	bgrp.add(r3);
	tl= new JTextField(15);
	r1.addItemListener(this);
	r2.addItemListener(this);
	r3.addItemListener(this);
	f.add(r1);
	f.add(r2);
	f.add(r3);
	f.add(tl);
	f.setSize(600,600);
	f.setVisible(true);
	f.setDefaultCloseOperation(EXIT_ON_CLOSE);
}

	
	
	@Override
public void itemStateChanged(ItemEvent ie) 
	{
	// TODO Auto-generated method stub
	JRadioButton jrb = (JRadioButton)ie.getItem();
	tl.setText(jrb.getText());
}



	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 new RadioExample("example");
	

	}

}
