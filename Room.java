import java.util.*;

public class Room {
    
    //attributes for basic room
    private String exit;
    private String code;
    private String type;
    private boolean light;
    private ArrayList<String> items;
    
    public Room(String exit, String code, String type, boolean light) {
        this.exit = exit;
        this.code = code;
        this.type = type;
        this.light = light;
        this.items = new ArrayList<String>();
    }

    public String getExit() {
        return this.exit;  
    }

    public String getCode() {
     return this.code;   
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
        String x = "This is a " + this.type + ". This room has " + this.items.size() + " objects; you can chose to retrieve items or not (be weary of your decisions). This room also has a specific code to be able to exit. Find the code by exploring the room.";
        return x;
    }
}