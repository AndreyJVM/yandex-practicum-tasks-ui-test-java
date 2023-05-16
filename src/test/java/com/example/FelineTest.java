package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineTest {

    @Test
    public void eatMeatReturnsCorrectValue() throws Exception {
        // Arrange
        Feline feline = new Feline();
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");

        // Act
        List<String> actualFood = feline.eatMeat();

        // Assert
        Assert.assertEquals(expectedFood, actualFood);
    }

    @Test
    public void getFamilyReturnsCorrectValue() {
        // Arrange
        Feline feline = new Feline();
        String expectedFamily = "Кошачьи";

        // Act
        String actualFamily = feline.getFamily();

        // Assert
        Assert.assertEquals(expectedFamily, actualFamily);
    }

    @Test
    public void getKittensReturnsCorrectMethod() {
        // Arrange
        Feline feline = new Feline();
        int expectedCount = 1;

        // Act
        int actualCount = feline.getKittens();

        // Assert
        Assert.assertEquals(expectedCount, actualCount);
    }

    @Test
    public void getKittensReturnsCorrectValue() {
        // Arrange
        Feline feline = new Feline();
        int expectedCount = 2;

        // Act
        int actualCount = feline.getKittens(expectedCount);

        // Assert
        Assert.assertEquals(expectedCount, actualCount);
    }
}
