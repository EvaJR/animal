package com.capgemini.animals.interfaces;

public class InterfaceApp {
    public static void main(String[] args) {
        Television v = new Samsung();
        Samsung s = new Samsung();

        v.on();
        v.off();
        v.changeChannel(5);
        v.toggleSubtitles();

        TelevisionSwitcher switcher = new TelevisionSwitcher();
        switcher.switchOn(v);
        switcher.switchOn(s);
    }
}
