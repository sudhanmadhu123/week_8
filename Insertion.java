import java.util.*;

public class Insertion{
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println("Original ArrayList: " + numbers);
        numbers.add(0, 5);
        System.out.println("Updated ArrayList: " + numbers);
    }
}