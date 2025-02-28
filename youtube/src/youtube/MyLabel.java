package youtube;
import javax.swing.*;
import java.awt.*;
public class MyLabel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame =new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100,100,1000,500);
		Container c= frame.getContentPane();
		c.setLayout(null);
		JLabel label= new JLabel("username");
		label.setBounds(100,50,100,30);
		Font font=new Font("Arial ",Font.PLAIN,30);
		label.setFont(font);
		
		c.add(label);
	
	}
	

}
