public class Student {

    private String name;

    private int age;

    private String year;

    private User student;

    private User student1;

    public Student(String name, int age, String year){

        this.name = name;
        this.age = age;
        this.year = year;


    }

    /**
     * The getDescriptions method will
     *
     * @param grades an integer representing the students previous average.
     * @param aspirations a String representing the students' mindset.
     * @return a String representing a formatted paragraph showcasing a detailed description of the student.
     */
    public String getDescriptions(int grades, String aspirations){

        int aspiration_randomizer = 1 + (int) (Math.random() * 5);

        if (aspiration_randomizer == 1) {
            aspirations = "1";
            return aspirations;
        }
        if (aspiration_randomizer == 2) {
            aspirations = "2";
            return aspirations;
        }
        if (aspiration_randomizer == 3) {
            aspirations = "3";
            return aspirations;
        }
        if (aspiration_randomizer == 4) {
            aspirations = "4";
            return aspirations;
        }
        if (aspiration_randomizer == 5) {
            aspirations = "5";
            return aspirations;
        }

        String descriptions = "Students Name: " + name + "\n";
        descriptions += "Age and Year: " + age + ", Grade " + year + "\n";
        descriptions += "Previous Years' Overall Average: " + grades + "\n";
        descriptions += "Aspirations: " + aspirations;

        return descriptions;
    }

    public void studentSimulation() {

        student.simulation();
        student1.simulation();


    }
    

}
