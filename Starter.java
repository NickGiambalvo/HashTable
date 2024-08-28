public class Starter {
    public static void main(String[] args) {

//        Standard Hash Table object
        StandardHashTable standardHashTable = new StandardHashTable(10);
//        inserts values into standard hashtable
        standardHashTable.insert(58, 5);
        standardHashTable.insert(27, 10);
        standardHashTable.insert(47, 15);
        standardHashTable.insert(37, 20);
        standardHashTable.insert(17, 25);
        standardHashTable.insert(97, 30);

//   gets the values from the standard hashtable
        System.out.println(standardHashTable.get(58));
        System.out.println(standardHashTable.get(27));
        System.out.println(standardHashTable.get(47));
        System.out.println(standardHashTable.get(37));
        System.out.println(standardHashTable.get(17));
        System.out.println(standardHashTable.get(97));

//        deletes value and tries to get value, but it is deleted, so it will just return null
        standardHashTable.delete(27);
        System.out.println(standardHashTable.get(27));
        standardHashTable.delete(47);
        System.out.println(standardHashTable.get(47));
        standardHashTable.delete(37);
        System.out.println(standardHashTable.get(37));
        standardHashTable.delete(17);
        System.out.println(standardHashTable.get(17));

//       Linear prob hash table object
        LinearProbingHashTable linearProbingHashTable = new LinearProbingHashTable(10);
//        inserts values
        linearProbingHashTable.insert(10, 100);
        linearProbingHashTable.insert(20, 200);
        linearProbingHashTable.insert(30, 300);
        linearProbingHashTable.insert(40, 400);
        linearProbingHashTable.insert(50, 500);
//       gets values from linear prob hash table
        System.out.println(linearProbingHashTable.get(10));
        System.out.println(linearProbingHashTable.get(20));
        System.out.println(linearProbingHashTable.get(30));
        System.out.println(linearProbingHashTable.get(40));
        System.out.println(linearProbingHashTable.get(50));
    }
}
