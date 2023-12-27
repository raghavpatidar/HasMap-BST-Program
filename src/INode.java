public class INode<T extends Comparable<T>> {
    T data;
    INode<T> right;
    INode<T> left;

    INode(T data) {
        this.data = data;
        right = null;
        left = null;
    }

}
