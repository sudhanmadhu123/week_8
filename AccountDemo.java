class Employee {
    private int employeeId;
    private String name;
    private double hra;
    private double da;

    public Employee(int employeeId, String name, double hra, double da) {
        this.employeeId = employeeId;
        this.name = name;
        this.hra = hra;
        this.da = da;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getHra() {
        return hra;
    }

    public double getDa() {
        return da;
    }
}

class Account extends Employee {
    private String department;
    private double salary;

    public Account(int employeeId, String name, double hra, double da, String department, double salary) {
        super(employeeId, name, hra, da);
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public double calculateGrossSalary() {
        return salary + getHra() + getDa();
    }
}

class Manager extends Employee {
    private String typeOfManager;
    private double salary;

    public Manager(int employeeId, String name, double hra, double da, String typeOfManager, double salary) {
        super(employeeId, name, hra, da);
        this.typeOfManager = typeOfManager;
        this.salary = salary;
    }

    public String getTypeOfManager() {
        return typeOfManager;
    }

    public double getSalary() {
        return salary;
    }

    public double calculateGrossSalary() {
        return salary + getHra() + getDa();
    }
}

public class Main {
    public static void main(String[] args) {
        
        Account account = new Account(1001, "Madhusudhan", 5000, 3000, "Accounts", 20000);
        System.out.println("Account Employee ID: " + account.getEmployeeId());
        System.out.println("Account Employee Name: " + account.getName());
        System.out.println("Account Employee Department: " + account.getDepartment());
        System.out.println("Account Employee Salary: " + account.getSalary());
        System.out.println("Account Employee Gross Salary: " + account.calculateGrossSalary());
        Manager manager = new Manager(1002, "Jane Doe", 10000, 5000, "Senior Manager", 50000);
        System.out.println("Manager Employee ID: " + manager.getEmployeeId());
        System.out.println("Manager Employee Name: " + manager.getName());
        System.out.println("Manager Type of Manager: " + manager.getTypeOfManager());
        System.out.println("Manager Salary: " + manager.getSalary());
        System.out.println("Manager Gross Salary: " + manager.calculateGrossSalary());
    }
}