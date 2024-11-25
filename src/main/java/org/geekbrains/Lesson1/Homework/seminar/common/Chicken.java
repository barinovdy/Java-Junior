package org.geekbrains.Lesson1.Homework.seminar.common;

import org.geekbrains.Lesson1.Homework.seminar.common.interfaces.HealthyFood;

/**
 * Курица
 */
public class Chicken implements HealthyFood {
    @Override
    public boolean getProteins() {
        return true;
    }
    @Override
    public boolean getFats() {
        return false;
    }
    @Override
    public boolean getCarbohydrates() {
        return false;
    }
    @Override
    public String getName() {
        return "Курица";
    }
}
