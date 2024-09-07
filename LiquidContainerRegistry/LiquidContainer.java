package LiquidContainerRegistry;


import java.util.Scanner;

public class LiquidContainer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContainerOperations containerOps = new ContainerOperations();

        while (true) {
            System.out.println("Welcome to the Liquid Container Registry!");
            System.out.println("1. Add a Liquid Container");
            System.out.println("2. Calculate the Average Volume");
            System.out.println("3. Retrieve a Container's Volume");
            System.out.println("4. Generate Nicknames");
            System.out.println("5. Print All Containers");
            System.out.println("6. Compare Container Volumes");
            System.out.println("7. Exit");
            System.out.print("Please select an option: ");

            int option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1:
                    containerOps.dataEntry();
                    break;
                case 2:
                    containerOps.calculateAverageVolume();
                    break;
                case 3:
                    containerOps.retrieveContainerVolume();
                    break;
                case 4:
                    containerOps.addNickname();
                    break;
                case 5:
                    containerOps.printAllContainers();
                    break;
                case 6:
                    containerOps.compareContainerVolumes();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}
