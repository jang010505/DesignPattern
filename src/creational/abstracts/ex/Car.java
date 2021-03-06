package creational.abstracts.ex;

import creational.abstracts.ex.frame.Frame;
import creational.abstracts.ex.wheel.Wheel;

public class Car {

    private Frame frame;
    private Wheel wheel;

    public Car(Frame frame, Wheel wheel) {
        this.frame = frame;
        this.wheel = wheel;
    }

    public Frame getFrame() {
        return frame;
    }

    public Wheel getWheel() {
        return wheel;
    }
}
