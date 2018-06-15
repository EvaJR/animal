package com.capgemini.animals.model;

public class Mammal extends Animal {


    private boolean warmBlooded;

    public boolean isWarmBlooded() {
        return warmBlooded;
    }

    public void setWarmBlooded(boolean warmBlooded) {
        this.warmBlooded = warmBlooded;
    }

    @Override // good practice
    public void roar() {
        System.out.println("Miauw");
    }

    public void test() {
        System.out.println("test");
    }
}
