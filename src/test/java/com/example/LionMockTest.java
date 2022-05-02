package com.example;

import com.example.exception.NotSuchSexException;
import com.example.lionTypes.ILionType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static com.example.LionSexEnum.MALE;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class LionMockTest {
    @Mock
    ILionType lionType;


    @Test
    public void test() throws NotSuchSexException {
        Mockito.when(lionType.getLatinName()).thenReturn("Latin Name");
        assertThat(new Lion(lionType, MALE).getLatinName(), equalTo("Latin Name"));
    }

}
