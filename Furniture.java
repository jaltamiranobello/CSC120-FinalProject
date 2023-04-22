public class Furniture {
    
    //attributes
    public String type;
    public boolean status;
    private Letter l;

    public Furniture(String type) {
        this.type = type;
        this.status = false;
    }

    public Furniture(String type, Letter l) {
        this.type = type;
        this.status = false;
        this.l = l;
    }

    public Letter getLetter() {
        return this.l;
    }
}
