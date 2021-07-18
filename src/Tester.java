import javax.swing.*;

public class Tester{

    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setSize(600,600);
        Cross crossP = new Cross();
        frame.add(crossP);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}