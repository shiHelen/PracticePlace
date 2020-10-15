package ru.ssau.tk.oop.task0;

import java.util.Date;

public class Person {

    private String firstName;
    private String lastName;
    private int passportId;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassportId(int passportId) {
        this.passportId = passportId;
    }

    public int getPassportId() {
        return passportId;
    }
}
