package com.example;

import java.util.List;

public class Animal {

    public List<String> getFood(AnimalCategory animalCategory) throws Exception {
        switch (animalCategory){
            case CARNIVORES: return List.of("Meat", "Birds", "Fish");
            case HERBIVORES:  return List.of("Grass", "Grain");
            default: throw new Exception("You should choose either CARNIVORES or HERBIVORES. Будь добр, ёпта, выбери что-нить, ну!");
        }
    }

    public String getFamily() {
        return "We know some animal families: Feline, etc...";
    }
}