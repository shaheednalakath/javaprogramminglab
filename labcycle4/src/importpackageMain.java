import shapesimplement.shapes;
import p1circle.circle;
import p2square.square;
import p3triange.triangle;
import  p4rectangle.rectangle;
public class importpackageMain {
    public static void main(String[] args) {
       circle c=new circle(5);
       square sq=new square(2);
       triangle tr=new triangle(2,5);
       rectangle rt=new rectangle(3,10);
        System.out.println(c.area_calculator());
        System.out.println(sq.area_calculator());
        System.out.println(tr.area_calculator());
        System.out.println(rt.area_calculator());
    }
}