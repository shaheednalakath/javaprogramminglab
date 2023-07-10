package p4rectangle;
import shapesimplement.shapes;
public class rectangle implements shapes {
    private double length;
    private double width;
    public rectangle(double length,double width)
    {
        this.length=length;
        this.width=width;
    }

    public double area_calculator() {
        return length*width;
    }
}
