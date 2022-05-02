package com.example.exception;

public class NotSuchSexException extends Exception {
    private final static String MESSAGE = "Используйте допустимые значения пола животного - самец или самка";

    public NotSuchSexException() {
        super(MESSAGE);
    }
}
