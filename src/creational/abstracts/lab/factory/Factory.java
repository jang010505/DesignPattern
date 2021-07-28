package creational.abstracts.lab.factory;

import creational.abstracts.lab.display.Display;
import creational.abstracts.lab.frame.Frame;

public interface Factory {
    Frame crateFrame();
    Display crateDisplay();
}
