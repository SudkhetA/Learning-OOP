package week02.chapter05.section01;

import java.util.HashMap;

// HashMap

public class Main05 {
    public static void main(String[] args) {
        HashMap<String, Integer> studentScores = new HashMap<String, Integer>();
        studentScores.put("Alice", 90);
        studentScores.put("Bob", 85);
        studentScores.put("Charlie", 95);

        System.out.println("Studens Scores: " + studentScores);

        int bobScore = studentScores.get("Bob");
        System.out.println("Bob's Score: " + bobScore);

        if (studentScores.containsKey("Alice")) {
            System.out.println("Alice is in the HashMap.");
        } else {
            System.out.println("Alice is not in the HashMap.");
        }

        studentScores.remove("Charlie");
        System.out.println("Studens Scores: " + studentScores);

        for(HashMap.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println("Student: " + entry.getKey() + ", Score: " + entry.getValue());
        }
    }
}
