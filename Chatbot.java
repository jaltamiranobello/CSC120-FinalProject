import java.util.ArrayList;

public class Chatbot {

    public static void checkUserResponse(Character c, ArrayList<String> command){
        if (command.contains("open")){
            if (command.contains("barbie") & command.contains("house")){
              Furniture x = Purgatory.whichFurniture("barbie house");
              c.open(x);
            }
            else if (){
            }

        }
<<<<<<< HEAD
        else if (command.contains("walk")){
            if(command.contains("north")){
                c.walk("North");
            }
            else if (command.contains("south")){
                c.walk("South");
            }
            else if(command.contains("east")){
                c.walk("East");
            }
            else if(command.contains("west")){
                c.walk("West");
            }
            else{
                System.out.println("Sorry, this is not a valid direction.");
            }

=======
        else if (){
>>>>>>> 85c0ebaa0751e71b19ec582108ed6edb4f17c39f
        }
        else if(command.contains("read")){
            c.read();
        }
        else if (command.contains("write")){
            c.write();
        }
        else if(command.contains("view") & command.contains("notes")){
            c.viewnotes();
        }
        else if( (command.contains("pick")) & (command.contains("up")) & (command.contains("letter"))){
            c.pickup_letter();
        }
        else if ( (command.contains("put")) & (command.contains("down")) & (command.contains("letter"))){
            c.putDown_letter();
        }
    }

}
