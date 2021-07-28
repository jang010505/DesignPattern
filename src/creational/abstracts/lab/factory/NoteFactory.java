package creational.abstracts.lab.factory;

import creational.abstracts.lab.display.Display;
import creational.abstracts.lab.display.NoteDisplay;
import creational.abstracts.lab.frame.Frame;
import creational.abstracts.lab.frame.NoteFrame;

public class NoteFactory implements Factory{

    @Override
    public Frame crateFrame() {
        return new NoteFrame();
    }

    @Override
    public Display crateDisplay() {
        return new NoteDisplay();
    }
}
