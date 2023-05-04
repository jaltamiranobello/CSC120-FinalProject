import java.util.ArrayList;

public class Bedroom extends Room {
    
    private ArrayList<Furniture> objects;

    public Bedroom(String code, Furniture a, Furniture b, Furniture c, Furniture d){
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
       String x = "\nThis is a bedroom and it has four pieces of furniture: Desk, Nightstand, Dresser, and Closet. You can chose to retrieve some objects in them or not (be weary of your decisions). This room also has a specific code to be able to exit. Find the code by exploring the room and the mode of exit. You are currently at the Southern area of the room and there is a nightstand here.";
       return x;
    }
}
