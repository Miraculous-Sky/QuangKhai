public class SaleTour extends TourDecorator {
    private double saleAmount;

    public SaleTour(Tour tour, double saleAmount) {
        super(tour);
        this.saleAmount = saleAmount;
    }

    @Override
    public double price() {
        return tour.price() - saleAmount;
    }

    @Override
    public String getDescription() {
        return "Tour giảm giá: " + tour.getDescription() + "(giảm " + saleAmount + ")";
    }
}
