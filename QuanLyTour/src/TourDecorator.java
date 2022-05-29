public abstract class TourDecorator extends Tour {
    protected Tour tour;

    public TourDecorator(Tour tour) {
        this.tour = tour;
    }

    @Override
    public abstract double price();

    @Override
    public abstract String getDescription();
}
