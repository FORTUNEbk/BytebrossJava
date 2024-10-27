class LinkeNode {
    Node head; 

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);

        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node prev = head;
        for (int i = 1; i < position - 1 && prev != null; i++) {
            prev = prev.next;
        }

        if (prev == null) {
            System.out.println("Position out of bounds");
            return;
        }

        newNode.next = prev.next;
        prev.next = newNode;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.head = new Node(10);
        list.head.next = new Node(1);
        list.head.next.next = new Node(8);
        list.head.next.next.next = new Node(11);

        System.out.println("Original List:");
        list.printList();

        list.insertAtPosition(5, 3);
        System.out.println("List after inserting 5 at position 3:");
        list.printList();
    }
}
