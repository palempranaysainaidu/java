import java.awt.*;
import java.awt.event.*;

class AdapterDemo extends Frame {
    AdapterDemo() {
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse clicked at: " + e.getX() + ", " + e.getY());
            }
        });

        setSize(300, 300);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        new AdapterDemo();
    }
}
