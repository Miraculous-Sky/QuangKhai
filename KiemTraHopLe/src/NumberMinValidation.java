public class NumberMinValidation extends NumberValidation {

    public boolean validate(String data, double min) {
        if (!validate(data)) return false;
        return Double.compare(Double.parseDouble(data), min) >= 0;
    }
}
