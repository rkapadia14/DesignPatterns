package com.poc.designpattern.adapter;

public class AudioMediaAdapter implements MediaPlayer {
	public static final String VLC = "vlc";
    public static final String MP4 = "mp4";

    private AdvancedMediaPlayer advancedMusicPlayer;
   
    public AudioMediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase(VLC)) {
            advancedMusicPlayer = new VlcMediaPlayerDemo();
        } else if (audioType.equalsIgnoreCase(MP4)) {
            advancedMusicPlayer = new Mp4MediaPlayerDemo();
        }
    }

    @Override
    public void playAudio(String audioType, String audioFileName) {
        if (audioType.equalsIgnoreCase(VLC)) {
            advancedMusicPlayer.playVlcPlayer(audioFileName);
        } else if (audioType.equalsIgnoreCase(MP4)) {
            advancedMusicPlayer.playMp4Player(audioFileName);
        }
    }

	
}
