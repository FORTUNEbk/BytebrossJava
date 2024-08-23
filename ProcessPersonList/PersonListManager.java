package ProcessPersonList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonListManager {

    public static void processPersonList() {
        List<Person> personList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) break;

            System.out.print("Enter ID: ");
            String id = scanner.nextLine();
            if (id.isEmpty()) break;

            System.out.print("Enter gender: ");
            String gender = scanner.nextLine();

            System.out.print("Enter county: ");
            String county = scanner.nextLine();

            Person newPerson = new Person(name, id, gender, county);

            if (!personList.contains(newPerson)) {
                personList.add(newPerson);
                System.out.println("Added: " + newPerson);
            } else {
                System.out.println("Duplicate entry found. Person not added.");
            }
        }

        System.out.println("\nFinal list of persons:");
        for (Person person : personList) {
            System.out.println(person);
        }

        scanner.close();
    }

    public static void main(String[] args) {
        processPersonList();
    }
}
