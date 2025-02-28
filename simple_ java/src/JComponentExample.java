import java.awt.*;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
class MyComponent extends JComponent{
	public void paint(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(30, 30, 100, 100);
		
		
	}
	
}
public class JComponentExample {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyComponent com = new MyComponent();
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame Frame = new JFrame("JComponent Example");
		Frame.setSize(300,200);
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Frame.add(com);
		Frame.setVisible(true);
	}

}
