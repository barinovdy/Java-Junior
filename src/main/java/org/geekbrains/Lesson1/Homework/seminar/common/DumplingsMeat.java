package org.geekbrains.Lesson1.Homework.seminar.common;

import org.geekbrains.Lesson1.Homework.seminar.common.interfaces.SemiFinishedFood;

/**
 * Пельмени
 */
public class DumplingsMeat implements SemiFinishedFood {
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
        return "Пельмени";
    }
}
