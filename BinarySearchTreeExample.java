class BinarySearchTree {
    class Node {
        int value;
        Node left, right;

        public Node(int value) {
            this.value = value;
            left = right = null;
        }
    }

    Node root;

    BinarySearchTree() {
        root = null;
    }

    void insert(int value) {
        root = insertRec(root, value);
    }

    Node insertRec(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }

        if (value < root.value) {
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }

        return root;
    }

    void delete(int value) {
        root = deleteRec(root, value);
    }

    Node deleteRec(Node root, int value) {
        if (root == null) {
            return root;
        }

        if (value < root.value) {
            root.left = deleteRec(root.left, value);
        } else if (value > root.value) {
            root.right = deleteRec(root.right, value);
        } else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            root.value = minValue(root.right);
            root.right = deleteRec(root.right, root.value);
        }

        return root;
    }

    int minValue(Node root) {
        int minValue = root.value;
        while (root.left != null) {
            minValue = root.left.value;
            root = root.left;
        }
        return minValue;
    }

    void inorder() {
        inorderRec(root);
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.value + " ");
            inorderRec(root.right);
        }
    }

    boolean search(int value) {
        return searchRec(root, value);
    }

    boolean searchRec(Node root, int value) {
        if (root == null) {
            return false;
        }

        if (value == root.value) {
            return true;
        }

        if (value < root.value) {
            return searchRec(root.left, value);
        } else {
            return searchRec(root.right, value);
        }
    }
}

public class BinarySearchTreeExample {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        System.out.println("Inorder traversal of the tree:");
        bst.inorder();
        System.out.println();

        int searchValue = 40;
        if (bst.search(searchValue)) {
            System.out.println(searchValue + " found in the tree.");
        } else {
            System.out.println(searchValue + " not found in the tree.");
        }

        System.out.println("Deleting 40 from the tree.");
        bst.delete(40);

        System.out.println("Inorder traversal after deletion:");
        bst.inorder();
    }
}
