# Binary Search Tree (BST) Project

Yeh project ek Binary Search Tree (BST) ka implementation hai. Ismein aap insertion, search, aur in-order traversal operations dekh sakte hain.

## Code Explanation

### Node Class

```java
static class Node {
    int data;          // Node ki value ko store karne ke liye
    Node left;        // Left child ka reference
    Node right;       // Right child ka reference

    Node(int data) {  // Constructor, jab naya node create hota hai
        this.data = data; // Node ki value set karte hain
        this.left = null; // Left child ko null initialize karte hain
        this.right = null; // Right child ko null initialize karte hain
    }
}
```

- Node Class: Yeh class ek node ki structure ko define karti hai.
- Data Fields: data, left, aur right fields ko declare kiya gaya hai.
- Constructor: Jab naya node create hota hai, toh uski value set hoti hai aur left-right child null hote hain.

```
public static Node insert(Node root, int val) {
    if (root == null) {
        return new Node(val); // Agar root null hai, toh naya node create karte hain
    }
    if (val < root.data) {
        root.left = insert(root.left, val); // Left subtree mein insert karte hain
    } else {
        root.right = insert(root.right, val); // Right subtree mein insert karte hain
    }
    return root; // Unchanged root return karte hain
}
```

1. Insert Method: Yeh method tree mein value insert karne ke liye hai.
2. Base Case: Agar root null hai, toh naya node create karte hain.
3. Comparison: Value ko current node se compare karte hain:
   - Agar value chhoti hai, toh left subtree mein insert karte hain.
   - Agar badi hai, toh right subtree mein insert karte hain.
4. Return: Har baar root ko return karte hain.

### **In-Order Traversal Method**

```
public static void inorder(Node root) {
    if (root == null) {
        return; // Agar root null hai, toh kuch nahi karna
    }
    inorder(root.left); // Left subtree ko traverse karte hain
    System.out.print(root.data + " "); // Current node ki value print karte hain
    inorder(root.right); // Right subtree ko traverse karte hain
}
```

1. In-Order Traversal: Yeh method tree ko sorted order mein print karta hai.
2. Base Case: Agar root null hai, toh return karte hain.
3. Recursive Calls: Pehle left subtree ko traverse karte hain, phir current node ki value print karte hain, aur finally right subtree ko traverse karte hain.

### **Search Method**

```
public static boolean search(Node root, int key) {
    int comparisons = 0; // Comparisons ka counter initialize karte hain
    while (root != null) {
        comparisons++; // Har comparison ke liye counter increment karte hain
        if (key == root.data) {
            System.out.println("Key " + key + " found after " + comparisons + " comparisons.");
            return true; // Agar key mil gaya, toh true return karte hain
        } else if (key < root.data) {
            root = root.left; // Agar key chhota hai, toh left mein jaate hain
        } else {
            root = root.right; // Agar key bada hai, toh right mein jaate hain
        }
    }
    System.out.println("Key " + key + " not found after " + comparisons + " comparisons.");
    return false; // Agar key nahi mila, toh false return karte hain
}
```

1. Search Method: Yeh method tree mein value dhoondhne ke liye hai.
2. Counter: Comparisons ka counter initialize hota hai.
3. While Loop: Loop tab tak chalta hai jab root null nahi hota.
4. Comparisons: Har iteration mein counter increment hota hai:

- Agar key mil gaya, toh uski comparisons print karte hain.
- Agar key chhota hai, toh left subtree mein jaate hain.
- Agar key bada hai, toh right subtree mein jaate hain.

5. Not Found: Agar loop khatam ho gaya aur key nahi mila, toh appropriate message print karte hain.

### **Main Method**

```
public static void main(String[] args) {
    int value[] = { 5, 1, 3, 4, 2, 7, 80, 6, 55 }; // Values jo insert karni hain
    Node root = null; // Tree ka root initialize karte hain
    for (int i = 0; i < value.length; i++) {
        root = insert(root, value[i]); // Har value ko insert karte hain
    }
    inorder(root); // In-order traversal call karte hain
    System.out.println(); // Ek naya line print karte hain

    // Search operation
    int key = 6; // Jise hum search karna chahte hain
    search(root, key); // Search function call karte hain
}
```

1. Main Method: Yeh entry point hai program ka.
2. Values Array: Insert karne ke liye values define ki gayi hain.
3. Root Initialization: Root ko null se initialize karte hain.
4. Insertion Loop: Loop ke through har value ko insert karte hain.
5. In-Order Traversal Call: Tree ki values ko sorted order mein print karte hain.
6. Search Operation: Key ko search karte hain aur results print karte hain.

###

**_Conclusion_**:

- Yeh project aapko BST ki basic functionalities samajhne mein madad karega. Agar aapko koi sawal hai ya suggestions hain, toh aap mujhe contact kar sakte hain.
