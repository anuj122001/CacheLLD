public class DLL{
    private DLLNode head;
    private DLLNode tail;
    public DLL() {
        this.head = null;
        this.tail = null;
    }
    public void keyAddedToFront(DLLNode node) {
        if(head == null) {
            head = node;
            tail = node;
            return;
        }
        node.next = head;
        head.prev = node;
        head = node;
    }
    public void keyDetached(DLLNode node) {
        if(node == head) {
            head = head.next;
            if(head != null) {
                head.prev = null;
            }
            return;
        }
        if(node == tail) {
            tail = tail.prev;
            if(tail != null) {
                tail.next = null;
            }
            return;
        }
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    public String removeLast() {
        if(tail == null) {
            return null;
        }
        String key = tail.key;
        if(tail == head) {
            head = null;
            tail = null;
        }
        tail = tail.prev;
        tail.next = null;
        return key;
    }
}