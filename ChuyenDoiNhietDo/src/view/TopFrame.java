package view;

import model.TemperatureModel;

import javax.swing.*;
import java.awt.*;

public class TopFrame extends JFrame {
    public JPanel pnlFDegree, pnlCDegree, pnlThermometer;
    public TemperatureModel model;

    public TopFrame(TemperatureModel temperatureModel) {
        this.model = temperatureModel;
        setTitle("Temperature");
        setSize(400, 400);
        setResizable(false);

        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(15, 15, 15, 15);
        c.gridx = 0;
        c.gridy = 0;
        add(pnlFDegree = new FahrenheitPanel("Fahrenheit Temperature", temperatureModel), c);
        c.gridx = 0;
        c.gridy = 1;
        add(pnlCDegree = new CelsiusPanel("Celsius Temperature", temperatureModel), c);
        c.gridx = 1;
        c.gridy = 0;
        c.gridheight = 2;
        c.fill = GridBagConstraints.BOTH;
        add(pnlThermometer = new ThermometerPanel(temperatureModel), c);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(200, 200);
        setVisible(true);

    }
}
