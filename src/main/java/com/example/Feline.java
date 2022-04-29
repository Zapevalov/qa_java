package com.example;

import java.util.List;

public abstract class Feline extends Animal implements Predator {
    @Override
    public String getFamily() {
        return "Feline";
    }

    public List<String> getFood() throws Exception {
        return super.getFood(AnimalCategory.CARNIVORES);
    }

    public abstract int getKittens();
}
