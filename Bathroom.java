import java.util.*;

public class Bathroom extends Room {

    private ArrayList<Furniture> objects;

    //as the rooms get harder, the exit gets harder
    public Bathroom(String code, Furniture a, Furniture b, Furniture c, Furniture d){
        super(code);
        this.objects = new ArrayList<Furniture>();
        this.objects.add(a);
        this.objects.add(b);
        this.objects.add(c);
        this.objects.add(d);
    }

    public ArrayList<Furniture> getObjects(){
        return this.objects;
    }

    public String toString() {
       String x = "This is a bathroom and it has four pieces of furniture: Toilet, Medicine Cabinet, Trash Can, and Shower. You can chose to retrieve some spectial items in them or not (be weary of your decisions). This room also has a specific code to be able to exit. Find the code by exploring the room and the mode of exit. You are currently at the Southern area of the room and there is a medicine cabinet here.";
       return x;
    }

}