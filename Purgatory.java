import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Purgatory {
    
    //Objects in purgatory class
    public static Letter lbd_1 =  new Letter ("ROM are the first three letters of the code");
    public static Letter lbd_2 = new Letter("ANT are the third, fourth, and fifth letters of the code.");
    public static Letter lbd_3 = new Letter("IC are the sixth and seventh letters of the code.");
    public static Letter lbd_4 = new Letter("IZE are the last three letters of the code.");

    public static Letter lt_e_1 = new Letter("OB are the first two letters of the code.");
    public static Letter lt_e_2 = new Letter("SE are the third and fourth letters of the code.");
    public static Letter lt_e_3 = new Letter("SSI are the fifth, sixth, and seventh letters of the code.");
    public static Letter lt_e_4 = new Letter("ON are the last two letters of the code.");

    public static Letter lt_m_1 = new Letter("IN are the first two letters of the code.");
    public static Letter lt_m_2 = new Letter("TE are the third and fourth letters of the code.");
    public static Letter lt_m_3 = new Letter("RE are the fifth and sixth letters of the code.");
    public static Letter lt_m_4 = new Letter("ST are the last two letters of the code.");
 
    public static Letter lt_h_1 = new Letter("END are the first three letters of the code.");
    public static Letter lt_h_2 = new Letter("EA are the fourth and fifth letters of the code.");
    public static Letter lt_h_3 = new Letter("RM are the sixth and seventh letters of the code.");
    public static Letter lt_h_4 = new Letter("ENT are the last three letters of the code.");

    public static Letter lk_e_1 = new Letter("PO are the first two letters of the code.");
    public static Letter lk_e_2 = new Letter("I is the third letter of the code.");
    public static Letter lk_e_3 = new Letter("SO are the fourth and fifth letters of the code.");
    public static Letter lk_e_4 = new Letter("N  is the last letter of the code.");

    public static Letter lk_m_1 = new Letter("S is the first letter of the code.");
    public static Letter lk_m_2 = new Letter("W is the second letter of the code.");
    public static Letter lk_m_3 = new Letter("E is the third letter of the code.");
    public static Letter lk_m_4 = new Letter("ET are the last two letters of the code.");

    public static Letter lk_h_1 = new Letter("FO are the first two letters of the code.");
    public static Letter lk_h_2 = new Letter("RE are the third and fourth letters of the code.");
    public static Letter lk_h_3 = new Letter("VE and the fifth and sixth letters of the code.");
    public static Letter lk_h_4 = new Letter("R is the last letter of the code.");

    public static Letter lb_e_1 = new Letter("SE are the first two letters of the code.");
    public static Letter lb_e_2 = new Letter("C is the third letter of the code.");
    public static Letter lb_e_3 = new Letter("RE are the fourth and fifth letters of the code.");
    public static Letter lb_e_4 = new Letter("T is the last letter of the code.");

    public static Letter lb_m_1 = new Letter("S is the first letter of the code.");
    public static Letter lb_m_2 = new Letter("A is the second letter of the code.");
    public static Letter lb_m_3 = new Letter("F is the third letter of the code.");
    public static Letter lb_m_4 = new Letter("E is the last letter of the code.");

    public static Letter lb_h_1 = new Letter("C is the first letter of the code.");
    public static Letter lb_h_2 = new Letter("AR are the second and third letters of the code.");
    public static Letter lb_h_3 = new Letter("IN are the fourth and fifth letters of the code.");
    public static Letter lb_h_4 = new Letter("G is the last letter of the code.");

    public static Letter llr_1 = new Letter("AL are the first two letters of the code.");
    public static Letter llr_2 = new Letter("O is the third letter of the code.");
    public static Letter llr_3 = new Letter("N is the fourth letter of the code.");
    public static Letter llr_4 = new Letter("E is the last letter of the code.");

    public static Furniture bd_1 = new Furniture("Desk", "North", lbd_1);
    public static Furniture bd_2 = new Furniture("Nightstand", "South",lbd_2, "Binoculars");
    public static Furniture bd_3 = new Furniture("Dresser","East", lbd_3);
    public static Furniture bd_4 =  new Furniture("Closet", "West", lbd_4, "Phone");

    public static Furniture t_easy_1 =  new Furniture("Toy Chest", "North",lt_e_1, "Lily's Schedule");
    public static Furniture t_easy_2 =  new Furniture("Barbie House", "South",lt_e_2);
    public static Furniture t_easy_3 =  new Furniture("Craft Table", "East",lt_e_3, "Teddy bear");
    public static Furniture t_easy_4 =  new Furniture("Lego Box", "West", lt_e_4);

    public static Furniture t_med_1 =  new Furniture("Toy Chest", "North",lt_m_1);
    public static Furniture t_med_2 =  new Furniture("Barbie House", "South",lt_m_2);
    public static Furniture t_med_3 =  new Furniture("Craft Table", "East",lt_m_3, "Lipstick");
    public static Furniture t_med_4 =  new Furniture("Lego Box", "West",lt_m_4, "Toy Camera");

    public static Furniture t_hard_1 =  new Furniture("Toy Chest", "North",lt_h_1, "Flowers");
    public static Furniture t_hard_2 =  new Furniture("Barbie House", "South",lt_h_2, "Locket");
    public static Furniture t_hard_3 =  new Furniture("Craft Table", "East",lt_h_3);
    public static Furniture t_hard_4 =  new Furniture("Lego Box", "West",lt_h_4);

    public static Furniture k_easy_1 =  new Furniture("Dishwasher", "North",lk_e_1);
    public static Furniture k_easy_2 =  new Furniture("Microwave","South", lk_e_2, "Medicine Pamphlet");
    public static Furniture k_easy_3 =  new Furniture("Oven", "East",lk_e_3, "Bowl with traces of unknown substance");
    public static Furniture k_easy_4 =  new Furniture("Pantry", "West",lk_e_4);

    public static Furniture k_med_1 =  new Furniture("Dishwasher","North", lk_m_1);
    public static Furniture k_med_2 =  new Furniture("Microwave","South", lk_m_2, "Cake");
    public static Furniture k_med_3 =  new Furniture("Oven", "East",lk_m_3, "Pharmacy Card");
    public static Furniture k_med_4 =  new Furniture("Pantry", "West",lk_m_4);

    public static Furniture k_hard_1 =  new Furniture("Dishwasher", "North",lk_h_1, "Tea Cup");
    public static Furniture k_hard_2 =  new Furniture("Microwave", "South",lk_h_2, "Purse");
    public static Furniture k_hard_3 =  new Furniture("Oven","East", lk_h_3);
    public static Furniture k_hard_4 =  new Furniture("Pantry", "West",lk_h_4);

    public static Furniture b_easy_1 =  new Furniture("Toilet", "North",lb_e_1);
    public static Furniture b_easy_2 =  new Furniture("Medicine Cabinet","South", lb_e_2, "Hair Pin");
    public static Furniture b_easy_3 =  new Furniture("Trash Can", "East",lb_e_3);
    public static Furniture b_easy_4 =  new Furniture("Shower","West", lb_e_4, "Medicine Bottle");

    public static Furniture b_med_1 =  new Furniture("Toilet","North",lb_m_1, "Pills");
    public static Furniture b_med_2 =  new Furniture("Medicine Cabinet", "South",lb_m_2, "Necklace");
    public static Furniture b_med_3 =  new Furniture("Trash Can","East", lb_m_3);
    public static Furniture b_med_4 = new Furniture("Shower", "West",lb_m_4);

    public static Furniture b_hard_1 =  new Furniture("Toilet", "North",lb_h_1, "Straightener");
    public static Furniture b_hard_2 =  new Furniture("Medicine Cabinet", "South",lb_h_2, "Hairbrush");
    public static Furniture b_hard_3 =  new Furniture("Trash Can","East", lb_h_3);
    public static Furniture b_hard_4 = new Furniture("Shower", "West",lb_h_4);

    public static Furniture lr_1 =  new Furniture("Coffee Table", "North",llr_1, "Picture of Lily");
    public static Furniture lr_2 =  new Furniture("Safe", "South",llr_2,"Glass Vase Shard");
    public static Furniture lr_3 =  new Furniture("China Cabinet", "East",llr_3);
    public static Furniture lr_4 =  new Furniture("Bookshelf", "West",llr_4);

    public static Bedroom bedroom = new Bedroom("ROMANTICIZE", bd_1, bd_2, bd_3, bd_4);
    public static Toyroom toyroom_easy = new Toyroom("OBSESSION", t_easy_1, t_easy_2, t_easy_3, t_easy_4);
    public static Toyroom toyroom_med = new Toyroom("INTEREST", t_med_1, t_med_2, t_med_3, t_med_4);
    public static Toyroom toyroom_hard = new Toyroom("ENDEARMENT", t_hard_1, t_hard_2, t_hard_3, t_hard_4);
    public static Kitchen kitchen_easy = new Kitchen("POISON", k_easy_1, k_easy_2, k_easy_3, k_easy_4);
    public static Kitchen kitchen_med = new Kitchen("SWEET", k_med_1, k_med_2, k_easy_3, k_med_4);
    public static Kitchen kitchen_hard = new Kitchen("FOREVER", k_hard_1, k_hard_2, k_hard_3, k_hard_4);
    public static Bathroom bathroom_easy = new Bathroom("SECRET", b_easy_1, b_easy_2, b_easy_3, b_easy_4);
    public static Bathroom bathroom_med = new Bathroom( "SAFE", b_med_1, b_med_2, b_med_3, b_med_4);
    public static Bathroom bathroom_hard = new Bathroom("CARING", b_hard_1, b_hard_2, b_hard_3, b_hard_4);
    public static LivingRoom livingRoom = new LivingRoom("ALONE", lr_1, lr_2, lr_3, lr_4);
    
    public static Character jessica = new Character("Jessica", bedroom);

    /** Method that determines which room the character will move onto based on the amount of collected items they have from each room type
     * @param Character c
     * @return c.continue_game which is a boolean that represents if the character has reached the end of the game
    */
    public static boolean nextRoom(Character c){
        if(c.room_location instanceof Bedroom & c.collected_items_bd.size() == 0) {
            c.room_location = toyroom_hard;
            c.room_history.add(toyroom_hard);
            System.out.println(c.getName() + " is now in a Toyroom. " + toyroom_hard);
            return c.continue_game;
        }
        else if(c.room_location instanceof Bedroom & c.collected_items_bd.size() == 1) {
            c.room_location = toyroom_med;
            c.room_history.add(toyroom_med);
            System.out.println(c.getName() + " is now in a Toyroom. " + toyroom_med);
            return c.continue_game;
           
        }
        else if (c.room_location instanceof Bedroom & c.collected_items_bd.size() == 2) {
            c.room_location = toyroom_easy;
            c.room_history.add(toyroom_easy);
            System.out.println(c.getName() + " is now in a Toyroom. " + toyroom_easy);
            return c.continue_game;
           
        }
        else if (c.room_location instanceof Toyroom & c.collected_items_tyr.size() == 2) {
            c.room_location = kitchen_easy;
            c.room_history.add(kitchen_easy);
            System.out.println(c.getName() + " is now in a Kitchen. " + kitchen_easy);
            return c.continue_game;
           
        }
        else if (c.room_location instanceof Toyroom & c.collected_items_tyr.size() == 1) {
            c.room_location = kitchen_med;
            c.room_history.add(kitchen_med);
            System.out.println(c.getName() + " is now in a Kitchen. " + kitchen_med);
            return c.continue_game;
          
        }
        else if (c.room_location instanceof Toyroom & c.collected_items_tyr.size() == 0) {
            c.room_location = kitchen_hard;
            c.room_history.add(kitchen_hard);
            System.out.println(c.getName() + " is now in a Kitchen. " + kitchen_hard);
            return c.continue_game;
            
        }
        else if (c.room_location instanceof Kitchen & c.collected_items_kch.size() == 2) {
            c.room_location = bathroom_easy;
            c.room_history.add(bathroom_easy);
            System.out.println(c.getName() + " is now in a Bathroom. " + bathroom_easy);
            return c.continue_game;
            
        }
        else if (c.room_location instanceof Kitchen & c.collected_items_kch.size() == 1) {
            c.room_location = bathroom_med;
            c.room_history.add(bathroom_med);
            System.out.println(c.getName() + " is now in a Bathroom. " + bathroom_med);
            return c.continue_game;
            
        }
        else if (c.room_location instanceof Kitchen & c.collected_items_kch.size() == 0) {
            c.room_location = bathroom_hard;
            c.room_history.add(bathroom_hard);
            System.out.println(c.getName() + " is now in a Bathroom. " + bathroom_hard);
            return c.continue_game;
          
        }
        else if (c.room_location instanceof Bathroom){
            c.room_location = livingRoom;
            c.room_history.add(livingRoom);
            System.out.println(c.getName() + " is now in a Living Room. " + livingRoom);
            return c.continue_game;
           
        }
        else if(c.room_location instanceof LivingRoom & c.collected_items.size() < 8){
            System.out.println(c.getName() + " has failed to understand the purpose of Purgatory. " + c.getName() + " has woken up in the initial room again...");
            System.out.println("GAME OVER");
            c.continue_game = false;
            return c.continue_game;
        }
        else{
            System.out.println(c.getName() + " has understood the purpose of Purgatory.\n" + c.getName() + " is in Purgatory because one day she felt extremely lonely and saw the future love of her life, Lily, outside of her window.\nShe became entraced by her beauty and soon became obsessed to the point of stalking Lily to get close to her.\nThrough her stalking, she was able to get hired by Lily's brother to babysit Lily's niece at Lily's house.\nWeeks later, they have a date at " + c.getName() + "'s house.\nShe poisoned a cake so Lily can get sick and would have to rely on her.\nShe made Lily feel safe and asked Lily to stay over so she can take care of her.\nEventually, the truth revealed itself and then Lily became infuriated and attempted to run away.\n" + c.getName() + ", without thinking, ends up killing Lily with a glass shard from a flower vase so that no one else can ever have her.\nThen she poisoned herself because life is no longer worth living without Lily.\n" + c.getName() + " is now in the game Purgatory to repent her sins and reflect on her actions.");
            System.out.println("GAME OVER");
            c.continue_game = false;
            return c.continue_game;
        }
    } 

        /** Method that checks what furniture is near the character based on the character's position inside the room.
         * @param Character c
         */
        public static void nearMe(Character c){
            if (c.room_location instanceof Bedroom){
                if (c.position == "North"){
                    System.out.println("There is a desk here.");
                }
                else if(c.position == "South") {
                    System.out.println("There is a nightstand here.");
                }
                else if(c.position == "East"){
                    System.out.println("There is a dresser here.");
                }
                else if(c.position == "West"){
                    System.out.println("There is a closet here.");
                }
            }
            else if (c.room_location instanceof Toyroom){
                if (c.position == "North"){
                    System.out.println("There is a toychest here.");
                }
                else if(c.position == "South") {
                    System.out.println("There is a barbie house here.");
                }
                else if(c.position == "East"){
                    System.out.println("There is a craft table here.");
                }
                else if(c.position == "West"){
                    System.out.println("There is a lego box here.");
                }
            }
            else if (c.room_location instanceof Kitchen){
                if (c.position == "North"){
                    System.out.println("There is a dishwasher here.");
                }
                else if(c.position == "South") {
                    System.out.println("There is a microwave here.");
                }
                else if(c.position == "East"){
                    System.out.println("There is a oven here.");
                }
                else if(c.position == "West"){
                    System.out.println("There is a pantry here.");
                }
            }
            else if (c.room_location instanceof Bathroom){
                if (c.position == "North"){
                    System.out.println("There is a toilet cabinet here.");
                }
                else if(c.position == "South") {
                     System.out.println("There is a medicine cabinet here.");
                }
                else if(c.position == "East"){
                     System.out.println("There is a trash can here.");
                }
                else if(c.position == "West"){
                     System.out.println("There is a shower here.");
                }
            }
            else if (c.room_location instanceof LivingRoom){
                if (c.position == "North"){
                    System.out.println("There is coffee table here.");
                }
                else if(c.position == "South") {
                    System.out.println("There is a safe here.");
                }
                else if(c.position == "East"){
                    System.out.println("There is a china cabinet here.");
                }
                else if(c.position == "West"){
                    System.out.println("There is a bookshelf here.");
                }
            }
        }
        
        /** Method that assigns furniture to a specific room so that when character later decides to interact with a furniture it will check what room location they are in and return the furniture that belongs to their room location. 
         * @param String furniture
        */
        public static Furniture whichFurniture(String furniture){
            String f = furniture.toLowerCase();
            if (f == "desk") {
                Furniture x = bd_1;
                return x;
            }
            else if (f == "nightstand") {
                Furniture x = bd_2;
                return x;
            }
            else if (f == "dresser") {
                Furniture x = bd_3;
                return x;
            }
            else if (f == "closet") {
                Furniture x = bd_4;
                return x;
            }
            else if (f == "toy chest") {
                if (jessica.room_location == toyroom_easy){
                    Furniture x = t_easy_1;
                    return x;
                }
                else if(jessica.room_location == toyroom_med ){
                    Furniture x = t_med_1;
                    return x;
                }
                else {
                    Furniture x = t_hard_1;
                    return x;
                }
            }
            else if (f == "barbie house"){
                if (jessica.room_location == toyroom_easy){
                    Furniture x = t_easy_2;
                    return x;
                }
                else if(jessica.room_location == toyroom_med ){
                    Furniture x = t_med_2;
                    return x;
                }
                else {
                    Furniture x = t_hard_2;
                    return x;
                }
            }
            else if (f == "craft table"){
                if (jessica.room_location == toyroom_easy){
                    Furniture x = t_easy_3;
                    return x;
                }
                else if(jessica.room_location == toyroom_med ){
                    Furniture x = t_med_3;
                    return x;
                }
                else {
                    Furniture x = t_hard_3;
                    return x;
                }
            }
            else if (f == "lego box"){
                if (jessica.room_location == toyroom_easy){
                    Furniture x = t_easy_4;
                    return x;
                }
                else if(jessica.room_location == toyroom_med ){
                    Furniture x = t_med_4;
                    return x;
                }
                else {
                    Furniture x = t_hard_4;
                    return x;
                }
            }
            else if (f == "dishwasher"){
                if (jessica.room_location == kitchen_easy){
                    Furniture x = k_easy_1;
                    return x;
                }
                else if(jessica.room_location == kitchen_med){
                    Furniture x = k_med_1;
                    return x;
                }
                else {
                    Furniture x = k_hard_1;
                    return x;
                }
            }
            else if (f == "microwave"){
                if (jessica.room_location == kitchen_easy){
                    Furniture x = k_easy_2;
                    return x;
                }
                else if(jessica.room_location == kitchen_med){
                    Furniture x = k_med_2;
                    return x;
                }
                else {
                    Furniture x = k_hard_2;
                    return x;
                }
            }
            else if (f == "oven"){
                if (jessica.room_location == kitchen_easy){
                    Furniture x = k_easy_3;
                    return x;
                }
                else if(jessica.room_location == kitchen_med){
                    Furniture x = k_med_3;
                    return x;
                }
                else {
                    Furniture x = k_hard_3;
                    return x;
                }
            }
            else if (f == "pantry"){
                if (jessica.room_location == kitchen_easy){
                    Furniture x = k_easy_4;
                    return x;
                }
                else if(jessica.room_location == kitchen_med){
                    Furniture x = k_med_4;
                    return x;
                }
                else {
                    Furniture x = k_hard_4;
                    return x;
                }
            }
            else if (f == "toilet"){
                if (jessica.room_location == bathroom_easy){
                    Furniture x = b_easy_1;
                    return x;
                }
                else if(jessica.room_location == bathroom_med){
                    Furniture x = b_med_1;
                    return x;
                }
                else {
                    Furniture x = b_hard_1;
                    return x;
                }
            }
            else if (f == "medicine cabinet"){
                if (jessica.room_location == bathroom_easy){
                    Furniture x = b_easy_2;
                    return x;
                }
                else if(jessica.room_location == bathroom_med){
                    Furniture x = b_med_2;
                    return x;
                }
                else {
                    Furniture x = b_hard_2;
                    return x;
                }
            }
            else if (f == "trash can"){
                if (jessica.room_location == bathroom_easy){
                    Furniture x = b_easy_3;
                    return x;
                }
                else if(jessica.room_location == bathroom_med){
                    Furniture x = b_med_3;
                    return x;
                }
                else {
                    Furniture x = b_hard_3;
                    return x;
                }
            }
            else if (f == "shower"){
                if (jessica.room_location == bathroom_easy){
                    Furniture x = b_easy_4;
                    return x;
                }
                else if(jessica.room_location == bathroom_med){
                    Furniture x = b_med_4;
                    return x;
                }
                else {
                    Furniture x = b_hard_4;
                    return x;
                }
            }
            else if (f == "coffee table"){
                Furniture x = lr_1;
                return x;
            }
            else if (f == "safe"){
                Furniture x = lr_2;
                return x;
            }
            else if (f == "china cabinet"){
                Furniture x = lr_3;
                return x;
            }
            else if (f == "bookshelf"){
                Furniture x = lr_4;
                return x;
            }
            else{
                throw new RuntimeException("This is not something you can open or close.");
            }
        }


    public static void main(String[] args) {
        System.out.print("Welcome to Purgatory! You will be playing with the character named Jessica. To start playing, enter start: ");
        Scanner response = new Scanner(System.in);
        String user_input = response.nextLine();
        String l_user_input = user_input.toLowerCase();
        if (l_user_input.equals("start")) {
            System.out.println(bedroom.toString());
        
        while(jessica.continue_game){
            String user_input_2 = response.nextLine();
            String input = user_input_2.toLowerCase();
            if (input.equals("stop")){
                System.out.println("Thank you for playing. Hope to see you again.");
                break;
            }
            String [] split_words = input.split(" ");
            List <String> fixedLengthList = Arrays.asList(split_words);
            ArrayList <String> words = new ArrayList<String>(fixedLengthList);
            Chatbot.checkUserResponse(jessica, words, response);
            }         
        }
        response.close();
    }
}

