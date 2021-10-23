import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Car {
    Image carImage;
    int x;

    public Car(){
        ImageIcon imageIcon2 = new ImageIcon("car.png");
        carImage= imageIcon2.getImage().getScaledInstance(180,100,Image.SCALE_DEFAULT);
        x=1100;

    }

    public void whenKeyPressed(KeyEvent e){
        if(e.getKeyCode() == 37){
            x = x - 5;
        }
        if(e.getKeyCode() == 39){
            x = x + 5;
        }
    }
}