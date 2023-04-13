import java.util.Scanner;
class Delete{
  public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    int arr[]={1,2,23,44,45,56,225};
    System.out.print("Enter the value to be delete the number:");
    int value=s.nextInt();
    for(int i=0;i<arr.length;i++){
      if(arr[i]!=value){
        System.out.print(arr[i]+" ");
      }
    }
  }
}