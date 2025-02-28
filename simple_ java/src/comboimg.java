
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class comboimg extends JFrame implements ItemListener {
    JLabel l;
    JComboBox<String> cb;
    ImageIcon france, germany, italy, japan;
    JFrame f;

    comboimg() {
        f = new JFrame();
        
        cb = new JComboBox<>();
        cb.addItem("france");
        cb.addItem("germany");
        cb.addItem("italy");
        cb.addItem("japan");
        cb.addItemListener(this);
        
        l = new JLabel(new ImageIcon("C:\\Users\\amrutaaushikar\\OneDrive\\Desktop\\elicpes\\simple_ java\\src\\image\\france.gif"));

        f.add(cb);
        f.add(l);
        
        f.setLayout(new FlowLayout()); // or you can set it to null and set bounds manually
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(300, 300);
        f.setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        String s = (String) ie.getItem();
        l.setIcon(new ImageIcon("C:\\Users\\amrutaaushikar\\OneDrive\\Desktop\\elicpes\\simple_ java\\src\\image\\" + s + ".gif"));
    }

    public static void main(String[] args) {
        new comboimg();
    }
}
