package week01.chapter01;

public class Operators04 {
    public static void main(String[] args) {
        int a = 10;

        a += 5; // a = a + 5;
        System.out.println("a = " + a);

        a -= 3; // a = a - 3;
        System.out.println("a = " + a);

        a *= 2; // a = a * 2;
        System.out.println("a = " + a);

        a /= 4; // a = a / 4;
        System.out.println("a = " + a);

        a %= 6; // a = a % 6;
        System.out.println("a = " + a);

        int x = 10;
        int y = ++x;
        int z = x--;
        System.out.println(x + ", " + y + ", " + z);

        int m = 10;
        int n = 5;
        int max = (m > n) ? m : n;
        System.out.println("max = " + max);
    }
}
