import java.util.*;  
class oddeven
{
  public static void main(String[] args) 
   {
      Scanner sc= new Scanner(System.in);    
      System.out.print("Enter a number ");  
       int a= sc.nextInt();  
      if(a%2==0)
        {
              System.out.println("even number");
         }
       else{
              System.out.println("odd number");
            }
    }
}
