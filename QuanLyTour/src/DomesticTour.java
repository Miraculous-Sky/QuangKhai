public class DomesticTour extends Tour {
    public DomesticTour() {
    }

    public DomesticTour(String name, String description, int days, double basePrice) {
        super(name, description, days, basePrice);
    }

    @Override
    public double price() {
        return basePrice;
    }
}
