package com.jse.tutorials.design_patterns.structural.adapter;

public class VLCPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVLC(String fileName) {
        System.out.println("play VLC file: " + fileName);
    }

    @Override
    public void playMP4(String fileName) {}
}
