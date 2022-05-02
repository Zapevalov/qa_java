package com.example.lionTypes;

import com.example.Lion;
import com.example.LionSexEnum;
import com.example.exception.NotSuchSexException;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class PersicaTest {

    @Test
    public void getDesc() throws NotSuchSexException {
        assertThat(new Lion(new Persica(), LionSexEnum.MALE).getTypeDescription(),
                equalTo("Имеет заметные пучки шерсти на локтях и на конце хвоста, мощные когти и острые клыки, которыми они " +
                        "перетаскивают добычу по земле. Самцы имеют цвет от желтовато-оранжевого до темно-коричневого, " +
                                "львицы песочные или коричнево-желтоватые. Грива львов темного цвета, редко черная, короче, " +
                                "чем у африканского льва."));
    }

    @Test
    public void getAverageWeight() throws NotSuchSexException {
        assertThat(new Lion(new Persica(), LionSexEnum.FEMALE).getAverageWeight(),
                equalTo(170d));
    }

    @Test
    public void getLatinName() throws NotSuchSexException {
        assertThat(new Lion(new Persica(), LionSexEnum.FEMALE).getLatinName(), equalTo("Panthera leo persica"));
    }


}