package com.example;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class CatTest {

    @Test
    public void catEatAnimalFood() {
        assertThat(new Cat().getBasicDiet(), equalTo(List.of("Meat", "Birds", "Fish")));
    }

    @Test
    public void catIsFeline() {assertThat(new Lion().getFamily(), equalTo("Feline"));}

    @Test
    public void catMeows() { assertThat(new Cat().getSound(), equalTo("Meow"));}

    @Test
    public void catHasFiveKittens() {
        assertThat(new Cat(5).getKittensCount(), equalTo(5));
    }
}