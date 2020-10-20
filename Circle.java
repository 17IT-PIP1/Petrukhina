public class Circle {
    int radius, x = 0, y = 0;

    public Circle(int radius){
        this.radius = radius;
    }

    public void setCenter(int x, int y){
        this.x = x;
        this.y = y;
    }

    int getArea() {
        return this.radius * this.radius;
    }
}