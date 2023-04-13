import java.util.*;
import java.util.Collections;

class shuffledemo {
  public static void main(String[] args) {
    
   ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(9);
    
        Collections.shuffle(numbers);
        System.out.println("Shuffled ArrayList: " + numbers);
    }
}