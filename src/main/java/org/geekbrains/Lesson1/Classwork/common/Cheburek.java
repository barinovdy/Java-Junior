package org.geekbrains.Lesson1.Classwork.common;


import org.geekbrains.Lesson1.Classwork.common.interfaces.SemiFinishedFood;

/**
 * Чебурек
 */
public class Cheburek implements SemiFinishedFood {
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
        return "Чебурек";
    }
}
