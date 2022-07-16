package com.addressbook;

import java.util.HashMap;
import java.util.Scanner;

public class AddressBookDictionary {
    public AddInfo addressBook=new AddInfo();
    Scanner scanner = new Scanner(System.in);
    HashMap<String,AddInfo> addressBookDictionary=new HashMap<String,AddInfo>();
    public void operationDictionary() {
        boolean changes = true;
        do {
            System.out.println("\nChoose the operation you want to perform");
            System.out.println("1.Add Address Book\n2.Edit Entry of Existing address book\n3.Display Contact\n4.Exit Address book System");
            switch (scanner.nextInt()) {
                case 1:
                    addAddressBook();
                    AddInfo operation = new AddInfo();
                    operation.addContact();
                    break;
                case 2:
                    editAddressBook();
                    AddInfo operation1 = new AddInfo();
                    operation1.editPerson();
                    break;
                case 3:
                    displayContent();
                    AddInfo operation2 = new AddInfo();
                    operation2.display();
                    break;
                case 4:
                    changes = false;
                    System.out.println("We are exiting");
            }
        } while (changes);
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
        AddInfo addInfo1=new AddInfo();
        addInfo1.operations();
    }

    public void editAddressBook(){
        System.out.println("Enter name of address book you wanna edit");
        String addressBookName=scanner.next();
        if(addressBookDictionary.containsKey(addressBookName)){
            addressBook=addressBookDictionary.get(addressBookName);
            addressBook.operations();
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
}
