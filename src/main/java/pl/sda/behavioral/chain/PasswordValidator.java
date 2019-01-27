package pl.sda.behavioral.chain;

public interface PasswordValidator {

    void validate(String stringToValidate) throws PasswordValidationException;
}
