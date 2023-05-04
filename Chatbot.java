import java.util.ArrayList;

public class Chatbot {

    public static void checkUserResponse(Character c, ArrayList<String> command){
        if (command.contains("open")){
            if (command.contains("desk")){
               Furniture x = Purgatory.whichFurniture("desk");
                      c.open(x);
                   }
            else if (command.contains("nightstand")){
               Furniture x = Purgatory.whichFurniture("nightstand");
                      c.open(x);
                   }
            else if (command.contains("dresser")){
               Furniture x = Purgatory.whichFurniture("dresser");
                      c.open(x);
                   }
            else if (command.contains("closet")){
               Furniture x = Purgatory.whichFurniture("closet");
                      c.open(x);
                   }
            else if (command.contains("toy") & command.contains("chest") ){
               Furniture x = Purgatory.whichFurniture("toy chest");
                      c.open(x);
                   }
                   else if (command.contains("barbie") & command.contains("house")){
                     Furniture x = Purgatory.whichFurniture("barbie house");
                     c.open(x);
                   }
            else if (command.contains("craft") & command.contains("table")){
                     Furniture x = Purgatory.whichFurniture("craft table");
                     c.open(x);
                   }
            else if (command.contains("lego") & command.contains("box")){
                     Furniture x = Purgatory.whichFurniture("lego box");
                     c.open(x);
                   }
            else if (command.contains("dishwasher")){
                     Furniture x = Purgatory.whichFurniture("dishwasher");
                     c.open(x);
                   }
            else if (command.contains("microwave")){
                     Furniture x = Purgatory.whichFurniture("microwave");
                     c.open(x);
                   }
            else if (command.contains("oven")){
                     Furniture x = Purgatory.whichFurniture("oven");
                     c.open(x);
                   }
            else if (command.contains("pantry")){
                     Furniture x = Purgatory.whichFurniture("pantry");
                     c.open(x);
                   }
           else if (command.contains("toilet")){
                     Furniture x = Purgatory.whichFurniture("toilet");
                     c.open(x);
                   }
            else if (command.contains("medicine") & command.contains("cabinet")){
                     Furniture x = Purgatory.whichFurniture("medicine cabinet");
                     c.open(x);
                   }
           else if (command.contains("trash") & command.contains("can")){
                     Furniture x = Purgatory.whichFurniture("trash can");
                     c.open(x);
                   }
           else if (command.contains("shower")){
                     Furniture x = Purgatory.whichFurniture("shower");
                     c.open(x);
                   }
           else if (command.contains("coffee") & command.contains("table")){
                     Furniture x = Purgatory.whichFurniture("coffee table");
                     c.open(x);
                   }
           else if (command.contains("safe")){
                     Furniture x = Purgatory.whichFurniture("safe");
                     c.open(x);
                   }
           else if (command.contains("china") & command.contains("cabinet")){
                     Furniture x = Purgatory.whichFurniture("china cabinet");
                     c.open(x);
                   }
           else if (command.contains("bookshelf")){
                     Furniture x = Purgatory.whichFurniture("bookshelf");
                     c.open(x);
                   }
            else{
                    System.out.println("Sorry this is not a valid furniture to be opened.");
                   }
            }

        else if (command.contains("close")){
            if (command.contains("desk")){
                    Furniture x = Purgatory.whichFurniture("desk");
                    c.close(x);
                   }
           else if (command.contains("nightstand")){
                    Furniture x = Purgatory.whichFurniture("nightstand");
                    c.close(x);
                   }
             else if (command.contains("dresser")){
                    Furniture x = Purgatory.whichFurniture("dresser");
                    c.close(x);
                   }
            else if (command.contains("closet")){
                    Furniture x = Purgatory.whichFurniture("closet");
                    c.close(x);
                   }
            else if (command.contains("toy") & command.contains("chest") ){
                    Furniture x = Purgatory.whichFurniture("toy chest");
                    c.close(x);
                   }
                   else if (command.contains("barbie") & command.contains("house")){
                     Furniture x = Purgatory.whichFurniture("barbie house");
                     c.close(x);
                   }
            else if (command.contains("craft") & command.contains("table")){
                     Furniture x = Purgatory.whichFurniture("craft table");
                     c.close(x);
                   }
            else if (command.contains("lego") & command.contains("box")){
                     Furniture x = Purgatory.whichFurniture("lego box");
                     c.close(x);
                   }
            else if (command.contains("dishwasher")){
                     Furniture x = Purgatory.whichFurniture("dishwasher");
                     c.close(x);
                   }
            else if (command.contains("microwave")){
                     Furniture x = Purgatory.whichFurniture("microwave");
                     c.close(x);
                   }
            else if (command.contains("oven")){
                     Furniture x = Purgatory.whichFurniture("oven");
                     c.close(x);
                   }
            else if (command.contains("pantry")){
                     Furniture x = Purgatory.whichFurniture("pantry");
                     c.close(x);
                   }
           else if (command.contains("toilet")){
                     Furniture x = Purgatory.whichFurniture("toilet");
                     c.close(x);
                   }
            else if (command.contains("medicine") & command.contains("cabinet")){
                     Furniture x = Purgatory.whichFurniture("medicine cabinet");
                     c.close(x);
                   }
           else if (command.contains("trash") & command.contains("can")){
                     Furniture x = Purgatory.whichFurniture("trash can");
                     c.close(x);
                   }
           else if (command.contains("shower")){
                     Furniture x = Purgatory.whichFurniture("shower");
                     c.close(x);
                   }
           else if (command.contains("coffee") & command.contains("table")){
                     Furniture x = Purgatory.whichFurniture("coffee table");
                     c.close(x);
                   }
           else if (command.contains("safe")){
                     Furniture x = Purgatory.whichFurniture("safe");
                     c.close(x);
                   }
           else if (command.contains("china") & command.contains("cabinet")){
                     Furniture x = Purgatory.whichFurniture("china cabinet");
                     c.close(x);
                   }
           else if (command.contains("bookshelf")){
                     Furniture x = Purgatory.whichFurniture("bookshelf");
                     c.close(x);
                   }
            else{
                     System.out.println("Sorry this is not a valid furniture to be closed.");
                   }
            }
       
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
