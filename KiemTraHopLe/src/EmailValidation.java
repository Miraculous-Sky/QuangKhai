public class EmailValidation implements Validation {
    @Override
    public boolean validate(String data) {
        return data.matches("^\\w+@\\w+$");
    }
}
