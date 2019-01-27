package pl.sda.behavioral.chain;

import java.util.ArrayList;
import java.util.List;

public class ChainMain {

    public static void main(String[] args) {
        List<PasswordValidator> validators = new ArrayList<PasswordValidator>();
        validators.add(new AlphanumericPasswordValidator());
        validators.add(new MinimumLengthPasswordValidator());

        LoginClient client = new LoginClient(validators);
        client.login("John", "123456asdfsdfsdfsdfsfd");
    }
}
