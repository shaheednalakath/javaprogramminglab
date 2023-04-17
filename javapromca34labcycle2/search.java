import java.util.Scanner;
public class search{
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("enter size of an array");
  int n=sc.nextInt();
  int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
          int search;
          System.out.println("enter search element:");
          search=sc.nextInt();
          int pos=0;
        for (int i = 0; i < n; i++) 
          {
             if(arr[i] == search)
                {
                   pos=i+1;
                   System.out.println("Element found at position " +pos+ " in the array.");
                   break;
                }
              
         }
      

 }
}

