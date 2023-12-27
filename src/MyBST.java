import java.util.LinkedList;
import java.util.Queue;

public class MyBST<T extends Comparable<T>> {
    public INode<T> root;

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

    int size() {
        return sizeRec(root);
    }

    int sizeRec(INode<T> node) {
        if (node == null) {
            return 0;
        } else {
            return (sizeRec(node.left) + 1 + sizeRec(node.right));
        }
    }

    void printLevelOrder() {
        Queue<INode<T>> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty()) {
            INode<T> tempNode = queue.poll();

            if (tempNode == null) {
                if (queue.isEmpty() == false)
                    queue.add(null);
                System.out.println();
            } else {

                System.out.print(tempNode.data + " ");

                if (tempNode.left != null) {
                    queue.add(tempNode.left);
                }

                if (tempNode.right != null) {
                    queue.add(tempNode.right);
                }
            }
        }
    }
}
