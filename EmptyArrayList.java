import java.util.ArrayList;
public class EmptyArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("date");
        System.out.println("ArrayList before clearing: " + list);
        list.clear();
        System.out.println("ArrayList after clearing: " + list);
    }
}