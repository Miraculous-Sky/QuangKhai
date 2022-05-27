public class PhoneNumberValidation implements Validation {

    @Override
    public boolean validate(String data) {
        return data.matches("^08//d{8}$");
    }
}
