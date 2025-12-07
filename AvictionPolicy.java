public interface AvictionPolicy {
    void put(String key);
    void keyAccessed(String key);
    String evictKey();

}
