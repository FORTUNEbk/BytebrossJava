class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("Added: " + data);
    }

    public void remove(int data) {
        if (head == null) {
            System.out.println("List is empty. Nothing to remove.");
            return;
        }

        if (head.data == data) {
            head = head.next;
            System.out.println("Removed: " + data);
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
            System.out.println("Removed: " + data);
        } else {
            System.out.println("Node with value " + data + " not found.");
        }
    }

    public boolean search(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class LinkedList {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        list.printList();

        System.out.println("Is 20 in the list? " + list.search(20)); // true
        System.out.println("Is 50 in the list? " + list.search(50)); // false

        list.remove(20);
        list.printList(); 

        list.remove(50); 

        list.printList();
    }
}
