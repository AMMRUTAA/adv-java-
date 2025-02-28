//package Simple1;
import java.awt.*;
import javax.swing.*;

public class simple1 {
    simple1()
    {
    	JFrame f = new JFrame("Button Example");
    	ImageIcon m = new ImageIcon("C:\\Users\\amrutaaushikar\\OneDrive\\Desktop\\elicpes\\simple_ java\\src\\image\\imageicon.png");
    	JButton b = new JButton("Hello",m);
    	b.setFont(new Font("Arial",Font.PLAIN, 40));
    	b.setVerticalTextPosition(SwingConstants.BOTTOM);
    	b.setHorizontalTextPosition(SwingConstants.CENTER);
    	b.setBounds(200,199,400,400);
    	f.add(b);
    	f.setSize(699,699);
    	f.setLayout(null);
    	f.setVisible(true);
    	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
	public static void main(String[] args) {
		new simple1();
	}

}