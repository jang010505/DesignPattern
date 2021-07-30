package creational.factory.lab;

public class ShapeFactory {
    public static Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("Circle"))
            return new Circle();
        else if(shapeType.equalsIgnoreCase("Rectangle"))
            return new Rectangle();
        return null;
    }
}
