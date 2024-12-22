class Subject{

    String name;
    public void TechSubject(){
        System.out.println("Tech Subject");
    }
}

class Java extends Subject{

    public void basic(){
        System.out.println("oop based subject");
    }
}

public class SingleInheritanceEx {

    public static void main(String[] args) {

        Java s1 = new Java();

        System.out.println(s1.name = "java");
        s1.TechSubject();
        s1.basic();
    }
}
