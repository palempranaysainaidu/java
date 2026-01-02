import java.awt.*;  
import java.awt.event.*;  

public class AWTKeyEvents extends Frame {  
    AWTKeyEvents() {  
        Label l = new Label("Click or type");  
        add(l);  
        setSize(300,200);  
        setLayout(new FlowLayout());  
        setVisible(true);  

        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){ l.setText("Mouse: "+e.getX()+","+e.getY()); }
        });  

        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e){ l.setText("Key: "+e.getKeyChar()); }
        });  

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){ System.exit(0); }
        });  
    }  

    public static void main(String[] args){ new AWTKeyEvents(); }  
}  
