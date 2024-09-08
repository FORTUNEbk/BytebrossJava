package LiquidContainerUpdate;

import java.util.HashMap;
import java.util.Map;

public class WarehouseInventory {
    private HashMap<String, Double> containers = new HashMap<>();
    private HashMap<String, String> containerLabels = new HashMap<>();

    public void addOrUpdateContainer(String containerName, double weight) {
        containers.put(containerName, containers.getOrDefault(containerName, 0.0) + weight);
        System.out.println("Container " + containerName + " updated successfully.");
    }

    public void calculateTotalWeight() {
        double totalWeight = 0.0;
        
        for (double weight : containers.values()) {
            totalWeight += weight;
        }
        
        System.out.println("The total weight of all containers is: " + totalWeight + " kg.");
    }

    public void findHeaviestContainer() {
        if (containers.isEmpty()) {
            System.out.println("The inventory is empty.");
            return;
        }

        String heaviestContainer = null;
        double maxWeight = Double.MIN_VALUE;
        
        for (Map.Entry<String, Double> entry : containers.entrySet()) {
            if (entry.getValue() > maxWeight) {
                maxWeight = entry.getValue();
                heaviestContainer = entry.getKey();
            }
        }

        System.out.println("The heaviest container is " + heaviestContainer + " with " + maxWeight + " kg.");
    }

    public void assignLabel(String containerName, String label) {
        if (containers.containsKey(containerName)) {
            containerLabels.put(label, containerName);
            System.out.println("Label " + label + " assigned to container " + containerName + ".");
        } else {
            System.out.println("Container does not exist.");
        }
    }

    public void displayAllContainers() {
        if (containers.isEmpty()) {
            System.out.println("No containers to display.");
        }

        System.out.println("Containers and their weights:");
        for (Map.Entry<String, Double> entry : containers.entrySet()) {
            System.out.println("Container: " + entry.getKey() + " - Weight: " + entry.getValue() + " kg");
        }
    }

    public void compareContainerWeights(String firstContainer, String secondContainer) {
        if (containers.containsKey(firstContainer) && containers.containsKey(secondContainer)) {
            double firstWeight = containers.get(firstContainer);
            double secondWeight = containers.get(secondContainer);
            
            if (firstWeight > secondWeight) {
                System.out.println(firstContainer + " is heavier than " + secondContainer + ".");
            } else if (secondWeight > firstWeight) {
                System.out.println(secondContainer + " is heavier than " + firstContainer + ".");
            } else {
                System.out.println("Both containers have the same weight.");
            }
        } else {
            System.out.println("One or both of the containers do not exist.");
        }
    }
}
