import java.util.Scanner;

public class Story {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

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

    }
}
