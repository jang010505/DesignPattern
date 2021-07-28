package creational.abstracts.ex.Factory;

import creational.abstracts.ex.frame.Frame;
import creational.abstracts.ex.wheel.Wheel;

public interface Factory {
    Frame createFrame();
    Wheel createWheel();
}
