package week02.chapter04.section08;

class MathUtils {
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        MathUtils math = new MathUtils();
        System.out.println(math.add(5, 3));
        System.out.println(math.add(5, 3, 2));
        System.out.println(math.add(5.5, 3.3));
    }
}
