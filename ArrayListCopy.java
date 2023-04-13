import java.util.*;

public class ArrayListCopy{
  public static void main(String args[]){

    ArrayList<Integer>list1=new ArrayList<Integer>();
    list1.add(10);
    list1.add(20);
    list1.add(30);

    ArrayList<Integer>list2=new ArrayList<Integer>();

    for(Integer element:list1){
      list2.add(element);
    }
    System.out.println("list1:"+list1);
    System.out.println("list2:"+list2);
  }
}