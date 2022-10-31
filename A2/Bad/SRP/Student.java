package Bad.SRP;

public class Student {
    /*
    Student class performs several functions which acc to the SRP, is bad coding.
    So we need to divide the functionalities into various classes.
     */

    public String name;
    public String email;
    public String phone_number;
    public int[] marks;
    public double cgpa;

    Student(String name, String email, String phone_number, int[] marks)
    {
        this.name = name;
        this.email = email;
        this.phone_number = phone_number;
        this.marks = marks;
    }

    public void calculateCGPA(){
        double total = 0;
        for(int i = 0 ; i < marks.length; i++){
            total = total + marks[i];
        }
        total = total / marks.length;
        this.cgpa = total;
    }

    public void printResult(){
        System.out.println("Result of Student "+name+ ": "+ cgpa);
    }

    public void checkScholarshipEligibility(){
        if(cgpa > 95 && cgpa < 100){
            System.out.println("Student is eligible for Scholarhip of $2000");
        }
        else if(cgpa<=95 && cgpa > 90){
            System.out.println("Student is eligible for Scholarhsip of $1000");
        }
    }
}
