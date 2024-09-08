package LiquidContainerUpdate;

import java.util.Scanner;

public class WarehouseInventoryTracker {
    public static void main(String[] args) {
        WarehouseInventory warehouse = new WarehouseInventory();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        System.out.println("Welcome to the Warehouse Inventory Tracker!");
        
        while (running) {
            System.out.println("1. Add or Update a Container");
            System.out.println("2. Calculate Total Weight");
            System.out.println("3. Find Heaviest Container");
            System.out.println("4. Assign Labels to Containers");
            System.out.println("5. Display All Containers");
            System.out.println("6. Compare Container Weights");
            System.out.println("7. Exit");
            System.out.print("Please select an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                case 1:
                    addOrUpdateContainer(warehouse, scanner);
                    break;
                case 2:
                    warehouse.calculateTotalWeight();
                    break;
                case 3:
                    warehouse.findHeaviestContainer();
                    break;
                case 4:
                    assignLabel(warehouse, scanner);
                    break;
                case 5:
                    warehouse.displayAllContainers();
                    break;
                case 6:
                    compareContainerWeights(warehouse, scanner);
                    break;
                case 7:
                    running = false;
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        
        scanner.close();
    }


    private static void addOrUpdateContainer(WarehouseInventory warehouse, Scanner scanner) {
        System.out.print("Enter the container name: ");
        String containerName = scanner.nextLine();
        System.out.print("Enter the container weight (in kg): ");
        double weight = scanner.nextDouble();
        warehouse.addOrUpdateContainer(containerName, weight);
    }

    private static void assignLabel(WarehouseInventory warehouse, Scanner scanner) {
        System.out.print("Enter the container name to assign a label: ");
        String containerName = scanner.nextLine();
        System.out.print("Enter the label (nickname) for the container: ");
        String label = scanner.nextLine();
        warehouse.assignLabel(containerName, label);
    }

    private static void compareContainerWeights(WarehouseInventory warehouse, Scanner scanner) {
        System.out.print("Enter the first container name: ");
        String firstContainer = scanner.nextLine();
        System.out.print("Enter the second container name: ");
        String secondContainer = scanner.nextLine();
        warehouse.compareContainerWeights(firstContainer, secondContainer);
    }
}
