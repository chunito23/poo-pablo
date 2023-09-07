/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class hashArchivos<K, V> {
    private int capacity;
    private List<LinkedList<Entry<K, V>>> mainTable;
    private List<Entry<K, V>> overflowTable;

    public hashArchivos(int capacity) {
        this.capacity = capacity;
        mainTable = new ArrayList<>(capacity);
        overflowTable = new ArrayList<>();
        for (int i = 0; i < capacity; i++) {
            mainTable.add(new LinkedList<>());
        }
    }
    
    public int hashFuntion(int numero){
        return numero % capacity;
    }

    public void put(K key, V value) {
        int hash = key.hashCode() % capacity;
        LinkedList<Entry<K, V>> bucket = mainTable.get(hash);

        // Check if the key already exists in the bucket and update the value
        for (Entry<K, V> entry : bucket) {
            if (entry.getKey().equals(key)) {
                entry.setValue(value);
                return;
            }
        }

        // If key doesn't exist in the bucket, add a new entry to the overflow zone
        overflowTable.add(new Entry<>(key, value));
    }

    public V get(K key) {
        int hash = key.hashCode() % capacity;
        LinkedList<Entry<K, V>> bucket = mainTable.get(hash);

        for (Entry<K, V> entry : bucket) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }

        // Check overflow zone for the key
        for (Entry<K, V> entry : overflowTable) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }

        return null; // Key not found
    }

    public void remove(K key) {
        int hash = key.hashCode() % capacity;
        LinkedList<Entry<K, V>> bucket = mainTable.get(hash);

        Entry<K, V> entryToRemove = null;
        for (Entry<K, V> entry : bucket) {
            if (entry.getKey().equals(key)) {
                entryToRemove = entry;
                break;
            }
        }

        if (entryToRemove != null) {
            bucket.remove(entryToRemove);
        }

        // Remove from overflow zone as well
        Entry<K, V> overflowEntryToRemove = null;
        for (Entry<K, V> entry : overflowTable) {
            if (entry.getKey().equals(key)) {
                overflowEntryToRemove = entry;
                break;
            }
        }

        if (overflowEntryToRemove != null) {
            overflowTable.remove(overflowEntryToRemove);
        }
    }

    // Other methods, like size(), clear(), etc.

    private static class Entry<K, V> {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }
}
