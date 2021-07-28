package creational.abstracts.ex.Factory;

import creational.abstracts.ex.frame.Frame;
import creational.abstracts.ex.frame.SonataFrame;
import creational.abstracts.ex.wheel.SonataWheel;
import creational.abstracts.ex.wheel.Wheel;

public class SonataFactory implements Factory {
    @Override
    public Frame createFrame() {
        return new SonataFrame();
    }

    @Override
    public Wheel createWheel() {
        return new SonataWheel();
    }
}