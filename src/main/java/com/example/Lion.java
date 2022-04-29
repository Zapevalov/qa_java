package com.example;

import com.example.lionTypes.ILionType;

public class Lion extends Feline {
    private ILionType lionType;
    private boolean hasMane;
    private int kittens;


    public Lion(ILionType lionType, LionSexEnum sex) throws Exception  {
        this.lionType = lionType;

        switch (sex){
            case MALE: hasMane = true; break;
            case FEMALE: hasMane = false; break;
            default:  throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    public Lion(ILionType lionType, LionSexEnum sex, int kittens) throws Exception  {
      this(lionType, sex);
      this.kittens = kittens;
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    @Override
    public int getKittens() {
        return kittens;
    }
}
