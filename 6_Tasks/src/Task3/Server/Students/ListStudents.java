package Task3.Server.Students;

import java.util.ArrayList;
import java.util.List;

public class ListStudents {

    private List<Student> students;

    {
        students = new ArrayList<>();
    }

    public ListStudents() {
    }

    public ListStudents(List<Student> info) {
        this.students = info;
    }

    public void addStudents(List<Student> students) {
        students.addAll(students);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "ListStudents{" +
                "students=" + students +
                '}';
    }

}
