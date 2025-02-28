import javax.swing.*;
public class CheckBoxExample1
 {
CheckBoxExample1(){
	JFrame f= new JFrame("CheckBoxExample");
	JCheckBox checkBox1 = new JCheckBox("C++");
	checkBox1.setBounds(100,100,50,50);
	JCheckBox checkBox2 = new JCheckBox("java",true);
	checkBox2.setBounds(100,150,50,50);
	f.add(checkBox1);
	f.add(checkBox2);
	f.setSize(400,400);
	f.setLayout(null);
	f.setVisible(true);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CheckBoxExample1();
	}

}
