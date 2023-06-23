import java.util.Scanner;

////package labcycle3;
////
////import java.util.Scanner;
////
////class publisher{
////private String name;
////public publisher(String name){
////    this.name=name;
////}
////public String getname()
////{
////    return name;
////}
////}
////class book{
////    publisher publish;
////    double prize;
////    String title;
////    String category;
////    book(publisher publish,String title,String category,double prize)
////    {
////        this.publish=publish;
////        this.prize=prize;
////        this.title=title;
////        category="general";
////    }
////    String category()
////    {
////        return "general";
////    }
////
////}
////class lit_aery{
////
////}
////class fiction{
////
////
////
////}
////public class MainBook {
////    public static void main(String[] args) {
////        Scanner sc=new Scanner(System.in);
////        System.out.println("enter the publisher name");
////        String publisher_name=sc.next();
////        System.out.println("enter book name you want to store");
////        String bookname=sc.next();
////        System.out.println("enter book prize");
////        double book_prize= sc.nextDouble();
////        System.out.println("which categoryies you want to add book ");
////        System.out.println("1-FICTION");
////        System.out.println("2-Literature");
////        System.out.println("3-General");
////        int book_catgory=sc.nextInt();
////        if(book_catgory ==2)
////        {
////            book b2=new lit_aery(new publisher(publisher_name),bookname,book_prize);
////        }
////
////    }
////}
//
//
//import java.util.Scanner;
//
//class Publisher
//{
//    private String name;
//    public Publisher(String name)
//    {
//        this.name= name;
//    }
//    public String getname()
//    {
//        return name;
//    }
//}
//
//class Book
//{
//    Publisher publish;
//    double price;
//    String title;
//    String category;
//
//    Book(Publisher publish,String title,double price)
//    {
//        this.publish = publish;
//        this.price=price;
//        this.title=title;
//        category="general";
//
//    }
//    String category()
//    {
//        return "General";
//    }
//
//    void display()
//    {
//        System.out.println("\t\t\t\t Book details");
//        System.out.println("Title:"+title);
//        System.out.println("Publisher name:"+publish.getname());
//        System.out.println("Price:"+price);
//        System.out.println("category:"+category());
//    }
//}
//
//class Fiction extends Book{
//    Fiction(Publisher publish,String title,double price)
//    {
//        super(publish, title,price);
//
//    }
//    String category()
//    {
//        return "Fiction";
//    }
//}
//
//class Literature extends Book
//{
//    Literature(Publisher publish,double price,String title)
//    {
//        super(publish, title, price);
//    }
//    String category()
//    {
//        return "Literature";
//    }
//}
//
//class MainBook
//{
//    public static void main(String args[])
//    {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("add publisher name :");
//        String a = sc.nextLine().toUpperCase();
//        System.out.println("add book name:");
//
//        String b = sc.nextLine().toUpperCase();
//        System.out.println("add book price:");
//        double c = sc.nextDouble();
//        System.out.println("which category do you want add this book  \n 1.Fiction \n 2.Literature \n 3.General");
//        System.out.println("select any one :");
//
//        int d = sc.nextInt();
//        if (d==2) {
//
//            Book b1= new Literature(new Publisher(a),c,b);
//            b1.display();
//        }
//        else if (d==1)
//        {
//            Book b2 = new Fiction(new Publisher(a), b,c);
//            b2.display();
//        }
//        else {
//            Book b1= new Book(new Publisher(a),b,c);
//            b1.display();
//        }
//    }
//}
class publisher{
 private String name;
 public publisher(String name)
 {
     this.name=name;

 }
 public String getname()
 {
     return name;
 }

}
class book {
    publisher publish;
    double prize;
    String title;
    String category;

    book(publisher publish, String title, double prize) {
        this.publish = publish;
        this.prize = prize;
        this.title = title;
        this.category = "general";
    }
    String category()
    {
        return "general";
    }

    void display() {
        System.out.println("book details");
        System.out.println("title:" + title);
        System.out.println("publisher name:" + publish.getname());
        System.out.println("prize:" + prize);
        System.out.println("category:" + category());
    }
}

class literature extends book{
    literature(publisher publish,String title,double prize)
    {
        super(publish,title,prize);
    }
    String category()
    {
        return "litrature";
    }

}
class fiction extends book{
    fiction(publisher publish,String title,double prize)
    {
        super(publish,title,prize);
    }
    String category()
    {
        return "fiction";
    }

}
class MainBook{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your book details");
        System.out.println("enter book name");
        String b_n=sc.next();
        System.out.println("enter book prize");
        double b_p=sc.nextDouble();
        System.out.println("book title:");
        String b_t=sc.next();
        System.out.println("enter book categories");
        System.out.println("1-fiction ");
        System.out.println("2-litratuer");
        System.out.println("3-general");
        System.out.println("select one");
        int b_c=sc.nextInt();
        if(b_c == 1)
        {
           book b1=new fiction(new publisher(b_n),b_t,b_p);
           b1.display();
        }
        else if(b_c==2)
        {
            book b2=new literature(
                    new publisher(b_n),b_t,b_p);
            b2.display();

        }
        else{
            book b3=new book(new publisher(b_n),b_t,b_p);
            b3.display();
        }
    }
}