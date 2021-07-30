package creational.prototype.lab;

public class Frame {
    private final String name;
    private final String color;

    public Frame(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Frame{" +
                "name = '" + name + '\'' +
                ", color = '" + color + '\'' +
                '}';
    }

}
