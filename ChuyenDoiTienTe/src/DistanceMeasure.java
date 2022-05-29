public class DistanceMeasure extends Measure {
    public DistanceMeasure() {
    }

    public DistanceMeasure(double value, DistanceUnit unit) {
        super(value, unit);
    }

    @Override
    public Measure convertTo(Unit unit) {
        if (unit instanceof DistanceUnit) {
            double baseValue = this.value / this.unit.getExchangeRate();
            return new DistanceMeasure(baseValue * unit.getExchangeRate(), (DistanceUnit) unit);
        }
        return null;
    }
}
