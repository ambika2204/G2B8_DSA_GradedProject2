package binarysearchtree;

public class Main {
    public static void main(String[] args) {
        // code to test
        BTToRightSkewedTree tree = new BTToRightSkewedTree();
        tree.node = new Node(50);
        tree.node.left = new Node(30);
        tree.node.right = new Node(60);
        tree.node.left.left = new Node(10);
        tree.node.right.left = new Node(55);
        //method to transform bst to skewed tree
        tree.processBST(tree.node);
        //method to print the transformed data
        tree.traverse(tree.newHead);
    }
}