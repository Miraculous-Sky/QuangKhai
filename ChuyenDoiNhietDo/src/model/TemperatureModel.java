package model;

import observer.ThermometerObservable;

public class TemperatureModel extends ThermometerObservable {
    private double temperatureF = 32.0;

    public double getF() {
        return temperatureF;
    }

    public void setF(double tempF) {
        temperatureF = tempF;
        notifySubscribers();
    }

    public double getC() {
        return (temperatureF - 32.0) * 5.0 / 9.0;
    }

    public void setC(double tempC) {
        temperatureF = tempC * 9.0 / 5.0 + 32.0;
        notifySubscribers();
    }
}