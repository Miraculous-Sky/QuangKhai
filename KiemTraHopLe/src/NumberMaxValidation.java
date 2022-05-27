public class NumberMaxValidation extends NumberValidation {

    public boolean validate(String data, double max) {
        if (!validate(data)) return false;
        return Double.compare(Double.parseDouble(data), max) <= 0;
    }
}