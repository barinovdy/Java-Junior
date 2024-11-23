package org.geekbrains.Lesson2.Homework;

//Используя Reflection API, напишите программу,
//которая выводит на экран все методы класса String.

import java.lang.reflect.Method;

public class Homework2 {
    public static void main(String[] args) throws ClassNotFoundException {
        Method[] methods = String.class.getMethods();
        for (Method method : methods) {
            System.out.println("Method: " + method);
        }
    }
}
