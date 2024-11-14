/**
 * The User class represents the user. A user is the one playing and interacting with the game.
 * They are assigned a name, a likableness score, and a simulation ability
 */
public class User {

    private String name;

    private int likableness = 5;

    private String simulation;

    /**
     * Constructor for the User class. This creates an instance of the user given the
     * parameters mentioned below.
     *
     * @param name represents the name of the user. They are given one by random choice
     * @param likableness represents the users likability score.
     *
     */
    public User(String name, int likableness){

      this.name = name;
      this.likableness = likableness;

    }

    /**
     * getName method for the User class. This method will return a String
     * which displays the name of the user.
     *
     * @return returns the randomly generated name of the user.
     *
     */
    public String getName(){
        int randomName = 1 + (int) (Math.random() * 3);

        if (randomName == 1) {
            name = "Butt-cheeks";
            return name;
        }
        if (randomName == 2) {
            name = "Azz";
            return name;
        }
        if (randomName == 3) {
            name = "-insert main character-";
            return name;
        }
        return name;
    }

    /**
     * the likablenessDecreases method for the User class.
     * This method will return an int displaying the users likableness decreasing.
     *
     * @return returns the users likableness - 1
     *
     */
    public int likablenessDecreases(){
            int thatsnotNice = 1;
            return likableness - thatsnotNice;
    }

    /**
     * the likablenessIncreases method for the User class.
     * This method will return an int displaying the users likableness increasing
     * or staying the same if it is already 5.
     *
     * @return returns the users likableness + 1
     *
     */
    public int likablenessIncreases(){

        if (likableness == 5) {
            return 5;
        }
        return likableness++;
    }

    /**
     * The simulation method will store fighting based simulations for the user to
     * randomly call upon.
     *
     * @return returns a String representing a randomly picked simulation.
     */

    public String simulation() {

        int simulate = 1 + (int) (Math.random() * 5);

        if (simulate == 1) {
            return "";
        }
        if (simulate == 2) {
            return "";
        }
        if (simulate == 3) {
            return "";
        }
        if (simulate == 4) {
            return "";
        }
        if (simulate == 5) {
            return "";
        }
    return "";
    }

    public void endGame() {

        if (likableness == 0) {
            System.out.println("Sorry, but you have lost all of your credibility. Better luck next time.");
        }

    }


}


}
