package LiquidContainerRegistry;

import java.util.HashMap;
import java.util.Scanner;

public class ContainerOperations {
    private HashMap<String, Integer> storage;
    private HashMap<String, String> nicknames;
    private Scanner scanner;

    public ContainerOperations() {
        this.storage = new HashMap<>();
        this.nicknames = new HashMap<>();
        this.scanner = new Scanner(System.in);
    }

    private int getValidIntegerInput(String prompt) {
        while (true) {
            try {
                System.out.println(prompt);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
    }

    private String getValidStringInput(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public void dataEntry() {
        String containerName = getValidStringInput("Enter the name of the container");
        int newVolume = getValidIntegerInput("Enter the volume of the container");

        if (storage.containsKey(containerName)) {
            int currentVolume = storage.get(containerName);
            storage.put(containerName, currentVolume + newVolume);
            System.out.println("Updated volume of '" + containerName + "' to " + (currentVolume + newVolume));
        } else {
            storage.put(containerName, newVolume);
            System.out.println("Added container '" + containerName + "' with volume " + newVolume);
        }
    }

    public void calculateAverageVolume() {
        if (storage.isEmpty()) {
            System.out.println("No containers available to calculate.");
            
        }

        double totalVolume = 0.0;
        for (int volume : storage.values()) {
            totalVolume += volume;
        }

        double averageVolume = totalVolume / storage.size();
        System.out.println("Average volume of all containers: " + averageVolume);
    }

    public void retrieveContainerVolume() {
        String containerName = getValidStringInput("Enter the name of the container you want");

        if (storage.containsKey(containerName)) {
            int volume = storage.get(containerName);
            System.out.println("The volume of container '" + containerName + "' is: " + volume + " liters");
        } else {
            System.out.println("Container '" + containerName + "' does not exist.");
        }
    }

    public void addNickname() {
        String containerName = getValidStringInput("Enter the name of the container to add a nickname");

        if (storage.containsKey(containerName)) {
            String nickname = getValidStringInput("Enter the nickname for the container");
            nicknames.put(containerName, nickname);
            System.out.println("Nickname '" + nickname + "' added for container '" + containerName + "'");
        } else {
            System.out.println("Container '" + containerName + "' does not exist, so a nickname cannot be added.");
        }
    }

    public void printAllContainers() {
        if (storage.isEmpty()) {
            System.out.println("No containers in the registry.");
            return;
        }

        System.out.println("List of all containers and their volumes:");
        for (String containerName : storage.keySet()) {
            int volume = storage.get(containerName);
            String nickname = nicknames.getOrDefault(containerName, "No nickname");
            System.out.println("- Container: " + containerName + " (Nickname: " + nickname + "), Volume: " + volume + " liters");
        }
    }

    public void compareContainerVolumes() {
        String firstContainer = getValidStringInput("Enter the name of the first container");
        String secondContainer = getValidStringInput("Enter the name of the second container");

        if (storage.containsKey(firstContainer) && storage.containsKey(secondContainer)) {
            int firstVolume = storage.get(firstContainer);
            int secondVolume = storage.get(secondContainer);

            if (firstVolume > secondVolume) {
                System.out.println("Container '" + firstContainer + "' has a larger volume (" + firstVolume + " liters) than '" + secondContainer + "' (" + secondVolume + " liters).");
            } else if (firstVolume < secondVolume) {
                System.out.println("Container '" + secondContainer + "' has a larger volume (" + secondVolume + " liters) than '" + firstContainer + "' (" + firstVolume + " liters).");
            } else {
                System.out.println("Both containers '" + firstContainer + "' and '" + secondContainer + "' have equal volumes (" + firstVolume + " liters).");
            }
        } else {
            if (!storage.containsKey(firstContainer)) {
                System.out.println("Container '" + firstContainer + "' does not exist.");
            }
            if (!storage.containsKey(secondContainer)) {
                System.out.println("Container '" + secondContainer + "' does not exist.");
            }
        }
    }
}
