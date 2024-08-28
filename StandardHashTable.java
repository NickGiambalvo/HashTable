import java.util.ArrayList;

class StandardHashTable {

    private final int size;
    private final ArrayList<Pair>[] hashTable;

    public StandardHashTable(int size) {
        this.size = size;
        this.hashTable = new ArrayList[size];
        for (int i = 0; i < size; i++) {
            hashTable[i] = new ArrayList<>();
        }
    }
//    inserts values and keys into standard hash table
    public void insert(int key, int value) {
        int index = hash(key);
        for (Pair pair : hashTable[index]) {
            if (pair.key == key) {
                pair.value = value;
                return;
            }
        }
        hashTable[index].add(new Pair(key, value));
    }
//    allows us to retrieve the keys and values from the hash table
    public Integer get(int key) {
        int index = hash(key);
        for (Pair pair : hashTable[index]) {
            if (pair.key == key) {
                return pair.value;
            }
        }
        return null;
    }
//    allows us to delete values from hash table
    public void delete(int key) {
        int index = hash(key);
        ArrayList<Pair> list = hashTable[index];
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).key == key) {
                list.remove(i);
                return;
            }
        }
    }
// Tells us the index of a key in hash table using modular
    private int hash(int key) {

        return key % size;
    }

//    simple data structure to hold a key and value pair
    private static class Pair {
        int key;
        int value;

        Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}
