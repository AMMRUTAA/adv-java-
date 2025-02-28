import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JRootPane;
import javax.swing.JMenuBar;

public class RootPaneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JRootPane root = f.getRootPane();
		JMenuBar bar = new JMenuBar();
		JMenu menu = new JMenu("File");
		bar.add(menu);
		menu.add("open");
		menu.add("Close");
		root.setJMenuBar(bar);
		root.getContentPane().add(new JButton("Press Me"));
		f.pack();
		f.setSize(300,300);
		f.setVisible(true);

	}

}
