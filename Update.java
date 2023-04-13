import java.util.*;
public class Update{
  public static void main(String args[]){
    ArrayList<String> names = new ArrayList<String>();
    names.add("XYZ");
    names.add("ABC");
    names.add("DEF");
    String newName = "PQR";
    names.set(1,newName);
    System.out.println("Updated names in the ArrayList:");
    for(String name: names){
      System.out.println(name);
    }
    Collections.sort(names);
    System.out.println(names);
  }
}