public class Rectangle {
    int height, width;

    public Rectangle(int height, int width){
        this.height = height;
        this.width = width;
    }

    int getArea(int height, int width){
        return this.height * this.width;
    }
}