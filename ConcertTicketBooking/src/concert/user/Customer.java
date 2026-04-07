package concert.user;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Customer implements User {
    private String name;
    private String email;

    public Customer(String name, String email) {
        if (!isValidName(name)) {
            throw new IllegalArgumentException("Invalid name. Only letters and spaces allowed.");
        }
        if (!isValidEmail(email)) {
            throw new IllegalArgumentException("Invalid email format.");
        }

        this.name = name;
        this.email = email;
    }

    private boolean isValidName(String name) {
        // Allows only alphabets and spaces, min 1 character
        return Pattern.matches("^[A-Za-z ]+$", name);
    }

    private boolean isValidEmail(String email) {
        // Basic email regex pattern
        return Pattern.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$", email);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void displayUserInfo() {
        System.out.println("Customer: " + name + ", Email: " + email);
    }
}
