package structural.proxy;
// RealImage simulates an expensive object (like loading a large image from disk).

public class RealImage implements Image {
    private final String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading " + filename + " from disk...");
    }

    @Override
    public void display() {
        System.out.println("Displaying " + filename);
    }
}