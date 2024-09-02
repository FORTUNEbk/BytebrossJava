import java.util.ArrayList;
import java.util.HashMap;

public class studentsInCourse {
    public static void main(String[] args) {

        HashMap<String, ArrayList<String>> studentCourses = new HashMap<>();

        enrollStudent(studentCourses, "Alice", "Math");
        enrollStudent(studentCourses, "Bob", "Science");
        enrollStudent(studentCourses, "Alice", "Science");
        enrollStudent(studentCourses, "Charlie", "Math");

        printCourses(studentCourses, "Alice"); // Should print: Math, Science

        unenrollStudent(studentCourses, "Alice", "Math");

        printCourses(studentCourses, "Alice"); // Should print: Science

        studentsInCourse(studentCourses, "Science"); // Should print: Bob, Alice
    }

    public static void enrollStudent(HashMap<String, ArrayList<String>> map, String studentName, String course) {
        map.putIfAbsent(studentName, new ArrayList<>());
        map.get(studentName).add(course);
    }

    public static void unenrollStudent(HashMap<String, ArrayList<String>> map, String studentName, String course) {
        if (map.containsKey(studentName)) {
            map.get(studentName).remove(course);
        }
    }

    public static void printCourses(HashMap<String, ArrayList<String>> map, String studentName) {
        if (map.containsKey(studentName)) {
            System.out.println(studentName + " is enrolled in: " + map.get(studentName));
        } else {
            System.out.println(studentName + " is not enrolled in any courses.");
        }
    }

    public static void studentsInCourse(HashMap<String, ArrayList<String>> map, String course) {
        System.out.println("Students enrolled in " + course + ":");
        for (String student : map.keySet()) {
            if (map.get(student).contains(course)) {
                System.out.println(student);
            }
        }
    }
}