public class Cache{
    private final Storage Storage;
    private final AvictionPolicy policy;
    private static Cache Instance;
    private Cache(int capacity, AvictionPolicy policy) {
        this.Storage = new Storage(capacity);
        this.policy = policy;
        
    }
    public static Cache getInstance(int capacity, AvictionPolicy policy) {
        if(Instance == null) {
            Instance = new Cache(capacity, policy);
        }
        return Instance;
    }
    public void put(String key, String value) {
        if(Storage.size() >= Storage.getCapacity()) {
            String evictKey = policy.evictKey();
            Storage.remove(evictKey);
        }
        Storage.put(key, value);
        policy.put(key);
    }
    public String get(String key) {
        String value = Storage.get(key);
        if(value == null) {
            return null;
        }
        policy.keyAccessed(key);
        return value;   
    }

}



