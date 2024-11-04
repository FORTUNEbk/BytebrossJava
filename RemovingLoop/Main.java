public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.createLoop(3);

        if (list.hasLoop()) {
            System.out.println("Loop detected in the list.");
        } else {
            System.out.println("No loop detected in the list.");
        }

        list.removeLoop();

        if (list.hasLoop()) {
            System.out.println("Loop still present in the list.");
        } else {
            System.out.println("Loop successfully removed.");
        }

        // Print the list after removing the loop
        list.printList();
    }
}
