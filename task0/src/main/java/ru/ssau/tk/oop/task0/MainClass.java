package ru.ssau.tk.oop.task0;

public class MainClass {
    public static void main(String[] args) {
        Person sister = new Person();
        sister.setLastName("Shishova");
        sister.setFirstName("Elena");
        sister.setPassportId(3216450);

        Person brother = new Person();
        brother.setLastName("Shishov");
        brother.setFirstName("Andrey");
        brother.setPassportId(1078645);

        System.out.println(sister.getFirstName() + ' ' + sister.getLastName() + ' ' + sister.getPassportId());
        System.out.println(brother.getFirstName() + ' ' + brother.getLastName() + ' ' + brother.getPassportId());
    }
}
