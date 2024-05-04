import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Onyedikachi", 1, 4);
        Student student2 = new Student("Odun", 1, 4);
        Student student3 = new Student("Niffy", 1, 4);
        Student student4 = new Student("Elizy", 1, 4);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

        School unilag = new School(studentList);

        // Add a new student to the school
        Student student5 = new Student("Bob", 1, 4);
        Student student6 = new Student("Thosmon", 1, 200);
        unilag.addStudent(student5);
        unilag.addStudent(student6);
       

        System.out.println("List of Student in Unilag");
        List<Student> unilagStudents = unilag.getStudents();
        for (Student student : unilagStudents) {
            String name = student.getName();
            System.out.println(name);
        }

     

        // for (Student student : studentList) {
        //     System.out.println(student.getName());
        // }

        student1.payFees(30000);
        student2.payFees(5000);

        System.out.println(student1.getName() + " paid " + student1.getFeesPaid());
        System.out.println(student1.getName() + " remaining balance " + student1.remainingbalance());
        System.out.println(student2.getName() + " paid " + student2.getFeesPaid());
        System.out.println(student1.getName() + " remaining balance is " + student1.remainingbalance());
        System.out.println(student2.getName() + " remaining balance is " + student2.remainingbalance());

    }
}