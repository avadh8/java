class MathUtils {

    static int square(int num) {
        return num * num;
    }
}

public class StaticMethodEx {

    public static void main(String[] args) {

        System.out.println(MathUtils.square(5));

    }
}
