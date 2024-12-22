class Parent{

    void greet(){
        System.out.println("Hello from parent");
    }
}

class Child extends Parent{

    void greet(){
        super.greet();
        System.out.println("Hello from child");
    }
}


public class SuperMethodEx {

    public static void main(String[] args) {

        Child c = new Child();
        c.greet();
    }
}
