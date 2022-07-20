package com.addressbookmanagement;

import java.util.List;
import java.util.Scanner;

public interface AddressBookIF {
    void operation();

    void createContactPerson(Scanner scannerObject);

    void addContact(String firstName, ContactPerson person);

    void addPersonToCity(ContactPerson contact);

    void addPersonToState(ContactPerson contact);

    void editPerson();

    void deletePerson();

    void displayContents();

    void printSortedList(List<ContactPerson> sortedContactList);

    void sortAddressBook(int sortingChoice);

    void writeToAddressBookFile(AddressBook.IOService ioService);

    List<String> readDataFromFile(AddressBook.IOService fileIo);
}
