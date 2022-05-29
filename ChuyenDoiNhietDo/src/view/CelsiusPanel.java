package view;

import model.TemperatureModel;

public class CelsiusPanel extends FormPanel {
    public CelsiusPanel(String title, TemperatureModel model) {
        super(title, model);
        btnLower.addActionListener(e -> model.setC(model.getC() - 1));
        btnRaise.addActionListener(e -> model.setC(model.getC() + 1));
        txfTemperature.addActionListener(e -> model.setC(Double.parseDouble(txfTemperature.getText())));
    }

    @Override
    public void update() {
        txfTemperature.setText(model.getC() + "");
    }
}
