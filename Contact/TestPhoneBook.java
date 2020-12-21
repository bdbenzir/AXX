public class TestPhoneBook {
    public static void main(String[] args) {
        PhoneBook book=new PhoneBook(5);
        book.addContact(new Contact("John","01710000001",true));
        book.addContact(new Contact("Will","01810000001",false));
        book.addContact(new Contact("Alice","01910000001",true));
        book.addContact(new Contact("Jane","01610000001",false));
        book.addContact(new Contact("Harry","01310000001",false));

        book.viewAllContacts();

        book.viewEmergencyContacts();

        System.out.println(book.searchContact("Jane"));
    }

}