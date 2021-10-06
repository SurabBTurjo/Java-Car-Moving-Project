import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {
    Image img;
    car car;

    public Board(){
        ImageIcon imageIcon = new ImageIcon("background.png");
        img = imageIcon.getImage();
        car = new car();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(img,0,0,this);
        g.drawImage(car.carImage,300,450,this);


    }
}//change
