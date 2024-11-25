package org.geekbrains.Lesson1.Homework.seminar.common;

import org.geekbrains.Lesson1.Homework.seminar.common.interfaces.Snack;

/**
 * Чипсы
 */
public class Crisps implements Snack {
    @Override
    public boolean getProteins() {
        return false;
    }
    @Override
    public boolean getFats() {
        return true;
    }
    @Override
    public boolean getCarbohydrates() {
        return false;
    }
    @Override
    public String getName() {
        return "Чипсы";
    }
}
