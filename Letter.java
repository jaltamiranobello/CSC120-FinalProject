public class Letter {

    private String text;
    private Furniture furniture;

    public Letter(String text, Furniture furniture){
        this.text = text;
        this.furniture = furniture;
    }

    public String getText(){
        return this.text;
    }

    public Furniture getFurniture(){
        return this.furniture;
    }
}
