package com.addressbook;
import java.util.Scanner;
public class AddInfo {
    public void addContact(){
        Scanner sc= new Scanner(System.in);
        AddressBook contact=new AddressBook();
        System.out.println("Enter First Name: ");
        String firstname = sc.next();
        System.out.println("Enter last Name: ");
        String lastname = sc.next();
        System.out.println("Enter Address: ");
        String adderss = sc.next();
        System.out.println("Enter City: ");
        String city = sc.next();
        System.out.print("Enter State: ");
        String state = sc.next();
        System.out.print("Enter Zip Code: ");
        int zip = sc.nextInt();
        System.out.print("Enter Pnone Number: ");
        long phoneNumber = sc.nextLong();
        System.out.println("Enter Email: ");
        String email = sc.next();

        contact.setFirstName(firstname);
        contact.setLastName(lastname);
        contact.setAddress(adderss);
        contact.setCity(city);
        contact.setState(state);
        contact.setZip(zip);
        contact.setPhoneNumber(phoneNumber);
        contact.setEmail(email);

        System.out.println(contact.getLastName());
        System.out.println(contact.getFirstName());
        System.out.println(contact.getAddress());
        System.out.println(contact.getCity());
        System.out.println(contact.getState());
        System.out.println(contact.getZip());
        System.out.println(contact.getPhoneNumber());
        System.out.println(contact.getEmail());

    }

}
