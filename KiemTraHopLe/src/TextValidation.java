public class TextValidation implements Validation {
    @Override
    public boolean validate(String data) {
        return data.matches("^\\w+$");
    }
}
