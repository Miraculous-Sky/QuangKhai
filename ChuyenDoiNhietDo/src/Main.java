import model.TemperatureModel;
import observer.Observer;
import view.TopFrame;

public class Main {

    public static void main(String[] args) {
        TemperatureModel temperatureModel = new TemperatureModel();
        TopFrame topFrame = new TopFrame(temperatureModel);
        temperatureModel.addSubscriber((Observer) topFrame.pnlFDegree);
        temperatureModel.addSubscriber((Observer) topFrame.pnlCDegree);
        temperatureModel.addSubscriber((Observer) topFrame.pnlThermometer);
        temperatureModel.setF(0);

    }
}
