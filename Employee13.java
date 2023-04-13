public class Employee {
    private int eid;
    private String ename;
    private double esalary;

    public void setEid(int eid) {
        this.eid = eid;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setEsalary(double esalary) {
        this.esalary = esalary;
    }

    public int getEid() {
        return eid;
    }

    public String getEname() {
        return ename;
    }

    public double getEsalary() {
        return esalary;
    }
}

class Employee13 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        for (int i = 0; i < employees.length; i++) {
            Employee employee = new Employee();
            employee.setEid(i + 1);
            employee.setEname("Employee " + (i + 1));
            employee.setEsalary(Math.random() * (100000 - 50000) + 50000); // random salary between 50,000 and 100,000
            employees[i] = employee;
        }

        for (Employee employee : employees) {
            System.out.println("Employee ID: " + employee.getEid());
            System.out.println("Employee Name: " + employee.getEname());
            System.out.println("Employee Salary: " + employee.getEsalary());
        }
    }
}