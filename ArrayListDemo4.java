import java.util.*;
class ArrayListDemo4{
  public static void main(String args[]){ 
     List list=new ArrayList();
     Scanner sc=new Scanner(System.in);
     list.add(sc.next());
     list.add(sc.next());
     list.add(sc.next());
     System.out.println(list);
     for(Object str:list){
       System.out.println(str);
     }
  }
}