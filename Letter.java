public class Letter {
     // Attribute for Letter class
    private String text;

    /** Constructor to create a Letter object
     * @param String text: the text assigned to the letter
    */
    public Letter(String text){
        this.text = text;
    }

    /** Getter that retrieves the text assigned to the Letter
     * @return String: the text from the letter
    */
    public String getText(){
        return this.text;
    }

}
