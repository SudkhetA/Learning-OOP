package week02.chapter04.section09;

// Encapsulation

class Employee {
    private int employeeId;
    private String name;
    private double salary;

    public Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    // Public method to get the employee ID. // Getter method.
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {                // Getter method.
        return name;
    }

    public void setName(String name) {       // Setter method
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary amount.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "John Doe", 50_000.00);
        System.out.println("Employee ID: " + emp.getEmployeeId());
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary: " + emp.getSalary());

        // Updating employee details.
        emp.setName("Jane Doe");
        emp.setSalary(55_000.00);
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary: " + emp.getSalary());

        emp.setSalary(-10_000.00);
    }
}
