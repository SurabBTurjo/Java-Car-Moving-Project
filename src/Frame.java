import javax.swing.*;

public class Frame {
    public static void main(String[] arg){
        JFrame frame= new JFrame();
        frame.setSize(1500, 800);
        frame.add(new Board());
        frame.setVisible(true);
    }
}
