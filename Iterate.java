import java.util.ArrayList;

public class Iterate{
   public static void main(String[] args) {
      ArrayList<String> colors = new ArrayList<String>();
      colors.add("Red");
      colors.add("Green");
      colors.add("Blue");
      colors.add("Yellow");
      colors.add("Orange");
      System.out.println("The colors in the list are:");
      for (String color : colors) {
         System.out.println(color);
      }
   }
}