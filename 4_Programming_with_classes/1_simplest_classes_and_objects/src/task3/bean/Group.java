package task3.bean;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private List<Student> students;

    {
        students = new ArrayList<Student>();
    }

    public Group() {

    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public String toString() {
        return "students= " + students;
    }
}
