package com.addressbook;
import java.util.Scanner;
public class AddressBookMain {
    public static void main(String args[]) {
        Scanner sc2= new Scanner(System.in);
        System.out.println("Welcome to Address Book");
        AddInfo addInfo = new AddInfo();
        int choose = sc2.nextInt();
        boolean changes = true;

        do{
            System.out.println("\nChoose the operation you want to perform");
            System.out.println("1.Add To Address Book\n2.Edit Existing Entry\n3.Delete Contact\n4.Exit Address book System");
            switch (choose){

                case 1:
                    addInfo.addContact();
                    break;
                case 2:
                    addInfo.editPerson();
                    break;
                case 3:
                    addInfo.deletePerson();
                    break;
                case 4:
                    changes = false;
                    System.out.println("We are exiting");
            }

        }while (changes);

    }

}
