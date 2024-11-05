package BinarySearchTree;

class Node {
    int data;
    Node left, right;

    Node(int x) {
        data = x;
        left = null;
        right = null;
    }
}

public class CountBSTNodesWithin {
    static int getCount(Node root, int l, int h) {
        // Base case: if the current node is null, return 0
        if (root == null) {
            return 0;
        }

        // If current node's data is within the range [l, h], include it
        if (root.data >= l && root.data <= h) {
            return 1 + getCount(root.left, l, h) + getCount(root.right, l, h);
        }

        // If current node's data is less than l, search in the right subtree
        if (root.data < l) {
            return getCount(root.right, l, h);
        }

        // If current node's data is greater than h, search in the left subtree
        return getCount(root.left, l, h);
    }

    public static void main(String[] args) {
        // Create a hard-coded BST.
        // 10
        // / \
        // 5 50
        // / / \
        // 1 40 100
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(50);
        root.left.left = new Node(1);
        root.right.left = new Node(40);
        root.right.right = new Node(100);

        int l = 5;
        int h = 45;

        // Output the count of nodes within the range [l, h]
        System.out.println(getCount(root, l, h));
    }
}