class Node{
    int key ;
    Node next;
}

class MyHashSet {

    private Node set[];

    public MyHashSet() {
        set = new Node[1000];
    }
    
    public void add(int key) {
        Node cur = set[hash(key)];
        while(cur != null){
            if(cur.key == key)
            return;
            cur = cur.next;
        }
        Node ne = new Node();
        ne.key = key;
        ne.next = set[hash(key)];
        set[hash(key)] = ne;
    }
    
    public void remove(int key) {
        Node cur = set[hash(key)];
        Node pre = null;
        while(cur != null){
            if(cur.key == key){
                if(pre == null) set[hash(key)] = cur.next;
                else
                    pre.next = cur.next;
            }
            
            pre = cur;
            cur = cur.next;
        }

    }
    
    public boolean contains(int key) {
        Node cur = set[hash(key)];
        while(cur != null){
            if(cur.key == key) return true;
            cur = cur.next;
        }
        return false;
    }

    private int hash(int key){
        return key % 1000;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */