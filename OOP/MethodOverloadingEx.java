public class MethodOverloadingEx {

    public int add(int a, int b){
        return a + b;
    }

    public double add(int a, double b){
        return a + b;
    }

    public static void main(String[] args) {

        MethodOverloadingEx m1 = new MethodOverloadingEx();

        System.out.println(m1.add(1,2));
        System.out.println(m1.add(1,2.1));

    }
}
