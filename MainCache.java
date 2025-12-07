public class MainCache {
    public static void main(String[] args) {
    
    Cache myCache=Cache.getInstance(5, new LRUCache());
    myCache.put("1", "One");
    myCache.put("2", "Two");
    myCache.put("3", "Three");
    myCache.put("4", "Four");
    myCache.put("5", "Five");
    System.out.println(myCache.get("1")); // Output: One
    myCache.put("6", "Six"); // This should evict key "2" as per LRU policy
    System.out.println(myCache.get("2"));
    System.out.println(myCache.get("6"));  // Output: null (as "2" has been evicted)
    
    }
}
