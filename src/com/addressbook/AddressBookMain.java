package com.addressbook;
import java.util.Scanner;
public class AddressBookMain {
    public static void main(String[] args) {

        System.out.println("Welcome to Address Book");
        AddressBookDictionary addressBookDictionary=new AddressBookDictionary();
        addressBookDictionary.operationDictionary();
        AddInfo addInfo = new AddInfo();
        addInfo.operations();

    }

}
