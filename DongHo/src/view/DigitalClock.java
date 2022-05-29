package view;

import model.observer.Observer;

import javax.swing.*;
import java.awt.*;

public class DigitalClock extends JPanel implements Observer {
    JLabel lblTime = new JLabel();

    public DigitalClock() {
        lblTime.setFont(new Font(null, Font.BOLD, 20));
        add(lblTime);
    }

    @Override
    public void update(Object context) {
        lblTime.setText(context.toString());
    }
}
