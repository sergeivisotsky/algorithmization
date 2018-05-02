import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SwingTestTwo extends JFrame implements KeyListener {
    public SwingTestTwo() {
        setSize(250, 100);
        JPanel p = new JPanel();
        JTextField txt = new JTextField();
        txt.setPreferredSize(new Dimension(150, 20));
        txt.addKeyListener(this);
        p.add(txt);
        add(p, BorderLayout.CENTER);
        setTitle("Swing");
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        String msg = " ";
        switch (key) {
            case KeyEvent.VK_ALT:
                msg += "alt";
                break;
            case KeyEvent.VK_CONTROL:
                msg += "ctrl";
                break;
            case KeyEvent.VK_SHIFT:
                msg += "shift";
                break;
        }
        System.out.println("presed: " + key + msg);
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        String msg = " ";
        switch (key) {
            case KeyEvent.VK_ALT:
                msg += "alt";
                break;
            case KeyEvent.VK_CONTROL:
                msg += "ctrl";
                break;
            case KeyEvent.VK_SHIFT:
                msg += "shift";
                break;
        }
        System.out.println("released: " + key + msg);
    }

    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();
        System.out.print("typed: ");
        System.out.println(c);
    }

    public static void main(String[] args) {
        SwingTestTwo win = new SwingTestTwo();
        win.setDefaultCloseOperation(EXIT_ON_CLOSE);
        win.setVisible(true);
    }


}