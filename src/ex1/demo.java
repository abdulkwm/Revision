package ex1;

class Shape{
    int length;
    int width;
    int radius;

    public Shape() {
    }
    public Shape(int length, int width, int radius) {
        this.length = length;
        this.width = width;
        this.radius = radius;
    }
    public double area(){
        return this.length * this.width;
    }
}
class Circle extends Shape{
    int parameter;

    public Circle(int length, int width, int radius) {
        super(length, width, radius);
    }

    public Circle(int parameter) {
        this.parameter = parameter;
    }

    public int getParameter() {
        return parameter;
    }
}
public class demo {
    private void clone(Circle circle){
        System.out.println(circle.area());
    }
    public static void main(String[] args) {
        Circle circle = new Circle(2,5,3);
        Circle circle1 = new Circle(23);
        System.out.println(circle1.getParameter());
        System.out.println(circle.area());
        System.out.println("I want to clone the circle object to clone1 object");
        demo n = new demo();
        n.clone(circle);
        n.clone(circle);
    }
}
