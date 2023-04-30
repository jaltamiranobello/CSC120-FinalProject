import java.util.*;

public class Purgatory {
    ArrayList<Room> rooms;
    Letter lbd_1 =  new Letter ("ROM are the first three letters of the code");
    Letter lbd_2 = new Letter("ANT are the third, fourth, and fifth letters of the code.");
    Letter lbd_3 = new Letter("IC are the sixth and seventh letters of the code.");
    Letter lbd_4 = new Letter("IZE are the last three letters of the code.");

    Letter lt_e_1 = new Letter("OB are the first two letters of the code.");
    Letter lt_e_2 = new Letter("SE are the third and fourth letters of the code.");
    Letter lt_e_3 = new Letter("SSI are the fifth, sixth, and seventh letters of the code.");
    Letter lt_e_4 = new Letter("ON are the last two letters of the code.");

    Letter lt_m_1 = new Letter("IN are the first two letters of the code.");
    Letter lt_m_2 = new Letter("TE are the third and fourth letters of the code.");
    Letter lt_m_3 = new Letter("RE are the fifth and sixth letters of the code.");
    Letter lt_m_4 = new Letter("ST are the last two letters of the code.");
 
    Letter lt_h_1 = new Letter("END are the first three letters of the code.");
    Letter lt_h_2 = new Letter("EA are the fourth and fifth letters of the code.");
    Letter lt_h_3 = new Letter("RM are the sixth and seventh letters of the code.");
    Letter lt_h_4 = new Letter("ENT are the last three letters of the code.");

    Letter lk_e_1 = new Letter("PO are the first two letters of the code.");
    Letter lk_e_2 = new Letter("I is the third letter of the code.");
    Letter lk_e_3 = new Letter("SO are the fourth and fifth letters of the code.");
    Letter lk_e_4 = new Letter("N  is the last letter of the code.");

    Letter lk_m_1 = new Letter("S is the first letter of the code.");
    Letter lk_m_2 = new Letter("W is the second letter of the code.");
    Letter lk_m_3 = new Letter("E is the third letter of the code.");
    Letter lk_m_4 = new Letter("ET are the last two letters of the code.");

    Letter lk_h_1 = new Letter("FO are the first two letters of the code.");
    Letter lk_h_2 = new Letter("RE are the third and fourth letters of the code.");
    Letter lk_h_3 = new Letter("VE and the fifth and sixth letters of the code.");
    Letter lk_h_4 = new Letter("R is the last letter of the code.");

    Letter lb_e_1 = new Letter("SE are the first two letters of the code.");
    Letter lb_e_2 = new Letter("C is the third letter of the code.");
    Letter lb_e_3 = new Letter("RE are the fourth and fifth letters of the code.");
    Letter lb_e_4 = new Letter("T is the last letter of the code.");

    Letter lb_m_1 = new Letter("S is the first letter of the code.");
    Letter lb_m_2 = new Letter("A is the second letter of the code.");
    Letter lb_m_3 = new Letter("F is the third letter of the code.");
    Letter lb_m_4 = new Letter("E is the last letter of the code.");

    Letter lb_h_1 = new Letter("C is the first letter of the code.");
    Letter lb_h_2 = new Letter("AR are the second and third letters of the code.");
    Letter lb_h_3 = new Letter("IN are the fourth and fifth letters of the code.");
    Letter lb_h_4 = new Letter("G is the last letter of the code.");

    Letter llr_1 = new Letter("AL are the first two letters of the code.");
    Letter llr_2 = new Letter("O is the third letter of the code.");
    Letter llr_3 = new Letter("N is the fourth letter of the code.");
    Letter llr_4 = new Letter("E is the last letter of the code.");

    Furniture bd_1 = new Furniture("Desk", lbd_1);
    Furniture bd_2 = new Furniture("Nightstand", lbd_2);
    Furniture bd_3 = new Furniture("Dresser", lbd_3);
    Furniture bd_4 =  new Furniture("Closet", lbd_3);

    Furniture t_easy_1 =  new Furniture("Toy Chest", lt_e_1);
    Furniture t_easy_2 =  new Furniture("Barbie House", lt_e_2);
    Furniture t_easy_3 =  new Furniture("Craft Table", lt_e_3);
    Furniture t_easy_4 =  new Furniture("Lego Box", lt_e_4);

    Furniture t_med_1 =  new Furniture("Toy Chest", lt_m_1);
    Furniture t_med_2 =  new Furniture("Barbie House", lt_m_2);
    Furniture t_med_3 = new Furniture("Craft Table", lt_m_3);
    Furniture t_med_4 =  new Furniture("Lego Box", lt_m_4);

    Furniture t_hard_1 =  new Furniture("Toy Chest", lt_h_1);
    Furniture t_hard_2 =  new Furniture("Barbie House", lt_h_2);
    Furniture t_hard_3 = new Furniture("Craft Table", lt_h_3);
    Furniture t_hard_4 =  new Furniture("Lego Box", lt_h_4);

    Furniture k_easy_1 =  new Furniture("Dishwasher", lk_e_1);
    Furniture k_easy_2 =  new Furniture("Microwave", lk_e_2);
    Furniture k_easy_3 =  new Furniture("Oven", lk_e_3);
    Furniture k_easy_4 =  new Furniture("Pantry", lk_e_4);

    Furniture k_med_1 =  new Furniture("Dishwasher", lk_m_1);
    Furniture k_med_2 =  new Furniture("Microwave", lk_m_2);
    Furniture k_med_3 =  new Furniture("Oven", lk_m_3);
    Furniture k_med_4 =  new Furniture("Pantry", lk_m_4);

    Furniture k_hard_1 =  new Furniture("Dishwasher", lk_h_1);
    Furniture k_hard_2 =  new Furniture("Microwave", lk_h_1);
    Furniture k_hard_3 =  new Furniture("Oven", lk_h_1);
    Furniture k_hard_4 =  new Furniture("Pantry", lk_h_1);

    Furniture b_easy_1 =  new Furniture("Toilet", lb_e_1);
    Furniture b_easy_2 =  new Furniture("Medicine Cabinet", lb_e_2);
    Furniture b_easy_3 =  new Furniture("Trash Can", lb_e_3);
    Furniture b_easy_4 =  new Furniture("Shower", lb_e_4);

    Furniture b_med_1 =  new Furniture("Toilet", lb_m_1);
    Furniture b_med_2 =  new Furniture("Medicine Cabinet", lb_m_2);
    Furniture b_med_3 =  new Furniture("Trash Can", lb_m_3);
    Furniture b_med_4 = new Furniture("Shower", lb_m_4);

    Furniture b_hard_1 =  new Furniture("Toilet", lb_h_1);
    Furniture b_hard_2 =  new Furniture("Medicine Cabinet", lb_h_2);
    Furniture b_hard_3 =  new Furniture("Trash Can", lb_h_3);
    Furniture b_hard_4 = new Furniture("Shower", lb_h_4);

    Furniture lr_1 =  new Furniture("Coffee Table", llr_1);
    Furniture lr_2 =  new Furniture("Safe", llr_2);
    Furniture lr_3 =  new Furniture("China Cabinet", llr_3);
    Furniture lr_4 =  new Furniture("Bookshelf", llr_4);

    Bedroom bedroom = new Bedroom("Door", "ROMANTICIZE", bd_1, bd_2, bd_3, bd_4);
    Toyroom toyroom_easy = new Toyroom("Door", "OBSESSION", t_easy_1, t_easy_2, t_easy_3, t_easy_4);
    Toyroom toyroom_med = new Toyroom("Window", "INTEREST", t_med_1, t_med_2, t_med_3, t_med_4);
    Toyroom toyroom_hard = new Toyroom("Vent", "ENDEARMENT", t_hard_1, t_hard_2, t_hard_3, t_hard_4);
    Kitchen kitchen_easy = new Kitchen("Door", "POISON", k_easy_1, k_easy_2, k_easy_3, k_easy_4);
    Kitchen kitchen_med = new Kitchen("Window", "SWEET", k_med_1, k_med_2, k_easy_3, k_med_4);
    Kitchen kitchen_hard = new Kitchen("Vent", "FOREVER", k_hard_1, k_hard_2, k_hard_3, k_hard_4);
    Bathroom bathroom_easy = new Bathroom("Door", "SECRET", b_easy_1, b_easy_2, b_easy_3, b_easy_4);
    Bathroom bathroom_med = new Bathroom("Window", "SAFE", b_med_1, b_med_2, b_med_3, b_med_4);
    Bathroom bathroom_hard = new Bathroom("Vent", "CARING", b_hard_1, b_hard_2, b_hard_3, b_hard_4);
    LivingRoom livingRoom = new LivingRoom("Door", "ALONE", lr_1, lr_2, lr_3, lr_4);

    public Purgatory(){
        rooms = new ArrayList<>();
    }

    public void addRooms(Room room){
        rooms.add(room);
    }


    public static void nextRoom(Character c){
        if (c.getCollectedItems().size() == 0){
        }


        }

    public static void main(String[] args) {
        //Purgatory theGame = new Purgatory();
            
    }

    }

