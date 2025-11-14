public class CacheTest {

    public static void main(String[] args) {
        Cache<String> stringCache = new Cache<>(3);
        stringCache.add("Element A");
        stringCache.add("Element B");
        stringCache.add("Element C");

        System.out.println("Cache after adding A, B, C: " + stringCache);

        System.out.println("(getFirst): " + stringCache.getFirst());
        System.out.println("(getLast):  " + stringCache.getLast());

        stringCache.add("Element D");
        System.out.println("Cache after adding D: " + stringCache);
        System.out.println("(getFirst): " + stringCache.getFirst());

        System.out.println("\nexists()");
        System.out.println("does 'Element C'? " + stringCache.exists("Element C"));
        System.out.println("does 'Element A'? " + stringCache.exists("Element A"));

        System.out.println("\ngetItemByIndex()");
        System.out.println("Element index 0: " + stringCache.getItemByIndex(0));
        System.out.println("Element index 2: " + stringCache.getItemByIndex(2));
        System.out.println("Element index 5 (false): " + stringCache.getItemByIndex(5));

        System.out.println("\nremove()");
        System.out.println("deleting 'Element C'...");
        boolean removeResult = stringCache.remove("Element C");
        System.out.println("deletying result: " + removeResult);
        System.out.println("cache after deleting C: " + stringCache);

        System.out.println("\n<Integer>");
        Cache<Integer> intCache = new Cache<>(2);
        intCache.add(100);
        intCache.add(200);
        System.out.println("cache Integer: " + intCache);
        intCache.add(300);
        System.out.println("cache Integer after adding 300: " + intCache);
    }
}