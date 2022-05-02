package com.example;

import java.util.List;

public class Animal {

    public List<String> getFood(AnimalCategory animalCategory){
        if (animalCategory == AnimalCategory.HERBIVORES) {
            return List.of("Grass", "Grain");
        }
        return List.of("Meat", "Birds", "Fish");
    }

    public String getFamily() {
        return "We know some animal families: Feline, etc...";
    }
}