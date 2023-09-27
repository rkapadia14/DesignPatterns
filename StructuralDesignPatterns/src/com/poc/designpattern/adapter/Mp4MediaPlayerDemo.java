package com.poc.designpattern.adapter;

public class Mp4MediaPlayerDemo implements AdvancedMediaPlayer{
	 @Override
	    public void playVlcPlayer(String audioFileName) {
		 //no implementation for VLC Media Player
	    }

	    @Override
	    public void playMp4Player(String audioFileName) {
	        System.out.println("Playing Audio Music file " + audioFileName + " with MP4 Media Player");
	    }
}
