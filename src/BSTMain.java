public class BSTMain {
    public static void main(String[] args) {
        MyBST<Integer> tree = new MyBST<Integer>();

        tree.root = new INode<Integer>(56);
        tree.root.left = new INode<Integer>(30);
        tree.root.right = new INode<Integer>(70);

        tree.root.left.left = new INode<Integer>(22);
        tree.root.left.right = new INode<Integer>(40);
        tree.root.left.left.left = new INode<Integer>(11);
        tree.root.right.left = new INode<Integer>(60);
        tree.root.right.right = new INode<Integer>(95);
        tree.root.right.left.left = new INode<Integer>(65);
        tree.root.right.left.right = new INode<Integer>(63);
        tree.root.right.right.right = new INode<Integer>(67);

        tree.printLevelOrder();

        System.out.println("\nThe size of the binary tree is: " + tree.size());
    }
}
