package p1circle;
import shapesimplement.shapes;
public class circle implements shapes {

        private double radius;
        public circle (double radius){
            this.radius=radius;
        }
        public double area_calculator() {
            return Math.PI*radius*radius;
        }

    }

