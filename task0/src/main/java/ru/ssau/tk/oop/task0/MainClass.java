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

        Person friend = new Person();
        friend.setFirstName("Marina");
        friend.setLastName("Kolebanova");
        friend.setPassportId(777456777);

        System.out.println(friend.getFirstName() + ' ' + friend.getLastName() + ' ' + friend.getPassportId());

        Person myBestFriend = new Person("Karina", "Myshibanova");
        System.out.println(myBestFriend.getFirstName() + ' ' + myBestFriend.getLastName());

        Person actor = new Person(789654);
        actor.setLastName("Depp");
        actor.setFirstName("Johnny");
        System.out.println(actor.getFirstName() + ' ' + actor.getLastName() + ' ' + actor.getPassportId());

        Person singer = new Person("Sergei", "ATL", 321456111);
        System.out.println(singer.getFirstName() + ' ' + singer.getLastName() + ' ' + singer.getPassportId());
    }
}
