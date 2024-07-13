class Node {
    int value;
    Node left, right;

    public Node(int item) {
        value = item;
        left = right = null;
    }
}

public class BinarySearchTree {
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

    boolean search(int value) {
        return searchRec(root, value) != null;
    }

    Node searchRec(Node root, int value) {
        if (root == null || root.value == value) {
            return root;
        }
        if (value < root.value) {
            return searchRec(root.left, value);
        }
        return searchRec(root.right, value);
    }

    int searchWithIterations(int value) {
        return searchWithIterationsRec(root, value, 0);
    }

    int searchWithIterationsRec(Node root, int value, int iterations) {
        if (root == null) {
            return iterations;
        }
        iterations++;
        if (root.value == value) {
            return iterations;
        }
        if (value < root.value) {
            return searchWithIterationsRec(root.left, value, iterations);
        }
        return searchWithIterationsRec(root.right, value, iterations);
    }

    // Method to populate the tree with predefined values
    void populateTree(int[] values) {
        for (int i = 0; i < values.length; i++)  {
            insert(values[i]);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        // Predefined values to populate the tree
        int[] values = {10, 5, 12, 3, 1, 13, 7, 2, 4, 14, 9, 8, 6, 11};

        // Populate the tree with predefined values
        tree.populateTree(values);

        // Perform a search for a predefined value
        int searchValue = 9;
        int iterations = tree.searchWithIterations(searchValue);
        System.out.println("Found search value in " + iterations + " iterations.");
    }
}
