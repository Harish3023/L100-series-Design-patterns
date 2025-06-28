package structural.adapter;
//Adaptee class
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
    System.out.println("Mp4Player cannot play VLC files: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing MP4 file: " + fileName);
    }
}
