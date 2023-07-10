package mul;
import arthamatic.shapes;
public class mulitiplication implements shapes {
    private double a;
    private double b;
    public mulitiplication(double a,double b)
    {
        this.a=a;
        this.b=b;
    }


    public double operation() {
        return a*b;
    }
}
