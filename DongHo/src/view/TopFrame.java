package view;

import javax.swing.*;

public class TopFrame {
    public JPanel analogClockPanel = new AnalogClock();
    public JPanel digitalClockPanel = new DigitalClock();

    public TopFrame() {
        JFrame analogClockFrame = new JFrame("Analog Clock");
        analogClockFrame.setSize(400, 400);
        analogClockFrame.add(analogClockPanel);
        analogClockFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        analogClockFrame.setLocation(200, 200);
        analogClockFrame.setVisible(true);

        JFrame digitalClockFrame = new JFrame("Digital Clock");
        digitalClockFrame.add(digitalClockPanel);
        digitalClockFrame.setSize(200, 100);
        digitalClockFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        digitalClockFrame.setLocation(600, 200);
        digitalClockFrame.setVisible(true);
    }
}
