
import java.awt.Font;
import javax.swing. *;
public class SButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        JFrame f = new JFrame("ButtonExample");
        JButton b = new JButton("Click Me");
        b.setFont(new Font("Arial", Font.PLAIN,40));
        b.setSize(30,50);
        b.setBounds(150,150,200,200);
        f.add(b);
        f.setLayout(null);
        f.setSize(400,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
	}

}