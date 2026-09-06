package week01.chapter01;

public class VariableAndConstant {
    public static void main(String[] args) {
        int age = 1;
        int sum = age + 10;

        System.out.println(age);
        System.out.println(sum);

        double salary = 50000.75;
        System.out.println(salary);

        char grade = 'A';
        System.out.println(grade);

        String name = "Do Something";
        System.out.println(name);

        String _surname = "Yes, sir";
        System.out.println(_surname);

        // Constant
        final int MAX_VALUE = 1000;
        System.out.println(MAX_VALUE);
    }
}
