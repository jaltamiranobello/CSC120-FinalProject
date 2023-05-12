public class Furniture {
    // Attributes for Furniture class
    private String type;
    public boolean open_status;
    private Letter l;
    private String special_item;
    public String direction;

    /** Constructor that creates object Furniture
     * @param String type: the name of the furniture type
     * @param String direction: the location of the furniture
    */
    public Furniture(String type, String direction) {
        this.type = type;
        this.open_status = false;
        this.direction = direction;
    }
    
     /** Overloaded constructor that creates object Furniture
     * @param String type: the name of the furniture type
     * @param String direction: the location of the furniture
     * @param Letter l: the letter the furniture contains
    */
    public Furniture(String type, String direction, Letter l) {
        this.type = type;
        this.open_status = false;
        this.l = l;
        this.direction = direction;
    }

    /** Overloaded constructor that creates object Furniture
     * @param String type: the name of the furniture type
     * @param String direction: the location of the furniture
     * @param Letter l: the letter the furniture contains
     * @String special_item: the special item in the furniture
    */
    public Furniture(String type, String direction, Letter l, String special_item) {
        this.type = type;
        this.open_status = false;
        this.l = l;
        this.special_item = special_item;
        this.direction = direction;
    }

    /** Overloaded constructor that creates object Furniture
     * @param String type: the name of the furniture type
     * @param String direction: the location of the furniture
     * @String special_item: the special item in the furniture
    */
    public Furniture(String type, String direction, String special_item) {
        this.type = type;
        this.open_status = false;
        this.special_item = special_item;
        this.direction = direction;
    }

    /** Getter for type of furniture */
    public String getType() {
        return this.type;
    }
    /** Getter for Letter l */
    public Letter getLetter() {
        return this.l;
    }

    /** Getter for special_item */
    public String getSpecialItem() {
        return this.special_item;
    }

}
