import java.util.Collections;
import java.util.LinkedList;

public class LinkedlistEx {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("4");
        list.add("3");
        list.add("6");
        list.add("1");
        list.add("5");

        System.out.println(list);
//        list.addFirst("g");
//        list.addLast("h");
//
//        System.out.println(list);
//
//        list.pop();
//        list.push("z");
//        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
