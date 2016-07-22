package com.jse.tutorials.design_patterns.structural.adapter;

public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;
    
    public MediaAdapter(String audioType) {
        if ("VLC".equalsIgnoreCase(audioType)) {
            advancedMediaPlayer = new VLCPlayer();
        } else if ("MP4".equalsIgnoreCase(audioType)) {
            advancedMediaPlayer = new MP4Player();
        }
    }
    
    @Override
    public void play(String audioType, String fileName) {
        if ("VLC".equalsIgnoreCase(audioType)) {
            advancedMediaPlayer.playVLC(fileName);
        } else if ("MP4".equalsIgnoreCase(audioType)) {
            advancedMediaPlayer.playMP4(fileName);
        }
    }
}
