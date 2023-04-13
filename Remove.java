import java.util.ArrayList;
public class Remove {
  public static void main(String[] args) {
      ArrayList<String> list = new ArrayList<String>();
      list.add("First");
      list.add("Second");
      list.add("Third");
      list.add("Fourth");
      list.add("Fifth");
      System.out.println("Before removing the third element: " + list);
      list.remove(2);
      System.out.println("After removing the third element: " + list);
   }
}