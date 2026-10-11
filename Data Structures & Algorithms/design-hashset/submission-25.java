class Node{
    int key;
    Node next;
}

public class MyHashSet {
    private final Node[] table;
    private final int TABLE_SIZE = 1000;

    public MyHashSet() {
        table = new Node[TABLE_SIZE];
    }

    public void add(int key) {
        Node cur = table[hash(key)];
        while(cur != null){
            if(cur.key == key)
                return;
            cur = cur.next;
        }

        Node ne = new Node();
        ne.key = key;
        ne.next = table[hash(key)];
        table[hash(key)] = ne;
    }

    public void remove(int key) {
        Node cur = table[hash(key)];
        Node pre = null;

        while(cur != null){
            if(cur.key == key){
                if(pre == null) {
                    table[hash(key)] = cur.next;
                } else{
                    pre.next = cur.next;
                }
            }
            pre = cur;
            cur = cur.next;
        }
    }

    public boolean contains(int key) {
        Node cur = table[hash(key)];
        while(cur != null){
            if(cur.key == key)
                return true;

            cur = cur.next;
        }

        return false;
    }

    int hash(int key){
        return key % TABLE_SIZE;
    }
}