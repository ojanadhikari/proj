package Unit12Applet;

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
public class Form extends Applet {
    @Override
    public void init() {
        Label lbl1=new Label("First Number: ");
        add(lbl1);
        TextField txt1=new TextField(10);
        add(txt1);
        Label lbl2=new Label("Second Number: ");
        add(lbl2);
        TextField txt2=new TextField(10);
        add(txt2);
        Label lbl3=new Label("Result Operation");
        add(lbl3);
        Button btn=new Button("Add");
        add(btn);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(txt1.getText());
                int num2 = Integer.parseInt(txt2.getText());
                int res = num1+num2;
                lbl3.setText("Sum="+res);
            }
        });
    }
}
