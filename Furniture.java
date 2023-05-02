public class Furniture {
    
    private String type;
    public boolean open_status;
    private Letter l;
    private String special_item;
    public String direction;

    public Furniture(String type, String direction) {
        this.type = type;
        this.open_status = false;
        this.direction = direction;
    }
    
    public Furniture(String type, String direction, Letter l) {
        this.type = type;
        this.open_status = false;
        this.l = l;
        this.direction = direction;
    }

    public Furniture(String type, String direction, Letter l, String special_item) {
        this.type = type;
        this.open_status = false;
        this.l = l;
        this.special_item = special_item;
        this.direction = direction;
    }

    public Furniture(String type, String direction, String special_item) {
        this.type = type;
        this.open_status = false;
        this.special_item = special_item;
        this.direction = direction;
    }

    public String getType() {
        return this.type;
    }

    public Letter getLetter() {
        return this.l;
    }

    public String getSpecialItem() {
        return this.special_item;
    }

}
