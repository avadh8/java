abstract class Vehical {

    String name;

    abstract void start();

    void stop(){
        System.out.println(name + " is stopping");
    }
}

class Car extends Vehical{
    @Override
    void start(){
        System.out.println(name +" is starting");
    }

}

public class AbstractionEx {

    public static void main(String[] args) {

        Car c = new Car();

        c.name = "i20";
        c.start();
        c.stop();
    }
}
