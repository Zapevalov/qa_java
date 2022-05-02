package com.example.lionTypes;

import com.example.Lion;
import com.example.LionSexEnum;
import com.example.exception.NotSuchSexException;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class BleyenberghiTest {

    @Test
    public void getDesc() throws NotSuchSexException {
        assertThat(new Lion(new Bleyenberghi(), LionSexEnum.MALE).getTypeDescription(),
                equalTo("Встречается в западной Замбии и Зимбабве, Анголе, Заире, Намибии и северной Ботсване. " +
                        "Эти львы являются одними из крупнейших среди всех видов львов. Самцы весят около 140–242 кг, " +
                                "самки около 105–170 кг. Гривы у самцов светлее, чем у других подвидов."));
    }

    @Test
    public void getAverageWeight() throws NotSuchSexException {
        assertThat(new Lion(new Bleyenberghi(), LionSexEnum.FEMALE).getAverageWeight(),
                equalTo(200d));
    }

    @Test
    public void getLatinName() throws NotSuchSexException {
        assertThat(new Lion(new Bleyenberghi(), LionSexEnum.FEMALE).getLatinName(), equalTo("Leo Bleyenberghi"));
    }


}