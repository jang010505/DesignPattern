package creational.prototype.lab;

public class Phone implements Cloneable {

    public Display display;
    public Frame frame;

    public Phone(Display display, Frame frame) {
        this.display = display;
        this.frame = frame;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "display = " + display +
                ", frame = " + frame +
                '}';
    }

    @Override
    protected Object clone() {
        Object obj = null;
        try {
            obj = super.clone();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }
}
