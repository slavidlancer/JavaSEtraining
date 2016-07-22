package com.jse.tutorials.design_patterns.structural.adapter;

public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;
    
    @Override
    public void play(String audioType, String fileName) {
        if ("MP3".equalsIgnoreCase(audioType)) {
            System.out.println("play mp3 file: " + fileName);
        } else if ("VLC".equalsIgnoreCase(audioType) ||
                "MP4".equalsIgnoreCase(audioType)) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("invalid media (" + audioType +
                    ") - not supported");
        }
    }
}
