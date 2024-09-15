package ListProcessor;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Step 1: Test with sample user data
        List<String> userData = Arrays.asList(
                "Alice:ADMIN:123-456",
                "Bob:USER:789-012",
                "Charlie:GUEST:111-111",
                "Eve:UNKNOWN:123-456",
                "Mallory:ADMIN:12-34X"
        );

        // Step 2: Create an instance of UserProcessor and process the data
        UserProcessor processor = new UserProcessor();
        List<String> result = processor.formatUserData(userData);

        // Step 3: Output the formatted results
        for (String user : result) {
            System.out.println(user);
        }
    }
}
