import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

class Parent1{

    Parent1(){
        System.out.println("Parent Constructor");
    }
}

class Child1 extends Parent1{

    Child1(){
        super();
        System.out.println("Child Constructor");
    }
}

public class SuperConstructorEx {

    public static void main(String[] args) {

        new Child1();

        //date & time
        LocalTime obj = LocalTime.now();
        System.out.println(obj);

        LocalDate obj1 = LocalDate.now();
        System.out.println(obj1);


    }
}
