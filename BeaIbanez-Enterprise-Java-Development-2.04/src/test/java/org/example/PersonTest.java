package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    private Person person = new Person(12, "Bea Ibanez", -90, "Teacher");

    PersonTest() throws Exception {
    }

    @Test
    void set_age_ok() {
        Exception exception = assertThrows(RuntimeException.class, () -> {
            person.setAge(60);
       } );
    }

    @Test
    void set_age_nook() {
        Exception exception = assertThrows(RuntimeException.class, () -> {
            person.setAge(-3);
        } );
    }


}