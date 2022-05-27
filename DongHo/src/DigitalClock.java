import javax.swing.*;

public class DigitalClock extends JPanel implements Observer {
    JLabel lblTime = new JLabel();

    public DigitalClock() {
        add(lblTime);
    }

    @Override
    public void update(Object context) {
        lblTime.setText(context.toString());
    }
}
