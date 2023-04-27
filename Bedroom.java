import java.util.*;

public class Bedroom extends Room {
    
    private ArrayList<Furniture> objects;

    public Bedroom(String exit, String code, boolean light, Furniture a, Furniture b, Furniture c, Furniture d){
        super(exit, code, light);
        this.objects.add(a);
        this.objects.add(b);
        this.objects.add(c);
        this.objects.add(d);
    }

    public ArrayList<Furniture> getObjects(){
        return this.objects;
    }

    public String toString() {
       String x = "This is a bedroom and it has " + this.objects.size() + " pieces of furniture; you can chose to retrieve some objects in them or not (be weary of your decisions). This room also has a specific code to be able to exit. Find the code by exploring the room and the mode of exit.";
       return x;
    }
}
