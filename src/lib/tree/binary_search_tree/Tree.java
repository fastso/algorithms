package lib.tree.binary_search_tree;

/**
 * Binary Search Tree
 */
public class Tree {
    Node root;

    /**
     * Nodeを二分探索木に挿入する。
     *
     * @param node Node
     * @return Node
     */
    public Node insert(Node node) {
        Node parent = null;
        Node child = root;

        while (child != null) {
            parent = child;
            if (node.key < child.key) child = child.left;
            else child = child.right;
        }
        node.parent = parent;

        if (parent == null) {
            this.root = node;
        } else if (node.key < parent.key) {
            parent.left = node;
        } else {
            parent.right = node;
        }
        return node;
    }

    public void printWalkPreorder(Node node) {
        if (node == null) return;
        System.out.print(" " + node.key);
        printWalkPreorder(node.left);
        printWalkPreorder(node.right);
    }

    public void printWalkInorder(Node node) {
        if (node == null) return;
        printWalkInorder(node.left);
        System.out.print(" " + node.key);
        printWalkInorder(node.right);
    }

    public void printWalkPostorder(Node node) {
        if (node == null) return;
        printWalkPostorder(node.left);
        printWalkPostorder(node.right);
        System.out.print(" " + node.key);
    }

}
