package task3.bean;

import java.util.Arrays;

public class Student {
    private String firstName;
    private String lastName;
    private int group_number;
    private int marks[];

    {
        marks = new int[5];
    }

    public Student() {

    }

    public Student(String firstName, String lastName, int group_number, int marks[]) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group_number = group_number;
        this.marks = marks;
    }

    public int getGroup_number() {
        return group_number;
    }

    public int[] getMarks() {
        return marks;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", group_number=" + group_number +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }
}
