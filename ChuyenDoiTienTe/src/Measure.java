import java.text.DecimalFormat;

public abstract class Measure {
    protected double value;
    protected Unit unit;

    public Measure() {
    }

    public Measure(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(CurrencyUnit unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return new DecimalFormat("#.######").format(value) + unit.getSymbol();
    }

    public abstract Measure convertTo(Unit unit);
}
