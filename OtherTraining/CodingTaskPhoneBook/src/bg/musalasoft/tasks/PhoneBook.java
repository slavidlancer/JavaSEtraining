package bg.musalasoft.tasks;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneBook {
    private static final String VALID_BULGARIAN_NUMBER_PATTERN =
            "((\\+359)|(0)|(00359))((88)|(87)|(89))[2-9][0-9]{6}";
    private static final String VALID_BULGARIAN_ENTRY_PATTERN =
            "\\([\\w\\d\\, ]+((\\+359)|(0)|(00359))((88)|(87)|(89))[2-9]"
            + "[0-9]{6}\\)";
    
    private Map<String, String> phoneBookEntries;
    private Map<String, String> reversedPhoneBookEntries;
    private Map<String, Long> outgoingCallsCounts;
    
    public PhoneBook(String fileName) {
        this.phoneBookEntries = new TreeMap<>();
        getEntriesFromFile(fileName);
        this.outgoingCallsCounts = new HashMap<>();
    }

    protected boolean getEntriesFromFile(String fileName) {
        File fileToOpen = new File(fileName);
        Scanner fileScanner = null;
        
        try {
            fileScanner = new Scanner(fileToOpen);
            
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                
                if (line.matches(VALID_BULGARIAN_ENTRY_PATTERN)) {
                    String name = extractName(line);
                    String number = extractNumber(line);
                    
                    this.phoneBookEntries.put(name, number);
                }
            }
        } catch (FileNotFoundException fnfe) {
            System.err.println("Error in reading entries from file!");
            fnfe.printStackTrace();
            
            return false;
        } finally {
            fileScanner.close();
        }
        
        return true;
    }
    
    private String extractName(String source) {
        Pattern namePattern = Pattern.compile("\\([\\w\\d ]+\\,");
        Matcher matcher = namePattern.matcher(source);
        String name = ""; 
        
        if (matcher.find()) {
            name = matcher.group().replace("(", "").replace(",", "");
        }
        
        return name;
    }
    
    private String extractNumber(String source) {
        Pattern numberPattern = Pattern.compile(VALID_BULGARIAN_NUMBER_PATTERN);
        Matcher matcher = numberPattern.matcher(source);
        String number = "";
        
        if (matcher.find()) {
            number = matcher.group();
        }
        
        return number;
    }
    
    public boolean addEntry(String name, String number) {
        if (isValidNumber(number)) {
            this.phoneBookEntries.put(name, number);
        }
        
        return false;
    }
    
    private boolean isValidNumber(String number) {
        if (number.matches(VALID_BULGARIAN_NUMBER_PATTERN)) {
            return true;
        }
        
        return false;
    }
    
    public boolean removeEntryByName(String name) {
        if (this.phoneBookEntries != null) {
            if (this.phoneBookEntries.containsKey(name)) {
                this.phoneBookEntries.remove(name);
                
                return true;
            }
        }
        
        return false;
    }
    
    public String getNumberByName(String name) {
        if (this.phoneBookEntries != null) {
            if (this.phoneBookEntries.containsKey(name)) {
                return this.phoneBookEntries.get(name);
            }
        }
        
        return "no entry";
    }
    
    public void printAllEntriesSortedByName() {
        for (Map.Entry<String, String> entry :
                this.phoneBookEntries.entrySet()) {
            System.out.println("(" + entry.getKey() + ", " + entry.getValue() +
                    ")");
        }
    }
    
    public boolean addOutgoingCallsNumber(Long count, String number) {
        if (isValidNumber(number) && (count >= 0) &&
                this.phoneBookEntries.containsValue(number)) {
            this.outgoingCallsCounts.put(number, count);
            
            return true;
        }
        
        return false;
    }
    
    public void printTopNOr5MaxOutgoingCallsCounts(int... args) {
        int n;
        int count = 0;
        
        if (args.length == 1) {
            n = args[0];
        } else {
            n = 5;
        }
        
        List<Map.Entry<String, Long>> outgoingCallsList = new LinkedList<>(
                this.outgoingCallsCounts.entrySet());
        sortEntriesByValue(outgoingCallsList);
        Collections.reverse(outgoingCallsList);
        
        Map<String, Long> outgoingCallsMap = createMapFromList(
                outgoingCallsList);
        
        reversePhoneBookEntries(this.phoneBookEntries);
        
        for (Map.Entry<String, Long> entry : outgoingCallsMap.entrySet()) {
            if (count >= n) {
                break;
            }
            
            System.out.println("(" +
                    this.reversedPhoneBookEntries.get(entry.getKey()) + ", " +
                    entry.getKey() + ") : " + entry.getValue() +
                    " outgoing calls");
            
            count++;
        }
    }
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    private void sortEntriesByValue(List<Entry<String, Long>> list) {
        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object object1, Object object2) {
                return ((Comparable) ((Map.Entry) object1).getValue()).
                        compareTo(
                                ((Map.Entry) object2).getValue());
            }
        });
    }
    
    @SuppressWarnings({ "rawtypes", "unchecked" })
    private Map<String, Long> createMapFromList(
            List<Entry<String, Long>> list) {
        Map<String, Long> map = new LinkedHashMap<>();
        
        for (Iterator iterator = list.iterator(); iterator.hasNext();) {
            Map.Entry<String, Long> entry =
                    (Map.Entry<String, Long>) iterator.next();
            
            map.put(entry.getKey(), entry.getValue());
        }
        
        return map;
    }
    
    private void reversePhoneBookEntries(Map<String, String> phoneBookEntries) {
        this.reversedPhoneBookEntries = new HashMap<>();
        
        for (Map.Entry<String, String> entry : phoneBookEntries.entrySet()) {
            this.reversedPhoneBookEntries.put(entry.getValue(), entry.getKey());
        }
    }
}
