package view;

import model.TemperatureModel;
import observer.Observer;

import javax.swing.*;
import java.awt.*;

public class ThermometerPanel extends JPanel implements Observer {
    int top, left, width, height, max, min;
    TemperatureModel model;

    public ThermometerPanel(TemperatureModel model) {
        this.model = model;
        top = 10;
        left = 50;
        width = 40;
        height = 130;
        max = 30;
        min = -20;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.drawRect(left, top, width, height);

        g.setColor(Color.RED);
        g.fillOval(left - width / 2 + 5, top + height - width / 3 + 8, width * 2 - 10, width * 2 - 10);
        g.setColor(Color.BLACK);
        g.drawOval(left - width / 2 + 5, top + height - width / 3 + 8, width * 2 - 10, width * 2 - 10);

        g.setColor(Color.WHITE);
        g.fillRect(left + 1, top + 1, width - 1, height - 1);

        g.drawString(max + "°F", left - 50, top + 5);
        g.drawString(min + "°F", left - 50, top + height - 5);

        g.setColor(Color.RED);
        int redtop = height * (max - (int) model.getF()) / (max - min) + top;
        g.fillRect(left + 1, Math.max(top + 1, redtop),
                width - 1, height - Math.max(redtop - top, 0));
    }

    @Override
    public void update() {
        repaint();
    }
}
