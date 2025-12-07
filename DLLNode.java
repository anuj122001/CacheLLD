class DLLNode{
    public String key;
    public DLLNode prev;
    public DLLNode next;
    public DLLNode(String key) {
        this.key = key;
        this.prev = null;
        this.next = null;
    }
}