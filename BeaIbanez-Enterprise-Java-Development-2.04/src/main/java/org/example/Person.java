package org.example;

public class Person {

    private int id;
    private String name;
    private int age;
    private String occupation;

    public Person(int id, String name, int age, String occupation) throws Exception {
        setName(name);
        setAge(age);
        setId(id);
        setOccupation(occupation);
    }

    public Person() {

    }

    public Person(int i, String name, int age) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {

        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        if (age< 0) {
            try {
                throw new Exception("La edad tiene que ser mayor que 0");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }else{
            System.out.println(age+" years");
    }}

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }



}
