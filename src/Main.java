import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("-----student------");
        System.out.println("middle: ");
        String middle = sc.next();
        System.out.println("address: ");
        String address = sc.next();
        System.out.println("email: ");
        String email = sc.next();
        System.out.println("number phone: ");
        String numberPhone = sc.next();
        System.out.println("student code: ");
        String studentCode = sc.next();
        Student s1 = new Student(middle, address, email, numberPhone, studentCode, new ArrayList<>());

        System.out.println("Enter number of subject: ");
        int n = sc.nextInt();
        int m = n;
        while(n != 0){
            System.out.println("-----Subject---- " + (m - n + 1));
            System.out.println("course code: ");
            String courseCode = sc.next();
            System.out.println("course name: ");
            String courseName = sc.next();
            System.out.println("number of period: ");
            int numberOfPeriods = sc.nextInt();
            System.out.println("number of test: ");
            int numberOfTests = sc.nextInt();
            int[] testScore = new int[numberOfTests];
            for(int i = 0; i < numberOfTests; i++){
                System.out.println("score of test: " + (i + 1));
                testScore[i] = sc.nextInt();
            }
            System.out.println("instructor: ");
            String instructor = sc.next();
            Subject sb = new Subject(courseCode, courseName, numberOfPeriods, numberOfTests, instructor, testScore);
            s1.addSubjectList(sb);
            n--;
        }

        for(Subject sb : s1.getSubjectList()){
            sb.display();
        }
    }
}