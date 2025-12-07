import java.util.HashMap;

public class LRUCache implements AvictionPolicy {
    private DLL dll;
    private HashMap<String, DLLNode> map;
    public LRUCache() {
        this.dll = new DLL();
        this.map = new HashMap<>();
    }
    public void put(String key)
    {
        DLLNode newNode = new DLLNode(key);
        dll.keyAddedToFront(newNode);
        map.put(key, newNode);
    }
    @Override
    public void keyAccessed(String key) {
        dll.keyDetached(map.get(key));
        dll.keyAddedToFront(map.get(key));
    }
    @Override
    public String evictKey() {
        return dll.removeLast();
    }
    
    
}