package view;

import model.TemperatureModel;
import observer.Observer;

import javax.swing.*;
import java.awt.*;

public class ThermometerPanel extends JPanel implements Observer {
    int top, left, width, height;
    TemperatureModel model;

    public ThermometerPanel(TemperatureModel model) {
        this.model = model;
//        width = 20;
//        top = 20;
//        left = 100;
//        height = 200;
        setSize(new Dimension(200, 200));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.black);
        g.drawRect(left, top, width, height);
        g.setColor(Color.red);
        g.fillOval(left - width / 2, top + height - width / 3, width * 2, width * 2);
        g.setColor(Color.black);
        g.drawOval(left - width / 2, top + height - width / 3, width * 2, width * 2);
        g.setColor(Color.white);
        g.fillRect(left + 1, top + 1, width - 1, height - 1);
        g.setColor(Color.red);
//        long redtop = height*(_farenheit.get()-_farenheit.getMax())/(_farenheit.getMin()-_farenheit.getMax());
//        g.fillRect(left+1, top + (int)redtop, width-1, height-(int)redtop);
    }

    @Override
    public void update() {

    }
}
