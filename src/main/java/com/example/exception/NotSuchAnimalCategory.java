package com.example.exception;

public class NotSuchAnimalCategory extends Exception{
    private final static String MESSAGE = "You should choose either CARNIVORES or HERBIVORES. Будь добр, ёпта, выбери что-нить нормальное, ну!";

    public NotSuchAnimalCategory() {
        super(MESSAGE);
    }
}
