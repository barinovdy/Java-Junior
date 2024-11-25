package org.geekbrains.Lesson1.Classwork.common;


import org.geekbrains.Lesson1.Classwork.common.interfaces.SemiFinishedFood;

/**
 * Замороженные ягоды
 */
public class DumplingsBerries implements SemiFinishedFood {
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
        return "Замороженные ягоды";
    }
}
