package pl.sda.behavioral.chain;

public class MinimumLengthPasswordValidator implements PasswordValidator {

    public void validate(String stringToValidate) throws PasswordValidationException {
        if (stringToValidate.length() < 10) {
            throw new PasswordValidationException("Password requires at least 10 characters");
        }
    }
}
