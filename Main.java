public class Main{

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Circle cir1 = new Circle(5);
        Ellipse ei1 = new Ellipse(5,8);
        System.out.print(r1.getArea(5,8));
        System.out.print(cir1.getArea());
        System.out.print(ei1.getArea());
    }
}