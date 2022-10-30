package Good.SRP;

public class CalculateEligibility extends Student {

    Student student = new Student();
    public CalculateEligibility(Student s1) {
        this.student = s1;
    }

    public void checkScholarshipEligibility(){
        if(student.cgpa > 95 && student.cgpa < 100){
            System.out.println("Student is eligible for Scholarhip of $2000");
        }
        else if(student.cgpa<=95 && student.cgpa > 90){
            System.out.println("Student is eligible for Scholarhsip of $1000");
        }
    }
}
