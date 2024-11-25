package org.geekbrains.Lesson3.Homework.Task2;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Serializer {
    public static final String FILE_JSON = ".\\src\\main\\java\\org\\geekbrains\\Lesson3\\Homework\\Task2\\person.json";
    public static final String FILE_BIN = ".\\src\\main\\java\\org\\geekbrains\\Lesson3\\Homework\\Task2\\person.bin";
    public static final String FILE_XML = ".\\src\\main\\java\\org\\geekbrains\\Lesson3\\Homework\\Task2\\person.xml";

    private static final ObjectMapper objectMapper = new ObjectMapper();
    private static final XmlMapper xmlMapper = new XmlMapper();

    public static void addNewPerson(Scanner scanner, List<Person> personList) {
        System.out.println("Введите имя:");
        String newPersonName = scanner.nextLine();
        System.out.println("Введите возраст:");
        int newPersonAge = Integer.parseInt(scanner.nextLine());

        personList.add(new Person(newPersonName, newPersonAge));
        savePersonToFile(FILE_JSON, personList);
        savePersonToFile(FILE_BIN, personList);
        savePersonToFile(FILE_XML, personList);
        System.out.println("Новая персона добавлена.");
    }

    public static void modifyPerson(Scanner scanner, List<Person> personList) {
        System.out.println("Введите имя персоны для изменения данных:");
        String personName = scanner.nextLine();
        System.out.println("Введите новый возраст:");
        int newPersonAge = Integer.parseInt(scanner.nextLine());
        for (Person person : personList) {
            if (person.getName().equals(personName)) {
                person.setAge(newPersonAge);
            }
        }
        savePersonToFile(FILE_JSON, personList);
        savePersonToFile(FILE_BIN, personList);
        savePersonToFile(FILE_XML, personList);
        System.out.println("Персона изменена.");
    }
    public static void deletePerson(Scanner scanner, List<Person> personList) {
        System.out.println("Введите имя удаляемой персоны:");
        String personName = scanner.nextLine();
        Iterator<Person> personListIterator = personList.iterator();
        while (personListIterator.hasNext()) {
            Person personNext = personListIterator.next();
            if (personNext.getName().equals(personName)) {
            personListIterator.remove();
            }
        }
        savePersonToFile(FILE_JSON, personList);
        savePersonToFile(FILE_BIN, personList);
        savePersonToFile(FILE_XML, personList);
        System.out.println("Персона удалена.");
    }

    public static void savePersonToFile(String fileName, List<Person> personList) {
        try {
            if (fileName.endsWith(".json")) {
                objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
                objectMapper.writeValue(new File(fileName), personList);
            } else if (fileName.endsWith(".bin")) {
                try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
                    oos.writeObject(personList);
                }
            } else if (fileName.endsWith(".xml")) {
                xmlMapper.writeValue(new File(fileName), personList);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Person> loadPersonFromFile(String fileName) {
        List<Person> personList = new ArrayList<>();

        File file = new File(fileName);
        if (file.exists()) {
            try {
                if (fileName.endsWith(".json")) {
                    personList = objectMapper.readValue(file, objectMapper.getTypeFactory().constructCollectionType(List.class, Person.class));
                } else if (fileName.endsWith(".bin")) {
                    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                        personList = (List<Person>)ois.readObject();
                    }
                } else if (fileName.endsWith(".xml")) {
                    personList = xmlMapper.readValue(file, xmlMapper.getTypeFactory().constructCollectionType(List.class, Person.class));
                }
            } catch (IOException | ClassNotFoundException e) { e.printStackTrace(); }
        }
        personList.stream().forEach(System.out::println);
        return personList;
    }
}
