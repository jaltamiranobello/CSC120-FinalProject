import java.util.*;

public class Purgatory {

    ArrayList<Room> rooms;

    Letter lbd_1 = new Letter(null);
    Letter lbd_2 = new Letter();
    Letter lbd_3 = new Letter();
    Letter lbd_4 = new Letter();

    Letter lt_e_1 = new Letter();
    Letter lt_e_2 = new Letter();
    Letter lt_e_3 = new Letter();
    Letter lt_e_4 = new Letter();

    Letter lt_m_1 = new Letter();
    Letter lt_m_2 = new Letter();
    Letter lt_m_3 = new Letter();
    Letter lt_m_4 = new Letter();

    Letter lt_h_1 = new Letter();
    Letter lt_h_2 = new Letter();
    Letter lt_h_3 = new Letter();
    Letter lt_h_4 = new Letter();

    Letter lk_e_1 = new Letter();
    Letter lk_e_2 = new Letter();
    Letter lk_e_3 = new Letter();
    Letter lk_e_4 = new Letter();

    Letter lk_m_1 = new Letter();
    Letter lk_m_2 = new Letter();
    Letter lk_m_3 = new Letter();
    Letter lk_m_4 = new Letter();

    Letter lk_h_1 = new Letter();
    Letter lk_h_2 = new Letter();
    Letter lk_h_3 = new Letter();
    Letter lk_h_4 = new Letter();

    Letter lb_e_1 = new Letter();
    Letter lb_e_2 = new Letter();
    Letter lb_e_3 = new Letter();
    Letter lb_e_4 = new Letter();

    Letter lb_m_1 = new Letter();
    Letter lb_m_2 = new Letter();
    Letter lb_m_3 = new Letter();
    Letter lb_m_4 = new Letter();

    Letter lb_h_1 = new Letter();
    Letter lb_h_2 = new Letter();
    Letter lb_h_3 = new Letter();
    Letter lb_h_4 = new Letter();

    Letter llr_1 = new Letter();
    Letter llr_2 = new Letter();
    Letter llr_3 = new Letter();
    Letter llr_4 = new Letter();

    Furniture bd_1 = new Furniture("Bedside Table");
    Furniture bd_2 = new Furniture("Drawer");
    Furniture bd_3 = new Furniture("Closet");
    Furniture bd_4 =  new Furniture("Desk");

    Furniture t_easy_1 =  new Furniture("Toy Chest");
    Furniture t_easy_2 =  new Furniture("Barbie House");
    Furniture t_easy_3 =  new Furniture("Craft Table");
    Furniture t_easy_4 =  new Furniture("Lego Box");

    Furniture t_med_1 =  new Furniture("Toy Chest");
    Furniture t_med_2 =  new Furniture("Barbie House");
    Furniture t_med_3 = new Furniture("Craft Table");
    Furniture t_med_4 =  new Furniture("Lego Box");

    Furniture t_hard_1 =  new Furniture("Toy Chest");
    Furniture t_hard_2 =  new Furniture("Barbie House");
    Furniture t_hard_3 = new Furniture("Craft Table");
    Furniture t_hard_4 =  new Furniture("Lego Box");

    Furniture k_easy_1 =  new Furniture("Cabinet");
    Furniture k_easy_2 =  new Furniture("Microwave");
    Furniture k_easy_3 =  new Furniture("Oven");
    Furniture k_easy_4 =  new Furniture("Pantry");

    Furniture k_med_1 =  new Furniture("Cabinet");
    Furniture k_med_2 =  new Furniture("Microwave");
    Furniture k_med_3 =  new Furniture("Oven");
    Furniture k_med_4 =  new Furniture("Pantry");

    Furniture k_hard_1 =  new Furniture("Cabinet");
    Furniture k_hard_2 =  new Furniture("Microwave");
    Furniture k_hard_3 =  new Furniture("Oven");
    Furniture k_hard_4 =  new Furniture("Pantry");

    Furniture b_easy_1 =  new Furniture("Toilet");
    Furniture b_easy_2 =  new Furniture("Medicine Cabinet");
    Furniture b_easy_3 =  new Furniture("Trash Can");
    Furniture b_easy_4 =  new Furniture("Shower");

    Furniture b_med_1 =  new Furniture("Toilet");
    Furniture b_med_2 =  new Furniture("Medicine Cabinet");
    Furniture b_med_3 =  new Furniture("Trash Can");
    Furniture b_med_4 = new Furniture("Shower");

    Furniture b_hard_1 =  new Furniture("Toilet");
    Furniture b_hard_2 =  new Furniture("Medicine Cabinet");
    Furniture b_hard_3 =  new Furniture("Trash Can");
    Furniture b_hard_4 = new Furniture("Shower");

    Furniture lr_1 =  new Furniture("Coffee Table");
    Furniture lr_2 =  new Furniture("TV Stand");
    Furniture lr_3 =  new Furniture("Sofa Storage");
    Furniture lr_4 =  new Furniture("Bookshelf");

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

