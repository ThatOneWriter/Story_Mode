public class User {

    private String name;

    private int likableness = 5;

    private String simulation;

    public User(String name, int likableness){

      this.name = name;
      this.likableness = likableness;

    }

    public String getName(){
       name = "Azz";

        return name;

    }

    public int likablenessDecreases(){

        int anti = 1;
        while (true) {

            return likableness - anti;

        }

    }

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
