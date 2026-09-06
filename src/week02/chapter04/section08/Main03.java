package week02.chapter04.section08;

class Employee {
    public void work() {
        System.out.println("Employee is working.");
    }
}

class Manager extends Employee {
    @Override
    public void work() {
        System.out.println("Manager is managing the team.");
    }
}

class Developer extends Employee {
    @Override
    public void work() {
        System.out.println("Developer is writing code.");
    }
}

public class Main03 {
    public static void main(String[] args) {
        Employee emp1 = new Manager();
        Employee emp2 = new Developer();

        emp1.work();
        emp2.work();
    }
}
