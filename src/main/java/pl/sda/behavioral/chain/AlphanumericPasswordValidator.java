package pl.sda.behavioral.chain;

import javax.xml.bind.ValidationException;

public class AlphanumericPasswordValidator implements PasswordValidator {

    public void validate(String stringToValidate) throws PasswordValidationException {
        boolean hasAnyNumber = false;
        boolean hasAnyLetter = false;

        for (int i = 0; i < stringToValidate.length(); i++) {
            Character currentChar = stringToValidate.charAt(i);
            if (!hasAnyNumber) {
                hasAnyNumber = Character.isDigit(currentChar);
            }
            if (!hasAnyLetter) {
                hasAnyLetter = Character.isLetter(currentChar);
            }
        }
        if (hasAnyLetter && hasAnyNumber) {
            return;
        } else {
            throw new PasswordValidationException("Required at least one letter and number");
        }
    }
}
