import model.Time;
import model.observer.ClockObservable;
import model.observer.Observable;
import model.observer.Observer;
import view.TopFrame;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        TopFrame topFrame = new TopFrame();
        Observable observable = new ClockObservable();
        observable.addSubscriber((Observer) topFrame.analogClockPanel);
        observable.addSubscriber((Observer) topFrame.digitalClockPanel);

        Time time = new Time();
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
