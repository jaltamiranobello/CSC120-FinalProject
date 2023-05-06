import java.util.ArrayList;
import java.util.Scanner;

public class Chatbot {

    public static void checkUserResponse(Character c, ArrayList<String> command, Scanner response){
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
                    System.out.println("Sorry that is not a valid furniture to be opened.");
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
                     System.out.println("Sorry that is not a valid furniture to be closed.");
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
                System.out.println("Sorry, that is not a valid direction.");
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
        else if((command.contains("pick")) & (command.contains("up")) & (command.contains("letter"))){
            c.pickup_letter();
        }
        else if ((command.contains("put")) & (command.contains("down")) & (command.contains("letter"))){
            c.putDown_letter();
        }
        else if (command.contains("help")) {
            c.help();
        }

        else if (command.contains("grab")){
            if (command.contains("binoculars")){
                c.grab("binoculars");
            }
            else if (command.contains("phone")){
                c.grab("phone");
            }
            else if (command.contains("lily's") & command.contains("schedule")){
                c.grab("lily's schedule");
            }
            else if (command.contains("teddy") & command.contains("bear")){
                c.grab("teddy bear");
            }
            else if (command.contains("lipstick")){
                c.grab("lipstick");
            }
            else if (command.contains("toy") & command.contains("camera")){
                c.grab("toy camera");
            }
            else if (command.contains("flowers")){
                c.grab("flowers");
            }
            else if (command.contains("locket")){
                c.grab("locket");
            }
            else if (command.contains("medicine") & command.contains("pamphlet")){
                c.grab("medicine pamphlet");
            }
            else if (command.contains("bowl") & command.contains("with") & command.contains("traces") & command.contains("of") & command.contains("unknown") & command.contains("substance")){
                c.grab("bowl with traces of unknown substance");
            }
            else if (command.contains("cake")){
                c.grab("cake");
            }
            else if (command.contains("pharmacy") & command.contains("card")){
                c.grab("pharmacy card");
            }
            else if (command.contains("tea") & command.contains("cup")){
                c.grab("tea cup");
            }
            else if (command.contains("purse")){
                c.grab("purse");
            }
            else if (command.contains("hair") & command.contains("pin")){
                c.grab("hair pin");
            }
            else if (command.contains("medicine") & command.contains("bottle")){
                c.grab("medicine bottle");
            }
            else if (command.contains("pills")){
                c.grab("pills");
            }
            else if (command.contains("necklace")){
                c.grab("necklace");
            }
            else if (command.contains("straightener")){
                c.grab("straightener");
            }
            else if (command.contains("hairbrush")){
                c.grab("hairbrush");
            }
            else if (command.contains("picture") & command.contains("of") & command.contains("lily")){
                c.grab("picture of lily");
            }
            else if (command.contains("glass") & command.contains("vase") & command.contains("shard")){
                c.grab("glass vase shard");
            }
            else{
                System.out.println("Sorry, that is not a valid item.");
            }
        }

        else if (command.contains("keep")){
            if (command.contains("binoculars")){
                c.keep("binoculars");
            }
            else if (command.contains("phone")){
                c.keep("phone");
            }
            else if (command.contains("lily's") & command.contains("schedule")){
                c.keep("lily's schedule");
            }
            else if (command.contains("teddy") & command.contains("bear")){
                c.keep("teddy bear");
            }
            else if (command.contains("lipstick")){
                c.keep("lipstick");
            }
            else if (command.contains("toy") & command.contains("camera")){
                c.keep("toy camera");
            }
            else if (command.contains("flowers")){
                c.keep("flowers");
            }
            else if (command.contains("locket")){
                c.keep("locket");
            }
            else if (command.contains("medicine") & command.contains("pamphlet")){
                c.keep("medicine pamphlet");
            }
            else if (command.contains("bowl") & command.contains("with") & command.contains("traces") & command.contains("of") & command.contains("unknown") & command.contains("substance")){
                c.keep("bowl with traces of unknown substance");
            }
            else if (command.contains("cake")){
                c.keep("cake");
            }
            else if (command.contains("pharmacy") & command.contains("card")){
                c.keep("pharmacy card");
            }
            else if (command.contains("tea") & command.contains("cup")){
                c.keep("tea cup");
            }
            else if (command.contains("purse")){
                c.keep("purse");
            }
            else if (command.contains("hair") & command.contains("pin")){
                c.keep("hair pin");
            }
            else if (command.contains("medicine") & command.contains("bottle")){
                c.keep("medicine bottle");
            }
            else if (command.contains("pills")){
                c.keep("pills");
            }
            else if (command.contains("necklace")){
                c.keep("necklace");
            }
            else if (command.contains("straightener")){
                c.keep("straightener");
            }
            else if (command.contains("hairbrush")){
                c.keep("hairbrush");
            }
            else if (command.contains("picture") & command.contains("of") & command.contains("lily")){
                c.keep("picture of lily");
            }
            else if (command.contains("glass") & command.contains("vase") & command.contains("shard")){
                c.keep("glass vase shard");
            }
            else{
                System.out.println("Sorry, that is not a valid item.");
            }
        }

        else if (command.contains("drop")){
            if (command.contains("binoculars")){
                c.drop("binoculars");
            }
            else if (command.contains("phone")){
                c.drop("phone");
            }
            else if (command.contains("lily's") & command.contains("schedule")){
                c.drop("lily's schedule");
            }
            else if (command.contains("teddy") & command.contains("bear")){
                c.drop("teddy bear");
            }
            else if (command.contains("lipstick")){
                c.drop("lipstick");
            }
            else if (command.contains("toy") & command.contains("camera")){
                c.drop("toy camera");
            }
            else if (command.contains("flowers")){
                c.drop("flowers");
            }
            else if (command.contains("locket")){
                c.drop("locket");
            }
            else if (command.contains("medicine") & command.contains("pamphlet")){
                c.drop("medicine pamphlet");
            }
            else if (command.contains("bowl") & command.contains("with") & command.contains("traces") & command.contains("of") & command.contains("unknown") & command.contains("substance")){
                c.drop("bowl with traces of unknown substance");
            }
            else if (command.contains("cake")){
                c.drop("cake");
            }
            else if (command.contains("pharmacy") & command.contains("card")){
                c.drop("pharmacy card");
            }
            else if (command.contains("tea") & command.contains("cup")){
                c.drop("tea cup");
            }
            else if (command.contains("purse")){
                c.drop("purse");
            }
            else if (command.contains("hair") & command.contains("pin")){
                c.drop("hair pin");
            }
            else if (command.contains("medicine") & command.contains("bottle")){
                c.drop("medicine bottle");
            }
            else if (command.contains("pills")){
                c.drop("pills");
            }
            else if (command.contains("necklace")){
                c.drop("necklace");
            }
            else if (command.contains("straightener")){
                c.drop("straightener");
            }
            else if (command.contains("hairbrush")){
                c.drop("hairbrush");
            }
            else if (command.contains("picture") & command.contains("of") & command.contains("lily")){
                c.drop("picture of lily");
            }
            else if (command.contains("glass") & command.contains("vase") & command.contains("shard")){
                c.drop("glass vase shard");
            }
            else{
                System.out.println("Sorry, that is not a valid item.");
            }
        }
        else if(command.contains("enter") & command.contains("code")){
            System.out.println("Enter code: ");
            String input = response.nextLine();
            c.enterCode(input);
        }
        else{
            System.out.println("This is not a valid command.");
        }
    }

}
