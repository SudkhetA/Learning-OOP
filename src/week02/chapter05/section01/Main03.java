package week02.chapter05.section01;

import java.util.ArrayList;

// ArrayList

public class Main03 {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<String>();
        System.out.println("Size: " + stringList.size());
        stringList.add("Hello");
        stringList.add("World");
        System.out.println("Size: " + stringList.size());

        String first = stringList.get(0);
        System.out.println("First String: " + first);

        stringList.set(0, "Hi");
        System.out.println("First String: " + stringList.get(0));

        stringList.remove(1);
        for(String element: stringList) {
            System.out.println("Element: " + element);
        }
    }
}
