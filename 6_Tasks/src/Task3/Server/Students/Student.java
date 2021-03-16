package Task3.Server.Students;

import java.util.Objects;

public class Student {
    private String firstName;
    private String lastName;
    private String city;
    private int course;
    private String birthday;

    public Student() {
    }

    public Student(String firstName, String lastName, String city, int course, String birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.course = course;
        this.birthday = birthday;
    }

    public String toString() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student that = (Student) o;
        return course == that.course &&
                firstName.equals(that.firstName) &&
                lastName.equals(that.lastName) &&
                city.equals(that.city) &&
                birthday.equals(that.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, city, course, birthday);
    }
}
