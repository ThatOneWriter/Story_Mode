import java.util.Scanner;

public class Story {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Hello and Welcome to Story Mode, The Game!");
        String information = """
                \s
                You have been transported to an interactive story mode game where you the user  \s
                are a teacher trying to navigate their way working at an extremely elite \s
                superhero high school. \s 
                
                \s 
                Here I will be providing you all the information you need to comfortably interact with the game. \s
                
                When given a selection of answer choices, please fully type in your answer; ex. Option A \s
              
                When given the opportunity to, if you select these letters you will be able to do the following: \s
                press 'l' if you would like to view your current likableness   \s
                press 's' if you would like to view your own stats \s
                press 'p' if you would like to view the person you are interacting withs information \s
                press '+' if you would like to pause the game and view the information that is currently being shown. \s
                
                Enjoy!  \s
               \s""";
        System.out.println(information);
        System.out.print("Would you like to begin? type in any letter whenever you are ready to begin the game. ");
        String enter = scan.nextLine();

        String name = "--------------------------------------------------------------" + "\n";
        name += "| Narrator: What would you like to be referred as the game progresses? |";
        System.out.println(name);
        String setName = scan.nextLine();

        User user = new User(setName, 5);
        setName = user.getName();

        System.out.println("Narrator: Did you say your name was " + setName + "? \n Option A. Uh.. Sure. \n Option B. That is not what I said!");
        System.out.println("(Please either type in 'Option A' or 'Option B' when answering.)");
        String firstSelection = scan.nextLine();

        if (firstSelection.equals("Option A") || firstSelection.equals("Option B")) {
            System.out.println("Narrator: Alright, " + setName + " it is.");
        }
        else {
            System.out.println("Sorry but that is not one of the answer choices. (Please either type in 'Option A' or 'Option B' when answering.)");
        }
        System.out.println("--------------------------------------------------------------");

        System.out.println("Day " + user.theWeek());
        String opening = "You are patiently seated in a chair, as you await being called into the principals room." + "\n";
        opening += "It is unknown as to why you have been summoned by the principal himself, " + "\n";
        opening += "but you figure it must have something to do with ";
        opening += "the school year starting back up." + "\n" + "Although its odd, since the student applications should already be submitted by now,";
        opening += "\n" + "as there are only two weeks left until school starts.";

        System.out.println(opening + "\n");

        System.out.println("Then you hear it, your name is called to enter the room-");

        String call = "'Mr. " + setName + ", Please report to the principals office immediately!',";
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
            String outcome = "You give off a frightnening glare to the poor old lady as her eyes turn glossy, shinning with tears. " +
                    "\n" + "It seems as though this wasn't the best response. ";
            System.out.println(outcome);
            System.out.println("Likableness count: " + user.likablenessDecreases());
            System.out.println("\n" + "--------------------------------------------------------------");
            System.out.println("Narrator: Uh oh! Seems as though your likableness went down a point. Be careful, as once your likableness reaches" +
                    "\n" + "zero, the game is over. Make sure to be conscience of your answers and the ways they may impact the NPCs around you. ");
            System.out.println("--------------------------------------------------------------" + "\n");

        }

        if (secondSelection.equals("Option C")) {
            System.out.println("\n" + "--------------------------------------------------------------");
            System.out.println("Narrator: " + "\n" +
                    " The oh so naive protagonist whines for he has not read the description. Oh how sad a tale is this! ");
            System.out.println("--------------------------------------------------------------" + "\n");
        }



        String theMeeting = "You make your way into the office, taking a seat directly infront of the principal. 'Good Morning Mr. " + setName + ", he grunts."
                + "\n" + "Pincipal Gludious looming presence fills up the room as he glares down at you. " +
                "You neverously glance around the room." + "\n";
        theMeeting += "Option A. You think to yourself, what a horrible name that is." + "\n"
                + "Option B. Disregard his name and ask why you have been called for this meeting.";
        System.out.println(theMeeting);
        String thirdSelection = scan.nextLine();

        if (thirdSelection.equals("Option A")) {
            String outcome = "His eyebrows receed upwards as he exclaims, 'What did you just say?!' It dawns on you that you have just said that out loud.";
            outcome += "\n" + "'Nothing,' you embarrasingly stammer. He appears suspicious, but decides to go on with the meeting.";
            System.out.println(outcome);
        }

        String theMeeting1 = "'So anyways,' he leads with, 'as you know the school year begins in a couple of days, and recently theres been a problem with "
                +"\n" + "the student files.. I had to remove Mr. Godsend from the ...... ";
        theMeeting1 += "So with that being said I have decided to assign you with the task of reviewing the remaining students files." + "\n";
        theMeeting1 += "\n" + "Baffled by this newfound responsibility, you decide to, " + "\n"
        + "Option A. Argue against having to do this." + "\n"
        + "Option B. Write your own response." + "\n"
        + "Option C. Flip over the table.";
        System.out.println(theMeeting1);
        String fourthSelection = scan.nextLine();

        if (fourthSelection.equals("Option A")) {
            String outcome = "'But Principal Gludious,' you stammer, 'theres no way I could review student files this last minute. There is only a week left" +
                    "\n" + "until the school year begins!' ";
            outcome += "His flat mouth turns downward into a frown. He coldly says, 'You do realize that I am in charge of giving you your tenure, right?" +
                    "\n" + "I suggest that if you would like to recieve a much more favorable outcome towards it, you'll do as I say.'";
            System.out.println(outcome);

        }

        if (fourthSelection.equals("Option B")) {
            System.out.println("Use this space to type out your response: ");
            String writeitYourself = scan.nextLine();
            System.out.println("\n" + "--------------------------------------------------------------");
            System.out.println("Narrator: " + "\n" +
                    " Sorry but no one is reading allat lil bro. ");
            System.out.println("--------------------------------------------------------------" + "\n");

        }

        if (fourthSelection.equals("Option C")) {

            System.out.println("\n" + "--------------------------------------------------------------");
            System.out.println("Narrator: " + "\n" +
                    " Lets do a short minigame! If you correctly guess a number between 1 and 10, your outcome might turn out better. Good luck!");
            String guesser = scan.nextLine();
            int guess = 1 + (int) (Math.random() * 10);

            if ((guesser.equals("1") || guesser.equals("2") || guesser.equals("3") || guesser.equals("4") || guesser.equals("5")) && (guess <= 10))
            {
                System.out.println("It seems as though your guess was... Incorrect. Better luck next time!");
                System.out.println("--------------------------------------------------------------" + "\n");

                String outcome = "Out of extreme anger you decide to flip over his desk, but it doesn't move an inch!" +
                        "\n" + "You then realize that it is bolted to the groud.. you glance at Principal Gludious in embarrasement. Uh, Awkward..";
                System.out.println(outcome);
                System.out.println("Likableness count: " + user.likablenessDecreases());
            }

            if ((guesser.equals("6") || guesser.equals("7") || guesser.equals("8") || guesser.equals("9") || guesser.equals("10")) && (guess <= 10))
            {
                System.out.println("It seems as though your guess was... Correct!");
                System.out.println("--------------------------------------------------------------" + "\n");

                String outcome = "Out of extreme anger you decide to flip over his desk, narrowly missing his face by an inch. Glancing at Principal Gludious" +
                        "\n" + "it seems as though he is completely stunned by your actions, but then his face shifts and he starts.. laughing?";
                System.out.println(outcome);
                System.out.println("Likableness count: " + user.likablenessIncreases());
            }

        }
        String theMeeting2 = "";
        System.out.println(theMeeting2);
        user.endGame();
    }
}
