public class LinkedList {
    private Node head;

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
    }

    public void createLoop(int position) {
        Node loopNode = head;
        Node lastNode = head;
        int count = 1;

        while (count < position && loopNode != null) {
            loopNode = loopNode.next;
            count++;
        }

        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }

        if (loopNode != null) {
            lastNode.next = loopNode;
        }
    }

    public boolean hasLoop() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;  
            }
        }
        return false; 
    }

    public void removeLoop() {
        Node slow = head;
        Node fast = head;

        boolean loopExists = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                loopExists = true;
                break;
            }
        }

        if (loopExists) {
            slow = head;
            if (slow == fast) {
                while (fast.next != slow) {
                    fast = fast.next;
                }
            } else {
                while (slow.next != fast.next) {
                    slow = slow.next;
                    fast = fast.next;
                }
            }
            fast.next = null;
            System.out.println("Loop removed from the list.");
        } else {
            System.out.println("No loop found in the list.");
        }
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
