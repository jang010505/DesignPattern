package creational.prototype.lab;

public class Main {
    public static void main(String[] args) {
        Frame frame = new Frame("note V1", "white");
        Display display = new Display("note V1", 7);

        GalaxyNote whiteNote = new GalaxyNote(display, frame);

        GalaxyNote redNote = (GalaxyNote) whiteNote.clone();

        redNote.changeFrame(new Frame("note V2", "red"));

        System.out.println(redNote.toString());
        System.out.println(whiteNote.toString());
    }
}
