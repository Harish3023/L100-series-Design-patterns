package structural.adapter;
// Adaptee class
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing VLC file: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
    System.out.println("VlcPlayer cannot play MP4 files: " + fileName);    
    }
}
