package creational.abstracts.lab;

import creational.abstracts.lab.display.Display;
import creational.abstracts.lab.frame.Frame;

public class Phone {
    private final Frame frame;
    private final Display display;

    public Phone(Frame frame, Display display){
        this.frame = frame;
        this.display = display;
    }

    public Frame getFrame() {
        return frame;
    }

    public Display getDisplay() {
        return display;
    }
}