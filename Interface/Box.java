package Interface;

import java.util.ArrayList;

public class Box implements Packable {
    private double maxWeight;
    private ArrayList<Packable> contents;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.contents = new ArrayList<>();
    }

    public void add(Packable item) {
        if (this.weight() + item.weight() <= maxWeight) {
            contents.add(item);
        }
    }

    @Override
    public double weight() {
        double totalWeight = 0;
        for (Packable item : contents) {
            totalWeight += item.weight();
        }
        return totalWeight;
    }

    @Override
    public String toString() {
        return "Box: " + contents.size() + " items, total weight " + weight() + " kg";
    }
}
