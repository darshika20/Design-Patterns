public class AudioPlayer implements MediaPlayer {


    @Override
    public void play(String audioFormat, String fileName)  {
        try {
            if(audioFormat.equalsIgnoreCase("mp4") || audioFormat.equalsIgnoreCase("vlc")) {
                MediaAdapter mediaAdapter = new MediaAdapter(audioFormat);
                mediaAdapter.play(fileName);
            } else if (audioFormat.equalsIgnoreCase("mp3")) {
                System.out.println("Printing "+ fileName + " in " + audioFormat +" format");
            } else {
                throw new NotFoundException("Audio format "+audioFormat+" not supported");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

}
