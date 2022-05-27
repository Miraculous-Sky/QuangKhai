public class NumberValidation implements Validation {
    @Override
    public boolean validate(String data) {
        return data.matches("^\\d+\\.?\\d+$");
    }
}
