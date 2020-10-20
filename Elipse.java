import java.util.Scanner;

public class Ellipse{
    double radius, small;

    public Ellipse(double radius, double small) {
        this.radius = radius;
        this.small = small;
    }

    double getArea(){
        return Math.PI * this.radius * this.small;
    }
}