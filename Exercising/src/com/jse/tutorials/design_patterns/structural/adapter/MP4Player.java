package com.jse.tutorials.design_patterns.structural.adapter;

public class MP4Player implements AdvancedMediaPlayer {
    @Override
    public void playVLC(String fileName) {}

    @Override
    public void playMP4(String fileName) {
        System.out.println("play MP4 file: " + fileName);
    }
}
