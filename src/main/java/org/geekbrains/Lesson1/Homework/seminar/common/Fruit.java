package org.geekbrains.Lesson1.Homework.seminar.common;

import org.geekbrains.Lesson1.Homework.seminar.common.interfaces.HealthyFood;

/**
 * Фрукт
 */
public class Fruit implements HealthyFood {
    @Override
    public boolean getProteins() {
        return false;
    }
    @Override
    public boolean getFats() {
        return false;
    }
    @Override
    public boolean getCarbohydrates() {
        return true;
    }
    @Override
    public String getName() {
        return "Фрукт";
    }
}
