package org.example;

import java.sql.Array;
import java.util.ArrayList;

public class Main {



    public static void main(String[] args) throws Exception {

        Person person = new Person(2, "Bea Ibanez",90, "Teacher");

        PersonsList personList1 = new PersonsList();
        personList1.findByName("Bea Ibanez");


//EJERCICIO 2
        var personList = new ArrayList<Person>(5);
        personList.add(new Person(10, "Albert Garcia", 2, "Teacher"));
        personList.add(new Person(1, "Soraya Sanchez", 2, "Teacher"));
        personList.add(new Person(14, "Ruben Dario", 2, "Teacher"));
        personList.add(new Person(19, "Salvatore Corsario", 2, "Teacher"));
        personList.add(new Person(9, "Trixi Ibanez", 2, "Teacher"));



//EJERCICIO 3
        Person person2=new Person(12, "Albert Garcia", 2, "Teacher");
        PersonsList personListClass= new PersonsList();
        Person person3= personListClass.clone(person2);

        System.out.println(person2.getId() );
        System.out.println(person3.getId() );


//EJERCICIO 4


    }

    public static void writeToFile(FileWriter){

    }
}