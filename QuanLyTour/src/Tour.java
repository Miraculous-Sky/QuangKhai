public abstract class Tour {
    protected String name;
    protected String description;
    protected int days;
    protected double basePrice;

    public Tour() {
    }

    public Tour(String name, String description, int days, double basePrice) {
        this.name = name;
        this.description = description;
        this.days = days;
        this.basePrice = basePrice;
    }

    public abstract double price();

    public String getDescription() {
        return description;
    }
}
