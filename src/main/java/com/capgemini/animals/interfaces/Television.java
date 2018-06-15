package com.capgemini.animals.interfaces;

public interface Television { // AN interface is a 100% abstract class (and it is not a class)
    void on();
    void off();

    void changeChannel(int newChannel);
    void changeVolume(int newVolume);

    void toggleSubtitles();
}
