package creational.abstracts.lab.factory;

import creational.abstracts.lab.display.Display;
import creational.abstracts.lab.display.SDisplay;
import creational.abstracts.lab.frame.Frame;
import creational.abstracts.lab.frame.SFrame;

public class SFactory implements Factory{

    @Override
    public Frame crateFrame() {
        return new SFrame();
    }

    @Override
    public Display crateDisplay() {
        return new SDisplay();
    }
}
