public class Unit {
    protected String symbol;
    protected double exchangeRate;

    public Unit() {
    }

    public Unit(String symbol, double exchangeRate) {
        this.symbol = symbol;
        this.exchangeRate = exchangeRate;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }
}