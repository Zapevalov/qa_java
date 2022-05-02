package com.example;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(DataProviderRunner.class)
public class AnimalTest {

    @DataProvider
    public static Object[][] animalCategory() {
        return new Object[][]{
                {AnimalCategory.CARNIVORES, List.of("Meat", "Birds", "Fish")},
                {AnimalCategory.HERBIVORES, List.of("Grass", "Grain")},
        };
    }

    @Test
    @UseDataProvider("animalCategory")
    public void getFood(AnimalCategory animalCategory, List<String> list) {
        assertThat(new Animal().getFood(animalCategory), equalTo(list));
    }

    @Test
    public void getFamily() {
        assertThat(new Animal().getFamily(), equalTo("We know some animal families: Feline, etc..."));
    }
}