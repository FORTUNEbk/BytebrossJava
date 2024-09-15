package ListProcessor;

import java.util.*;

public class UserProcessor {

    // Method to process and format user data
    public List<String> formatUserData(List<String> userData) {
        List<String> formattedUsers = new ArrayList<>();

        // Iterate through the list of user data
        Iterator<String> iterator = userData.iterator();
        while (iterator.hasNext()) {
            String entry = iterator.next();
            String[] parts = entry.split(":");

            if (parts.length != 3) {
                // Skip invalid entries that don't have exactly 3 parts
                continue;
            }

            String name = parts[0];
            String roleString = parts[1];
            String id = parts[2];

            try {
                // Create a User object, which validates role and ID
                User user = new User(name, roleString, id);
                // Add formatted user to the list
                formattedUsers.add(user.formatUser());
            } catch (IllegalArgumentException e) {
                // Skip invalid entries (invalid role or ID)
            }
        }

        return formattedUsers;
    }
}
