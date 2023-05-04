import java.util.ArrayList;

public class Chatbot {

    public static void checkUserResponse(Character c, ArrayList<String> command){
        if (command.contains("open")){
            if (command.contains("barbie") & command.contains("house")){
              Furniture x = Purgatory.whichFurniture("barbie house");
              c.open(x);
            }
            else{
                System.out.println("yes open no barbie");
            }

        }
        else {
            System.out.println("no open");
        }
    }

}
