class Student {
    private String name;
    private int id;
    private String department;
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }
    
    public String getDepartment() {
        return department;
    }
}

class StudentDemo{
  public static void main(String args[]){
    Student student1 = new Student();
student1.setName("Madhusudhan");
student1.setId(12345);
student1.setDepartment("Electronics and communication");

System.out.println(student1.getName());       
System.out.println(student1.getId());       
System.out.println(student1.getDepartment());  
  }
}