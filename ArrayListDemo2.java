import java.util.*;
class ArrayListDemo{
  public static void main(String args[]){
    // List list=new ArrayList();
    // list.add(123);
    // list.add("laitha");
    // list.add(56.75f);
    // System.out.println(list);
    // for( Object obj:list){
    //   System.out.println(obj);
    // }
 
    // List list=new ArrayList();
    // Scanner sc=new Scanner(System.in);
    // list.add(sc.next());
    // list.add(sc.next());
    // list.add(sc.next());
    // System.out.println(list);
    // for(Object str:list){
    //   System.out.println(str);
    // }
 
   //  List<Integer> list=new ArrayList<Integer>();
   //  list.add(123);
   //  list.add(124);
   //  list.add(127);
   // System.out.println(list);
   //  for(Integer i:list)
   //  {
   //    System.out.println(i);
   //  }
 
    List<Float> list=new ArrayList<Float>();
    Scanner sc=new Scanner(System.in);
    list.add(sc.nextFloat());
    list.add(sc.nextFloat());
    list.add(sc.nextFloat());
    list.add(sc.nextFloat());
    System.out.println(list);
    for(Float i:list)
    {
      System.out.println(i);
    } 
  }
