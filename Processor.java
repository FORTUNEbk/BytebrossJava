import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Processor {

    enum UserRole {
        ADMIN, USER, GUEST

    }

   

    public static List<String> formatUserData(List<String> userData) {
        List<String> formattedUsers = new ArrayList<>();
        
        String idPattern = "\\d{3}-\\d{3}";
        Pattern pattern = Pattern.compile(idPattern);

        Iterator<String> iterator = userData.iterator();
        while (iterator.hasNext()) {
            String entry = iterator.next();
            String[] parts = entry.split(":");

            if (parts.length != 3) {
                continue;
            }

            String name = parts[0];
            String roleString = parts[1];
            String id = parts[2];

            try {
                UserRole role = UserRole.valueOf(roleString);  
                
                Matcher matcher = pattern.matcher(id);
                if (matcher.matches()) {
                    StringBuilder formatted = new StringBuilder();
                    formatted.append("User: ").append(name).append(" (").append(role).append("), ID: ").append(id);
                    formattedUsers.add(formatted.toString());
                }
            } catch (Exception e) {
                continue;
            }
        }

        return formattedUsers;

    }
    public static void main(String[] args) {
        List<String> userData = Arrays.asList(
                "Alice:ADMIN:123-456",
                "Anne:USER:789-012",
                "Greg:GUEST:111-111",
                "Eve:UNKNOWN:123-456",
                "James:ADMIN:12-34X"
        );

        List<String> result = formatUserData(userData);

        for (String user : result) {
            System.out.println(user);
        }
    }
}
