package com.example.cat;

import com.example.Cat;
import com.example.Feline;
import org.junit.Test;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class CatTest {

    @Test
    public void catGedFoodLikePredator() throws Exception {
        assertThat(new Cat(0).getFood(), equalTo(asList("Животные", "Птицы", "Рыба")));
    }

}