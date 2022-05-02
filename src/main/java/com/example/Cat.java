package com.example;

public class Cat extends Feline {
    private final int kittensCount;

    public Cat() {
        this.kittensCount = 0;
    }

    public Cat(int kittensCount) {
        this.kittensCount = kittensCount;
    }

    public String getSound() {
        return "Meow";
    }

    @Override
    public int getKittensCount() {
        return kittensCount;
    }
}
