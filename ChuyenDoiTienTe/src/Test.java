public class Test {
    public static void main(String[] args) {
        CurrencyUnit vnd = new CurrencyUnit("₫", 22505);
        CurrencyUnit jpy = new CurrencyUnit("¥", 111.8);
        CurrencyUnit eur = new CurrencyUnit("€", 0.89);
        CurrencyUnit gbp = new CurrencyUnit("£", 0.77);

        System.out.println(new CurrencyMeasure(15, vnd).convertTo(eur));
        System.out.println(new CurrencyMeasure(0.000593, eur).convertTo(vnd));

        DistanceUnit mile = new DistanceUnit("mi.", 0.000621);
        DistanceUnit yard = new DistanceUnit("yd", 1.093613);
        System.out.println(new DistanceMeasure(1, yard).convertTo(mile));
    }
}
