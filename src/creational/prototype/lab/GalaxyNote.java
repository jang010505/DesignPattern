package creational.prototype.lab;

public class GalaxyNote extends Phone {

    public GalaxyNote(Display display, Frame frame) {
        super(display, frame);
    }

    public void changeFrame(Frame frame) {
        this.frame = frame;
    }

    public void changeDisplay(Display display) {
        this.display = display;
    }

    @Override
    public String toString() {
        return "GalaxyNote{" +
                "frame = " + frame +
                ", display = " + display +
                '}';
    }
}
