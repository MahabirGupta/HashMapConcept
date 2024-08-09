import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

//        declare a HaspMap without specifying the data type of the key and values
//        HashMap hashMap = new HashMap<>(); // heterogenous HashMap

        //        declare a HaspMap by specifying the data type of the key and values
        HashMap<Integer,String> hashMap = new HashMap<>(); // homogeneous HashMap
        hashMap.put(101,"Mahabir");
        hashMap.put(102,"Babita");
        hashMap.put(103,"Anish");
        hashMap.put(104,"Anishkaa");
        hashMap.put(105,"Happy Family");
        hashMap.put(103,"Mahabir"); // key cannot be duplicated
        hashMap.put(106,"Mahabir"); // value can be duplicated
//        print all the values in the HashMap
        System.out.println(hashMap);

//        to get the value from the key
        System.out.println(hashMap.get(102));

//        to remove the key value entry
        hashMap.remove(106); //remove pair from HashMap
        System.out.println(hashMap);

//        to check if a particular key is in the HashMap
        hashMap.containsKey(104);
        System.out.println(hashMap.containsKey(104));
        System.out.println(hashMap.containsKey(106));
        System.out.println();
        //        to check if a particular value is in the HashMap
        hashMap.containsValue("Happy Family");
        System.out.println(hashMap.containsValue("Happy Family"));
        System.out.println(hashMap.containsValue(" Family"));
        System.out.println();

//        to check if a HashMap is empty
        System.out.println(hashMap.isEmpty());

        System.out.println();

//        to get all the keys from the HashSet
        System.out.println(hashMap.keySet()); //return all the keys as a Set Collection because duplicates are not allowed

//        to get individual key use for..each loop
        for (int keyVariable:hashMap.keySet()){
            System.out.println(keyVariable);
        }

        //        to get all the values from the HashSet
        System.out.println(hashMap.values()); //return all the values as a Collection because duplicates are  allowed

        //        to get individual values use for..each loop
        for (String value:hashMap.values()){
            System.out.println(value);
        }

        //        to get all entry as a set
        hashMap.entrySet();
        System.out.println(hashMap.entrySet()); // return all the entries as a Set object

        System.out.println();

//        to get individual entry using keySet()
        for (int keyVariable:hashMap.keySet()){
            System.out.println(keyVariable + "       " + hashMap.get(keyVariable));
        }
        System.out.println();

//       to get individual entry using Entry methods
//        ************************

        for (Map.Entry entry:hashMap.entrySet()){ // 101 Mahabir will be stored as a entry in Map.Entry entry
            entry.getKey();
            entry.getValue();
            System.out.println(entry.getKey() + "   " + entry.getValue());
        }
        System.out.println();
//        to get individual entry using iterator method
        Iterator iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();
//        or
        Set set = hashMap.entrySet(); // get all the entries as a Set
        Iterator iterator1 = set.iterator();
        while (iterator1.hasNext()){
            Map.Entry entry = (Map.Entry) iterator1.next();
//            System.out.println(entry);
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }
    }
}
