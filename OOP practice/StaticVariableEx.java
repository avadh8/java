class Counter{

    static int count;

    Counter(){
        count++;
    }

    public void displayCount(){
        System.out.println("total count "+ count);
    }
}

public class StaticVariableEx {

    public static void main(String[] args) {

        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        c2.displayCount();
    }
}
