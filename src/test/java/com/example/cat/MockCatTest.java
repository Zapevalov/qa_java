package com.example.cat;


import com.example.Cat;
import com.example.Feline;
import org.hamcrest.MatcherAssert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class MockCatTest {
    @Mock
    Feline feline;

    @Test
    public void catGetFoodLikePredatorMock() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(asList("1", "2", "3"));
        MatcherAssert.assertThat(new Cat(feline).getFood(), equalTo(asList("1", "2", "3")));
    }

    @Test
    public void catMeows() {
        assertThat(new Cat(feline).getSound(), equalTo("Meow"));
    }
}
