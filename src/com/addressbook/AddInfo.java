package com.addressbook;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;
public class AddInfo implements AddInfoIF {
    Scanner sc= new Scanner(System.in);
    Scanner scanner = new Scanner(System.in);
    HashMap<String,AddressBook> addressBookHashMap=new HashMap<String,AddressBook>();
    HashMap<String,AddInfo> addressBookDictionary=new HashMap<String,AddInfo>();
    public String addressBookName;
    boolean present=false;
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
        AddressBook addressBook=new AddressBook();
        System.out.println("Enter First Name: ");
        String firstname = sc.next();
        addressBookHashMap.entrySet().stream().forEach(entry ->{
            if(entry.getKey().equals(firstname.toLowerCase())){
                System.out.println("Already exist");
                present=true;
                return;
            }
        });
        if(present==false){
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

            addressBook.setFirstName(firstname);
            addressBook.setLastName(lastname);
            addressBook.setAddress(adderss);
            addressBook.setCity(city);
            addressBook.setState(state);
            addressBook.setZip(zip);
            addressBook.setPhoneNumber(phoneNumber);
            addressBook.setEmail(email);
            addressBookHashMap.put(firstname.toLowerCase(),addressBook);
        }
    }
    @Override
    public void editPerson(){
        AddressBook addressBook=new AddressBook();
        System.out.println("Enter First name: ");
        String firstName=sc.next();
            if(addressBookHashMap.containsKey(firstName)) {
                addressBook = addressBookHashMap.get(firstName);
                System.out.println("Choose attribute you want to change:");
                System.out.println("1.First Name\n2.Last Name\n3.Address\n4.City\n5.State\n6.ZipCode\n7.Phone Number\n8.Email");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Enter the correct first Name :");
                        firstName = sc.next();
                        addressBook.setFirstName(firstName);
                        break;
                    case 2:
                        System.out.println("Enter the correct Last Name :");
                        String lastName = sc.next();
                        addressBook.setLastName(lastName);
                        break;
                    case 3:
                        System.out.println("Enter the correct Address :");
                        String address = sc.next();
                        addressBook.setAddress(address);
                        break;
                    case 4:
                        System.out.println("Enter the correct City :");
                        String city = sc.next();
                        addressBook.setCity(city);
                        break;
                    case 5:
                        System.out.println("Enter the correct State :");
                        String state = sc.next();
                        addressBook.setState(state);
                        break;
                    case 6:
                        System.out.println("Enter the correct Zip Code :");
                        int zip = sc.nextInt();
                        addressBook.setZip(zip);
                        break;
                    case 7:
                        System.out.println("Enter the correct Phone Number :");
                        long phoneNumber = sc.nextLong();
                        addressBook.setPhoneNumber(phoneNumber);
                        break;
                    case 8:
                        System.out.println("Enter the correct Email :");
                        String email = sc.next();
                        addressBook.setEmail(email);
                        break;
                }
            }
    }




    @Override
    public void deletePerson(){
        System.out.println("Enter the first name of the person to be deleted");
        String firstName = sc.next();
        if(addressBookHashMap.containsKey(firstName)){
            addressBookHashMap.remove(firstName);
            System.out.println("Contact deleted");
        }
        else {
            System.out.println("Contact not found");
        }
    }

    @Override
    public void display(){
        System.out.println("Contents of Address Book");
        for (String contact : addressBookHashMap.keySet()){
            AddressBook addressBook=addressBookHashMap.get(contact);
            System.out.println(addressBook);
        }

    }
    public void addAddressBook() {
        System.out.println("Enter name of address book");
        String addressBookName = scanner.next();
        if (addressBookDictionary.containsKey(addressBookName)) {
            System.out.println("Address Book already exist");
            return;
        }
        AddInfo addInfo = new AddInfo();
        addInfo.setAddressBookName(addressBookName);
        addressBookDictionary.put(addressBookName,addInfo);
        /*AddInfo addInfo1=new AddInfo();
        addInfo1.addContact();*/
    }
    public void editAddressBook(){
        System.out.println("Enter name of address book you wanna edit");
        String addressBookName=scanner.next();
        if(addressBookDictionary.containsKey(addressBookName)){
            addressBookDictionary.get(addressBookName);
            //operations();
        }
        else{
            System.out.println("Book doesn't exist");
        }
    }
    public void displayContent(){
        System.out.println("Content of address book dictionary");
        for (String bookName : addressBookDictionary.keySet()){
            System.out.println(bookName);
        }
    }
    public void operationDictionary() {
        boolean changes = true;
        do {
            System.out.println("\nChoose the operation you want to perform");
            System.out.println("1.Add Address Book\n2.Edit Entry of Existing address book\n3.Display Contact\n4.Exit Address book System");
            switch (scanner.nextInt()) {
                case 1:
                    addAddressBook();
                    addContact();
                    break;
                case 2:
                    editAddressBook();
                    editPerson();
                    break;
                case 3:
                    displayContent();
                    display();
                    break;
                case 4:
                    changes = false;
                    System.out.println("We are exiting");
            }
        } while (changes);
    }
}
