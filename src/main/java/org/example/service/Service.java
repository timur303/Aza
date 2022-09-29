package org.example.service;
import org.example.db.PersonDao;
import org.example.entity.Person;
import java.util.List;

public class Service {

    private PersonDao personDao = new PersonDao();

    public Person create(Person person){
        return personDao.create(person);
    }
    public List<Person> getByName(String name,int age){
        return personDao.getByName(name,age);
    }
    public void update(String name,int age){
        personDao.update(name,age);
    }
    public void deleteByName(String name){
        personDao.deleteByName(name);
    }

}
