public class PhoneBook {
    private Contact []contacts;
    private int numOfContacts;

    public PhoneBook(int size) {
        contacts=new Contact[size];
        numOfContacts=0;
    }

    public boolean addContact(Contact contact)
    {
        if(numOfContacts==contacts.length)
            return false;
        contacts[numOfContacts++]=contact;
        return true;
    }

    public int getSize()
    {
        return numOfContacts;
    }

    public void viewAllContacts()
    {
        System.out.println("All contacts:");
        for(int i=0;i<numOfContacts;i++)
            System.out.println(contacts[i]+"\n");
    }
    public void viewEmergencyContacts()
    {
        System.out.println("Emergency contacts:");
        for(int i=0;i<numOfContacts;i++)
        {
            if(contacts[i].isEmergencyContact())
                System.out.println(contacts[i]+"\n");
        }
    }

    public String searchContact(String name)
    {
        for(int i=0;i<numOfContacts;i++)
            if(contacts[i].getName().equalsIgnoreCase(name))
                return contacts[i].toString();
        return "Contact not found.";
    }
    public boolean isFull()
    {
        return numOfContacts==contacts.length;
    }
    public boolean isEmpty()
    {
        return numOfContacts==0;
    }
}