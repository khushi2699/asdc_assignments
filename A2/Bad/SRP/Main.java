package Bad.SRP;

public class Main {
    public static void main(String args[]){
        Student s1 = new Student("Khushi Shah", "khshah2699@gmail.com", "9029921301",
                new int[] {90,99,95,90,92});

        s1.calculateCGPA();
        s1.printResult();
        s1.checkScholarshipEligibility();
    }
}
