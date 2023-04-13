import java.util.*;
import java.util.Collections;

class ReverseDemo {

  public static void main(String[] args) {
  ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Grapes");
        arrayList.add("Mango");
        
        System.out.println("Original ArrayList: " + arrayList);
        
        Collections.reverse(arrayList);
        
        System.out.println("Reversed ArrayList: " + arrayList);
    }

}