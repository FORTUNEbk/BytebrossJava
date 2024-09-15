package ListProcessor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
    enum UserRole {
        ADMIN, USER, GUEST
    }

    private String name;
    private UserRole role;
    private String id;

    // Constructor to initialize the user object
    public User(String name, String roleString, String id) throws IllegalArgumentException {
        this.name = name;
        this.role = UserRole.valueOf(roleString);  // Validate role
        if (isValidId(id)) {
            this.id = id;
        } else {
            throw new IllegalArgumentException("Invalid ID format");
        }
    }

    // Method to validate the ID format ###-###
    private boolean isValidId(String id) {
        String idPattern = "\\d{3}-\\d{3}";
        Pattern pattern = Pattern.compile(idPattern);
        Matcher matcher = pattern.matcher(id);
        return matcher.matches();
    }

    // Method to return the formatted user data
    public String formatUser() {
        StringBuilder formatted = new StringBuilder();
        formatted.append("User: ").append(name)
                 .append(" (").append(role).append("), ID: ").append(id);
        return formatted.toString();
    }
}
