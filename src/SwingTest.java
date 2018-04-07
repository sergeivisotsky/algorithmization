import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class SwingTest extends JFrame implements ActionListener, MouseListener {
    public SwingTest() {
        setSize(250, 100);
        JPanel p = new JPanel();
        JButton btn = new JButton("Click Me");
        btn.addActionListener(this);
        btn.addMouseListener(this);
        p.add(btn);
        add(p, BorderLayout.CENTER);
        setTitle("Swing");
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("button clicked");
    }

    public void mouseClicked(MouseEvent arg0) {
        System.out.println("click: x=" + arg0.getX()
                + " y=" + arg0.getY());
    }

    public void mouseEntered(MouseEvent arg0) {
        System.out.println("mouse entered");
    }

    public void mouseExited(MouseEvent arg0) {
        System.out.println("mouse exited");
    }

    public void mousePressed(MouseEvent arg0) {
        System.out.println("pressed: x=" + arg0.getX()
                + " y=" + arg0.getY());
    }

    public void mouseReleased(MouseEvent arg0) {
        System.out.println("released: x=" + arg0.getX()
                + " y=" + arg0.getY());
    }

    public static void main(String[] args)
            throws Exception {
        SwingTest win = new SwingTest();
        win.setDefaultCloseOperation(EXIT_ON_CLOSE);
        win.setVisible(true);
    }
}

