class Employee{

    public void salary(){
        System.out.println("employee salary 35k");
    }
}

class BackEndDeveloper extends Employee{

    public void task(){
        System.out.println("develop backend side");
    }
}

class Developer extends BackEndDeveloper{

    public void workHours(){
        System.out.println("8");
    }
}


public class MultilevelInheritanceEx {

    public static void main(String[] args) {

        Developer d = new Developer();

        d.workHours();
        d.task();
        d.salary();

    }
}
