import java.util.LinkedList;

public class Cache<T> {

    private int capacity;
    private LinkedList<T> list;
    public Cache(int n) {
        this.capacity = n;
        this.list = new LinkedList<>();
    }
    public void add(T item) {
    if (list.size() == capacity) {
        list.removeFirst();
    }
    list.addLast(item);
            }
        public boolean remove(T item) {
        return list.remove(item);
    }
}