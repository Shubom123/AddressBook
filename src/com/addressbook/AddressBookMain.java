package com.addressbook;

public class AddressBookMain {
    public static void main(String args[]) {
        System.out.println("Welcome to Address Book");
        AddressBook contact=new AddressBook();
        contact.setFirstName("Shubom");
        System.out.print(contact.getFirstName());
        contact.setLastName("Nath");
        System.out.print(contact.getLastName());
        contact.setAddress("Pasighat, East Siang, Arunachal Pradesh");
        System.out.println(contact.getAddress());
        contact.setCity("Pasighat");
        System.out.print(contact.getCity());
        contact.setState("Arunachal Pradesh");
        System.out.print(contact.getState());
        contact.setZip(791102);
        System.out.print(contact.getZip());
        contact.setPhoneNumber(8288894252L);
        System.out.println(contact.getPhoneNumber());
        contact.setEmail("shubomnath88@gmail.com");
        System.out.println(contact.getEmail());
    }

}
