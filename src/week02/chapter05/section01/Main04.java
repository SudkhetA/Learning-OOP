package week02.chapter05.section01;

import java.util.LinkedList;

// LinkedList

public class Main04 {
    public static void main(String[] args) {
        LinkedList<String> stringList = new LinkedList<>();
        stringList.add("Hello");
        stringList.add("Start");
        stringList.add("End");

        System.out.println("First String: " + stringList.get(0));
        stringList.set(0, "Hi");
        System.out.println("Modified First String: " + stringList.get(0));

        stringList.remove(1);
        for(String element : stringList) {
            System.out.println("Element: " + element);
        }
    }
}
