package org.example;

import org.example.entity.Person;
import org.example.service.Service;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Service service = new Service();
//        service.create(new Person("Timur",18));
//        service.create(new Person("Aza",22));
//        service.create(new Person("Janybek",21));
//        service.create(new Person("Aza",24));
        //_____________________________________________//
        //Аты Аза жана жашы 20дан чон болгон баардык жумушчуларды алыныз.//
//        service.getByName("Aza",20);//
        //_____________________________________________//
        //Аты Аза болгон жумушчулардын жашын 18ге озгортунуз.//
//            service.update("Aza",18);
        //_____________________________________________//
        service.deleteByName("Aza");
    }


}
