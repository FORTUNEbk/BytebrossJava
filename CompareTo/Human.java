

public class Human implements Comparable<Human> {
    private int wage;
    private String name;

    public Human(String name, int wage) {
        this.name = name;
        this.wage = wage;
    }

    public String getName() {
        return this.name;
    }

    public int getWage() {
        return this.wage;
    }

    public String toString() {
        return this.name + " " + this.wage;
    }

    public int compareTo(Human human) {
        return human.getWage() - this.wage;
    }
}
