public class Mp4Player implements AdvancedAudioPlayer {
    @Override
    public void play(String fileName) {
        System.out.println("Playing " + fileName + " in mp4 format");
    }
}
