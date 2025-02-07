class BinarySearchTree {

    /** An inner class representing a node in a BST tree */
    private class BSTNode {
        int data; // value at the node
        BSTNode left; // left child
        BSTNode right; // right child

        BSTNode(int newdata) {
            data = newdata;
        }
    } // end of class BSTNode

    private BSTNode root; // the root of the tree

    /**
     * Constructor
     */
    BinarySearchTree() {
        root = null;
    }

    /**
     * Insert an element in the BST (iterative)
     * @param elem value to insert
     */
    public void insertIterative(int elem) {
        BSTNode prev = null; // need to keep track of the node to which we will be attaching the new node
        BSTNode current = root;
        if (root == null) {
            root = new BSTNode(elem);
            return;
        }
        while (current != null) {
            if (elem >= current.data) {
                prev = current;
                current = current.right;
            }
            else {
                prev = current;
                current = current.left;
            }
        }
        if (elem < prev.data) {
            prev.left = new BSTNode(elem);
        }
        else {
            prev.right = new BSTNode(elem);
        }
    }

    /** Return the largest value in the BST. Must be efficient.
     *
     * @return largest value
     */
    public int getLargestIterative() {
        BSTNode curr = root;
        if (curr == null)
            throw new IllegalArgumentException();
        // FILL IN CODE: iterative implementation of getLargest
        return 0; //change
    }

    /**
     * Get the largest node in the BST - calls a private recursive method
     * @return largest value in BST
     */
    public int getLargest() {
      return getLargest(root);
    }

    private int getLargest(BSTNode root) {
        // FILL IN CODE: recursive implementation of getLargest

       return 0; // change
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insertIterative(6);
        tree.insertIterative(1);
        tree.insertIterative(10);
        tree.insertIterative(8);
        tree.insertIterative(12);
        tree.insertIterative(16);
        tree.insertIterative(15);
        tree.insertIterative(25);
        tree.insertIterative(11);

        System.out.println(tree.getLargestIterative());
        System.out.println(tree.getLargest());

    }
}
