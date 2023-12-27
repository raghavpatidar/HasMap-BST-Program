public class MyLinkedList<K, V> {
    MyMapNode<K, V> head;

    public MyLinkedList() {
        this.head = null;
    }

    public void add(K key, V value) {
        MyMapNode<K, V> newNode = new MyMapNode<K, V>(key, value);
        if (head == null) {
            head = newNode;
        } else {
            MyMapNode<K, V> temp = head;
            while (temp.next != null) {
                if (temp.key.equals(key)) {
                    temp.value = value;
                    return;
                }
                temp = temp.next;
            }
            if (temp.key.equals(key))
                temp.value = value;
            else
                temp.next = newNode;

        }
    }

    public V get(K key) {
        MyMapNode<K, V> temp = head;
        while (temp != null) {
            if (temp.key.equals(key)) {
                return temp.value;
            }
            temp = temp.next;
        }
        return null;
    }

}
