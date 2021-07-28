package creational.abstracts.lab;

import creational.abstracts.lab.factory.Factory;
import creational.abstracts.lab.factory.NoteFactory;
import creational.abstracts.lab.factory.SFactory;

public class Main {
    public static void main(String[] args) {
        Factory sFactory = new SFactory();
        Phone s = new Phone(sFactory.crateFrame(), sFactory.crateDisplay());
        s.getFrame().shape();
        s.getDisplay().size();

        System.out.println("================");

        Factory noteFactory = new NoteFactory();
        Phone note = new Phone(noteFactory.crateFrame(), noteFactory.crateDisplay());
        note.getFrame().shape();
        note.getDisplay().size();
    }
}
