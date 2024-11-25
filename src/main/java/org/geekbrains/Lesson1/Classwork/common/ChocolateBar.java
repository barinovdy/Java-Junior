package org.geekbrains.Lesson1.Classwork.common;


import org.geekbrains.Lesson1.Classwork.common.interfaces.Snack;

/**
 * Шоколадка
 */
public class ChocolateBar implements Snack {
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
        return "Шоколадный батончик";
    }
}
