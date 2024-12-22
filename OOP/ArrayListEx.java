import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

//        System.out.println(list);
        System.out.println(list.size());

//        for (String element : list){
//            System.out.print(element+" ");
//        }

        list.add(3,"f");
        System.out.println(list);

        //Iterator
        Iterator<String> it = list.iterator();

        System.out.println(it.next());

//        list.set(0,"avadh");
//        System.out.println(list);
//
//        list.remove(0);
//        System.out.println(list);
//
//        System.out.println(list.contains("b"));
//
//        list.clear();
//        System.out.println(list);
    }
}
