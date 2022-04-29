package com.example;

import java.util.List;

public class Cat extends Feline {
    private int kittensCount;

    public Cat(int kittensCount) {
        this.kittensCount = kittensCount;
    }

    public String getSound() {
        return "Meow";
    }

    @Override
    public int getKittens() {
        return kittensCount;
    }
}
