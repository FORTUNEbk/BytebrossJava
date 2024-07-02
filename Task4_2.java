import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Task4_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the filename: ");
        String filename = scanner.nextLine();
        
        String[][] salesData = readSalesData(filename);
        if (salesData == null) {
            return;
        }
        
        System.out.print("Enter the product category: ");
        String category = scanner.nextLine();
        
        calculateAndDisplayResults(salesData, category, filename);
    }
    
    private static String[][] readSalesData(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            String[][] salesData = new String[100][];
            int index = 0;
            while ((line = br.readLine()) != null) {
                salesData[index++] = line.split(",");
            }
            String[][] result = new String[index][];
            System.arraycopy(salesData, 0, result, 0, index);
            return result;
        } catch (IOException e) {
            System.out.println("Error: The file " + filename + " was not found.");
            return null;
        }
    }
    
    private static void calculateAndDisplayResults(String[][] salesData, String category, String filename) {
        int totalQuantity = 0;
        double totalRevenue = 0;
        
        for (String[] row : salesData) {
            if (row[1].equals(category)) {
                totalQuantity += Integer.parseInt(row[2]);
                totalRevenue += Double.parseDouble(row[3]);
            }
        }
        
        if (totalQuantity == 0) {
            System.out.println("No products found for category: " + category);
        } else {
            double averageRevenue = totalRevenue / totalQuantity;
            System.out.println("File: " + filename);
            System.out.println("Category: " + category);
            System.out.println("Products Sold: " + totalQuantity);
            System.out.println("Total Revenue: " + totalRevenue);
            System.out.printf("Average Revenue per Product: %.2f\n", averageRevenue);
        }
    }
}
