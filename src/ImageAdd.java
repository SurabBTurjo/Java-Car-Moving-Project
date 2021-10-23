import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class ImageAdd extends JPanel {
    Image img;
    Car car;


    public ImageAdd(){
        ImageIcon imageIcon1 = new ImageIcon("background.png");
        img = imageIcon1.getImage();
        setFocusable(true);
        car = new Car();
        addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e){
                super.keyPressed(e);
                car.whenKeyPressed(e);

            }

        });


    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(img,0,0,this);
        g.drawImage(car.carImage,car.x,370,this);
        repaint();
    }
}