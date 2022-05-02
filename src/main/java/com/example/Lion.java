package com.example;

import com.example.exception.NotSuchSexException;
import com.example.lionTypes.Bleyenberghi;
import com.example.lionTypes.ILionType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Lion extends Feline {
    private final Logger logger = LogManager.getLogger(this.getClass());

    private ILionType lionType;
    private boolean hasMane;
    private int kittensCount;

    public Lion() {
        this.lionType = new Bleyenberghi();
        this.hasMane =  true;
        this.kittensCount = 0;
    }

    public Lion(ILionType lionType, LionSexEnum sex) throws NotSuchSexException  {
        this.lionType = lionType;

        switch (sex){
            case MALE: hasMane = true; break;
            case FEMALE: hasMane = false; break;
            default: {
                logger.debug(String.format("Sex %s is not exist", sex));
                throw new NotSuchSexException();
            }
        }
    }

    public Lion(ILionType lionType, LionSexEnum sex, int kittensCount) throws NotSuchSexException  {
      this(lionType, sex);
      this.kittensCount = kittensCount;
    }

    public boolean hasMane() {
        return hasMane;
    }

    @Override
    public int getKittensCount() {
        return kittensCount;
    }

    public String getTypeDescription(){
        return lionType.getDesc();
    }

    public double getAverageWeight(){
        return lionType.getAverageWeight();
    }

    public String getLatinName(){return lionType.getLatinName();}
}
