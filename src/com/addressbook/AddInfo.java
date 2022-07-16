package com.addressbook;
import java.util.Scanner;
import java.util.ArrayList;
public class AddInfo implements AddInfoIF {
    public final int NUM_OF_PEOPLE=10;
    Scanner sc= new Scanner(System.in);
    public static int numberOfEntries = 0;
    public String addressBookName;
    AddressBook[] array=new AddressBook[NUM_OF_PEOPLE];
    public String getAddressBookName(){
        return addressBookName;
    }
    public void setAddressBookName(String addressBookName){
        this.addressBookName=addressBookName;
    }
    @Override
    public void operations(){

        boolean changes = true;

        do{
            System.out.println("\nChoose the operation you want to perform");
            System.out.println("1.Add To Address Book\n2.Edit Existing Entry\n3.Delete Contact\n4.Display Contact\n5.Exit Address book System");
            switch (sc.nextInt()){

                case 1:
                    addContact();
                    break;
                case 2:
                    editPerson();
                    break;
                case 3:
                    deletePerson();
                    break;
                case 4:
                    display();
                    break;
                case 5:
                    changes = false;
                    System.out.println("We are exiting");
            }

        }while (changes);

    }

    @Override
    public void addContact(){
        System.out.println("Enter number of people you want to add to Address book");
        int numberOfPeople= sc.nextInt();
        int lastEntry=numberOfPeople+numberOfEntries;

        if(lastEntry>NUM_OF_PEOPLE){
            System.out.println("Address Book is FULL !");
            return;
        }
        else{
            for(int index=numberOfEntries; index<lastEntry; index++){
                AddressBook contact=new AddressBook();
                System.out.println("Enter the details of the person"+(index+1));
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
                System.out.print("Enter Phone Number: ");
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
                array[index]=contact;
                numberOfEntries++;
            }
        }

    }
    @Override
    public void editPerson(){
        System.out.println("Enter First name: ");
        for(int index = 0; index <numberOfEntries; index++){
            AddressBook contact= array[index];
            String firstName = sc.next();
            if(firstName.equals(contact.getFirstName())){

                System.out.println("Choose attribute you want to change:");
                System.out.println("1.First Name\n2.Last Name\n3.Address\n4.City\n5.State\n6.ZipCode\n7.Phone Number\n8.Email");
                int choice = sc.nextInt();

                switch (choice){
                    case 1:
                        System.out.println("Enter the correct first Name :");
                        firstName = sc.next();
                        contact.setFirstName(firstName);
                        break;
                    case 2:
                        System.out.println("Enter the correct Last Name :");
                        String lastName = sc.next();
                        contact.setLastName(lastName);
                        break;
                    case 3:
                        System.out.println("Enter the correct Address :");
                        String address = sc.next();
                        contact.setAddress(address);
                        break;
                    case 4:
                        System.out.println("Enter the correct City :");
                        String city = sc.next();
                        contact.setCity(city);
                        break;
                    case 5:
                        System.out.println("Enter the correct State :");
                        String state = sc.next();
                        contact.setState(state);
                        break;
                    case 6:
                        System.out.println("Enter the correct Zip Code :");
                        int zip = sc.nextInt();
                        contact.setZip(zip);
                        break;
                    case 7:
                        System.out.println("Enter the correct Phone Number :");
                        long phoneNumber = sc.nextLong();
                        contact.setPhoneNumber(phoneNumber);
                        break;
                    case 8:
                        System.out.println("Enter the correct Email :");
                        String email = sc.next();
                        contact.setEmail(email);
                        break;
                }
            }

        }

    }
    @Override
    public void deletePerson(){
        System.out.println("Enter the first name of the person to be deleted");
        String firstName = sc.next();
        for(int index = 0; index <numberOfEntries; index++){
            AddressBook contact= array[index];
            if(firstName.equals(contact.getFirstName())){
                for(int nextIndex = index; nextIndex<array.length-1; nextIndex++) {
                    array[nextIndex] = array[nextIndex+1];

                }
                numberOfEntries--;
                System.out.println("Data is deleted");
                return;

            }

        }
    }
    @Override
    public void display(){
        System.out.println("Contents of Address Book");
        for (int index=0;index<numberOfEntries;index++){
            System.out.println(array[index]);

        }
    }
    @Override
    public String toString(){
        return addressBookName;
    }
}
