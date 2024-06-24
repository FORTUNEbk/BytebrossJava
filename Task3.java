
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a start number: ");
        int start = Integer.valueOf(scanner.nextLine());
        System.out.print("Enter the end number: ");
        int end = Integer.valueOf(scanner.nextLine());

        System.out.println("Count of numbers: " + count(start, end));
        System.out.println("Sum of numbers: " + sum(start, end));
        System.out.println("Factorial of the sum: " + factorial(sum(start, end)));

    }

    public static int count(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            count++;
        }
        return count;

    }

    public static int sum(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;

        }
        return sum;

    }

    public static long factorial(int number) {
        long factorial = 1;
        for (int y = 1; y <= number; y++) {
            factorial *= y;

        }
        return factorial;
    }

}
