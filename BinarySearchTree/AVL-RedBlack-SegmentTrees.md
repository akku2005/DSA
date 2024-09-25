### _1. AVL Trees_

Definition: AVL Tree ek self-balancing binary search tree hai. Iska naam Georgy Adelson-Velsky aur Evgenii Landis ke naam par hai. Is tree ka main goal yeh hai ki tree hamesha balanced rahe, taaki search operations efficiently ho sakein.
Properties:

Balance Factor: Har node ke liye balance factor calculate kiya jata hai, jo ki left subtree aur right subtree ke height ka difference hota hai. Yeh value -1, 0, ya 1 honi chahiye.
Height: AVL Tree ka height logarithmic hota hai, yaani O(log n). Is wajah se searching, inserting, aur deleting operations fast hote hain.

Operations:

- Insertion:

  - Jab aap ek node ko insert karte ho, toh sabse pehle aap normal BST ki tarah node ko place karte ho.
  - Uske baad aap balance factor check karte ho. Agar balance factor kisi node ka 2 ya -2 hota hai, toh tree imbalance ho gaya hai.
  - Iske liye aapko rotations perform karne padte hain:
    - LL Rotation: Agar left subtree ka left child zyada heavy hai.
    - RR Rotation: Agar right subtree ka right child zyada heavy hai.
    - LR Rotation: Agar left subtree ka right child heavy hai. Yeh pehle left rotation aur phir right rotation karta hai.
    - RL Rotation: Agar right subtree ka left child heavy hai. Yeh pehle right rotation aur phir left rotation karta hai.

- Deletion:

  - Deletion ke case mein bhi aap sabse pehle node ko delete karte ho.
  - Uske baad, aapko balance factors check karne hote hain aur agar zaroorat ho toh rotations karne hote hain.

_Complexity_:

- Search: O(log n)
- Insertion: O(log n)
- Deletion: O(log n)

---

### _2. Red-Black Trees_

Definition: Red-Black Tree bhi ek self-balancing binary search tree hai. Yeh kuch rules follow karta hai jisse tree balanced rahe.

- Properties:

        1. Node Colors: Har node ya toh red hota hai ya black.
        2. Root Property: Root node hamesha black hota hai.
        3. Leaf Nodes: Har leaf node (NIL ya NULL) black hoti hai.
        4. Red Property: Agar koi node red hai, toh uske dono   children black hone chahiye (no two reds in a row).
        5. Black Depth: Har node se leaf nodes tak ka black node ka count same hona chahiye.

- Operations:

  - Insertion:

    - Jab aap ek node insert karte ho, toh node ko pehle red color diya jata hai.
    - Agar insertion ke baad koi violation hoti hai (jaise red-red property violate hoti hai), toh aapko color changes aur rotations karne padte hain.
    - Fixing Violations: Yeh alag-alag cases ke basis par kiya jata hai, jaise uncle node ka color check karke.

- Deletion:

  - Ismein deletion ke baad bhi similar properties maintain karni hoti hain.
  - Deletion ke baad, agar tree imbalance ho jata hai, toh aapko rotations aur color flips karne padte hain.

_Complexity_:

- Search: O(log n)
- Insertion: O(log n)
- Deletion: O(log n)

---

### _3. Segment Trees_

Definition: Segment Tree ek tree data structure hai jo efficient range queries (jaise sum, min, max) aur updates handle karta hai.

Structure:

- Segment tree ko ek array ke form mein implement kiya jata hai.
- Har node ek segment ko represent karta hai.
- Is tree mein leaf nodes original array ke elements ko represent karte hain, aur internal nodes unke aggregation (jaise sum, max) ko hold karte hain.
  Building:

- Segment Tree ko build karne ke liye array ko divide and conquer approach se segments mein divide kiya jata hai.
- Ek internal node ka value apne child nodes se calculate kiya jata hai (e.g., sum of left and right child for sum query).
  Operations:

- Query: Aap kisi range (i se j tak) ka sum ya maximum dekh sakte ho. Ismein aapko relevant segments ko access karna hota hai.
- Update: Agar aap original array ka kisi element ko update karte ho, toh aapko tree ko update karna hota hai taaki saare relevant segments bhi update ho jayein.
  _Complexity_:

- Building: O(n)
- Query: O(log n)
- Update: O(log n)

---

_Conclusion_

- AVL Tree: Yeh balanced binary search tree hai, jo insertion aur deletion ke baad balance ko maintain karta hai.
- Red-Black Tree: Yeh bhi ek balanced BST hai, jo red-black properties ko follow karta hai.
- Segment Tree: Yeh range queries aur updates ko efficiently handle karne ke liye use hota hai.
