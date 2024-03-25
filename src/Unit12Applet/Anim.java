package Unit12Applet;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-03-25
 **/
public class Anim extends Applet implements ActionListener {
    private final String text = "Fading Text";
    private int opacity = 255;
    private Timer timer;
    @Override
    public void init(){
        timer = new Timer(50,this);
        timer.start();
    }
    @Override
    public void paint(Graphics g) {
        g.setColor(new Color(0, 0, 0, opacity));
        g.drawString(text, 50, 50);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        opacity -= 5;
        if(opacity<=0){
            opacity =0;
            timer.stop();
        }
        repaint();
    }
}
