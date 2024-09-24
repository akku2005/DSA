// package BinarySearchTree;

// public class BST2 {
//     static class Node {
//         int data;
//         Node left;
//         Node right;

//         Node(int data) {
//             this.data = data;
//             this.left = null; // Initialize left child to null
//             this.right = null; // Initialize right child to null
//         }
//     }

//     public static Node insert(Node root, int val) {
//         if (root == null) {
//             return new Node(val); // Create a new node if root is null
//         }
//         if (val < root.data) {
//             // Insert in left subtree
//             root.left = insert(root.left, val);
//         } else {
//             // Insert in right subtree
//             root.right = insert(root.right, val);
//         }
//         return root; // Return the unchanged root
//     }

//     public static void inorder(Node root) {
//         if (root == null) {
//             return; // Base case for recursion
//         }
//         inorder(root.left); // Traverse left subtree
//         System.out.print(root.data + " "); // Print current node data
//         inorder(root.right); // Traverse right subtree
//     }

//     public static void main(String[] args) {
//         int value[] = { 5, 1, 3, 4, 2, 7, 80, 6, 55 };
//         Node root = null; // Initialize root to null
//         for (int i = 0; i < value.length; i++) {
//             root = insert(root, value[i]); // Insert each value into the BST
//         }
//         inorder(root); // Perform in-order traversal
//         System.out.println(); // Print a new line after traversal
//     }
// }

package BinarySearchTree;

public class BST2 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null; // Initialize left child to null
            this.right = null; // Initialize right child to null
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val); // Create a new node if root is null
        }
        if (val < root.data) {
            // Insert in left subtree
            root.left = insert(root.left, val);
        } else {
            // Insert in right subtree
            root.right = insert(root.right, val);
        }
        return root; // Return the unchanged root
    }

    public static void inorder(Node root) {
        if (root == null) {
            return; // Base case for recursion
        }
        inorder(root.left); // Traverse left subtree
        System.out.print(root.data + " "); // Print current node data
        inorder(root.right); // Traverse right subtree
    }

    // Search function
    public static boolean search(Node root, int key) {
        int comparisons = 0; // Counter for comparisons
        while (root != null) {
            comparisons++; // Increment comparisons for each comparison made
            if (key == root.data) {
                System.out.println("Key " + key + " found after " + comparisons + " comparisons.");
                return true; // Key found
            } else if (key < root.data) {
                root = root.left; // Move to left subtree
            } else {
                root = root.right; // Move to right subtree
            }
        }
        System.out.println("Key " + key + " not found after " + comparisons + " comparisons.");
        return false; // Key not found
    }

    public static void main(String[] args) {
        int value[] = { 5, 1, 3, 4, 2, 7, 80, 6, 55 };
        Node root = null; // Initialize root to null
        for (int i = 0; i < value.length; i++) {
            root = insert(root, value[i]); // Insert each value into the BST
        }
        inorder(root); // Perform in-order traversal
        System.out.println(); // Print a new line after traversal

        // Search for the key
        int key = 55;
        search(root, key); // Perform search operation
    }
}
