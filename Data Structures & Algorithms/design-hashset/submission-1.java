class MyHashSet {
    private List<Integer> data;

    public MyHashSet() {
        data = new ArrayList<>();    
    }
    
    public void add(int key) {
        if(!data.contains(key)){
            data.add(key);
        }
    }
    
    public void remove(int key) {
        data.remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        return data.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */