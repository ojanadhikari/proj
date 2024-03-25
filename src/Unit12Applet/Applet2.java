package Unit12Applet;

import java.applet.*;
import java.awt.*;
public class Applet2 extends Applet {
    @Override
    public void init() {
        Label lbl = new Label("Name: ");
        add(lbl);
        TextField txt = new TextField(10);
        add(txt);
        Button btn = new Button("Submit");
        add(btn);
    }
}
