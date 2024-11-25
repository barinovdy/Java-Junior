package org.geekbrains.Lesson3.Homework.Task1;

//Задание 1: Создайте класс Person с полями name и age.
// Реализуйте сериализацию и десериализацию этого класса в файл.

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person = new Person("Vasia", 34);
        String filename = ".\\src\\main\\java\\org\\geekbrains\\Lesson3\\Homework\\Task1\\person.txt";

        System.out.println(person);

        try (FileOutputStream fileOutputStream = new FileOutputStream(filename);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)){
            objectOutputStream.writeObject(person);
            System.out.println("Объект person сериализован");
        }

        Person personSer;

        try (FileInputStream fileInputStream = new FileInputStream(filename);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)){
            personSer = (Person)objectInputStream.readObject();
            System.out.println("Объект person десериализован");

        }

        System.out.println(personSer);
    }
}
