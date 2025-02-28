import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyListendemo1 extends JFrame implements KeyListener {
    JLabel l;
    JTextArea area;

    public KeyListendemo1() {
        l = new JLabel();
        l.setBounds(20, 50, 100, 20);
        
        area = new JTextArea();
        area.setBounds(20, 80, 300, 300);
        area.addKeyListener(this);
        
        this.add(l);
        this.add(area);
        this.setSize(400, 400);
        this.setLayout(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        l.setText("Key Typed: " + e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        l.setText("Key Pressed: " + e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        l.setText("Key Released: " + e.getKeyChar());
    }

    public static void main(String[] args) {
        new KeyListendemo1();
    }
}
