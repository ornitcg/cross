import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Cross extends JPanel {

    private MouseListener mLis = new MouseListener();
    private int x;
    private int y;

    public Cross(){
        addMouseMotionListener(mLis);
        x = 0;
        y = 0;
    }


    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.drawLine(0,y, getWidth(),y); // horizontal
        g.drawLine(x,0,x,getHeight()); // vertical

    }

    private class MouseListener implements MouseMotionListener {

        public void mouseMoved(MouseEvent e){
            x =  e.getX();
            y =  e.getY();
            repaint();
        }

        public void mouseDragged(MouseEvent e){
            // do nothing
        }
    }
}

