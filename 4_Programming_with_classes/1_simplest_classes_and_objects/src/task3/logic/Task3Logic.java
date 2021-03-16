package task3.logic;

import task3.bean.Student;

import java.util.ArrayList;
import java.util.List;

public class Task3Logic {

    public List<Student> sort_by_marks(List<Student> student) {
        List<Student> stud;
        int count = 0;

        stud = new ArrayList<Student>();

        for (Student ab : student) {
            for (int marks : ab.getMarks()) {
                if (marks == 9 || marks == 10) {
                    count++;
                }
            }

            if (count == 5) {
                stud.add(ab);
//                System.out.println(ab.toString());
            }
            count = 0;
        }

        return stud;
    }
}
