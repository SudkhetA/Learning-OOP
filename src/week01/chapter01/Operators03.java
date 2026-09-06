package week01.chapter01;

public class Operators03 {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;
        boolean result01, result02, result03;

        result01 = x && y; // AND
        result02 = x || y; // OR
        result03 = !x;

        System.out.println(result01);
        System.out.println(result02);
        System.out.println(result03);
    }
}
