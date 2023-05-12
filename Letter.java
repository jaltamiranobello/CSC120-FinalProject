public class Letter {
     // attribute for Letter class
    private String text;

    /** constructor to create a Letter object
     * @param String text
    */
    public Letter(String text){
        this.text = text;
    }

    /** getter method that retrieves the text assigned to the Letter object
     * @param String text
    */
    public String getText(){
        return this.text;
    }

}
