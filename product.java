import java.util.Scanner;
class product{
  int pcode;
  String pname;
  public float prize;
 void read()
 {
   
   Scanner sc=new Scanner(System.in);
   System.out.println("enter details of product");
   System.out.println("enter pcode");
   pcode=sc.nextInt();
   System.out.println("enter pname");
   pname=sc.next();
   System.out.println("enter pprize");
   prize=sc.nextFloat();
 }
 void display()
 {
   System.out.println(" Overatted product \n pcode="+pcode+"\npname="+pname+"\nprize="+prize);
   
 }
 public static void main(String[] args)
   {
     product n1=new product();
     product n2=new product();
     product n3=new product();
     
     n1.read();
     n2.read();
     n3.read();
     if(n1.prize >n2.prize && n1.prize >n3.prize)
     {
         n1.display();
      }
      else if(n2.prize >n1.prize && n2.prize>n3.prize)
                {
                   n2.display();
                 }
      else 
           {
            n3.display();
           }
      }     
                         
          
     
     
     
 }

