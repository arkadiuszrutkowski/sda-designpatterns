package pl.sda.behavioral.chain;

import java.util.List;

public class LoginClient {

    private final List<PasswordValidator> validators;

    public LoginClient(List<PasswordValidator> validators) {
        this.validators = validators;
    }

    public void login(String userName, String password) {

        boolean validationSuccess = true;
        for (PasswordValidator validator : validators) {
            try {
                validator.validate(password);
            } catch (PasswordValidationException e) {
                validationSuccess = false;
                System.out.println("Error: " + e.getMessage());
            }
            if (!validationSuccess) {
                break;
            }
        }
        if (validationSuccess) {
            System.out.println("user " + userName + " logged in!");
        }
    }
}
