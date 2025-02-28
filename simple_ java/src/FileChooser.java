import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class FileChooser extends JFrame implements ActionListener
{
	JMenuBar mb;
	JMenu file;
	JMenuItem open;
	JTextArea ta;
	FileChooser(){
		open = new JMenuItem("Open File");
		open.addActionListener(this);
		file = new JMenu("file");
		file.add(open);
		mb = new JMenuBar();
		mb.setBounds(0,0,800,20);
		mb.add(file);
		ta = new JTextArea(800,800);
		ta.setBounds(0,20,800,800);
		add(mb);
		add(ta);	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == open) {
			JFileChooser fc = new JFileChooser();
			int i =  fc.showOpenDialog(this);
			ta.setText("Hello");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileChooser om = new FileChooser();
		om.setSize(500,500);
		om.setLayout(null);
		om.setVisible(true);
		om.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
