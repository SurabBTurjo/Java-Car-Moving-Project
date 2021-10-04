import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {
    Image img;

    Board(){
        ImageIcon imageIcon = new ImageIcon("Photo.jpeg");
        img = imageIcon.getImage();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(img,0,0,this);
    }
}
