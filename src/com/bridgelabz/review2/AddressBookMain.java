package com.bridgelabz.review2;

public class AddressBookMain {
    public static void main(String[] args) {
        AddressBook addressBook1 = new AddressBook();
        System.out.println();
        System.out.println(addressBook1.contact.getName());
        System.out.println(addressBook1.contact.getAge());
        System.out.println(addressBook1.contact.getPhone());
        System.out.println(addressBook1.contact.getCity());
        System.out.println(addressBook1.contact.getState());
    }
}
