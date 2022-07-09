package org.example;

import java.util.ArrayList;
import java.util.List;

public class PersonsList {

    List<Person> personList = new ArrayList<>();

    //EJERCICIO 2
    public Person findByName(String name) {
        Person person = new Person();

        name.matches("[A-Z][a-zA-Z]+\s+[A-Z][a-zA-Z]*");

        try {
            if (name.matches("[A-Z][a-zA-Z]+\s+[A-Z][a-zA-Z]*")) {
                for (int i = 0; i < personList.size(); i++) {
                    if (name.equals(personList.get(i).getName())) {
                        person = personList.get(i);
                    }
                }

            } else

                throw new Exception("el formato de nombre no es correcto");
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }


        return person;
    }

    public Person clone(Person person) throws CloneNotSupportedException{
    return new Person (person.getId()+1,person.getName(), person.getAge());



    }

}

