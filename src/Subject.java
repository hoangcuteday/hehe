import java.util.Arrays;

public class Subject {

    private String courseCode;
    private String courseName;
    private int numberOfPeriods;
    private int numberOfTests;
    private String instructor;
    private boolean pass;
    private double totalScore;
    private int[] testScore;

    public Subject(){}

    public Subject(String courseCode, String courseName, int numberOfPeriods, int numberOfTests, String instructor, int[] testScore) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.numberOfPeriods = numberOfPeriods;
        this.numberOfTests = numberOfTests;
        this.instructor = instructor;
        this.testScore = testScore;
        this.totalScore = calculateAverage();
        this.pass = isPass();
    }

    public double calculateAverage(){
        double average = 0;
        if (testScore.length == 2) average = 0.3 * testScore[0] + 0.7 * testScore[1];
         else if (testScore.length == 3) average = 0.2 * testScore[0] + 0.3 * testScore[1] + 0.5 * testScore[2];

        else if(testScore.length == 4) average = 0.1 * testScore[0] + 0.2 * testScore[1] + 0.3 * testScore[2] + 0.4 * testScore[3];
        return average;
    }

    public boolean isPass(){
        return  this.totalScore >= 4.0;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getNumberOfPeriods() {
        return numberOfPeriods;
    }

    public void setNumberOfPeriods(int numberOfPeriods) {
        this.numberOfPeriods = numberOfPeriods;
    }

    public int getNumberOfTests() {
        return numberOfTests;
    }

    public void setNumberOfTests(int numberOfTests) {
        this.numberOfTests = numberOfTests;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public int[] getTestScore() {
        return testScore;
    }

    public void setTestScore(int[] testScore) {
        this.testScore = testScore;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "courseCode='" + courseCode + '\'' +
                ", courseName='" + courseName + '\'' +
                ", numberOfPeriods=" + numberOfPeriods +
                ", numberOfTests=" + numberOfTests +
                ", instructor='" + instructor + '\'' +
                ", pass=" + pass +
                ", totalScore=" + totalScore +
                ", testScore=" + Arrays.toString(testScore) +
                '}';
    }
}
