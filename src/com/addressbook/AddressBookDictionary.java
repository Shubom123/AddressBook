package com.addressbook;

import java.util.Scanner;

public class AddressBookDictionary {
    public final int NUM_OF_ADDRESSBOOK = 5;
    Scanner scanner = new Scanner(System.in);
    public AddInfo[] addressBookDictionary = new AddInfo[NUM_OF_ADDRESSBOOK];
    int numOfAddressbook = 0;

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
        System.out.println("You can add only " + (NUM_OF_ADDRESSBOOK - numOfAddressbook) + " books");
        String addressBookName = "";
        if (numOfAddressbook == 0) {
            System.out.println("Enter name of address book");
            addressBookName = scanner.next();
            AddInfo addInfo = new AddInfo();
            addInfo.setAddressBookName(addressBookName);
            addressBookDictionary[numOfAddressbook] = addInfo;
            numOfAddressbook++;
        } else {
            boolean bookExist = false;
            for (int index = 0; index < numOfAddressbook; index++) {
                System.out.println("Enter name of address book");
                addressBookName = scanner.next();
                AddInfo addInfo = addressBookDictionary[index];
                if (addressBookName.equals(addInfo.getAddressBookName())) {
                    bookExist = true;
                    System.out.println("Address book already exist");
                    break;
                }
                else {
                    addInfo.setAddressBookName(addressBookName);
                    addressBookDictionary[numOfAddressbook] = addInfo;
                    numOfAddressbook++;
                }
            }
        }
    }

    public void editAddressBook(){
        System.out.println("Enter name of address book you wanna edit");
        String addressBookName=scanner.next();
        for (int index=0; index<numOfAddressbook; index++){
            AddInfo addInfo=addressBookDictionary[index];
            if(addressBookName.equals(addInfo.getAddressBookName())){
                addInfo.operations();
            }
        }
    }
    public void displayContent(){
        System.out.println("Content of address book");
        for (int index=0; index<numOfAddressbook; index++){
            System.out.println(addressBookDictionary[index]);

        }
    }
}
