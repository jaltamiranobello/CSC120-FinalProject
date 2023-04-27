import java.util.*;

public class Bathroom extends Room {

    private ArrayList<Furniture> objects;

    //as the rooms get harder, the exit gets harder
    public Bathroom(String exit, String code, boolean light, Furniture a, Furniture b, Furniture c, Furniture d){
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
       String x = "This is a bathroom and it has " + this.objects.size() + " pieces of furniture; you can chose to retrieve some spectial items in them or not (be weary of your decisions). This room also has a specific code to be able to exit. Find the code by exploring the room and the mode of exit.";
       return x;
    }
}