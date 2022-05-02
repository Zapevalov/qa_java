package com.example;

import com.example.exception.NotSuchSexException;
import com.example.lionTypes.Bleyenberghi;
import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(DataProviderRunner.class)
public class LionTest {
    @Test
    public void lionIsFeline() {
        assertThat(new Lion().getFamily(), equalTo("Feline"));
    }

    @Test
    public void lionEatsOnlyAnimalFood() {
        assertThat(new Lion().getBasicDiet(), equalTo(List.of("Meat", "Birds", "Fish")));
    }

    @Test
    public void maleLionHasMane() throws NotSuchSexException {
        var lion = new Lion(new Bleyenberghi(), LionSexEnum.MALE);
        assertThat(lion.hasMane(), equalTo(true));
    }

    @Test
    public void femaleLionDoesNotHaveMane() throws NotSuchSexException {
        var lion = new Lion(new Bleyenberghi(), LionSexEnum.FEMALE);
        assertThat(lion.hasMane(), equalTo(false));
    }

    @Test
    public void getKittens() throws NotSuchSexException {
        var lion = new Lion(new Bleyenberghi(), LionSexEnum.FEMALE, 3);
        assertThat(lion.getKittensCount(), equalTo(3));
    }

    @Test(expected = NotSuchSexException.class)
    public void testLionSexException() throws NotSuchSexException {
        new Lion(new Bleyenberghi(), LionSexEnum.TRANS);
    }

    @DataProvider
    public static Object[][] sex() {
        return new Object[][]{
                {LionSexEnum.MALE, true},
                {LionSexEnum.FEMALE, false},
        };
    }

    @Test
    @UseDataProvider("sex")
    public void testLionSex(LionSexEnum lionSex, boolean isMane) throws NotSuchSexException {
        assertThat(new Lion(new Bleyenberghi(), lionSex).hasMane(), equalTo(isMane));
    }
}