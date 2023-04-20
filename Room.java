import java.util.*;

public class Room {
    
    //attributes for basic room
    private String exit;
    private boolean key;
    private String type;
    private boolean light;
    private ArrayList<String> items;
    
    public Room(String exit, boolean key, String type, boolean light) {
        this.exit = exit;
        this.key = key;
        this.type = type;
        this.light = light;
        this.items = new ArrayList<String>();
    }

    public String getExit() {
        return this.exit;  
    }

    public boolean getKey() {
     return this.key;   
    }

    public String getType() {
        return this.type;
    }

    public boolean getLight() {
        return this.light;
    }

    public ArrayList <String> getItems() {
        return this.items;
    }

    public String toString() {
        String x = "This is a " + this.type + ". This room has " + this.items.size() + " objects; try to find the key within the objects.";
        return x;
    }
}