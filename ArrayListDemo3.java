import java.util.*;
class ArrayListDemo3{
  public static void main(String args[]){
     List list=new ArrayList();
     list.add(123);
     list.add("Madhu");
     list.add(56.75f);
     System.out.println(list);
     for( Object obj:list){
       System.out.println(obj);
    }
  }
}