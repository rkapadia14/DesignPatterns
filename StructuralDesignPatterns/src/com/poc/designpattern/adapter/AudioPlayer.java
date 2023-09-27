package com.poc.designpattern.adapter;


public class AudioPlayer implements MediaPlayer{

	private AudioMediaAdapter mediaAdapter;
	
	@Override
	public void playAudio(String audioType, String audioFileName) {
		// TODO Auto-generated method stub
		//the mp3 format is supported by AudioPlayer itself and it doesn't need adapter here.
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file: " + audioFileName);
        }
        //to support other formats, we will need the MediaAdapter
        else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new AudioMediaAdapter(audioType);
            mediaAdapter.playAudio(audioType, audioFileName);
        } else {
            System.out.println("The given format: " + audioType + " is not supported");
        }
		
	}

}
