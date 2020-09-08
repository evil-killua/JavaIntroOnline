package task3;

public class Student {
    String name;
    int group_number;
    int marks[];

    public Student(String name, int group_number, int marks[]){
        this.name=name;
        this.group_number=group_number;
        this.marks=marks;
    }

    public String getName(){
        return name;
    }

    public int getGroup_number(){
        return group_number;
    }

    public int[] getMarks(){
        return marks;
    }
}
