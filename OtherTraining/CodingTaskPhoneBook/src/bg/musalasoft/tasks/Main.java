package bg.musalasoft.tasks;

public class Main {
    private static final String FILE_NAME = "resources/"
            + "names_phone_numbers.txt";
    
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook(FILE_NAME);
        
        //phoneBook.printAllEntriesSortedByName();
        
        phoneBook.addEntry("new", "+359889123456");
        phoneBook.addEntry("new wrong", "3598882123456");
        phoneBook.addEntry("new 02", "00359899123456");
        phoneBook.addEntry("new 03", "0874123456");
        
        //phoneBook.printAllEntriesSortedByName();
        
        phoneBook.addEntry("new 04wrong", "0871123456");
        phoneBook.addEntry("new 05wrong", "0862123456");
        phoneBook.addEntry("new 06wrong", "3598882123456");
        
        //phoneBook.printAllEntriesSortedByName();
        
        phoneBook.addEntry("new 07", "00359898123456");
        phoneBook.removeEntryByName("new 07");
        phoneBook.removeEntryByName("name 02");
        
        phoneBook.printAllEntriesSortedByName();
        
        System.out.println();
        
        System.out.println(phoneBook.getNumberByName("new 03"));
        System.out.println(phoneBook.getNumberByName("name 03"));
        System.out.println(phoneBook.getNumberByName("new 07"));
        System.out.println(phoneBook.getNumberByName("name 02"));
        System.out.println(phoneBook.getNumberByName("new"));
        System.out.println(phoneBook.getNumberByName("name"));
        System.out.println(phoneBook.getNumberByName("new wrong"));
        
        System.out.println();
        
        phoneBook.addOutgoingCallsNumber((long) 6, "+359889123456");
        phoneBook.addOutgoingCallsNumber((long) 6, "+359789123456");
        phoneBook.addOutgoingCallsNumber((long) 7, "+359885123456");
        phoneBook.addOutgoingCallsNumber((long) 8, "59885123456");
        phoneBook.addOutgoingCallsNumber((long) 5, "00359899123456");
        phoneBook.addOutgoingCallsNumber((long) 4, "0874123456");
        phoneBook.addOutgoingCallsNumber((long) 6, "+359882123456");
        //phoneBook.addOutgoingCallsNumber((long) 2, "00359899123456");
        phoneBook.addOutgoingCallsNumber((long) 2, "0873123456");
        phoneBook.addOutgoingCallsNumber((long) 1, "0884123456");
        phoneBook.addOutgoingCallsNumber((long) 1, "0895123456");
        
        phoneBook.printTopNOr5MaxOutgoingCallsCounts();
        
        /*System.out.println();
        
        phoneBook.printTopNOr5MaxOutgoingCallsCounts(10);*/
    }
}
