package creational.factory.lab;

public class Main {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.getShape("Circle");
        Shape rectangle = ShapeFactory.getShape("Rectangle");

        circle.shape();
        rectangle.shape();
    }
}
