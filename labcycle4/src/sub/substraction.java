package sub;
import arthamatic.shapes;

public class substraction implements shapes {
    private double a;
    private  double b;
    public  substraction(double a,double b)
    {
        this.a=a;
        this.b=b;

    }
    public double operation() {
        return a-b;
    }
}
