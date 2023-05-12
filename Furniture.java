public class Furniture {
    // attribute for Furniture class
    private String type;
    public boolean open_status;
    private Letter l;
    private String special_item;
    public String direction;

    /** constructor that creates object Furniture
     * @param String type
     * @param String direction
    */
    public Furniture(String type, String direction) {
        this.type = type;
        this.open_status = false;
        this.direction = direction;
    }
    
     /** overloaded constructor that creates object Furniture
     * @param String type
     * @param String direction
     * @param Letter l
    */
    public Furniture(String type, String direction, Letter l) {
        this.type = type;
        this.open_status = false;
        this.l = l;
        this.direction = direction;
    }

    /** overloaded constructor that creates object Furniture
     * @param String type
     * @param String direction
     * @param Letter l
     * @String special_item
    */
    public Furniture(String type, String direction, Letter l, String special_item) {
        this.type = type;
        this.open_status = false;
        this.l = l;
        this.special_item = special_item;
        this.direction = direction;
    }

    /** overloaded constructor that creates object Furniture
     * @param String type
     * @param String direction
     * @String special_item
    */
    public Furniture(String type, String direction, String special_item) {
        this.type = type;
        this.open_status = false;
        this.special_item = special_item;
        this.direction = direction;
    }

    /** getter for type of furniture */
    public String getType() {
        return this.type;
    }
    /** getter for Letter l */
    public Letter getLetter() {
        return this.l;
    }

    /** getter for special_item */
    public String getSpecialItem() {
        return this.special_item;
    }

}
