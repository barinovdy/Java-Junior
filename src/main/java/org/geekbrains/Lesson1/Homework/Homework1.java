package org.geekbrains.Lesson1.Homework;

//Урок 1. Лямбды и Stream API
//Напишите программу, которая использует Stream API для обработки списка чисел.
//Программа должна вывести на экран среднее значение всех четных чисел в списке.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Homework1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,3,5,2,7,7,9,5,7));

        OptionalDouble average = list.stream().filter(e -> e % 2 == 0).mapToDouble(e -> e).average();
        System.out.println(average.isPresent()? "Среднее всех четных чисел: " + average.getAsDouble() : "Нет четных чисел");
    }
}
