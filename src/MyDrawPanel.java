import javax.sound.midi.ControllerEventListener;
import javax.sound.midi.ShortMessage;
import javax.swing.*;
import java.awt.*;

//绘图面板类
public class MyDrawPanel extends JPanel implements ControllerEventListener {
    boolean msg = false;

    public void controlChange(ShortMessage event){
        msg = true;
        repaint();
    }

    public void paintComponent(Graphics g){
        if (msg){
            Graphics2D g2 = (Graphics2D)g;

            int r = (int)(Math.random()*250);
            int gr = (int)(Math.random()*250);
            int b = (int)(Math.random()*250);

            g.setColor(new Color(r,gr,b));
        }
    }
}
