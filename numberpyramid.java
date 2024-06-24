import java.util.Scanner;

public class numberpyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the desired height.");
        int number = Integer.valueOf(scanner.nextLine());
        
        for (int i = 1; i <= number; i++) {
            
            for (int j = 1; j <= number - i; j++) {
                System.out.print(" ");
            }
        
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
    
            System.out.println();
        }
        
        scanner.close();
    }
}
