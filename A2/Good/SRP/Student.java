package Good.SRP;

public class Student {

    public String name;
    public String email;
    public String phone_number;
    public int[] marks;
    public double cgpa;

    Student() {}

    Student(String name, String email, String phone_number, int[] marks)
    {
        this.name = name;
        this.email = email;
        this.phone_number = phone_number;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public int[] getMarks() {
        return marks;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
}
