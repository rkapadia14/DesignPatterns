package com.poc.designpattern.adapter;

public class VlcMediaPlayerDemo implements AdvancedMediaPlayer{
	 @Override
	    public void playVlcPlayer(String audioFileName) {
	        System.out.println("Playing Audio Music file " + audioFileName + " with VLC Media Player");
	    }

	    @Override
	    public void playMp4Player(String fileName) {
	        //no implementation for Mp4 Player
	    }
}
