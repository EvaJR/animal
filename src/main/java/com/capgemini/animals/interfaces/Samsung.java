package com.capgemini.animals.interfaces;

public class Samsung implements Television {

    private boolean on;
    private int currentChannel;
    private int volumeLevel;
    private boolean subtitles;

    @Override
    public void on() {
        System.out.println("I am a Samsung and currently I am switched on");
        this.on = true;

    }

    @Override
    public void off() {
        System.out.println("I am a Samsung and currently I am switched off");
        this.on = false;
    }

    @Override
    public void changeChannel(int newChannel) {
        this.currentChannel = newChannel;
        System.out.println("I am a Samsung and the channel is now " + Integer.toString(currentChannel));

    }

    @Override
    public void changeVolume(int newVolume) {
        this.volumeLevel = newVolume;
        System.out.println("I am a Samsung and the channel is now " + Integer.toString(volumeLevel));

    }

    @Override
    public void toggleSubtitles() {
        this.subtitles = !this.subtitles;
        String result = ( subtitles ) ? "on" : "off"; // ?: is the conditional operator
        System.out.println("I am a Samsung and the subtitles are now " + result);

    }
}
