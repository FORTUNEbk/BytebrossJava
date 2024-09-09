package StudentManagement;

import java.util.HashMap;
import java.util.Map;

public class GradesManager {

    private HashMap<String, Student> students;

    public GradesManager() {
        students = new HashMap<>();
    }

    public void addStudent(String studentName) {
        if (!students.containsKey(studentName)) {
            students.put(studentName, new Student(studentName));
        }
    }

    public void addGrade(String studentName, String subject, int grade) {
        Student student = students.get(studentName);
        if (student != null) {
            student.addGrade(subject, grade);
        }
    }

    public void removeStudent(String studentName) {
        students.remove(studentName);
    }

    public Integer getGrade(String studentName, String subject) {
        Student student = students.get(studentName);
        if (student != null) {
            return student.getGrade(subject);
        }
        return null;
    }

    public double getAverageGrade(String studentName) {
        Student student = students.get(studentName);
        if (student != null) {
            return student.getAverageGrade();
        }
        return 0.0;
    }

    public String getTopStudent() {
        String topStudent = null;
        double highestAverage = 0.0;

        for (Student student : students.values()) {
            double average = student.getAverageGrade();
            if (average > highestAverage) {
                highestAverage = average;
                topStudent = student.getName();
            }
        }

        return topStudent;
    }

    public static void main(String[] args) {
        GradesManager manager = new GradesManager();

        manager.addStudent("Alice");
        manager.addStudent("Bob");

        manager.addGrade("Alice", "Math", 90);
        manager.addGrade("Alice", "Science", 85);
        manager.addGrade("Bob", "Math", 92);
        manager.addGrade("Bob", "Science", 88);

        System.out.println("Alice's Math grade: " + manager.getGrade("Alice", "Math")); // 90
        System.out.println("Bob's average grade: " + manager.getAverageGrade("Bob")); // 90.0

        System.out.println("Top student: " + manager.getTopStudent()); // Bob

        manager.removeStudent("Alice");
        System.out.println("Alice's Math grade after removal: " + manager.getGrade("Alice", "Math")); // null
    }
}
