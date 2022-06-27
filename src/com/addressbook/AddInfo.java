package com.addressbook;
import java.util.Scanner;
import java.util.ArrayList;
public class AddInfo {
    AddressBook contact=new AddressBook();
    ArrayList<AddressBook> array = new ArrayList<AddressBook>();
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
        array.add(contact);

        System.out.println(contact.getLastName());
        System.out.println(contact.getFirstName());
        System.out.println(contact.getAddress());
        System.out.println(contact.getCity());
        System.out.println(contact.getState());
        System.out.println(contact.getZip());
        System.out.println(contact.getPhoneNumber());
        System.out.println(contact.getEmail());


    }
    public void editPerson(){
        System.out.println("Enter First name: ");
        Scanner sc1 = new Scanner(System.in);
        String firstName = sc1.next();
        if(firstName.equals(contact.getFirstName())){
            System.out.println("\nChoose attribute you want to change:");
            System.out.println("1.First Name\n2.Last Name\n3.Address\n4.City\n5.State\n6.ZipCode\n7.Phone Number\n8.Email");
            int choice = sc1.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter the correct first Name :");
                    firstName = sc1.next();
                    contact.setFirstName(firstName);
                    break;
                case 2:
                    System.out.println("Enter the correct Last Name :");
                    String lastName = sc1.next();
                    contact.setLastName(lastName);
                    break;
                case 3:
                    System.out.println("Enter the correct Address :");
                    String address = sc1.next();
                    contact.setAddress(address);
                    break;
                case 4:
                    System.out.println("Enter the correct City :");
                    String city = sc1.next();
                    contact.setCity(city);
                    break;
                case 5:
                    System.out.println("Enter the correct State :");
                    String state = sc1.next();
                    contact.setState(state);
                    break;
                case 6:
                    System.out.println("Enter the correct Zip Code :");
                    int zip = sc1.nextInt();
                    contact.setZip(zip);
                    break;
                case 7:
                    System.out.println("Enter the correct Phone Number :");
                    long phoneNumber = sc1.nextLong();
                    contact.setPhoneNumber(phoneNumber);
                    break;
                case 8:
                    System.out.println("Enter the correct Email :");
                    String email = sc1.next();
                    contact.setEmail(email);
                    break;
            }
        }
        array.add(contact);
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
