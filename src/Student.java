import java.util.List;

public class Student {

    private String middleName;
    private String address;
    private String email;
    private String phoneNumber;
    private String studentCode;
    private List<Subject> subjectList;

    public Student(){}

    public Student(String middleName, String address, String email, String phoneNumber, String studentCode, List<Subject> subjectList) {
        this.middleName = middleName;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.studentCode = studentCode;
        this.subjectList = subjectList;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public List<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(List<Subject> subjectList) {
        this.subjectList = subjectList;
    }

    public void addSubjectList(Subject subject){
        this.subjectList.add(subject);
    }

    public void goToSchool(Student s){

    }

    public void doHomeWork(Student s){

    }

    public void payTuition(Student s){

    }

    public void takeExam(Student s){

    }

    @Override
    public String toString() {
        return "Student{" +
                "middleName='" + middleName + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", studentCode='" + studentCode + '\'' +
                ", subjectList=" + subjectList +
                '}';
    }
}
