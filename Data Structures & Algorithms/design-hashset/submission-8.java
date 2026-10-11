class MyHashSet {

    public static final int CAPACITY = 50;

    ArrayList<Integer>[] array = new ArrayList[CAPACITY];
 

    public MyHashSet() {
        for (int i = 0; i < array.length; i ++) {
            array[i] = new ArrayList<Integer>();
        }
    }
    
    public void add(int key) {
        int hash = getHash(key);
        if (!array[hash].contains(key)) {
            array[hash].add(key);
        }
    }
    
    public void remove(int key) {
        int hash = getHash(key);
        int index = array[hash].indexOf(key);
        if (index != -1) {
            array[hash].remove(index);
        }
    }
    
    public boolean contains(int key) {
        int hash = getHash(key);
        return array[hash].contains(key);
    }

      private int getHash(int value) {
        int hash = Math.abs(value % CAPACITY); 
        return hash;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */