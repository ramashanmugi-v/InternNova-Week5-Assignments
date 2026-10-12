import studentmanagement.Student;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Ramashanmugi", "CSE AI & ML");

        System.out.println("Student Information");
        s1.displayStudent();
    }
}