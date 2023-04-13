class InvalidSalaryException extends Exception{
  InvalidSalaryException(String str){
    super (str);
  }
}
class Employee {
    private int id;
    private String name;
    private double salary;

 

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

 

    int getId() {
        return id;
    }

 

    String getName() {
        return name;
    }

 

    double getSalary() {
        return salary;
    }
}

 

class Company {
    private Employee[] em = new Employee[10];
    private int nextIndex = 0;

 

    void addEmployee(Employee employee) {
        if (nextIndex == em.length) {
            Employee[] newEm = new Employee[em.length * 2];
            System.arraycopy(em, 0, newEm, 0, em.length);
            em= newEm;
        }
        em[nextIndex] = employee;
        nextIndex++;
    }

 

    void removeEmployee(Employee employee) throws  InvalidSalaryException{
        int index = -1;
        for (int i = 0; i < nextIndex; i++) {
            if (em[i].getId() == employee.getId()) {
                index = i;
            }
        }
        if (index == -1) {
            throw new InvalidSalaryException("Employee not found in company.");
        }
        for (int i = index; i < nextIndex - 1; i++) {
            em[i] = em[i + 1];
        }
        em[nextIndex - 1] = null;
        nextIndex--;
    }

 

    void displayEmployees() {
        for (int i = 0; i < nextIndex; i++) {
            System.out.println(em[i].getId() + " " + em[i].getName() + " - $" + em[i].getSalary());
        }
    }
}
class Employee10{
    public static void main(String[] args) {
      Company company = new Company();
      Employee em1 = new Employee(1213, "Employee 1", 10000);
      Employee em2 = new Employee(223, "Employee 2", 20000);
      Employee em3 = new Employee(3213, "Employee 3", 29000);
      company.addEmployee(em1);
      company.addEmployee(em2);
      try{
        company.removeEmployee(em1);
        System.out.println("Employee removed from company.");
      }
      catch(InvalidSalaryException e) {
        System.out.println(e);
      }
      company.displayEmployees();  
      }
    }