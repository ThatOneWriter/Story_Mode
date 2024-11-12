public class User {

    private String name;

    private int likableness;

    private String simulation;

    public User(String name, int likableness){

      this.name = name;
      this.likableness = likableness;

    }

    public String getName(){

        return name;

    }

    public int getLikableness(int likableness){

        int anti = 1;
        likableness = 5;
        while (true) {

            return likableness - anti;

        }

    }

    public void simulation() {

        int simulate = 1 + (int) (Math.random() * 8);

        if (simulate == 1) {
            System.out.println();
        }
        if (simulate == 2) {
            System.out.println();
        }
        if (simulate == 3) {
            System.out.println();
        }
        if (simulate == 4) {
            System.out.println();
        }
        if (simulate == 5) {
            System.out.println();
        }
        if (simulate == 6) {
            System.out.println();
        }
        if (simulate == 7) {
            System.out.println();
        }
        if (simulate == 8) {
            System.out.println();
        }

    }

    public void endGame() {

        if (likableness == 0) {
            System.out.println("Sorry, but you have lost all of your credibility. Better luck next time.");
        }

    }


}
