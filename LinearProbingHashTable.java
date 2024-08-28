import java.util.ArrayList;

class LinearProbingHashTable {



    private final int size;
    private final ArrayList<Pair> table;

    public LinearProbingHashTable(int size) {
        this.size = size;
        this.table = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            table.add(null);
        }
    }
    //    inserts values and keys into standard hash table
    public void insert(int key, int value) {
        int index = hash(key);
        while (table.get(index) != null && table.get(index).key != key) {
            index = (index + 1) % size;
        }
        table.set(index, new Pair(key, value));
    }

    //    allows us to retrieve the keys and values from the hash table
    public Integer get(int key) {
        int index = hash(key);
        while (table.get(index) != null && table.get(index).key != key) {
            index = (index + 1) % size;
        }
        if (table.get(index) != null) {
            return table.get(index).value;
        }
        return null;
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

