package org.geekbrains.Lesson4.Homework;

//Задание: Настройте связь между вашим приложением и базой данных MySQL с использованием Hibernate.
//Создайте несколько объектов Person и сохраните их в базу данных.


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        try(SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Person.class)
                .buildSessionFactory()) {

            Session session = sessionFactory.getCurrentSession();

            session.beginTransaction();

            session.save(new Person( "Ksenia", 30));
            session.save(new Person( "Viktor", 41));
            session.save(new Person( "Ilia", 23));

            System.out.println("Persons added");

            session.getTransaction().commit();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
