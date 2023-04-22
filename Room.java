import java.util.*;

public class Room {
    
    //attributes for basic room
    private String exit;
    private String code;
    //private String type;
    private boolean light;
    //private ArrayList<Furniture> objects;
    
    public Room(String exit, String code, boolean light) {
        this.exit = exit;
        this.code = code;
        //this.type = type;
        this.light = light;
    //    this.objects = new ArrayList<>();
    }

    public String getExit() {
        return this.exit;  
    }

    public String getCode() {
     return this.code;   
    }

    //public String getType() {
    //    return this.type;
    //}

    public boolean getLight() {
        return this.light;
    }

    //public ArrayList <Furniture> getObjects() {
    //    return this.objects;
    //}

    //public String toString() {
    //    String x = "This is a " + this.type + ". This room has " + this.objects.size() + " objects; you can chose to retrieve some objects or not (be weary of your decisions). This room also has a specific code to be able to exit. Find the code by exploring the room.";
    //    return x;
   //}
}