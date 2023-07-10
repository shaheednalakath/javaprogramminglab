package div;
import arthamatic.shapes;
public class division implements shapes{
    private double a;
    private double b;
    public division(double a,double b)
    {
        this.a=a;
        this.b=b;
    }
    public double operation() {
        return a/b;
    }
}
