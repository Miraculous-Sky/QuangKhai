package view;

import model.TemperatureModel;

public class FahrenheitPanel extends FormPanel {
    public FahrenheitPanel(String title, TemperatureModel model) {
        super(title, model);
        btnLower.addActionListener(e -> model.setF(model.getF() - 1));
        btnRaise.addActionListener(e -> model.setF(model.getF() + 1));
        txfTemperature.addActionListener(e -> model.setF(Double.parseDouble(txfTemperature.getText())));
    }

    @Override
    public void update() {
        txfTemperature.setText(model.getF() + "");
    }
}
