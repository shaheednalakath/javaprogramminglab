package add;
import arthamatic.shapes;
public class addtion implements shapes{
    private double a;
    private double b;
    public addtion(double a,double b)
    {
        this.a=a;
        this.b=b;

    }
    public double operation() {
        return a+b;
    }
}
