class rectangle
 { 
       double length; 
       double breadth; 
      void setData(double l, double b) 
       {  
         length =l; 
         breadth=b; 
       }  
       double area() 
       { 
         double rectArea; 
         rectArea = length * breadth; 
         return rectArea; 
       } 
 }  
 class RectangleArea  
 { 
          public static void main(String[] args) 
      {  
            rectangle firstRect = new rectangle(); 
            firstRect.setData(2.48,30); 
            double result = firstRect.area(); 
            System.out.println("Area of Rectangle = "+ result); 
      } 
 } 
 
