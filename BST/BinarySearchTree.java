package BST;

// BSTNode class represents each node in the Binary Search Tree
class BSTNode {
    int key; // Data stored in the node
    BSTNode left; // Pointer to the left child
    BSTNode right; // Pointer to the right child

    // Constructor to create a new node
    public BSTNode(int item) {
        key = item;
        left = right = null;
    }
}

// BinarySearchTree class contains methods to manipulate the BST
public class BinarySearchTree {
    // Root node of the BST
    BSTNode root;

    // Constructor to initialize the BST
    public BinarySearchTree() {
        root = null;
    }

    // Method to insert a new key in the BST
    void insert(int key) {
        root = insertRec(root, key);
    }

    // Recursive function to insert a new key in the BST
    BSTNode insertRec(BSTNode root, int key) {
        // If the tree is empty, return a new node
        if (root == null) {
            root = new BSTNode(key);
            return root;
        }

        // Otherwise, recur down the tree
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);
        // If key is already present, do not insert duplicates
        return root;
    }

    // Method to search a key in the BST
    boolean search(int key) {
        return searchRec(root, key);
    }

    // Recursive function to search a key in the BST
    boolean searchRec(BSTNode root, int key) {
        // Base Cases: root is null or key is present at root
        if (root == null)
            return false;
        if (root.key == key)
            return true;

        // Key is greater than root's key
        if (key < root.key)
            return searchRec(root.left, key);

        // Key is smaller than root's key
        return searchRec(root.right, key);
    }

    // Method to delete a key from the BST
    void deleteKey(int key) {
        root = deleteRec(root, key);
    }

    // Recursive function to delete a key from the BST
    BSTNode deleteRec(BSTNode root, int key) {
        // Base Case: If the tree is empty
        if (root == null)
            return root;

        // Otherwise, recur down the tree
        if (key < root.key)
            root.left = deleteRec(root.left, key);
        else if (key > root.key)
            root.right = deleteRec(root.right, key);
        // If key is same as root's key, then this is the node to be deleted
        else {
            // Node with only one child or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // Node with two children: Get the inorder successor (smallest in the right
            // subtree)
            root.key = minValue(root.right);

            // Delete the inorder successor
            root.right = deleteRec(root.right, root.key);
        }

        return root;
    }

    // Helper method to find the minimum value in a subtree
    int minValue(BSTNode root) {
        int minv = root.key;
        while (root.left != null) {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }

    // Method for inorder traversal of the BST
    void inorder() {
        inorderRec(root);
        System.out.println();
    }

    // Recursive function for inorder traversal
    void inorderRec(BSTNode root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    // Method for preorder traversal of the BST
    void preorder() {
        preorderRec(root);
        System.out.println();
    }

    // Recursive function for preorder traversal
    void preorderRec(BSTNode root) {
        if (root != null) {
            System.out.print(root.key + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    // Method for postorder traversal of the BST
    void postorder() {
        postorderRec(root);
        System.out.println();
    }

    // Recursive function for postorder traversal
    void postorderRec(BSTNode root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.key + " ");
        }
    }

    // Main method to demonstrate BST operations
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        /*
         * Example Insertion:
         * 50
         * / \
         * 30 70
         * / \ / \
         * 20 40 60 80
         */
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        // Inorder Traversal (Should print sorted order)
        System.out.print("Inorder Traversal: ");
        bst.inorder(); // Output: 20 30 40 50 60 70 80

        // Preorder Traversal
        System.out.print("Preorder Traversal: ");
        bst.preorder(); // Output: 50 30 20 40 70 60 80

        // Postorder Traversal
        System.out.print("Postorder Traversal: ");
        bst.postorder(); // Output: 20 40 30 60 80 70 50

        // Search for a key
        int keyToSearch = 60;
        if (bst.search(keyToSearch))
            System.out.println("Key " + keyToSearch + " found in BST.");
        else
            System.out.println("Key " + keyToSearch + " not found in BST.");

        // Delete a key
        int keyToDelete = 30;
        System.out.println("Deleting key " + keyToDelete);
        bst.deleteKey(keyToDelete);

        // Inorder Traversal after deletion
        System.out.print("Inorder Traversal after deletion: ");
        bst.inorder(); // Output: 20 40 50 60 70 80
    }
}
