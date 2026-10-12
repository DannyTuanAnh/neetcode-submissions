
class Node{
    int key;
    int value;
    Node next;
}

public class MyHashMap {
    private final Node[] myMap;
    private final int BUCKET_SIZE = 1000;

    public MyHashMap() {
        myMap = new Node[BUCKET_SIZE];
    }

    public void put(int key, int value) {
        int index = key % BUCKET_SIZE;

        Node cur = myMap[index];
        while (cur != null) {
            if (cur.key == key) {
                cur.value = value;
                return;
            }

            cur = cur.next;
        }

        Node newNode = new Node();

        newNode.key = key;
        newNode.value = value;
        newNode.next = myMap[index];

        myMap[index] = newNode;
    }

    public int get(int key) {
        int index = key % BUCKET_SIZE;

        Node cur = myMap[index];
        while(cur != null){
            if(cur.key == key) return cur.value;

            cur = cur.next;
        }

        return -1;
    }

    public void remove(int key) {
        int index = key % BUCKET_SIZE;

        Node cur = myMap[index];
        Node pre = null;
        while(cur != null){
            if(cur.key == key) {
                if (pre != null)
                    pre.next = cur.next;
                else
                    myMap[index] = cur.next;

                return;
            }
            
            pre = cur;
            cur = cur.next;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */