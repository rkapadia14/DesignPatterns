package com.poc.designpattern.adapter;

public class AdapterDesignPatternDemo {
	
	 public static void main(String[] args) {
		 
	        AudioPlayer audioPlayer = new AudioPlayer();
	        audioPlayer.playAudio("mp3", "Audio1.mp3");
	        audioPlayer.playAudio("mp4", "Audio2.mp4");
	        audioPlayer.playAudio("avi", "Audio3.avi");
	        audioPlayer.playAudio("vlc", "Audio4.vlc");
	    }  

}
