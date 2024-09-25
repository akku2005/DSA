package BinarySearchTree;

public class BST3 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Insert Method
    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }
        if (val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    // In-order Traversal Method
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " "); // Corrected to print the data
        inorder(root.right);
    }

    // Main method
    public static void main(String[] args) {
        int value[] = { 5, 3, 6, 7, 8, 1, 9, 2, 11, 20 };
        Node root = null;
        for (int val : value) { // Using enhanced for loop for clarity
            root = insert(root, val);
        }
        System.out.print("In-order traversal: ");
        inorder(root);
        System.out.println(); // Print a newline after the traversal
    }
}
