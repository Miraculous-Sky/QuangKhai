public class CurrencyMeasure extends Measure {

    public CurrencyMeasure() {
    }

    public CurrencyMeasure(double value, CurrencyUnit unit) {
        super(value, unit);
    }

    @Override
    public CurrencyMeasure convertTo(Unit unit) {
        if (unit instanceof CurrencyUnit) {
            double baseValue = this.value / this.unit.getExchangeRate();
            return new CurrencyMeasure(baseValue * unit.getExchangeRate(), (CurrencyUnit) unit);
        }
        return null;
    }
}
