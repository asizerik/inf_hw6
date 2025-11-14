import java.util.LinkedList;

public class Cache<T> {

    private int capacity;
    private LinkedList<T> list;
    public Cache(int n) {
        this.capacity = n;
        this.list = new LinkedList<>();
    }
}