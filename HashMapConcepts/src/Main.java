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
//        print all the values in the HashMap
        System.out.println(hashMap);
        //        declare a HaspMap by specifying the data type of the key and values
        HashMap<Integer,String> hashMap1 = new HashMap<>(); // homogeneous HashMap
    }
}
