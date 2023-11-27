package Java.JavaCore.Map;

import java.util.HashMap;
import java.util.Map.Entry;


public class Phone_db {
    private HashMap<Integer, String> phone_base = new HashMap<>();

    public void addNote(Integer number, String name){
        phone_base.put(number, name);
    }
    public String getNotebyNumber(Integer number){
        return phone_base.get(number);
    }
    
    public String getNotebyName(String name){
        StringBuilder result = new StringBuilder();
        for (Entry<Integer, String> note  : phone_base.entrySet()) {
            if (note.getValue().equals(name)) {
                result.append(note);
                result.append("\n");     
            }
        }
        return result.toString();
        
    }
    
}
