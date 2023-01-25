package com.bridgelabz.review2;

import java.util.Scanner;
import java.lang.String;


public class AddressBook {
    Contact contact = new Contact();

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    static void addContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Name");
        String name = scanner.next();
        System.out.println("Enter age");
        String age = scanner.next();
        System.out.println("Enter phone");
        String phone = scanner.next();
        System.out.println("Enter city");
        String city = scanner.next();
        System.out.println("Enter state");
        String state = scanner.next();
        Contact contact = new Contact();
        contact.setName();
        contact.setAge();
        contact.setPhone();
        contact.setCity();
        contact.setState();
    }
}