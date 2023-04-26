public class Furniture {
    
    private String type;
    public boolean open_status;
    private Letter l;
    private String special_item;

    public Furniture(String type) {
        this.type = type;
        this.open_status = false;
    }
    
    public Furniture(String type, Letter l) {
        this.type = type;
        this.open_status = false;
        this.l = l;
    }

    public Furniture(String type, Letter l, String special_item) {
        this.type = type;
        this.open_status = false;
        this.l = l;
        this.special_item = special_item;
    }

    public Furniture(String type, String special_item) {
        this.type = type;
        this.open_status = false;
        this.special_item = special_item;
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
