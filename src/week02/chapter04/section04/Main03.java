package week02.chapter04.section04;

class Counter {
    // Static variable.
    private static int count = 0;

    // Static method to imcrement count.
    public static void increment() {
        count++;
    }

    // Static method to get the current count.
    public static int getCount() {
        return count;
    }
}

public class Main03 {
    public static void main(String[] args) {
        // Calling static methods to increment and get count.
        Counter.increment();
        Counter.increment();
        System.out.println("Count: " + Counter.getCount());
    }
}
