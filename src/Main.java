import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Hồng", "Hội An", "hehe@gmail.com", "0987654321", "HanhHEHE", new ArrayList<>());

        Subject sb1 = new Subject("M11", "HM11", 4, 4, "hahaha", new int[]{8,8,8,8});
        Subject sb2 = new Subject("M12", "HM12", 4, 4, "hahaha", new int[]{1,2,3,4});

        s1.addSubjectList(sb1);
        s1.addSubjectList(sb2);

        for(Subject sb : s1.getSubjectList()){
            System.out.println(s1.getMiddleName() + " " + sb);
        }
    }
}