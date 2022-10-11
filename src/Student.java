public class Student {
    /* Instance Variables */
    private final String firstName;
    private final String lastName;
    private int gradYear;
    private double accumulatedTestScores;
    private int testScoreCount;

    /* Constructor */
    public Student(String firstName, String lastName, int gradYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradYear = gradYear;
        accumulatedTestScores = 0.0;
        testScoreCount = 0;
    }

    /* Getter Methods */
    // returns firstName
    public String getFirstName() {
        return firstName;
    }

    // returns lastName
    public String getLastName() {
        return lastName;
    }

    /* Setter Methods */
    // Sets gradYear to newGradYear
    public void setGradYear(int newGradYear) {
        gradYear = newGradYear;
    }

    // Adds newTestScore to accumulatedTestScores
    // and increments testScoreCount by 1
    public void addTestScore(double newTestScore) {
        accumulatedTestScores += newTestScore;
        testScoreCount++;
    }

    // Returns true if the student's average test score is greater
    // than or equal to 65; returns false otherwise (see Note 2 below)
    public boolean isPassing() {return averageTestScore() >= 65;}

    // Returns the Student's average test score as the
    // quotient of accumulatedTestScores and testScoreCount
    public double averageTestScore() {return accumulatedTestScores / testScoreCount;}

    // this method prints all info of a Student object to the console
    public void printStudentInfo() {
        System.out.println("Student Full Name: " + firstName + " " + lastName);
        System.out.println("Graduation Year: " + gradYear);
        System.out.println("Number of tests: " + testScoreCount);
        System.out.println("Average Test Score: " + averageTestScore());
        System.out.println("Is passing: " + isPassing());
    }

    // ADD YOUR NEW getStudentInfo() METHOD HERE
    public String getStudentInfo() {
        String s = "";
        s += String.format("Student Full Name: %s %s\n", firstName, lastName);
        s += String.format("Graduation year: %s\n", gradYear);
        s += String.format("Number of tests taken: %s\n", testScoreCount);
        s += String.format("Average test score: %s\n", averageTestScore());
        s += String.format("Is passing: %s\n", isPassing());

        return s;
    }
}
