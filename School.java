
import java.util.List;

public class School {
    private List<Student> students;

    public School(List<Student> students) {
       this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

}
