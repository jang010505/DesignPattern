package creational.prototype.lab;

public class Display {
    public String name;
    public int size;

    public Display(String name, int size){
        this.name = name;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Display{" +
                "name = '" + name + '\'' +
                ", size = '" + size + '\'' +
                '}';
    }
}
