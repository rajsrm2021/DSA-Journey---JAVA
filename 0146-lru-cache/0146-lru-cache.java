class LRUCache {

    class Node{
        Node next,prev;
        int key,value;

        public Node(int key,int value){
            this.key = key;
            this.value = value;
        }
    }

    private final int capacity;
    private final Map <Integer,Node> cache;
    private Node head;
    private Node tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>();
        head = new Node(-1,-1);
        tail = new Node(-1,-1);
        head.next = tail;
        tail.prev = head;
        
    }
    
    public int get(int key) {

        if(cache.containsKey(key)){

            Node node = cache.get(key);
            // move the node to front becz it become most recent used;
            moveToHead(node);
            return node.value;

        }else{
            return -1;
        }
        
    }
    
    public void put(int key, int value) {

        if(cache.containsKey(key)){
            Node node = cache.get(key);
            // update the vale;
            node.value = value;
            // move to head becz it become most resent use
            moveToHead(node);
        }else{
            Node newNode = new Node(key,value);
            cache.put(key,newNode);
            // add to front becz it is new node and need to added at front
            addToFront(newNode);

            if(cache.size()>capacity){
                removeLRU();
            }

        }
        
    }

    public void moveToHead(Node node){
        removeNode(node);
        addToFront(node);
    }

    public void addToFront(Node node){
        node.next = head.next;
        node.next.prev = node;
        head.next = node;
        node.prev = head;
    }
    public void removeNode(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public void removeLRU(){
        Node toRemove = tail.prev;
        removeNode(toRemove);
        cache.remove(toRemove.key);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */