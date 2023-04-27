//import java.util.*;

public class Room {
    
    //attributes for basic room
    private String exit;
    private String code;
    public boolean light;
    
    public Room(String exit, String code, boolean light) {
        this.exit = exit;
        this.code = code;
        this.light = light;
    }

    public String getExit() {
        return this.exit;  
    }

    public String getCode() {
     return this.code;   
    }
}