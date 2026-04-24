class Main {
    public static void main(String[] args) {

        ContactsManager myContactsManager = new ContactsManager();

        // Les Contacts
        Contact c1 = new Contact();
        c1.name = "Koné Amadou";
        c1.phoneNumber = "0701234567";
        myContactsManager.addContact(c1);

        Contact c2 = new Contact();
        c2.name = "Kouassi Adjoua";
        c2.phoneNumber = "0507654321";
        myContactsManager.addContact(c2);

        Contact c3 = new Contact();
        c3.name = "Traoré Mariam";
        c3.phoneNumber = "0102345678";
        myContactsManager.addContact(c3);

        Contact c4 = new Contact();
        c4.name = "Bamba Seydou";
        c4.phoneNumber = "0756789012";
        myContactsManager.addContact(c4);

        Contact c5 = new Contact();
        c5.name = "Yao Brice";
        c5.phoneNumber = "0223456789";
        myContactsManager.addContact(c5);

        // Rechercher un contact et afficher son numéro
        Contact found = myContactsManager.searchContact("Traoré Mariam");
        if (found != null) {
            System.out.println("Numéro de " + found.name + " : " + found.phoneNumber);
        } else {
            System.out.println("Contact non trouvé.");
        }
    }
}