class parent{

    String name = "parent";

    void displayName(){
        System.out.println("Name "+ name);
    }
}

class child extends parent{

    String name = "child";

    void displayName(){
        System.out.println("Name "+ name);
        System.out.println("Parent name "+ super.name);
    }
}

public class SuperVariableEx {

    public static void main(String[] args) {

        child c = new child();
        c.displayName();
    }
}
