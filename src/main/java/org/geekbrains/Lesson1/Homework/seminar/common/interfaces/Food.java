package org.geekbrains.Lesson1.Homework.seminar.common.interfaces;

/**
 *  Еда
 */
public interface Food extends Thing {

    /**
     *  Получить наличие протеинов в еде
     * @return Наличие протеинов
     */
    boolean getProteins();
    /**
     *  Получить наличие жиров в еде
     * @return Наличие жиров
     */
    boolean getFats();
    /**
     *  Получить наличие углеводов в еде
     * @return Наличие углеводов
     */
    boolean getCarbohydrates();
}
