package org.geekbrains.Lesson3.Homework.Task2;

//Задание 2: Используя JPA, создайте базу данных для хранения
// объектов класса Person. Реализуйте методы для добавления,
// обновления и удаления объектов Person.

import org.geekbrains.Lesson1.Classwork.common.interfaces.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static org.geekbrains.Lesson3.Homework.Task2.Serializer.*;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        List<Person> personList = new ArrayList<>(Arrays.asList(
//                new Person("Viktor", 32),
//                new Person("Maria", 24),
//                new Person("Ivan", 29)));
//        //Сериализация
//        System.out.println("Сериализация");
//        savePersonToFile(FILE_JSON, personList);
//        savePersonToFile(FILE_BIN, personList);
//        savePersonToFile(FILE_XML, personList);

        //Десериализация
        System.out.println("Десериализация");
        System.out.println("JSON file");
        loadPersonFromFile(FILE_JSON);
        System.out.println("BIN file");
        List<Person> personList = loadPersonFromFile(FILE_BIN);
        System.out.println("XML file");
        loadPersonFromFile(FILE_XML);

        while (true) {
            System.out.println("========================================================================");
            System.out.println("0 - Завершение работы приложения");
            System.out.println("1 - Отобразить список персон");
            System.out.println("2 - Добавить новую персону");
            System.out.println("3 - Изменить персону");
            System.out.println("4 - Удалить персону");
            System.out.println("Выберите пункт меню: ");

            if (scanner.hasNextInt()) {
                int no = scanner.nextInt();
                scanner.nextLine();

                switch (no) {
                    case 0 -> {
                        System.out.println("Завершение работы приложения.");
                        //Сериализация
                        System.out.println("Сериализация");
                        savePersonToFile(FILE_JSON, personList);
                        savePersonToFile(FILE_BIN, personList);
                        savePersonToFile(FILE_XML, personList);
                        System.exit(0);
                    }
                    case 1 -> {
                        System.out.println("Список персон:");
                        //Десериализация
                        System.out.println("Десериализация");
                        System.out.println("JSON file");
                        loadPersonFromFile(FILE_JSON);
                        System.out.println("BIN file");
                        loadPersonFromFile(FILE_BIN);
                        System.out.println("XML file");
                        loadPersonFromFile(FILE_XML);
                        //System.out.println(personList);
                    }
                    case 2 -> addNewPerson(scanner, personList);
                    case 3 -> modifyPerson(scanner, personList);
                    case 4 -> deletePerson(scanner, personList);
                    default -> System.out.println("Пункт меню не существует.\nПожалуйста, повторите попытку ввода.");
                }

            } else {
                System.out.println("Некорректный пункт меню.\nПожалуйста, повторите попытку ввода.");
                scanner.nextLine();
            }
        }
    }
}
