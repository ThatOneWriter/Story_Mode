import java.util.Scanner;

public class Story {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Hello and Welcome to Story Mode, The Game!");
        String information = """
                Here I will be providing you all the information you need to comfortably interact with the game. \s
                
                When given a selection of answer choices, please fully type in your answer; ex. Option A \s
              
                When given the opportunity to make an interaction, if you select these letters you will be able to do the following: \s
                press 'l' if you would like to view your current likableness   \s
                press 's' if you would like to view your own stats \s
                press 'p' if you would like to view the person you are interacting withs information \s
                press '+' if you would like to pause the game and view the information that is currently being shown. \s
                
                Enjoy!  \s
               \s""";
        System.out.println(information);
        System.out.print("Would you like to begin? type in x whenever you are ready. ");
        String x = scan.nextLine();

        System.out.println();
        String opening = "You are patiently seated in a chair, as you await being called into the principals room." + "\n";
        opening += "It is unknown as to why you have been summoned by the principal himself, " + "\n";
        opening += "but you figure it must have something to do with ";
        opening += "the school year starting back up." + "\n" + "Although its odd, since the student applications should already be submitted by now,";
        opening += "\n" + "as there are only two weeks left until school starts.";

        System.out.println(opening + "\n");

        System.out.println("Then you hear it, your name is called to enter the room-");

        String name = "--------------------------------------------------------------" + "\n";
        name += "| What would you like to be referred as the game progresses? |";
        System.out.println(name);
        String setName = scan.nextLine();

        User user = new User(setName, 5 );

        System.out.println("Did you say your name was " + user.getName() + "? \n Option A. Uh.. Sure. \n Option B. That is not what I said!");
        System.out.println("(Please either type in 'Option A' or 'Option B' when answering.)");
        String firstSelection = scan.nextLine();

        if (firstSelection.equals("Option A") || firstSelection.equals("Option B")) {
            System.out.println("Alright, " + user.getName() + " it is." );
        }

        System.out.println("--------------------------------------------------------------");

        String call = "'Mr." + user.getName() + ", Please report to the principals office immediately!',";
        call += """
                the old lady's voice rattles.
                As you walk past her receptionist desk, you have the options to either,\s
                """;
        call += "Option A. Give a frightening glare to the old witch, that is definitely not your name!" + "\n";
        call += "Option B. Give off a resigned sigh, and head into the room quietly." + "\n";
        call += "Option C. Ask whoever the narrator of the game is to tell you what is going on and why you are here." + "\n";
        System.out.print(call);
        String secondSelection = scan.nextLine();

        if (secondSelection.equals("Option A")) {
            System.out.println("Uh oh! Seems as though your likableness went down a point. Be careful, as once your likableness reaches" +
                    "zero, the game is over. Make sure to be conscience of your answers and the ways they may impact the NPCs around you. ");
            System.out.println("Likableness count: " + user.likablenessDecreases());
        }

        if (secondSelection.equals("Option C")) {
            System.out.println("\n" + "--------------------------------------------------------------");
            System.out.println("You have been transported to an interactive story mode game where you the user " + "\n" +
                    "are a teacher trying to navigate their way working at an extremely elite " + "\n" +
                    "superhero high school. I won't spoil the rest for you, keep going!");
            System.out.println("--------------------------------------------------------------" + "\n");
        }

    }
}
