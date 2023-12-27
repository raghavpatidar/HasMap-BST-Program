public class MyHashMap<K, V> {
    private int bucketSize;
    private int size;
    MyLinkedList<K, V>[] bucket;

    public MyHashMap() {
        this.bucketSize = 20;
        size = 0;
        bucket = new MyLinkedList[this.bucketSize];
        for (int i = 0; i < this.bucketSize; i++) {
            bucket[i] = new MyLinkedList<>();
        }
    }

    private int getIndex(K key) {
        int hashCode = Math.abs(key.hashCode());
        hashCode = hashCode % this.bucketSize;
        return hashCode;
    }

    public void put(K key, V value) {
        int idx = getIndex(key);
        size++;
        bucket[idx].add(key, value);
    }

    public V get(K key) {
        int idx = getIndex(key);
        return bucket[idx].get(key);
    }

    public boolean remove(K key) {
        int idx = getIndex(key);
        return bucket[idx].remove(key);
    }

}
