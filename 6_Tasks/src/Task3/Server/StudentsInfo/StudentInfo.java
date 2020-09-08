package Task3.Server.StudentsInfo;

public class StudentInfo {
    private String firstName;
    private String lastName;
    private String city;
    private int course;
    private String birthday;

    public StudentInfo(){}

    public StudentInfo(String firstName,String lastName,String city,int course,String birthday){
        this.firstName=firstName;
        this.lastName=lastName;
        this.city=city;
        this.course=course;
        this.birthday=birthday;
    }

    public String toString(){
        return firstName + " " + lastName + " " + city + " " + course + " " + birthday;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
