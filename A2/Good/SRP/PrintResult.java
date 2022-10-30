package Good.SRP;

public class PrintResult{

    Student student = new Student();

    PrintResult(Student s1){this.student = s1;}

    public void printResult(){
        System.out.println("Result of Student "+student.name+ ": "+ student.cgpa);
    }
}
