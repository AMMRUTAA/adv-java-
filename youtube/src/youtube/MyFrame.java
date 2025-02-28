package youtube;

import javax.swing.*;
import java.awt.*;
public class MyFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setSize(700,500);
		//frame.setTitle("My Frame"):
		ImageIcon icon = new ImageIcon ("small_image.png");
		frame.setIconImage(icon.getImage());
		Container c = frame.getContentPane();
//		color color=new color(255,0,0);
		c.setBackground(Color.RED);
		
	}

}