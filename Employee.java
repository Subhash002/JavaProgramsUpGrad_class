// Abstract Employee class
abstract class Employee {
    private String role;
    private double salary;

    public Employee(String role, double salary) {
        this.role = role;
        this.salary = salary;
    }

    public String getRole() {
        return role;
    }

    public double getSalary() {
        return salary;
    }

    // Abstract method to be implemented by subclasses
    public abstract void doWork();
}

// Manager class extending Employee
class Manager extends Employee {
    public Manager() {
        super("Manager", 80000);
    }

    @Override
    public void doWork() {
        System.out.println("Manager is managing the team.");
    }
}

// Developer class extending Employee
class Developer extends Employee {
    public Developer() {
        super("Developer", 60000);
    }

    @Override
    public void doWork() {
        System.out.println("Developer is writing code.");
    }
}

// Designer class extending Employee
class Designer extends Employee {
    public Designer() {
        super("Designer", 70000);
    }

    @Override
    public void doWork() {
        System.out.println("Designer is creating designs.");
    }
}

// Client class using the Employee subclasses
public class EmployeeClient {
    public static void main(String[] args) {
        // Polymorphism at work
        Employee manager = new Manager();
        Employee developer = new Developer();
        Employee designer = new Designer();

        // An array of Employee objects
        Employee[] employees = { manager, developer, designer };

        // Loop through and display role, salary, and work for each employee
        for (Employee employee : employees) {
            System.out.println("Role: " + employee.getRole());
            System.out.println("Salary: $" + employee.getSalary());
            employee.doWork();
            System.out.println();
        }
    }
}
