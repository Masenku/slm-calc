package com.example.slmcalc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorControllerTest {

    private CalculatorController calculatorController = new CalculatorController();

    @Test
    public void sumTest1() {
        //Arrange
        int a = 6;
        int b = 11;

        // Act
        int result = calculatorController.sum(a, b);

        //Assert
        assertEquals(17, result);
    }

    @Test
    public void sumTest2() {
        //Arrange
        int a = 29;
        int b = -4;

        // Act
        int result = calculatorController.sum(a, b);

        //Assert
        assertEquals(25, result);
    }

    @Test
    public void sumTest3() {
        //Arrange
        int a = -5;
        int b = -4;

        // Act
        int result = calculatorController.sum(a, b);

        //Assert
        assertEquals(-9, result);
    }
}