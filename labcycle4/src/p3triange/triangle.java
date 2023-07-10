package p3triange;
import shapesimplement.shapes;
public class triangle implements shapes {
    private double length;
    private double width;
    public triangle(double length,double width)
    {
        this.length=length;
        this.width=width;
    }
    public double area_calculator() {
        return 0.5*length*width;
    }
}
