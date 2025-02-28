
import javax.swing.*;
public class JTextAreaExample extends JFrame {
JTextAreaExample()
{
	JFrame f = new JFrame ("JTextArae Example");
	JTextArea area = new JTextArea("Welcome to Java");
	area.setBounds(10,30,200,200);
	f.add(area);
	f.setSize(600, 600);
	f.setLayout(null);
	f.setVisible(true);

}
	public static void main (String[] args)
	{
		new JTextAreaExample();
	
	}
}
