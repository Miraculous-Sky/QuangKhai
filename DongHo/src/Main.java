import javax.swing.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        Time time = new Time();
        JPanel analogClockPanel = new AnalogClock();
        JPanel digitalClockPanel = new DigitalClock();

        JFrame analogClockFrame = new JFrame("Analog Clock");
        analogClockFrame.setSize(200, 200);
        analogClockFrame.add(analogClockPanel);
        analogClockFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        analogClockFrame.setVisible(true);

        JFrame digitalClockFrame = new JFrame("Digital Clock");
        digitalClockFrame.add(digitalClockPanel);
        digitalClockFrame.setSize(200, 100);
        digitalClockFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        digitalClockFrame.setVisible(true);

        Observable observable = new ClockObservable();
        observable.addSubscriber((Observer) analogClockPanel);
        observable.addSubscriber((Observer) digitalClockPanel);


        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Calendar calendar = GregorianCalendar.getInstance();
                time.setHour(calendar.get(Calendar.HOUR_OF_DAY));
                time.setMinute(calendar.get(Calendar.MINUTE));
                time.setSecond(calendar.get(Calendar.SECOND));
                observable.notifySubscribers(time);
            }
        }, 0, 1);
    }
}
