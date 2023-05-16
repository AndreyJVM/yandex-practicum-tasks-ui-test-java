package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.List;

public class CatTest extends BaseTest {

    @Test
    public void getSoundReturnsCorrectValue() {
        // Arrange
        Cat cat = new Cat(new Feline());
        String expectedSound = "Мяу";

        // Act
        String actualSound = cat.getSound();

        // Assert
        Assert.assertEquals(expectedSound, actualSound);
    }

    @Mock
    Predator predator;

    @Test
    public void getFoodReturnsCorrectValue() throws Exception {
        // Arrange
        Cat cat = new Cat(new Feline());
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(predator.eatMeat()).thenReturn(expectedFood);

        // Act
        List<String> actualFood = cat.getFood();

        // Assert
        Assert.assertEquals(expectedFood, actualFood);
    }

}

