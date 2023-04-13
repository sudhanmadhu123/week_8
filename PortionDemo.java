import java.util.*;

class PortionDemo {
 public static void main(String[] args) {
  ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        ArrayList<Integer> portion = new ArrayList<Integer>(numbers.subList(1, 4));
        System.out.println("Portion of the ArrayList: " + portion);
    }
}