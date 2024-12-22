class Animal{

    public void sound(){
        System.out.println("animal make sound");
    }

}

class Dog extends Animal{

    public void sound(){
        System.out.println("bark");
    }

}

class cat extends Animal{

    public void sound(){
        System.out.println("meows");
    }

}
public class MethodOverridingEx {

    public static void main(String[] args) {

        Animal m1;
        m1 = new Animal();
        m1.sound();

        m1 = new cat();
        m1.sound();

        m1 = new Dog();
        m1.sound();
    }
}
