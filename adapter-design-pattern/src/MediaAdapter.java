public class MediaAdapter  {

    private AdvancedAudioPlayer advancedMediaPlayer;

    public MediaAdapter(String audioFormat) {
        if(audioFormat.equalsIgnoreCase("vlc")){
            advancedMediaPlayer = new VlcPlayer();
        } else if (audioFormat.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        } else if (audioFormat.equalsIgnoreCase("mp3")) {
            advancedMediaPlayer = null;
        }
    }

    public void play(String fileName) {
        if (advancedMediaPlayer != null) {
            advancedMediaPlayer.play(fileName);
        }
    }
}
