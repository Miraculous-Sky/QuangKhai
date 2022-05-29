public class VisitFamilyTour extends TourDecorator {
    public VisitFamilyTour(Tour tour) {
        super(tour);
    }

    @Override
    public double price() {
        return tour.price() * 1.05;
    }

    @Override
    public String getDescription() {
        return "Tour thăm thân nhân: " + tour.getDescription();
    }
}
