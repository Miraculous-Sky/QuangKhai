package view;

import model.TemperatureModel;
import observer.Observer;

import javax.swing.*;
import java.awt.*;

public abstract class FormPanel extends JPanel implements Observer {
    JTextField txfTemperature;
    JButton btnRaise, btnLower;
    TemperatureModel model;

    FormPanel(String title, TemperatureModel model) {
        this.model = model;
        setBorder(BorderFactory.createTitledBorder(title));
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(5, 5, 5, 5);  //top padding
        c.gridwidth = 2;
        c.gridx = 0;
        c.gridy = 0;
        add(txfTemperature = new JTextField("0.0"), c);
        c.gridwidth = 1;
        c.gridx = 0;
        c.gridy = 1;
        add(btnRaise = new JButton("Raise"), c);
        c.gridx = 1;
        c.gridy = 1;
        add(btnLower = new JButton("Lower"), c);
    }

}
