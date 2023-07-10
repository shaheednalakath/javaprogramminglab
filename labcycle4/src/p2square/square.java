package p2square;
import shapesimplement.shapes;
public class square implements shapes{
    private double sides;
    public square(double sides)
    {
        this.sides=sides;
    }


    public double area_calculator() {
        return sides*sides;
    }
}
