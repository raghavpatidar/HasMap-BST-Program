public class BSTMain {
    public static void main(String[] args) {
        MyBST<Integer> tree = new MyBST<Integer>();

        tree.insert(56);

        tree.insert(30);
        tree.insert(70);

        tree.inorder();
    }
}
