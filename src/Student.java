/**
 * The Student class represents the students. The user can view the students file and sort them.
 * The Student is assigned a name, an age and grade year, and a method which holds addition information about them.
 */
public class Student {

    private String name;

    private int age;

    private String year;

    private User student;

    private User student1;

    /**
     * Constructor for the Student class. This creates an instance of the student given the
     * parameters mentioned below.
     *
     * @param name represents the name of the student.
     * @param age represents the students int age.
     * @param year represents the grade the student is in.
     *
     */
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

    /**
     * The studentSimulation method will use the simulation method from the User class to randomly assign a student a fighting simulation.
     * This is how the user will be able to rank the students.
     *
     */
    public void studentSimulation() {

        student.simulation();
        student1.simulation();


    }


}
