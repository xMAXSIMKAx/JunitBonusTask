package org.example.app.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest {

    @Test
    public void testGetResWithPositiveSales() {
        // Підготовка
        double sales = 1000.0;
        BonusService bonusService = new BonusService();

        // Виконання
        String result = bonusService.getRes(sales);

        // Перевірка
        assertEquals("100,00", result);
    }

    @Test
    public void testGetResWithZeroSales() {
        // Підготовка
        double sales = 0.0;
        BonusService bonusService = new BonusService();

        // Виконання
        String result = bonusService.getRes(sales);

        // Перевірка
        assertEquals("Incorrect value!", result);
    }

    @Test
    public void testCalcBonus() {
        // Підготовка
        double sales = 1000.0;
        BonusService bonusService = new BonusService();

        // Виконання
        double result = bonusService.calcBonus(sales);

        // Перевірка
        assertEquals(100.0, result);
    }

    @Test
    public void testCalcBonusWithUnexpectedResult() {
        // Підготовка
        double sales = 500.0; // Припускаючи, що ставка бонусу - 10%, очікуваний бонус повинен бути 50.0
        BonusService bonusService = new BonusService();

        // Виконання
        double result = bonusService.calcBonus(sales);

        // Перевірка
        assertEquals(50.0, result, 0.001); // Допустима різниця для порівняння double
    }
}