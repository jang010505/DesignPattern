package creational.abstracts.ex.Factory;

import creational.abstracts.ex.frame.AvanteFrame;
import creational.abstracts.ex.frame.Frame;
import creational.abstracts.ex.wheel.AvanteWheel;
import creational.abstracts.ex.wheel.Wheel;

public class AvanteFactory implements Factory {

    @Override
    public Frame createFrame() {
        return new AvanteFrame();
    }

    @Override
    public Wheel createWheel() {
        return new AvanteWheel();
    }
}
