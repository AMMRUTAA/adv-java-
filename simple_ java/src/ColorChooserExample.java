import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChooserExample  extends JFrame implements ActionListener{
JFrame f;
JButton b;
JTextArea ta;
ColorChooserExample(){
f= new JFrame ("ColorChooserExample");
b=new JButton("Pad Color");
b.setBounds(200,250,100,30);
ta= new JTextArea();
ta.setBounds(10,10,300,200);
b.addActionListener(this);
f.add(b);f.add(ta);
f.setLayout(null);
f.setSize(400,400);
f.setVisible(true);
}


	@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	Color c = JColorChooser.showDialog(this,"Choose",Color.CYAN);
	ta.setBackground(c);
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
 new ColorChooserExample();
	}

}
