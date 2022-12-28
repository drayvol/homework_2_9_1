package PhoneBook;

import java.util.*;

public class Phonebook {
    private final HashMap<String, String> contacts = new HashMap<>();
     public void addContact(String name, String number){
         contacts.put(name, number);
     }
     public void removeContact(String name){
         contacts.remove(name);
     }


    public void print() {
        for (Map.Entry<String,String> entry: contacts.entrySet()){
            System.out.println(entry.getKey() +" " + entry.getValue());
        }

    }
}
