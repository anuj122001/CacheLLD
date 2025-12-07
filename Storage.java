import java.util.HashMap;

public class Storage {
    private int capacity;
    private HashMap<String,String> map = new HashMap<>();
    public Storage(int capacity) {
        this.capacity = capacity;
    }
    public void put(String key, String value) {
        if(map.size() >= capacity) {
            // Should not reach here as eviction is handled in cache class
            return;
        }
        map.put(key, value);
    }
    public String get(String key) {
        return map.get(key);
    }
    public void remove(String key){
        map.remove(key);
    }
    public int size() {
        return map.size();
    }
    public int getCapacity() {
        return capacity;
    }
}