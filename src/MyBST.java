public class MyBST<T extends Comparable<T>> {
    private INode<T> root;

    MyBST() {
        root = null;
    }

    public void insert(T data) {
        root = insertRecursion(root, data);
    }

    public INode<T> insertRecursion(INode<T> root, T data) {
        if (root == null) {
            root = new INode<T>(data);
            return root;
        }
        if (root.data.compareTo(data) < 0) {
            root.right = insertRecursion(root.right, data);
        } else {
            root.left = insertRecursion(root.left, data);
        }

        return root;
    }

    void inorder() {
        inorderRec(root);
    }

    void inorderRec(INode<T> root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }
}
