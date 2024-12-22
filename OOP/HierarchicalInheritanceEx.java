class Shape{

    public void display(){
        System.out.println("this is a shape");
    }
}

class Circle extends Shape{

    public void area(double radius){
        System.out.println("area of circle : "+  (Math.PI*radius*radius));
    }
}

class Rectangle extends Shape{

    public void area(double length, double weight){
        System.out.println("area of rectangle : "+ (length*weight));
    }
}


public class HierarchicalInheritanceEx {

    public static void main(String[] args) {

        Circle c = new Circle();
        c.display();
        c.area(2);

        Rectangle r = new Rectangle();
        r.display();
        r.area(2,3);

    }

}
