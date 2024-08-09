import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

//        declare a HaspMap without specifying the data type of the key and values
        HashMap hashMap = new HashMap<>(); // heterogenous HashMap
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

        //        declare a HaspMap by specifying the data type of the key and values
        HashMap<Integer,String> hashMap1 = new HashMap<>(); // homogeneous HashMap
    }
}
