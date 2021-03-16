package task3.view;

import task3.bean.Student;

import java.util.List;

public class Task3View {
    public void printInfo(List<Student> stud) {
        for (int i = 0; i < stud.size(); i++) {
            System.out.println("фамилия: " + stud.get(i).getFirstName() +
                    " ,номер группы: " + stud.get(i).getGroup_number());
        }
    }
}
