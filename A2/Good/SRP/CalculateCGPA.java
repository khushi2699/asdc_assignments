package Good.SRP;

public class CalculateCGPA{

    Student student = new Student();
    public CalculateCGPA(Student s1) {
        this.student = s1;
    }

    public void calculateCGPA(){
        double total = 0;
        for(int i = 0 ; i < student.marks.length; i++){
            total = total + student.marks[i];
        }
        total = total / student.marks.length;
        this.student.cgpa = total;
    }
}
