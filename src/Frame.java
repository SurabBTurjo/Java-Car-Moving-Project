import javax.swing.*;

public class Frame {
    public static void main(String[] args) {

        JFrame framework = new JFrame();
        framework.setSize(1024, 552);
        framework.add(new ImageAdd());
        framework.setVisible(true);

    }

}