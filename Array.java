
import java.util.ArrayList;

public class Array {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(4);
        numbers.add(8);
        numbers.add(15);
        numbers.add(6);
        numbers.add(23);
        numbers.add(9);
        numbers.add(3);

        numbers.remove(3); 

        checkContain(numbers, 15);

        int minIdx = minIndex(numbers);
        System.out.println("Index of the smallest number: " + minIdx);

        int sum = sumInList(numbers);
        System.out.println("Sum of all numbers: " + sum);

        printNeatly(numbers);
    }

    public static void checkContain(ArrayList<Integer> list, int number) {
        boolean containsNumber = list.contains(number);
        if (containsNumber) {
            System.out.println("Number " + number + " is found in the list.");
        } else {
            System.out.println("Number " + number + " is not found in the list!");
        }
    }

    public static int minIndex(ArrayList<Integer> list) {
        int minIndex = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < list.get(minIndex)) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int sumInList(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }

    public static void printNeatly(ArrayList<Integer> list) {
        for (int i = 0; i <list.size(); i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(list.get(i));
        }
        System.out.println();
    }
}
