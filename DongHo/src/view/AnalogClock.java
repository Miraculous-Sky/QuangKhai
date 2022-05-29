package view;

import model.Time;
import model.observer.Observer;

import javax.swing.*;
import java.awt.*;

public class AnalogClock extends JPanel implements Observer {
    Time time = new Time();

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int clockRadius = (int) (Math.min(getWidth(), getHeight()) * 0.8 * 0.5);
        int xCenter = getWidth() / 2;
        int yCenter = getHeight() / 2;

        int sLength = (int) (clockRadius * 0.8);
        int xSecond = (int) (xCenter + sLength * Math.sin(time.getSecond() * (2 * Math.PI / 60)));
        int ySecond = (int) (yCenter - sLength * Math.cos(time.getSecond() * (2 * Math.PI / 60)));
        g.setColor(Color.RED);
        g.drawLine(xCenter, yCenter, xSecond, ySecond);


        int mLength = (int) (clockRadius * 0.8);
        int xMinute = (int) (xCenter + mLength * Math.sin(time.getMinute() * (2 * Math.PI / 60)));
        int yMinute = (int) (yCenter - mLength * Math.cos(time.getMinute() * (2 * Math.PI / 60)));
        g.setColor(Color.BLACK);
        g.drawLine(xCenter, yCenter, xMinute, yMinute);


        int hLength = (int) (clockRadius * 0.5);
        int xHour = (int) (xCenter + hLength * Math.sin((time.getHour() % 12 + time.getMinute() / 60.0) * (2 * Math.PI / 12)));
        int yHour = (int) (yCenter - hLength * Math.cos((time.getHour() % 12 + time.getMinute() / 60.0) * (2 * Math.PI / 12)));
//        g.setColor(Color.blue);
        g.drawLine(xCenter, yCenter, xHour, yHour);

        g.drawOval(xCenter - clockRadius, yCenter - clockRadius, 2 * clockRadius, 2 * clockRadius);
        g.drawString("12", xCenter - 5, yCenter - clockRadius + 12);
        g.drawString("9", xCenter - clockRadius + 3, yCenter + 5);
        g.drawString("3", xCenter + clockRadius - 10, yCenter + 3);
        g.drawString("6", xCenter - 3, yCenter + clockRadius - 3);
    }

    @Override
    public void update(Object context) {
        this.time = (Time) context;
        repaint();
    }
}
