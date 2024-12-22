import java.util.HashMap;

public class HashMapEx {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Apple", 50);
        map.put("Banana", 30);
        map.put("mango", 40);
        map.put("orange",30);

        System.out.println("price of apple "+map.get("Apple"));

//        map.remove("Banana");

        System.out.println("Containce key Orange "+ map.containsKey("Orange"));
        System.out.println("containce value 30 "+ map.containsValue(30));

        System.out.println("size of hashmap "+ map.size());

        // for value only
        for (Integer element : map.values()){
            System.out.print(element+" ");
        }

        System.out.println();
        // for key only
        for (String element1 : map.keySet()){
            System.out.print(element1+" ");
        }

    }
}
