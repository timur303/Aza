package org.example.db;

import org.example.entity.Person;
import org.example.util.Util;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class PersonDao {
    private Util util;

    public Person create(Person person) {
        Session session = Util.getSession().openSession();
        session.beginTransaction();
        session.save(person);
        session.getTransaction().commit();
        session.close();
        System.out.println("Person successFully created! ");
        return person;
    }
    public List<Person> getByName(String name,int age){
        Session session = Util.getSession().openSession();
        session.beginTransaction();
        List<Person> personList = session.createQuery("FROM Person  WHERE name =: name and age >: age").
                setParameter("name",name).setParameter("age",age).getResultList();
        session.getTransaction().commit();
        session.close();
        System.out.println("found"+ personList.toString());
        return personList;
    }

    public void deleteByName(String name) {
        Session session = Util.getSession().openSession();
        session.beginTransaction();
        Query query = session.createQuery("DELETE FROM Person WHERE name =:name")
                .setParameter("name",name);
        query.executeUpdate();
        session.getTransaction().commit();
        session.close();
        System.out.println("Successfully deleted Person is " + name);
    }

    public void update(String name, int age){
        Session session = Util.getSession().openSession();
        session.beginTransaction();
        Query query = session.createQuery("UPDATE Person set age=:age WHERE name =:name")
                .setParameter("name",name).setParameter("age",age);
        System.out.println("SuccessFully age changed " + name + " " + age);
        query.executeUpdate();
        session.getTransaction().commit();
        session.close();
    }


}
