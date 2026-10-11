class MyHashSet {
    private final int[] table;
    private final int TABLE_SIZE = 1000000;

    public MyHashSet() {
        this.table = new int[TABLE_SIZE];
    }

    public void add(int key) {
        int index = key % TABLE_SIZE;

        table[index] = 1;
    }

    public void remove(int key) {
        int index = key % TABLE_SIZE;

        table[index] = 0;
    }

    public boolean contains(int key) {
        int index = key % TABLE_SIZE;

        int val = table[index];

        return val != 0;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */