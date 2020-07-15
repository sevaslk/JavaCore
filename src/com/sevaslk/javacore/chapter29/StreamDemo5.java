package com.sevaslk.javacore.chapter29;

import java.util.ArrayList;
import java.util.stream.Stream;

class NamePhoneEmail {
    String name;
    String phone;
    String email;

    NamePhoneEmail(String n, String p, String e) {
        name = n;
        phone = p;
        email = e;
    }
}

class NamePhone {
    String name;
    String phone;

    public NamePhone(String n, String p) {
        name = n;
        phone = p;
    }
}

class StreamDemo5 {
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail("Ларри", "555-5555", "Larry@qewry.com"));
        myList.add(new NamePhoneEmail("Джеймс", "555-4444", "James@qewry.com"));
        myList.add(new NamePhoneEmail("Мэри", "555-3333", "Mary@qewry.com"));

        System.out.println("Исходные элементы из списка myList: ");
        myList.stream().forEach(a -> System.out.println(a.name + " " + a.phone + " " + a.email));
        System.out.println();

        Stream<NamePhone> nameAndPhone = myList.stream().map(a -> new NamePhone(a.name, a.phone));
        System.out.println("Список имен и номеров телефонов: ");
        nameAndPhone.forEach(a -> System.out.println(a.name + " " + a.phone));
    }
}
