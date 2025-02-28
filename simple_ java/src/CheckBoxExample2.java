import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class CheckBoxExample2 extends JFrame implements ItemListener {
JTextField t1;
JCheckBox b=new JCheckBox();
CheckBoxExample2() {
	JFrame c = new JFrame ("CheckBox Example");
	c.setLayout(new FlowLayout());
	ImageIcon n = new ImageIcon ("C:\\Users\\amrutaaushikar\\OneDrive\\Desktop\\elicpes\\simple_ java\\src\\image\\france.gif");
	ImageIcon r = new ImageIcon("C:\\Users\\amrutaaushikar\\OneDrive\\Desktop\\elicpes\\simple_ java\\src\\image\\germany.gif");
	ImageIcon s = new ImageIcon("C:\\Users\\amrutaaushikar\\OneDrive\\Desktop\\elicpes\\simple_ java\src\\image\\italy.gif");	
	JCheckBox b=new JCheckBox("C",n);
	b.setRolloverIcon(r);
	b.setSelectedIcon(s);
	b.addItemListener(this);
	c.add(b);
	b=new JCheckBox("C++",n);
	b.setRolloverIcon(r);
	b.setSelectedIcon(s);
	b.addItemListener(this);
	c.add(b);
	b=new JCheckBox("Java",n);
	b.setRolloverIcon(r);
	b.setSelectedIcon(s);
	b.addItemListener(this);
	c.add(b);
	b=new JCheckBox("Perl",n);
	b.setRolloverIcon(r);
	b.setSelectedIcon(s);
	b.addItemListener(this);
	c.add(b);
	t1=new JTextField(15);
	c.add(b);
	c.add(t1);
	c.setSize(500,500);
	c.setVisible(true);
	c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);}
	public void itemStateChanged(ItemEvent ie)
	{
		JCheckBox b=(JCheckBox)ie.getItem();
		t1.setText(b.getText());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CheckBoxExample2();
	}

}
