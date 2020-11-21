package ru.ssau.tk.oop.task0;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PersonTest {

    @Test
    public void testTestToString() {
        Person human = new Person("Ivan", "Ivanov", 862495137);
        Person npvfb = new Person("Yuri", "Kuzmin", 753912684);

        assertEquals(human.toString(), "Ivan Ivanov");
        assertEquals(npvfb.toString(), "Yuri Kuzmin");
        npvfb.setLastName("");
        assertEquals(npvfb.toString(), "Yuri");
        human.setFirstName("");
        human.setLastName("");
        assertEquals(human.toString(), "");
    }
}