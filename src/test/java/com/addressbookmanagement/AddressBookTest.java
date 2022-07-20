package com.addressbookmanagement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

public class AddressBookTest {


    static AddressBook addressBook = new AddressBook();





    @Test
    public void givenDetails_ShouldAddToContactList() {

        ContactPerson person = new ContactPerson();
        Address address = new Address();
        addressBook.setAddressBookName("book1");
        String firstName = "Dipali";
        String lastName = "Sonawane";
        String email = "dips@gmail.com";
        long phoneNumber = 938475387;
        String city = "Jalgaon";
        String state = "Maharashtra";
        long zipCode = 425001;
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setEmail(email);
        person.setPhoneNumber(phoneNumber);
        address.setCity(city);
        address.setState(state);
        address.setZip(zipCode);
        person.setAddress(address);

        addressBook.addContact(firstName, person);

        firstName = "Manoj";
        lastName = "Sonawane";
        email = "manoj@gmail.com";
        phoneNumber = 847648263;
        city = "Mangalore";
        state = "Karnataka";
        zipCode = 560043;
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setEmail(email);
        person.setPhoneNumber(phoneNumber);
        address.setCity(city);
        address.setState(state);
        address.setZip(zipCode);
        person.setAddress(address);

        addressBook.addContact(firstName, person);

        int listSize = addressBook.contactList.size();
        Assertions.assertEquals(2, listSize);

    }

    @Test
    public void given2Contacts_WhenWrittenToFile_ShouldMatchEntries()
    {
        AddressBookFileIO addressFileIO = new AddressBookFileIO();
        addressFileIO.writeToAddressBookFile("book1.txt", addressBook.contactList);
        addressFileIO.printData("book1.txt");
        long entries = addressFileIO.countEntries("book1.txt");
        Assertions.assertEquals(2, entries);

    }

    @Test
    public void givenFile_WhenRead_ShouldReturnNumberOfEntries() {

        AddressBookFileIO addressFileIO = new AddressBookFileIO();
        List<String> entries = addressFileIO.readDataFromFile("book1.txt");
        long countEntries = entries.size();
        Assertions.assertEquals(2, countEntries);
    }


}

