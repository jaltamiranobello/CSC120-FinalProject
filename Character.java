import java.util.*;
public class Character {


    private String name;
    private ArrayList<String> notes;
    private ArrayList<String> collected_items;
    private String position;

    public Character(String name, String position){
        this.name = name;
        this.notes = new ArrayList<String>();
        this.collected_items = new ArrayList<String>();
        this.position = "South";
    }

    public ArrayList<String> getNotes(){
        return this.notes;
    }

    public ArrayList<String> getcollected_items(){
        return this.collected_items;
    }

    public String getName(){
        return this.name;
    }

    public void walk(String direction){ 
        try{
            if (this.position == direction){
                throw new RuntimeException(this.name + " is already here.");
            }
            if (direction == "North"){
                System.out.println(this.name + " moved towards the northern wall.");
            }
    
            else if (direction == "East"){
                System.out.println(this.name + " moved towards the eastern wall.");
            }
    
            else if (direction == "South"){
                System.out.println(this.name + " moved towards the southern wall.");
            }
    
            else if (direction == "West"){
                System.out.println(this.name + " moved towards the western wall.");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public void open(){

    }

    public void close(){

    }

    public void read(){

    }

    public void write() {

    }

    public void examine(){

    }

    public void grab(){

    }

    public void keep(){

    }

    public void drop() {

    }

    public void enterCode() {

    }

}
