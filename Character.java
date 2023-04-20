import java.util.*;
public class Character {


    private String name;
    private ArrayList<String> notes;
    private ArrayList<String> collected_items;

    public Character(String name){
        this.name = name;
        this.notes = new ArrayList<String>();
        this.collected_items = new ArrayList<String>();
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

    public void move(String direction){

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
