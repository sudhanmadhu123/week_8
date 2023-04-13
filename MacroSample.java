class Student {
  private int id;
  private String name;
 
  // setters
  void setId(int id) {
    this.id = id;
  }
 
  void setName(String name) {
    this.name = name;
  }
 
  // gerrers
  int getId() {
    return this.id;
  }
 
  String getName() {
    return this.name;
  }
}
 
class MacroSample {
  public static void main(String args[]) {
    Student st = new Student();
    st.setId(123);
    st.setName("Madhu");
    System.out.println(st.getId());
    System.out.println(st.getName());
 
  }
}