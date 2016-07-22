package com.jse.tutorials.design_patterns.structural.adapter;

public class AdapterPattern {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        
        audioPlayer.play("mp3", "music.mp3");
        audioPlayer.play("vlc", "video.vlc");
        audioPlayer.play("mp4", "video.mp4");
        audioPlayer.play("avi", "video.avi");
    }
}
